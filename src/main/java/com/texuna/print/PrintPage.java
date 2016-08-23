package com.texuna.print;

import com.texuna.config.ColumnConfig;
import com.texuna.config.Settings;

import java.util.ArrayList;
import java.util.List;

/**
 * Печатаем постранично
 */
public class PrintPage {

	private Settings settings;
	private PrintString printString = new PrintString();

	public PrintPage(Settings settings) {
		this.settings = settings;
	}

	public void setSettings(Settings settings) {
		this.settings = settings;
	}

	public Settings getSettings() {
		return settings;
	}

	public List<String> generate(List<String[]> inputData) {
		List<String> result = new ArrayList<>();

		printString.setSettings(settings);
		printString.generateHead(settings.getColumns());

		printString.setLineDelim();
		result.add(printString.getHead());
		result.add(printString.getDelimiter());
		for (String[] inRecord : inputData) {
			
			/**
			 * проверка на сколько строк будем разбивать строку перед тем как
			 * отправить ее в отчет 
			 * рост - на сколько строк разбили 
			 * сдвиг - если мы переносим всю запись на следующую страницу. Учитываем этот
			 * сдвиг при дальнейшем подсчете размера страницы.
			 */

			int sdvig = 0;
			int rost = 1;
			int i = 0;
			List<List<String>> lls = new ArrayList<List<String>>();
			
			for (ColumnConfig column : settings.getColumns()) {
				// находим максимальный рост по колонке
				List<String> ls = getRostList(inRecord[i++], column.getWidth());
				lls.add(ls);
				if (rost < ls.size()) {
					rost = ls.size();
				}
			}
			
			if ((result.size() + sdvig) % settings.getPage().getHeight() + rost > settings.getPage().getHeight()) {
				result.add("~");
				result.add(printString.getHead());
				result.add(printString.getDelimiter());
				sdvig += settings.getPage().getHeight() - (result.size() - sdvig) % settings.getPage().getHeight();
			}
			
			for (int j = 0; j < rost; j++) {
				String[] str = new String[inRecord.length];
				for (int l = 0; l < inRecord.length; l++) {
					if (lls.get(l).size() > j) 
						str[l] = lls.get(l).get(j);
					else str[l] = "";
				}

				result.add(printString.printStr(str));
				if ((result.size() + sdvig) % settings.getPage().getHeight() == 0) {
					result.add(printString.getDelimiter());
					result.add("~");
					result.add(printString.getHead());
					result.add(printString.getDelimiter());
				} else if (j == rost - 1) {
					result.add(printString.getDelimiter());
				}
			}
		}
		return result;
	}

	private List<String> getRostList(String string, int width) {
		List<String> ls = new ArrayList<String>();
		// здесь нужен сложный regix для поиска слов в предложении 
        // пока просто используем пробел как у всех нормальных людей
		String[] words = string.split(" ");
		// smoke test tipo
		if (string.length() <= width) {
			ls.add(string);
			return ls;
		}
		
		String s = "";
		for (int i = 0; i < words.length; i++) {
			s += words[i];
			if (s.length() > width) {
				if (s.length() == words[i].length()) {
					addRow(width, ls, s);
					s = "";
				} else {
					ls.add(s.substring(0, s.length() - words[i].length()-1));
					if (words[i].length() > width){
						s = addRowWithRest(width, ls, words[i]);
						if (!s.isEmpty()) s += " ";
					} else if (words[i].length() == width) {
						ls.add(words[i]);
						s= "";
					} else{
					      s = words[i] + " ";
					}
				}
			} else {
				s += " ";
			}
		}
		if (s.length() > 0)
			if (s.length() <= width)
				ls.add(s.trim());
			else {
				addRow(width, ls, s);
			}
		return ls;
	}

	private String addRowWithRest(int width, List<String> ls, String s) {
		int rost = s.length() / width;
		for (int k = 0; k < rost; k++)
			ls.add(s.substring(k * width, (k + 1) * width));
		if (s.length() % width != 0 && rost != 0)
			return s.substring(rost * width);
		return "";
	}

	private void addRow(int width, List<String> ls, String s) {
		int rost = s.length() / width;
		for (int k = 0; k < rost; k++)
			ls.add(s.substring(k * width, (k + 1) * width));
		if (s.length() % width != 0 && rost != 0)
			ls.add(s.substring(rost * width));
	}
}
