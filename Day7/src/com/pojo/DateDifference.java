package com.pojo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateDifference {

	public  static int dateDifference(String string1, String string2) throws ParseException {
		
			SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
			Date d = sd.parse(string1);
			Calendar c = Calendar.getInstance();
			c.setTime(d);
			long d1 = c.getTimeInMillis();
			d = sd.parse(string2);
			c.setTime(d);
			long d2 = c.getTimeInMillis();
			int n = Math.abs((int) ((d1 - d2) / (1000 * 3600 * 24)));
			return n;
	
    
	}
}
