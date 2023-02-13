package Tests;

import org.testng.annotations.Test;

public class DataProviderClassEx {

	@Test(dataProvider = "Info", dataProviderClass = DataSupplier.class)
	public void Data(Object[] K) {
		System.out.println(K);
	}
}
