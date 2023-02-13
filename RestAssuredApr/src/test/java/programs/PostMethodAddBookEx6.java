package programs;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import io.restassured.RestAssured;

public class PostMethodAddBookEx6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//get the request string from the method
		JsonRequest obj = new JsonRequest();
		
		RestAssured.baseURI = "http://216.10.245.166/";	
		
		//Send request with parameter
		String response2 = given().log().body().
				header("Content-Type","application/json")
		.body(obj.addLibrary2("2.1")).
		when().
				post("Library/Addbook.php")
		.then().log().body().extract().response().asString();
		
		System.out.println(response2);
		
	}

}
