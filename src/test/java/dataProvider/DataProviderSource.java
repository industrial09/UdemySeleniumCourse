package dataProvider;

import java.lang.reflect.Method;

import org.testng.ITestContext;
import org.testng.annotations.DataProvider;

public class DataProviderSource {
	@DataProvider(name="methodWay")
	public Object getDataWithMethodWay(Method method) {
		String methodName = method.getName();
		if(methodName.equals("scenario1")) {
			return new Object[][] {{"Scenario1 Data"}};
		}else if(methodName.equals("scenario2")) {
			return new Object[][] {{"Scenario2 Data"}};
		}else {
			return new Object[][] {{"Other Data"}};
		}
	}
	
	@DataProvider(name = "contextWay")
	public Object getDataWithITestContextWay(ITestContext context) {
		String contextName = context.getName();
		if(contextName.equals("Smoke Test")) {
			return new Object[][] {{"Smoke Test Data"}};
		}else if(contextName.equals("Regression Test")) {
			return new Object[][] {{"Regression Test Data"}};
		}else {
			return new Object[][] {{"Other Kind Of Test Data"}};
		}
	}
}
