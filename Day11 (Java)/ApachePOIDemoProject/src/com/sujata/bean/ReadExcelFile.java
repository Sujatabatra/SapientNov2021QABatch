package com.sujata.bean;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelFile {

	public static List<Country> readExcelData(String fileName){
		List<Country> countryList=new ArrayList<Country>();
		FileInputStream fileInputStream=null;
		try {
			fileInputStream=new FileInputStream(fileName);
			
			Workbook workbook=null;
			if(fileName.toLowerCase().endsWith("xlsx")) {
				workbook=new XSSFWorkbook(fileInputStream);
			}
			else if(fileName.toLowerCase().endsWith("xls")) {
				workbook=new HSSFWorkbook(fileInputStream);
			}
			
			int numberOfSheets=workbook.getNumberOfSheets();
			
			for(int index=0;index<numberOfSheets;index++) {
				
				Sheet sheet=workbook.getSheetAt(index);
				
				Iterator<Row> rowIterator=sheet.iterator();
				while(rowIterator.hasNext()) {
					String name="";
					String shortCode="";
					
					Row row=rowIterator.next();
					
					Iterator<Cell> cellIterator=row.cellIterator();
					
					while(cellIterator.hasNext()) {	
						Cell cell=cellIterator.next();
						
						switch(cell.getCellType()) {
						case Cell.CELL_TYPE_STRING:
							if(shortCode.equalsIgnoreCase("")){
								shortCode=cell.getStringCellValue().trim();
							}
							else if(name.equalsIgnoreCase("")) {
								name=cell.getStringCellValue().trim();
							}
							else {
								System.out.println("Random Data :: "+cell.getStringCellValue());
							}
							break;
						case Cell.CELL_TYPE_NUMERIC:
							System.out.println("Random Data ::: "+cell.getNumericCellValue());
						}
					}
					Country counrty=new Country(name,shortCode);
					countryList.add(counrty);
				}
				
				
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		finally {
			try {
				fileInputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return countryList;
	}
	
	public static void main(String[] args) {
		List<Country> list=readExcelData("Sample.xlsx");
		System.out.println("Country List : "+list);

	}

}
