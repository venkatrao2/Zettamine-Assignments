package com.zettamine.java.day05.assignment03;

import java.io.File;

public class RenameFile {
	private static final String NEW_FILE_NAME = "C:\\Users\\Venkatarao\\Documents\\Guntur.txt";
	private static final String OLD_FILE_NAME = "C:\\Users\\Venkatarao\\Documents\\Hyd.txt";

	public static void main(String[] args) {
		
		File f = new File(OLD_FILE_NAME);
		File rename = new File(NEW_FILE_NAME);
		if(f.exists()) {
			f.renameTo(rename);
			System.out.println("File Renamed Successfully--->");
		}
		else {
			System.err.println("File does not exists....");
		}
	}

}


