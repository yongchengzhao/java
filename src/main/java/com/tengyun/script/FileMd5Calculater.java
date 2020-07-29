package com.tengyun.script;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Objects;
import java.util.Set;
import java.util.HashSet;
import org.springframework.util.DigestUtils;

/**
 * @author Adam
 */
public class FileMd5Calculater {

    /**
     * 根据传入的文件夹路径使用递归算法获取该路径下所有的文件路径列表。
     * @param dir 根路径
     * @param filePathList 保存子文件路径的列表
     */
    public void getFilePathListByPath(String dir, List<String> filePathList) {
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

    /**
     * 根据文件路径列表生成路径和 MD5 值键值对，键为路径，值为 MD5 值。
     * @param filePathList 子文件路径列表
     * @return 子文件路径和 MD5 值键值对 map
     * @throws IOException 不处理异常
     */
    public Map<String, String> getFilePathAndMd5MapByFilePathList(List<String> filePathList) throws IOException {
        Map<String, String> filePathAndMd5Map = new HashMap<>(16);
        for(String filePath: filePathList){
            String md5Value = getMd5ByFilePath(filePath);
            filePathAndMd5Map.put(filePath, md5Value);
        }

        return filePathAndMd5Map;
    }

    /**
     * 根据文件路径生成并返回该文件的 MD5 值。
     * @param filePath 文件路径
     * @return MD5 值
     * @throws IOException 不处理异常
     */
    private String getMd5ByFilePath(String filePath) throws IOException {
        String md5Value = DigestUtils.md5DigestAsHex(new FileInputStream(filePath));
        System.out.println("md5Value: " + md5Value);

        return md5Value;
    }

    public static void main(String[] args) throws IOException {
        // 准备数据，设置需要遍历的文件夹根路径
        FileMd5Calculater fmc = new FileMd5Calculater();
        String rootPath = "E:\\Adam\\book\\李笑来\\定投改变命运";
        List<String> filePathList = new ArrayList<>();

        // 获取子文件路径列表并遍历
        fmc.getFilePathListByPath(rootPath, filePathList);
        filePathList.forEach(System.out::println);
        System.out.println("filePathList.size(): " + filePathList.size());

        // 获取子文件路径和 MD5 值 map 并遍历。将所有 MD5 值存入 set 用于去重，并遍历该 set。
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
