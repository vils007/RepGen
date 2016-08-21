package com.texuna;

import com.texuna.parser.TsvParser;
import com.texuna.parser.XmlParser;
import com.texuna.print.PrintReport2File;

/**
 *  паспечатать в файл отчет используя три файла в качестве параметров:
 *  
 *  setings.xml     -  задает параметры отчета ширину и высоту страницы + название и ширину колонок
 *  source-data.tsv -  содержание отчета
 *  fileReport.txt  -  файл вывода   
 */
public class Print2File {

	public static void main(String[] args) {

		// get settings

		if (args.length == 3) {
			XmlParser xmlParser = new XmlParser();
			xmlParser.parse(args[0]);
			// xmlParser.parse("settings.xml");

			// source input data in tsv format

			TsvParser tsvParser = new TsvParser();
			tsvParser.parse(args[1]);
			// tsvParser.parse("source-data.tsv");

			// Print a report 2 file

			PrintReport2File txtReportGenerator = new PrintReport2File();
			txtReportGenerator.setSettings(xmlParser.getSettings());
			txtReportGenerator.setInput(tsvParser.getTsvParserResult());
			txtReportGenerator.print2File(args[2]);
			// txtReportGenerator.print2File("testTr1.txt");
		} else
			System.out
					.println("Please use command: >java -jar target/RepGen-1.0-jar-with-dependencies.jar settings.xml source-data.tsv fileReport.txt");
	}
}
