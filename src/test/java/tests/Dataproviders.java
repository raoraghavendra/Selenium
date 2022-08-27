package tests;

import org.testng.annotations.DataProvider;

public class Dataproviders {
		
		
		@DataProvider
		public Object[][] sendData() {

			Object data[][] = new Object[2][2];
			data[0][0] = "9505236581";
			data[0][1] = "123465";

			data[1][0] = "9505236581";
			data[1][1] = "949494";

			return data;

		}
	

}