package setup;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class GetExcelData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Row row;
		Cell cell;
		try {
			FileInputStream file = new FileInputStream("TestData.xlsx");
			try {
				XSSFWorkbook book = new XSSFWorkbook(file);
				XSSFSheet sheet = book.getSheet("Sheet1");
				Iterator<Row> rowData = sheet.iterator();{
					while(rowData.hasNext()) {
						row = rowData.next();
						Iterator<Cell> cellData = row.cellIterator();
						while(cellData.hasNext()) {
							cell = cellData.next();
							DataFormatter formatter = new DataFormatter();
							String value = formatter.formatCellValue(cell);
						}
					}
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
