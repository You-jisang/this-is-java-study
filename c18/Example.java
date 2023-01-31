package c18;

import java.io.BufferedReader;
import java.io.FileReader;
public class Example {
    public static void main(String[] args) throws Exception {
        String filePath = "C:/Users/JiSang/Desktop/지상/this-is-java-study/c18/Example.java";

        FileReader fr = new FileReader(filePath);
        BufferedReader br = new BufferedReader(fr);

        int rowNumber = 0;
        String rowData;
        while(true) {
            rowData = br.readLine();
            if(rowData == null) break;
            rowNumber++;
            System.out.println(rowNumber+": "+rowData);
        }

        br.close(); fr.close();
    }
}