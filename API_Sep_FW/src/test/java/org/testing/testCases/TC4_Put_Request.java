package org.testing.testCases;

import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

import org.testing.testSteps.HTTPMethods;
import org.testing.utilities.HandleJsonFile;
import org.testing.utilities.HandleProperties;
import org.testing.utilities.JsonReplacement;
import org.testng.annotations.Test;

public class TC4_Put_Request
{
	@Test
  public void testCase4() throws IOException
  {
	  Properties probject= HandleProperties.loadPropertiesFile("../API_Sep_FW/URI.properties");
	 
	  String inputBodydata=HandleJsonFile.readJson("../API_Sep_FW/src/test/java/org/testing/resources/RequestBodyForUpdate.json");
      String updatedBodydata=JsonReplacement.jsonDataVariableValue(inputBodydata, "id",TC1_PostRequest.residvalue);
	  HTTPMethods http=new HTTPMethods(probject);
	  http.updateRequest("QA_URI",TC1_PostRequest.residvalue, updatedBodydata);
  }
}
