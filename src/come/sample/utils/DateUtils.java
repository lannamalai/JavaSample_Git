package come.sample.utils;

import java.util.Date;

public class DateUtils {
 
	public static void main(String[] args) {
 
		System.out.println(getLocalCurrentDate());
		System.out.println("Added sys out"+getLocalCurrentDate());
	}
 
	private static Date getLocalCurrentDate() {
		return new Date();		
	}
 
}