package Tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderString {

//	@Test(dataProvider = "Combination")
//	public void Test(Object[] K) {
//
//		for (int i = 0; i < K.length; i++) {
//			System.out.println(K[i]);
//		}
//		System.out.println(">>>");
//	}

	@Test(dataProvider = "StringEx")
	public void Test(String Str) {

		System.out.println(Str);
	}

	@DataProvider(indices = { 0, 2 })
	public String[] StringEx() {
		String[] s = new String[] { "abc", "xyz", "abm" };
		return s;
	}

//	@DataProvider()
//	public Integer[] IntEx() {
//		Integer[] i = new Integer[] { 1, 2, 3 };
//		return i;
//	}

//	@DataProvider()
//	public Object[][] Combination() {
//		Object[][] data = new Object[][] { { 1, "b", 3 }, { "a", 2, 3, "aa" } };
//		return data;
//	}

}
