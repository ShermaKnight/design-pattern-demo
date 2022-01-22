package org.example.file;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;

import java.io.File;
import java.io.IOException;
import java.util.Optional;

@SuppressWarnings("all")
public class FileReceiver {

    public boolean rename(String path, String destination) {
        if (StringUtils.isEmpty(path) || StringUtils.isEmpty(destination)) {
            return false;
        }
        File sourceFile = new File(path);
        if (sourceFile == null || !sourceFile.exists()) {
            return false;
        }
        File destinationFile = new File(destination);
        if (destination == null || destinationFile.exists()) {
            return false;
        }
        return sourceFile.renameTo(destinationFile);
    }

    public boolean copy(String source, String destination) {
        if (StringUtils.isEmpty(source) || StringUtils.isEmpty(destination)) {
            return false;
        }
        File sourceFile = new File(source);
        if (sourceFile == null || !sourceFile.exists()) {
            return false;
        }
        File destinationFile = new File(destination);
        if (destination == null || destinationFile.exists()) {
            return false;
        }
        try {
            FileUtils.copyFile(sourceFile, destinationFile);
            return true;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean move(String source, String destination) {
        if (StringUtils.isEmpty(source) || StringUtils.isEmpty(destination)) {
            return false;
        }
        File sourceFile = new File(source);
        if (sourceFile == null || !sourceFile.exists()) {
            return false;
        }
        File destinationFile = new File(destination);
        if (destination == null || destinationFile.exists()) {
            return false;
        }
        try {
            FileUtils.moveFile(sourceFile, destinationFile);
            return true;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean remove(String path) {
        if (StringUtils.isEmpty(path)) {
            return false;
        }
        File file = new File(path);
        if (file == null || !file.exists()) {
            return false;
        }
        try {
            FileUtils.delete(file);
            return true;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }
}
