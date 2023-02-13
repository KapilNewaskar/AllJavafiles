package Basics_Project;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import Files.Payload;

public class Json_File_Path {

	public static void main(String[] args) throws Exception {

		// given = all input details
		// when = Submit the API (Resource and http method)
		// then = validate the response

		RestAssured.baseURI = "https://rahulshettyacademy.com";

		//Add Place
		//content of file to string >> content of file can convert into Byte >> Byte data to string
		
	String response =	given().log().all().queryParam("key", "qaclick123").header("Content-Type", "application/json")
				.body(new String(Files.readAllBytes(Paths.get("C:\\Users\\newas\\OneDrive\\Desktop\\Git\\API\\Json File\\Add_Place.json"))))
		.when().post("maps/api/place/add/json")
		.then().statusCode(200).body("scope", equalTo("APP")).header("Server", "Apache/2.4.41 (Ubuntu)")
		.extract().response().asString();
	
	System.out.println(response);

	JsonPath js = new JsonPath(response);
	
	String PlaceId =  js.getString("place_id");
	
	System.out.println(PlaceId);
	
	
	//Update Place
	
	String NewAddress = "70 Summer walk, USA";
	
	given().log().all().queryParam("key", "qaclick123").header("Content-Type", "application/json")
	.body("{\r\n"
			+ "\"place_id\":\""+PlaceId+"\",\r\n"
			+ "\"address\":\""+NewAddress+"\",\r\n"
			+ "\"key\":\"qaclick123\"\r\n"
			+ "}")
	.when().put("maps/api/place/update/json")
	.then().log().all().statusCode(200).body("msg", equalTo("Address successfully updated"));
	
	//Get Place
	
	String getPlaceResponse =  given().log().all().queryParam("key", "qaclick123").queryParam("place_id", PlaceId)
	.when().get("maps/api/place/get/json")
	.then().assertThat().log().all().statusCode(200).extract().response().asString();
	
	JsonPath js1 =new JsonPath(getPlaceResponse);
	
	String ActualAddress = js1.getString("address");
	
	assertEquals(ActualAddress, NewAddress);
	
	
	
	
	}
}
