package Assessment_API;

import static io.restassured.RestAssured.given;

import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Testcase1 {
	

	@Test(dataProvider = "Valuesfromexcel")
	public void datasourceexample(String firstname,String status,String stream,String lastname) {
		RestAssured.baseURI = "http://localhost:3000/";
		JSONObject rootbodyobject = new JSONObject();
		JSONObject categoryobject = new JSONObject();
		JSONObject tagsobject = new JSONObject();
		rootbodyobject.put("id", 0);
		rootbodyobject.put("firstname",firstname);
		rootbodyobject.put("status",status);

		
		categoryobject.put("id", 0);
		categoryobject.put("stream",stream);

		tagsobject.put("id", 0);
		tagsobject.put("lastname", lastname);

		// Adding the Category and Tags object into the Rootbody
		rootbodyobject.put("category", categoryobject);
		rootbodyobject.put("tags", tagsobject);

		System.out.println(rootbodyobject);

		given().body(rootbodyobject.toJSONString()).headers("content-type", "Application/JSON").when().post("posts")
				.then()
				.statusCode(201).log().all();

                
	}
	
	@DataProvider(name = "Valuesfromexcel")
	public Object[][] exceldata() throws IOException {
		Object[][] data = Valuesfromexcel.gettestdata();

		return data;

	}


}