package utility;

import java.io.File;
import java.io.FileInputStream;

public class excelutil {
	public static String getCellvalues(String x1,String Sheet,int r,int c)
	{
		try
		{
			File f=new File(x1);
			FileInputStream fi=new FileInputStream(f);
			XSSFWorkbook wb=new XSSFWorkbook(fi);
			
			XSSFCell cell=(XSSFCell) wb.getSheet(Sheet).getRow(r).get
					if(cell.getCellType()==CellType.STRING)
					{
						return cell.getStringCellValues();
					}
					else
						try
			{
							File f=new File(x1);
							FileInputStream fi=new FileInputStream(f);
							XSSFWorkbook wb=new XSSFWorkbook(fi);
							return wb.getSheet(Sheet())
			}
			
		}
	}

}
