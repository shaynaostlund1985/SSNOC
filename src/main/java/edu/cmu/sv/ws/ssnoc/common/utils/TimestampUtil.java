package edu.cmu.sv.ws.ssnoc.common.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimestampUtil {

	public static String TIMESTAMP_FORMAT = "yyyy-MM-dd HH:mm";

	public static final Date convert(String timestamp) {
		try {
			if (timestamp == null) {
				return null;
			} else {
				return new SimpleDateFormat(TIMESTAMP_FORMAT).parse(timestamp);
			}
		} catch (ParseException e) {
			e.printStackTrace();
			return null;
		}
	}

	public static final String convert(Date date) {
		return new SimpleDateFormat(TIMESTAMP_FORMAT).format(date);
	}
}
