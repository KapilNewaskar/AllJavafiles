package programs;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class GetMethodEmployeeInfoEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// To validate json body
		//Note: i changed the URI, below line is the example
		//http://dummy.restapiexample.com/api/v1/employees
		//https://reqres.in/api/users?page=1
		
		String emp_name = "George";
		RestAssured.baseURI="https://reqres.in";
		given().
				param("page","1").
		when().
				get("/api/users").
		then().
			assertThat().statusCode(200).and().body("data[0].first_name", equalTo(emp_name));
		System.out.println("Status code is 200 OK");
		System.out.println("emp name is " + emp_name + " Emp Name validation is done successfully");
		
		
		//Verify the "Emp Name" and "Email" of the First Emp from body.
//		String email = "george.bluth@reqres.in";
//		given().
//		param("page","1").
//		when().
//		get("/api/users").		
//		then().assertThat().statusCode(200).and().contentType(ContentType.JSON).and().
//		body("data[0].first_name",equalTo(emp_name)).
//		body("data[0].email",equalTo(email));
//		System.out.println("verifying the emp Name and email is Done");
		
		String email = "george.bluth@reqres.in";
		given().
		param("page","1").
		when().
		get("/api/users").
		then().assertThat().statusCode(200).and().contentType(ContentType.JSON).and().
		body("data[0].email",equalTo(email));
		System.out.println("verifying the emp Name and email is Done");
		
		
		String name1 = "Janet";
		given().
		param("page", "1").
		when().
		get("/api/users").
		then().assertThat().statusCode(200).and().contentType(ContentType.JSON).and().
		body("data[1].first_name",equalTo(name1));
		System.out.println("all passss");
	}	

}
