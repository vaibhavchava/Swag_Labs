package Saucedemo_Automation.Saucedemo_Automation;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;


import StepDef.Test_Base;

public class Utility extends Test_Base {
	private static Workbook wb;
    private static Sheet sh;
    private static Cell cell;
    private static Map<String, Integer> columns = new HashMap<>();
    
//    public static String getCellData(int rownum, int colnum) throws Exception {
//        try {
//        	File fis = new File(oc.excel_Path);
//            wb = WorkbookFactory.create(fis);
//            sh = wb.getSheet("Sheet1");
//            cell = sh.getRow(rownum).getCell(colnum);
//            String CellData = null;
//            switch (cell.getCellType()) {
//                case STRING:
//                    CellData = cell.getStringCellValue();
//                    break;
//                case NUMERIC:
//                    if (DateUtil.isCellDateFormatted(cell)) {
//                        CellData = String.valueOf(cell.getDateCellValue());
//                    } else {
//                        CellData = String.valueOf((long) cell.getNumericCellValue());
//                    }
//                    break;
//                case BOOLEAN:
//                    CellData = Boolean.toString(cell.getBooleanCellValue());
//                    break;
//                case BLANK:
//                    CellData = "";
//                    break;
//            }
//            return CellData;
//        } catch (Exception e) {
//            return "";
//        }
//    }
    
//    public static String readData(int rowNumber, int CellNumber) throws Exception {
//    	
//    	File file = new File("");
//    	FileInputStream fis = new FileInputStream(file);
//    	XSSFWorkbook wb = new XSSFWorkbook(fis);
//    	XSSFSheet sheet = wb.getSheetAt(0);
//    	cell = sheet.getRow(rowNumber).getCell(CellNumber);
//        String CellData = null;
//        switch (cell.getCellType()) {
//            case STRING:
//                CellData = cell.getStringCellValue();
//                break;
//            case NUMERIC:
//                if (DateUtil.isCellDateFormatted(cell)) {
//                    CellData = String.valueOf(cell.getDateCellValue());
//                } else {
//                    CellData = String.valueOf((long) cell.getNumericCellValue());
//                }
//                break;
//            case BOOLEAN:
//                CellData = Boolean.toString(cell.getBooleanCellValue());
//                break;
//            case BLANK:
//                CellData = "";
//                break;
//        }
//        return CellData;
//    	
//    }
    
//    public static String getCellData(String columnName, int rownumber) throws Exception {
//        try {
//            File fis = new File(oc.excel_Path);
//            wb = WorkbookFactory.create(fis);
//            sh = wb.getSheet("Sheet1");
//            sh.getRow(0).forEach(cell -> {
//                columns.put(cell.getStringCellValue(), cell.getColumnIndex());
//            });
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//        return getCellData(rownumber, columns.get(columnName));
//    }
    
    
    
	public static String getProperty(String key) throws IOException {
        FileInputStream fp = new FileInputStream("C:\\Users\\hp\\eclipse-workspace\\Saucedemo_Automation\\Cred.properties");
        Properties prop = new Properties();
        prop.load(fp);
        return prop.getProperty(key);
    }
	
	public static void softAssertOf(String actual, String expected){
        SoftAssert as = new SoftAssert();
        as.assertEquals(actual,expected);
        as.assertAll();
       
    }
	
	public static void selectOptionFromDropdown(WebElement ele, String value){
        Select drp = new Select(ele);
        List<WebElement> allOptions = drp.getOptions();
        for(WebElement option : allOptions){
            if(option.getText().equalsIgnoreCase(value)){
                option.click();
                break;
            }
        }
    }

}
