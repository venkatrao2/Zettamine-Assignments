package com.zettamine.java.day05.assignment04;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class ProductDeserialize {

	public static void main(String[] args) {
		FileInputStream fis;
		ObjectInputStream ois;

		Product pd;

		try {
			String FILE_NAME = "C:\\Users\\Venkatarao\\Documents\\product\\productsaving";
			fis = new FileInputStream(FILE_NAME);
			ois = new ObjectInputStream(fis);

			List<Product> l = (List<Product>) ois.readObject();

			for (Product s : l) {
				System.out.println(s);
			}

			ois.close();
			fis.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
