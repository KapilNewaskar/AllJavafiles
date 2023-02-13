package Basics_Project;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Files.Payload;
import static org.hamcrest.Matchers.*;
import static io.restassured.RestAssured.*;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class LibraryApi {

	@Test(dataProvider = "BooksData" )
	public void PostBook(String isbn,String aisle) {

		RestAssured.baseURI = "http://216.10.245.166";

		String resp = given().header("Content-Type", "application/json").body(Payload.AddBook(isbn,aisle)).when()
				.post("Library/Addbook.php").then().assertThat().statusCode(200).log().all().body("Msg",equalTo("successfully added")).extract().response().asString();

		JsonPath js = new JsonPath(resp);
		String id = js.get("ID");
		System.out.println(id);
		
		//delete
		
		given().header("Content-Type", "application/json").log().all().body("{\r\n"
				+ "\"ID\": \""+id+"\"\r\n"
				+ "}")
		.when().delete("Library/DeleteBook.php")
		.then().statusCode(200).log().all().body("msg", equalTo("book is successfully deleted"));
		
	}
	
	@DataProvider(name = "BooksData")
	public Object[][] getData() {
		
		return new Object[][] {{"K4ss4","456576"},{"K4asfss4","4565576"},{"K4ss4dsf","4565576"},{"K4hgfss4","4565676"}};
	
	}
}
