package com.model;

import com.utils.DateTimeUtil;

public class DataItem {
	long openTime; // 開盤時間
	double open; // 開盤價
	double high; // 最高價
	double low; // 最低價
	double close; // 收盤價
	double volume; // 交易量
	long closeTime; // 收盤時間
	double quoteAssetVolume; // 成交金額（或總值）
	String dateStr; // 日期字串

	public DataItem(long openTime, double open, double high, double low, double close, double volume, long closeTime,
			double quoteAssetVolume) {
		this.openTime = openTime;
		this.open = open;
		this.high = high;
		this.low = low;
		this.close = close;
		this.volume = volume;
		this.closeTime = closeTime;
		this.quoteAssetVolume = quoteAssetVolume;
		this.dateStr = DateTimeUtil.timestampToDateString(String.valueOf(openTime), "yyyy-MM-dd HH:mm:ss");
	}

	@Override
	public String toString() {
		return "DataItem [openTime=" + openTime + ", open=" + open + ", high=" + high + ", low=" + low + ", close="
				+ close + ", volume=" + volume + ", closeTime=" + closeTime + ", quoteAssetVolume=" + quoteAssetVolume
				+ ", dateStr=" + dateStr + "]";
	}

}
