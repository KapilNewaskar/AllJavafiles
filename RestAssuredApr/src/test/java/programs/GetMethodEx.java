package programs;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import scala.collection.mutable.HashMap;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
//import org.testng.annotations.Test;

public class GetMethodEx {
	
	/*@Test
	public void TestRESTAPI(){*/
	public static void main(String[] args) {
		RestAssured.baseURI = "https://postman-echo.com";
		//https://postman-echo.com/cookies/set?foo1=bar1&foo2=bar2
		// to validate the sttus
		given().
				param("foo1","bar1").
				param("foo2","bar2").
		when().
				get("/cookies/set").
		then().
				//assertThat().statusCode(200);
		 assertThat().statusCode(200);
		System.out.println("status code is 200 and PASS");
		
		
		// to validate the status and content type
		RestAssured.baseURI = "https://postman-echo.com";
		given().
				param("foo1","bar1").
				param("foo2","bar2").
		when().
				get("/cookies/set").
		then().
				assertThat().statusCode(200).and().contentType(ContentType.JSON);
		System.out.println("status code is 200 and Content type is Json");
		
		
		

		
		
	}
	
}
