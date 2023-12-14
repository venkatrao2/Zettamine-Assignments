package com.zettamine.java.day05.assignment01;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class FileCopy {
	
	public static void main(String[] args) {
        Path sourcePath = Paths.get("C:\\Users\\Venkatarao\\Downloads\\venkatrao.txt");
        Path destinationPath = Paths.get("C:\\Users\\Venkatarao\\Documents\\venkat1.txt");

        try {
            Files.copy(sourcePath, destinationPath, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("File copied successfully!");
        } catch (IOException e) {
            System.err.println(e);
        }
	}

}
