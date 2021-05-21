package com.aspire.qa.utility;

import java.io.File;
import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;
import java.util.Properties;


public class ConfigDataProvider {    
	
	Properties pro;
		
		public ConfigDataProvider()
		{
			
			File src=new File("./Config/Config.properties");
			try {
				FileInputStream fis=new FileInputStream(src);
				pro=new Properties();
				pro.load(fis);
			}
			catch (Exception e) {
				System.out.println("not able to load config file"+e.getMessage());
				
			}
			
}
		
		
		public String getDataFromConfig(String keyToSearch) 
		{
			return pro.getProperty(keyToSearch);
		}
		
		public String getBrowser() {
			
			return pro.getProperty("Browser");
			
		}
		
		public String getURL() {
			
			return pro.getProperty("URL");
		}
		
		
		}
