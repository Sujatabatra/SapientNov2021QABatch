package com.sujata.chario;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileCharReadDemo {

	public static void main(String[] args) {
		
		FileReader fileReader=null;
		
		try {
			fileReader=new FileReader("DemoCharIO");
			int ch;
			while((ch=fileReader.read())!=-1) {
				System.out.print((char)ch);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				fileReader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		

	}

}
