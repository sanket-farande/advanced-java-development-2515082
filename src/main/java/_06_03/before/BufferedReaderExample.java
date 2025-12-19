package _06_03.before;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderExample {
    public static void main(String[] args) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("src/main/java/_06_03/example.txt"));){        
            String firstLine = bufferedReader.readLine();
            System.out.println(firstLine);
            
            StringBuilder sb = new StringBuilder();
            // BufferedReader cursor has been advanced to next line
            bufferedReader.lines().forEach(line -> sb.append(line+" "));
            System.out.println("Rest of the lines \n"+sb);

            // Use BufferedReader for reading line wise, But Scanner if you want to parse the content.
        } catch (IOException e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}