package com.texuna.parser;

import com.univocity.parsers.tsv.TsvParserSettings;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.List;

public class TsvParser {

	List<String[]> tsvReturn;

	public void parse(String fileName) {
		TsvParserSettings settings = new TsvParserSettings();
		com.univocity.parsers.tsv.TsvParser parser = 
				new com.univocity.parsers.tsv.TsvParser(settings);

		FileInputStream stream = null;
		try {
			stream = new FileInputStream(fileName);
			tsvReturn = parser
					.parseAll(new InputStreamReader(stream, "UTF-16"));
		} catch (FileNotFoundException e) {
			System.out.println(fileName + ": Error - File is not found");
		} catch (UnsupportedEncodingException e) {
			System.out.println(fileName + ": UTF-16 is not supported");
		}
	}

	public List<String[]> getTsvParserResult() {
		return tsvReturn;
	}

	public void setTsvParserResult(List<String[]> tsvParserResult) {
		this.tsvReturn = tsvParserResult;
	}
}
