package org.testing.utilities;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.JSONObject;
import org.json.JSONTokener;

// purpose of this method--to read any json file
// input parameter ? -- json file path
// output ----the json data in string format

public class HandleJsonFile
{
  public static String readJson(String jsonFilePath) throws FileNotFoundException
  {
	  File f=new File(jsonFilePath);
	  FileReader fr=new FileReader(f);
	  JSONTokener js=new JSONTokener(fr);
	  JSONObject j=new JSONObject(js);
	  return j.toString();
  }
}
