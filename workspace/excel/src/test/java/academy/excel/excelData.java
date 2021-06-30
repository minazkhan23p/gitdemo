package academy.excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import com.microsoft.schemas.office.visio.x2012.main.CellType;

public class excelData {
@Test
	public ArrayList<String> Exceltest(String Tetscasename) throws IOException {
	ArrayList<String> ExcelData=new ArrayList<String>();
		FileInputStream fis = new FileInputStream("D:\\SS1\\exceldemo.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		int numberOfSheets = workbook.getNumberOfSheets();
		for (int i = 0; i < numberOfSheets; i++) {
			if (workbook.getSheetName(i).equalsIgnoreCase("My work")) {
				XSSFSheet sheet = workbook.getSheetAt(i);
				//identify the tc column in first row 
				Iterator<Row>rows=sheet.iterator();
				Row firstRow=rows.next();
				Iterator<Cell> firstRowCellIterator=firstRow.cellIterator();
				int columnNumber=0;
				while(firstRowCellIterator.hasNext()){
					Cell FirstRowCellValues=firstRowCellIterator.next();
					if(FirstRowCellValues.getStringCellValue().equalsIgnoreCase("TestCases")){
						 
						break;
					}
					columnNumber++;
				}
				while(rows.hasNext()){
					Row rowIterator =rows.next();
					if(rowIterator.getCell(columnNumber).getStringCellValue().contains(Tetscasename)){
						Iterator<Cell> WantedRowcellValues=rowIterator.cellIterator();
						while(WantedRowcellValues.hasNext()){
							Cell cv=WantedRowcellValues.next();
							if(cv.getCellType()== org.apache.poi.ss.usermodel.CellType.STRING){
								ExcelData.add(cv.getStringCellValue());
							}
							else {
								String Ncv=NumberToTextConverter.toText(cv.getNumericCellValue());
								ExcelData.add(Ncv);
							}
							
						}
					}
				}
				//Once column is identifies we need to search for the paerticular test case name
				System.out.println(columnNumber);
				
			}
			
		}
		return ExcelData;

	}
}
