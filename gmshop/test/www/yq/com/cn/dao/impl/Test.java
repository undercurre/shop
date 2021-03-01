package www.yq.com.cn.dao.impl;

import java.util.Date;
import java.util.UUID;

public class Test {
	String name;
	private String test;

	public static void main(String[] args) {
//			Date utilDate = new Date();
//			System.out.println(utilDate);
//			
//			java.sql.Date sqlDate = new java.sql.Date(System.currentTimeMillis());
//			System.out.println(sqlDate);
//		String idStr = "56";
//		int id = Integer.parseInt(idStr);
//		System.out.println(id);
//		long idLong = Long.parseLong(idStr);
//		System.out.println(idLong);
//		
//		float idFloat = Float.parseFloat(idStr);
//		System.out.println(idFloat);
//		double idDoblue = Double.parseDouble(idStr);
//		System.out.println(idDoblue);
		
		
		String fileName ="xsd.sadfdasfxx.jpg";
		//把文件名重命名为全球唯一
		String uuid = UUID.randomUUID().toString();
		System.out.println(uuid);
		//得到文件名的扩展名  .jpg
		String extendsName = fileName.substring(fileName.lastIndexOf("."), fileName.length());
		System.out.println(extendsName);
		String onlyName = uuid + extendsName;//数据库也是保存这个图片名字
		System.out.println(onlyName);
	}
}
