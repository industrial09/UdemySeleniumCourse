package dataProvider;

import org.testng.annotations.Test;

public class DataProviderWithContextTest {
	@Test(dataProvider= "contextWay", dataProviderClass = DataProviderSource.class)
	//Using the ITestcontext interface only a method is need to access the data.
	//A .xml file needs to be created to get the name of the Tests, due to ITestContext gets TEST names
	public void getDataThroughContext(String testData) {
		System.out.println("Type Of Data gotten is: "+testData);
	}
}
