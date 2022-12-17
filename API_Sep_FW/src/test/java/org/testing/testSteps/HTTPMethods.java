package org.testing.testSteps;

import java.util.Properties;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

import static com.jayway.restassured.RestAssured.*;

public class HTTPMethods
{
	Properties pr;
	public HTTPMethods(Properties pr)  
	{
		this.pr=pr;
	}

	public Response postrequest(String uriKey,String bodyData)
	{
		String uriValue= pr.getProperty(uriKey);
		Response res=
		given()
		.contentType(ContentType.JSON)
		.body(bodyData)
		.when()
		.post(uriValue);
		
		System.out.println("Status code is ");
		System.out.println(res.statusCode());
		return res;
	}
	
	public void getAllRequest(String uriKey)
	{
		Response res=
		given()
		.contentType(ContentType.JSON)
		.when()
		.get(pr.getProperty(uriKey));
		
		System.out.println("Status code is ");
		System.out.println(res.statusCode());
		System.out.println("Response data is ");
		System.out.println(res.asString());
	}
	
	
	public void updateRequest(String uriKey,String idValue,String bodyData)
	{
		String uri=pr.getProperty(uriKey)+"/"+idValue;		
		Response res=
		given()
		.contentType(ContentType.JSON)
		.body(bodyData)
		.when()
		.put(uri);
		System.out.println("Status code is ");
		System.out.println(res.statusCode());
		System.out.println("Response is ");
		System.out.println(res.asString());
	}
	
	
	public void getParticularRecord(String uriKey,String idValue)
	{
		String uri=pr.getProperty(uriKey)+"/"+idValue;
		
		Response res=
		given()
		.contentType(ContentType.JSON)
		.when()
		.get(uri);
		
		System.out.println("Status code is ");
		System.out.println(res.statusCode());
		System.out.println("Response data is ");
		System.out.println(res.asString());
	}
	
	public void deleteRequest(String uriKey,String idValue)
	{
		String uri=pr.getProperty(uriKey)+"/"+idValue;
		Response res=
		given()
		.contentType(ContentType.JSON)
		.when()
		.delete(uri);
		
		System.out.println("Status code is ");
		System.out.println(res.statusCode());
	}
}
