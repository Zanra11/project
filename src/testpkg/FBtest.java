package testpkg;

import org.testng.annotations.Test;

import basepkg.baseclass;
import pagespkg.FBpage;
import utility.excelutil;

public class FBtest extends  baseclass{
	@Test
	public void verifyLoginWithValidCred()
	{
		FBpage p1=new FBpage(driver);
		String x1 ="C:\\Users\\CYBERHUB\\OneDrive\\Desktop";
		String Sheet="Sheet1";
		int rowCount=excelutil.getRowCount(x1,Sheet);
		for (int i=1;i<=rowCount;i++)
		{
			String UserName=excelutil.getCellvalues(x1, Sheet, i, 0);
			System.out.println("username---"+UserName);
			String pwd=excelutil.getCellvalues(x1, Sheet, i, 1);
			System.out.println("password---"+pwd);
			p1.setvalues(UserName, pwd);
			p1.login();
			
		}
	}

}
