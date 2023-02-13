package programs;

public class JsonRequest {
	
	public String addLibrary() {
		String name = "{\r\n"
				+ "	\"name\":\"Learn Selenium Automation using Java.\",\r\n"
				+ "	\"isbn\":\"SantoshSelenium\",\r\n"
				+ "	\"aisle\":\"1.8\",\r\n"
				+ "	\"author\":\"Santosh kumar\"\r\n"
				+ "}";
		return name;
	}
	
	public String addLibrary2(String Num) {
		String name = "{\r\n" + 
				"\"name\":\"Learn API Automation with Java.\",\r\n" + 
				"\"isbn\":\"santoshAPI.Net1\",\r\n" + 
				"\"aisle\":\""+Num+"\",\r\n" + 
				"\"author\":\"Santosh Kuamr\"\r\n" + 
				"}";
		return name;
	}
	
}
