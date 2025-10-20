package com;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.model.DataItem;
import com.utils.DateTimeUtil;

public class Analyze {
	
	public static void main(String[] args) throws ParseException {
		// dateStr=2024-09-16 00:00:00]
		System.out.println(DateTimeUtil.timestampToDateString("1727711999999", "yyyy-MM-dd HH:mm:ss"));
		System.out.println(DateTimeUtil.dateStringToTimestamp("2024-09-30 00:00:00", "yyyy-MM-dd HH:mm:ss"));
	}
	public static void main2(String[] args) throws ParseException {
		
		 // 假設 JSON 內容放在字串中
        String json = "{\"code\":0,\"timestamp\":1760941457197,\r\n"
        		+ "\"data\":[\r\n"
        		+ "[1726416000000,60336.149999999994,60351.16,57568.17,57890.0,1113.543281,1726502399999,65603211.913852]\r\n"
        		+ ",[1726502400000,57886.97,61318.01,57499.78,61125.67,1199.475003,1726588799999,70461502.502581]\r\n"
        		+ ",[1726588800000,61131.05,61258.61,59314.08,59432.53,1167.860312,1726675199999,70297587.600417]\r\n"
        		+ ",[1726675200000,59420.0,63500.35,59181.68,63156.619999999995,1445.714791,1726761599999,89326873.502235]\r\n"
        		+ "]\r\n"
        		+ "}";

        // 解析 JSON
        JsonObject jsonObj = JsonParser.parseString(json).getAsJsonObject();
        JsonArray dataArray = jsonObj.getAsJsonArray("data");

        List<DataItem> list = new ArrayList<>();

        for (JsonElement element : dataArray) {
            JsonArray arr = element.getAsJsonArray();

            DataItem item = new DataItem(
                    arr.get(0).getAsLong(),   // openTime
                    arr.get(1).getAsDouble(), // open
                    arr.get(2).getAsDouble(), // high
                    arr.get(3).getAsDouble(), // low
                    arr.get(4).getAsDouble(), // close
                    arr.get(5).getAsDouble(), // volume
                    arr.get(6).getAsLong(),   // closeTime
                    arr.get(7).getAsDouble()  // quoteAssetVolume
            );

            list.add(item);
        }

        // 輸出結果
        list.forEach(System.out::println);
		
		// 讀取資料
		// 解析資料成model
		
	}

}
