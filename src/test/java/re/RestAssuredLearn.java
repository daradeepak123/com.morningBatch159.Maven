package re;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import utils.ExcelReading;

public class RestAssuredLearn {
	
	
	ExcelReading er=new ExcelReading();
	
	
	@Test
	public void get_calls() throws IOException
	{
		// RestAssured.baseURI="https://reqres.in";
		 RestAssured.baseURI=er.data("API", 0, 0);
			
		 
		  
		  //Request object
		  RequestSpecification httpRequest=RestAssured.given();
		  
		  //Response object
		 // Response response=httpRequest.request(Method.GET,"/api/users/1");
		  Response response=httpRequest.request(Method.GET,er.data("API", 0, 1));
			 
		  //print response in console window
		  
		  String responseBody=response.getBody().asString();
		  System.out.println("Response Body is:" +responseBody);
		  
		  //status code validation
		  int statusCode=response.getStatusCode();
		  System.out.println("Status code is: "+statusCode);
		  Assert.assertEquals(statusCode, 200);
		  
		  //status line verification
		  String statusLine=response.getStatusLine();
		  System.out.println("Status line is:"+statusLine);
		  Assert.assertEquals(statusLine, "HTTP/1.1 200 OK");
		  
	}

}
