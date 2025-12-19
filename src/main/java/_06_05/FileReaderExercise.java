package _06_05;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExercise {

    // This method should return the first line of BufferedReaderVsScanner.txt.
    String getFirstLine() {
        String firstLine = "";
        try (BufferedReader bufferedReader = new BufferedReader(
                new FileReader("src/main/java/_06_05/BufferedReaderVsScanner.txt"));) {
            firstLine = bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return firstLine;
    }

    // This method should return all of the content of BufferedReaderVsScanner.txt
    // as a single String.
    String getWholeFile() {
        StringBuilder wholeFile = new StringBuilder();
        try (BufferedReader bufferedReader = new BufferedReader(
                new FileReader("src/main/java/_06_05/BufferedReaderVsScanner.txt"));) {
            bufferedReader.lines().forEach(line -> wholeFile.append(line));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return wholeFile.toString();
    }

}
