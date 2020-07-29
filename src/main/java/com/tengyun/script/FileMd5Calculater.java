package com.tengyun.script;



import org.springframework.util.DigestUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

/**
 * @author Adam
 */
public class FileMd5Calculater {
    public void getFilePathListByPath(String dir, ArrayList<String> filePathList) {
        File parentDir = new File(dir);

        for (File file: Objects.requireNonNull(parentDir.listFiles())) {
            if (file.isFile()){
                filePathList.add(file.getAbsolutePath());
            }
            else if(file.isDirectory()){
                getFilePathListByPath(file.getPath(), filePathList);
            }
        }
    }

    public Map<String, String> getFilePathAndMd5MapByFilePathList(ArrayList<String> filePathList) throws IOException {
        Map<String, String> filePathAndMd5Map = new HashMap<>(16);
        for(String filePath: filePathList){
            String md5Value = getMd5ByFilePath(filePath);
            filePathAndMd5Map.put(filePath, md5Value);
        }

        return filePathAndMd5Map;
    }

    private String getMd5ByFilePath(String filePath) throws IOException {
        String md5Value = DigestUtils.md5DigestAsHex(new FileInputStream(filePath));
        System.out.println("md5Value: " + md5Value);
        return md5Value;
    }

    public static void main(String[] args) throws IOException {
        FileMd5Calculater fmc = new FileMd5Calculater();
        String rootPath = "E:\\Adam\\book\\李笑来\\定投改变命运";
        ArrayList<String> filePathList = new ArrayList<>();

        fmc.getFilePathListByPath(rootPath, filePathList);
        filePathList.forEach(System.out::println);
        System.out.println("filePathList.size(): " + filePathList.size());

        Map<String, String> filePathAndMd5Map = fmc.getFilePathAndMd5MapByFilePathList(filePathList);
        Set<String> md5Set = new HashSet<>();
        filePathAndMd5Map.forEach((key, value) -> {
            System.out.println(key + ": " + value);
            md5Set.add(value);
        });
        md5Set.forEach(System.out::println);
        System.out.println("filePathAndMd5Map.size(): " + filePathAndMd5Map.size());
        System.out.println("md5Set.size(): " + md5Set.size());

    }
}
