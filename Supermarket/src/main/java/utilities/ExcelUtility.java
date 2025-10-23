package utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import constant.Constant;

public class ExcelUtility {
		
	static FileInputStream f;
	static XSSFWorkbook wb;
	static XSSFSheet sh;
	
	public static String getStringData(int a,int b,String sheet) throws IOException  // a-row value b-cell value
	{
		f=new FileInputStream(Constant.TESTDATAFILE);
		wb= new XSSFWorkbook(f);
		sh=wb.getSheet(sheet);
		XSSFRow r =sh.getRow(a); //to get data from row
		XSSFCell c = r.getCell(b); //to get cell details from row
		return c.getStringCellValue(); //method to access value from string
	}
	public static String getIntegerData(int a,int b,String sheet) throws IOException
	{
	f=new FileInputStream(Constant.TESTDATAFILE);
	wb= new XSSFWorkbook(f);
	sh=wb.getSheet(sheet);
	XSSFRow r =sh.getRow(a); //to get data from row
	XSSFCell c = r.getCell(b); //to get cell details from row
	int m =(int) c.getNumericCellValue(); //typecasting to convert double to int
	return String.valueOf(m); //typeconvesion-to convert any datatype into string
	}
	
	public static String getFloatData(int a,int b,String sheet) throws IOException
	{
	f=new FileInputStream(Constant.TESTDATAFILE);
	wb= new XSSFWorkbook(f);
	sh=wb.getSheet(sheet);
	XSSFRow r =sh.getRow(a); //to get data from row
	XSSFCell c = r.getCell(b); //to get cell details from row
	float m =(float) c.getNumericCellValue();
	return String.valueOf(m);
	}
}
