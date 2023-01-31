package c18;

import java.io.*;
import java.security.spec.ECField;
import java.util.Scanner;

public class BufferExample {
    public static void main(String[] args){
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.print("원본 파일 경로: ");
            String originalfilePath = scanner.nextLine();

            System.out.print("복사 파일 경로: ");
            String copyfilePath = scanner.nextLine();

            File file = new File(originalfilePath);
            if (!file.exists()) {
                System.out.println("원본 파일이 존재하지 않습니다.");
                System.exit(0);
            }

            File copyfile = new File(copyfilePath);
            if (!copyfile.exists()) {
                copyfile.mkdirs();
            }

            FileInputStream fis = new FileInputStream(originalfilePath);
            BufferedInputStream bis = new BufferedInputStream(fis);
            FileOutputStream fos = new FileOutputStream(copyfilePath);
            BufferedOutputStream bos = new BufferedOutputStream(fos);

            byte[] data = new byte[1024];
            while (true) {
                int num = bis.read(data);
                if (num == -1) break;
                bos.write(data, 0, num);
            }
            System.out.println("복사가 성공되었습니다.");
            fis.close();
            fos.close();
            bis.close();
            bos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }





            /*
        String originalFilePath1 = BufferExample.class.getResource("originalFile1.jpg").getPath();
        String targetFilepath1 = "C:/Temp/targetFile1.jpg";
        FileInputStream fis = new FileInputStream(originalFilePath1);
        FileOutputStream fos = new FileOutputStream(targetFilepath1);

        String originalFilePath2 = BufferExample.class.getResource("originalFile2.jpg").getPath();
        String targetFilepath2 = "C:/Temp/targetFile2.jpg";
        FileInputStream fis2 = new FileInputStream(originalFilePath2);
        FileOutputStream fos2 = new FileOutputStream(targetFilepath2);
        BufferedInputStream bis = new BufferedInputStream(fis2);
        BufferedOutputStream bos = new BufferedOutputStream(fos2);

        long nonBufferTime = copy(fis, fos);
        System.out.println(nonBufferTime);

        long bufferTime = copy(bis, bos);
        System.out.println(bufferTime);

        fis.close();
        fos.close();

        bis.close();
        bos.close();
    }

    public static long copy(InputStream is, OutputStream os) throws Exception {
        long start = System.nanoTime();

        while (true) {
            int data = is.read();
            if(data == -1) break;
            os.write(data);
        }

        os.flush();
        long end = System.nanoTime();
        return end - start;*/
    }
}
