package com.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTimeUtil {
	// 將 timestamp (毫秒) 轉為日期字串 yyyy-MM-dd HH:mm:ss
	public static String timestampToDateString(String timestampStr, String format) {
		long timestamp = Long.parseLong(timestampStr);
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		return sdf.format(new Date(timestamp));
	}

	// 將日期字串 yyyy-MM-dd HH:mm:ss 轉為 timestamp (毫秒)
	public static long dateStringToTimestamp(String dateString, String format) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		Date date = sdf.parse(dateString);
		return date.getTime();
	}
}
