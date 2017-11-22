package com.java4u.multithreading.util;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class TimeUtils {

	private TimeUtils() {
		// Do nothing
	}

	/**
	 * Adds the 'millisToAdd' no. of milliseconds to the 'initialTime' and returns
	 * the resultant timestamp as a <tt>java.util.Date</tt> object.
	 * 
	 * @param initialTime
	 * @param millisToAdd
	 * @return Date
	 */
	public static Date getFutureTime(Date initialTime, long millisToAdd) {
		Calendar cal = GregorianCalendar.getInstance();
		cal.setTimeInMillis(initialTime.getTime() + millisToAdd);

		return cal.getTime();
	}
}
