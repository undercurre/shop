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
		//���ļ���������Ϊȫ��Ψһ
		String uuid = UUID.randomUUID().toString();
		System.out.println(uuid);
		//�õ��ļ�������չ��  .jpg
		String extendsName = fileName.substring(fileName.lastIndexOf("."), fileName.length());
		System.out.println(extendsName);
		String onlyName = uuid + extendsName;//���ݿ�Ҳ�Ǳ������ͼƬ����
		System.out.println(onlyName);
	}
}
