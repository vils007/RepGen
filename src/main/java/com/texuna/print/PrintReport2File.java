package com.texuna.print;

import com.texuna.config.Settings;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

/**
 *  Лепим все это в файло 
 *
 */
public class PrintReport2File {

    private static final String NEW_LINE = "\r\n";

    private Settings settings;
    private List<String[]> input;
    private List<String> report = new ArrayList<>();

    public void print2File(String fileName) {
        PrintPage pageGenerator = new PrintPage(settings);
        report = pageGenerator.generate(input);

        try {

            File fileDir = new File(fileName);

            Writer out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileDir), "UTF-16"));

            for (String line : report) {
                out.append(line).append(NEW_LINE);
            }

            out.flush();
            out.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void setSettings(Settings settings) {
        this.settings = settings;
    }

    public Settings getSettings() {
        return settings;
    }

    public void setInput(List<String[]> inputData) {
        this.input = inputData;
    }

    public List<String[]> getInput() {
        return input;
    }
}
