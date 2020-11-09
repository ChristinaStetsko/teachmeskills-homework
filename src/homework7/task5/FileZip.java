package homework7.task5;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class FileZip {

    public static void main(String[] args) throws IOException {
        File dir = new File("/home/christina/tmp/task5");  //"D:\\Tmp\\task5"
        boolean created = dir.mkdir();
        if (created) {
            System.out.println("Created folder task5");
        }

        createFiles();

        archivingFiles();

        File newDir = newDirName(dir);

        dirContainsFiles(newDir);

        dileteDir(newDir);
    }

    private static void dileteDir(File newDir) {
        File dirDelete = new File("/home/christina/tmp/task5_renamed");  //D:\Tmp\task5_renamed
        for (File item : newDir.listFiles()) {
            item.delete();
        }
        dirDelete.delete();
        System.out.println("Directory task5_renamed was deleted");
    }

    private static void dirContainsFiles(File newDir) {
        System.out.println("Directory task5_renamed contains: ");
        if (newDir.isDirectory()) {
            for (File item : newDir.listFiles()) {
                System.out.println(item.getName());
            }
        } else {
            System.out.println("There is no such directory");
        }
    }

    private static File newDirName(File dir) {
        File newDir = new File("/home/christina/tmp/task5_renamed");  //D:\Tmp\task5_renamed
        if (dir.renameTo(newDir)) {
            System.out.println("Directory was renamed to task5_renamed");
        }
        return newDir;
    }

    private static void archivingFiles() {
        String zipFile = "/home/christina/tmp/task5.zip";  //D:\\Tmp\\task5.zip
        String[] archiveFiles = {"/home/christina/tmp/task5/File1.txt",
                "/home/christina/tmp/task5/File2.txt",
                "/home/christina/tmp/task5/File3.txt"};  //D:\\Tmp\\task5\\File1.txt", "D:\\Tmp\\task5\\File2.txt", "D:\\Tmp\\task5\\File3.txt"
        try {
            byte[] buffer = new byte[1024];
            FileOutputStream fileOutputStream = new FileOutputStream(zipFile);
            ZipOutputStream zipOutputStream = new ZipOutputStream(fileOutputStream);
            for (int i = 0; i < archiveFiles.length; i++) {
                File arcFile = new File(archiveFiles[i]);
                FileInputStream fis = new FileInputStream(arcFile);
                zipOutputStream.putNextEntry(new ZipEntry(arcFile.getName()));
                int length;
                while ((length = fis.read(buffer)) > 0) {
                    zipOutputStream.write(buffer, 0, length);
                }
                zipOutputStream.closeEntry();
                fis.close();
            }
            zipOutputStream.close();
        } catch (IOException ioe) {
            System.out.println("Error creating zip file: " + ioe);
        }
        System.out.println("The archive vas created");
    }

    private static void createFiles() {
        File file1 = new File("/home/christina/tmp/task5/File1.txt");  //D:\\Tmp\\task5\\File1.txt"
        File file2 = new File("/home/christina/tmp/task5/File2.txt");  //D:\\Tmp\\task5\\File2.txt"
        File file3 = new File("/home/christina/tmp/task5/File3.txt");  //D:\\Tmp\\task5\\File3.txt"
        try (FileWriter fileWriter1 = new FileWriter(file1);
             FileWriter fileWriter2 = new FileWriter(file2);
             FileWriter fileWriter3 = new FileWriter(file3)) {
            fileWriter1.write("Windmill, windmill for the land\nTurn forever hand in hand");
            fileWriter2.write("Take it all in on your stride");
            fileWriter3.write("It is sticking, falling down");
        } catch (IOException e) {
            System.out.println("File not found");
        }
    }
}