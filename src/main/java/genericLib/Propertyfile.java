package genericLib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Propertyfile {
	
	public String getdata(String key) throws IOException 
	{
		Properties p=new Properties();
		FileInputStream fis=new FileInputStream(autoCostant.propertyfilePath);  // paramater gives path of property file
		p.load(fis);
	    return p.getProperty(key);
		
	}

}