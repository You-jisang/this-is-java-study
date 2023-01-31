package c18.sec11;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilesExample {
    public static void main(String[] args) {
        try {
            String data = "" +"id: winter\n" +
                    "email: winter.com\n" + "tel: 010-123-456";

            Path path = Paths.get("C:/Temp/user.txt");

            Files.writeString(Paths.get("C:/Temp/user.txt"), data, Charset.forName("UTF-8"));

            System.out.println(Files.probeContentType(path));
            System.out.println(Files.size(path));

            String content = Files.readString(path, Charset.forName("UTF-8"));
            System.out.printf(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
