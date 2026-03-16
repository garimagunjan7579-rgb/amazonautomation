package utilities;

import java.io.FileInputStream;

import java.io.FileInputStream;

public class ExcelUtils {

    public static String getCellData(String path, String sheetName,
                                     int row, int col) {

        try {
            FileInputStream fis = new FileInputStream(path);
            Workbook workbook = WorkbookFactory.create(fis);
            Sheet sheet = workbook.getSheet(sheetName);

            return sheet.getRow(row).getCell(col).toString();

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
