/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iccconstruct.labsystem.view.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 *
 * @author Dilini Peiris
 */
public class ZipUtils {

    private List<String> fileList;
    private List<File> files;
    private static String OUTPUT_ZIP_FILE;
    private static String SOURCE_FOLDER = "_data"; // SourceFolder path

    public ZipUtils() {
        fileList = new ArrayList<String>();
        files = new ArrayList<>();
    }

    public static void entry(String output) throws FileNotFoundException {
        OUTPUT_ZIP_FILE = output + "\\";
        ZipUtils appZip = new ZipUtils();
        appZip.generateFileList(new File(SOURCE_FOLDER));
        appZip.zipIt(OUTPUT_ZIP_FILE);
    }

    public void zipIt(String zipFile) throws FileNotFoundException {
        byte[] buffer = new byte[1024];
        String source = new File(SOURCE_FOLDER).getName();
        FileOutputStream fos = null;
        ZipOutputStream zos = null;
        try {
            fos = new FileOutputStream(zipFile);
            zos = new ZipOutputStream(fos);

            System.out.println("Output to Zip : " + zipFile);
            FileInputStream in = null;

            for (int i = 0; i < files.size(); i++) {
                System.out.println("File Added : " + fileList.get(i));
                ZipEntry z = new ZipEntry(source);
                ZipEntry ze = new ZipEntry(source + File.separator + fileList.get(i));
                zos.putNextEntry(ze);
                try {
                    in = new FileInputStream(SOURCE_FOLDER + File.separator + fileList.get(i));
                    int len;
                    while ((len = in.read(buffer)) > 0) {
                        zos.write(buffer, 0, len);
                    }
                } finally {
                    in.close();
                }
            }
//            for (String file: this.fileList) {
//                System.out.println("File Added : " + file);
//                ZipEntry ze = new ZipEntry(source + File.separator + file);
//                zos.putNextEntry(ze);
//                try {
//                    in = new FileInputStream(SOURCE_FOLDER + File.separator + file);
//                    int len;
//                    while ((len = in .read(buffer)) > 0) {
//                        zos.write(buffer, 0, len);
//                    }
//                } finally {
//                    in.close();
//                }
//            }

            zos.closeEntry();
            System.out.println("Folder successfully compressed");

        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            try {
                zos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void generateFileList(File node) {
        // add file only
        if (node.isFile()) {
            fileList.add(generateZipEntry(node.toString()));
            files.add(node);
        }

        if (node.isDirectory()) {

            File[] listFiles = node.listFiles();
            for (File listFile : listFiles) {
                generateFileList(listFile);
            }
        }
    }

    private String generateZipEntry(String file) {
        return file.substring(SOURCE_FOLDER.length() + 1, file.length());
    }
}
