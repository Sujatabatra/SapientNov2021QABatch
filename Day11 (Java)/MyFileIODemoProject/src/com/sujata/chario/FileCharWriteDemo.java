package com.sujata.chario;

import java.io.FileWriter;
import java.io.IOException;

public class FileCharWriteDemo {

	public static void main(String[] args) {
		FileWriter fileWriter=null;
		try {
			fileWriter=new FileWriter("DemoCharIO");
			String str="Sujata Batra\nJava";
			
			fileWriter.write(str);
			System.out.println("File Created");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				fileWriter.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
