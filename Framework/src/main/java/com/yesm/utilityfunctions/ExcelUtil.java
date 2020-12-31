package com.yesm.utilityfunctions;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtil {


static XSSFWorkbook workbook=null;
 static XSSFSheet sheet=null;

 public static void getSheet() {
  try {
   workbook=new XSSFWorkbook("C:\\Users\\priya\\eclipse-framework\\Framework\\Data\\login.xlsx");
  } catch (IOException e) {
   // TODO Auto-generated catch block
   e.printStackTrace();} 
  sheet=workbook.getSheet("Sheet1"); 
 }

 public static int getRowCount() {
  ExcelUtil.getSheet();
  int rowcount=sheet.getPhysicalNumberOfRows(); 
  return rowcount;
 }

 public static int getColumnCount() {
  ExcelUtil.getSheet();
  int columnCount=sheet.getRow(0).getPhysicalNumberOfCells();  
  return columnCount;
 } 

 public static String getData(int row, int coulmn) {
  ExcelUtil.getSheet();
  String data= sheet.getRow(row).getCell(coulmn).getStringCellValue();
  return data;  
 }

	
	
}
