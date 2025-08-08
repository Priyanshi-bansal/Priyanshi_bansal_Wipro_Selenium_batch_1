package classDemo;

import java.util.Scanner;

public class Drivefile {
    String fileName;
    String fileType;
    double fileSize;

    void uploadFile(String name, String type, double size) {
        fileName = name;
        fileType = type;
        fileSize = size;
        System.out.println("File '" + fileName + "' uploaded successfully!\n");
    }

    void downloadFile() {
        System.out.println("=== Downloading File ===");
        System.out.println("File Name : " + fileName);
        System.out.println("File Type : " + fileType);
        System.out.println("File Size : " + fileSize + " MB");
        System.out.println("Download complete.\n");
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Drivefile file1 = new Drivefile();

        System.out.print("Enter File Name: ");
        String name = sc.nextLine();

        System.out.print("Enter File Type (pdf, docx, jpg): ");
        String type = sc.nextLine();

        System.out.print("Enter File Size in MB: ");
        double size = sc.nextDouble();

        file1.uploadFile(name, type, size);
        file1.downloadFile();

        sc.close();
    }
}
