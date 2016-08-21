package com.texuna.print;

import com.texuna.config.ColumnConfig;
import com.texuna.config.Settings;
import org.apache.commons.lang3.StringUtils;
import java.util.List;

/**
 * Формируем строки в отчете
 */
public class PrintString {

	private static final char COL = '|';
	private static final char LINE = '-';

	String row;
	String head;
	String delimiter;
	private Settings settings;

	public void setSettings(Settings settings) {
		this.settings = settings;
	}

	public Settings getSettings() {
		return settings;
	}

	public String getRow() {
		return row;
	}

	public void setRow(String row) {
		this.row = row;
	}

	public String getHead() {
		return head;
	}

	public void setHead(String head_) {
		this.head = head_;
	}

	public String getDelimiter() {
		return delimiter;
	}

	private StringBuilder printCol(String s, int columnWidth) {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(" ");
		stringBuilder.append(s);
		int diffSize = columnWidth - s.length();
		if (diffSize > 0) {
			stringBuilder.append(StringUtils.repeat(" ", diffSize));
		}
		stringBuilder.append(" ").append(COL);
		return stringBuilder;
	}

	public String printStr(String[] header) {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(COL);
		for (int i = 0; i < settings.getColumns().size(); i++) {
			stringBuilder.append(printCol(header[i], settings.getColumns().get(i)
					.getWidth()));
		}
		return stringBuilder.toString();
	}

	public void setLineDelim() {
		delimiter = StringUtils.repeat(LINE, settings.getPage()
				.getWidth());
	}

	public void generateHead(List<ColumnConfig> columns) {

		String[] header = new String[columns.size()];
		int i = 0;
		for (ColumnConfig column : columns) {
			header[i++] = column.getTitle();
		}
		head = printStr(header);
	}
}
