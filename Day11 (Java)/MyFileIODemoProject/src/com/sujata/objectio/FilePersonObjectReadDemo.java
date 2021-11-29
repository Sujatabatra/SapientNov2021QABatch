package com.sujata.objectio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class FilePersonObjectReadDemo {

	public static void main(String[] args) {
		FileInputStream fileInputStream=null;
		ObjectInputStream objectInputStream=null;
		
		try {
			fileInputStream=new FileInputStream("PersonData");
			objectInputStream=new ObjectInputStream(fileInputStream);
			
			Person person=(Person)objectInputStream.readObject();
			System.out.println(person);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		finally {
			try {
				objectInputStream.close();
				fileInputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
