package sharedServices;

import java.io.File;
import java.io.IOException;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class PublicFunctions {
	public static String getRandomString(int length) {
		StringBuilder sb = new StringBuilder();
		String characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
		for (int i = 0; i < length; i++) {
			int index = (int)(Math.random() * characters.length());
			sb.append(characters.charAt(index));
		}
		return sb.toString();
	}
	
	public static String getCellNumber() {
		Random rn = new Random();
		 StringBuilder sb = new StringBuilder();
		 int num;
		 sb.append("0");
		 int number = 61+rn.nextInt(29);
		 sb.append(number);
		 String cell [] = new String[7];
		 for(int i = 0; i<7; i++) {
			 num = rn.nextInt(9);
			 cell[i] = Integer.toString(num);
		 }
		for (int i = 0; i < 7; i++) {
			sb.append(cell[i]);
		}
		return sb.toString();
	}
	
	public static void takeScreenshot(WebDriver driver, String fileName) throws IOException {
		fileName = fileName + ".png";
		String directory = System.getProperty("user.dir") + "//screenshots//";
		//String directory = "/target/";
		File sourceFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(sourceFile, new File(directory + fileName));
	}
}
