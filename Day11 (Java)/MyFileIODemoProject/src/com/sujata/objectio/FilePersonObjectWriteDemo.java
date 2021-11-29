package com.sujata.objectio;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class FilePersonObjectWriteDemo {

	public static void main(String[] args)  {
		
		FileOutputStream fileOutputStream=null;
		ObjectOutputStream objectOutputStream=null;
		
		try {
			fileOutputStream=new FileOutputStream("PersonData");
			objectOutputStream=new ObjectOutputStream(fileOutputStream);
			
			Person person=new Person(101, "Amita Sharma");
			
			objectOutputStream.writeObject(person);
			System.out.println("File Created");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		finally {
			try {
				objectOutputStream.close();
				fileOutputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
