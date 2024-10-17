package org.example;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelUtils {

    public static FileInputStream fi;
    public static FileOutputStream fo;
    public static XSSFWorkbook wb;
    public static XSSFSheet ws;
    public static XSSFRow row;
    public static XSSFCell cell;

    public static int getCellc(String filepath, String xlsheet) throws IOException {

        fi = new FileInputStream(filepath);
        wb = new XSSFWorkbook(fi);
        ws = wb.getSheet(xlsheet);
        int row = ws.getLastRowNum();
        wb.close();
        fi.close();
        return row;
    }

    public static int getCellc(String filepath, String xlsheet, int rows) throws IOException {
        fi = new FileInputStream(filepath);
        wb = new XSSFWorkbook(fi);
        ws = wb.getSheet(xlsheet);
        row = ws.getRow(rows);
        int cell = row.getLastCellNum();
        wb.close();
        fi.close();
        return cell;
    }

    public static String getCellData(String filepath, String xlsheet, int rows, int cells) throws IOException {
        fi = new FileInputStream(filepath);
        wb = new XSSFWorkbook(fi);
        ws = wb.getSheet(xlsheet);
        row = ws.getRow(rows);
        cell = row.getCell(cells);

        String data;
        try {
            data = cell.toString();

        } catch (Exception e) {
            data = "";
        }

        wb.close();
        fi.close();
        return data;
    }

    public static void setCellValue(String filepath, String xlsheet, int rows, int cells, String data) throws IOException {
        fi = new FileInputStream(filepath);
        wb = new XSSFWorkbook(fi);
        ws = wb.getSheet(xlsheet);
        row = ws.getRow(rows);
        cell = row.createCell(cells);
        cell.setCellValue(data);

        fo = new FileOutputStream(filepath);
        wb.write(fo);
        wb.close();
        fo.close();
        fi.close();

    }

}
