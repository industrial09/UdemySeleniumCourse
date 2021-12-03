package dataProvider;

import org.testng.annotations.Test;

public class DataProviderWithMethodName {
	@Test(dataProvider="methodWay", dataProviderClass=DataProviderSource.class)
	public void scenario1(String result) {
		System.out.println("Data provided as per Method name is: "+result);
	}
	
	@Test(dataProvider="methodWay", dataProviderClass=DataProviderSource.class)
	public void scenario2(String result) {
		System.out.println("Data provided as per Method name is: "+result);
	}
	
	@Test(dataProvider="methodWay", dataProviderClass= DataProviderSource.class)
	public void commonScenario(String result) {
		System.out.println("Data provided as per Method name is: "+result);
	}
}
