package practice;

import org.openqa.selenium.By;

import genericUtility.JavaUtility;

public class PracticingJavaUtilityCLass {

	public static void main(String[] args) {

		JavaUtility jUtil = new JavaUtility();
		String dateStamp = jUtil.getCalendarDetails("dd-MM-YYYY");
		System.out.println(dateStamp);
		String dateTimeStamp = jUtil.getCalendarDetails("dd-MM-YY hh-mm-ss");
		System.out.println(dateTimeStamp);
		System.out.println(jUtil.generateRandomNumbers(2000));
		
	}

}
