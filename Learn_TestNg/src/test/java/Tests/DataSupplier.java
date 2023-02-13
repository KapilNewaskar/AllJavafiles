package Tests;

import org.testng.annotations.DataProvider;

public class DataSupplier {

	@DataProvider()
	public Object[][] Info() {
		Object[][] data = new Object[][] {

				{ "abc", 123 }, 
				{ "xyz", 456 },
				{ "pqr", 12223 } };
		return data;
	}

}
