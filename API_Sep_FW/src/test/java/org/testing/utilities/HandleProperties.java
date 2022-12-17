package org.testing.utilities;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

// purpose of this method----> Load the properties file
// input parameter ? --------> Properties file path
// output ? -----------------? it will return the object of the properties class

public class HandleProperties 
{
  public static Properties loadPropertiesFile(String filePath) throws IOException
  {
	  File f=new File(filePath);
	  FileReader fr=new FileReader(f);
	  Properties pr=new Properties();
	  pr.load(fr);
	  return pr;
  }
}
