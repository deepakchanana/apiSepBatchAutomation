package org.testing.testCases;

import java.io.IOException;
import java.util.Properties;

import org.testing.testSteps.HTTPMethods;
import org.testing.utilities.HandleProperties;
import org.testng.annotations.Test;

public class TC2_GetAllRequest
{

	@Test
	public void testcase2() throws IOException
	{
		Properties probject= HandleProperties.loadPropertiesFile("../API_Sep_FW/URI.properties");
		HTTPMethods http=new HTTPMethods(probject);
		http.getAllRequest("QA_URI");
	}
}
