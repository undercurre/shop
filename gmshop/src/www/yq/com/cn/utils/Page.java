package www.yq.com.cn.utils;

import java.util.ArrayList;
import java.util.List;

/**
 * ��ҳbean,ͨ�õ��κ���Ŀ��
 * @author Administrator
 * T��ʾ�κα�ӳ�����
 */
public class Page<T> {
	private int currentPage; //��ǰҳ�� �ͻ��˴��룬�����ֹ���ֵ
	//����õ������ݲ���װ��ȥ�� ��ҳ����totalCount 10  pageSize  3  3ҳ  ���㣺totalCount%pageSize==0 ����   		totalCount/pageSize ����   totalCount/pageSize +1
	private int totalPage;
	private int totalCount;// �ܼ�¼�����������ݿ��в�ѯ�õ�
	private int  pageSize;// ÿҳ��ʾ������ ���ͻ��˴��룬�����ֹ���ֵ
	private List<T>  lists = new ArrayList<T>();//һҳ����ϸ��¼��Ϣ�������ݿ��в�ѯ�õ�
	public int getTotalPage() {
		/*
		 * ����õ������ݲ���װ��ȥ�� ��ҳ����
		 * totalCount 10  pageSize  3  3ҳ  ���㣺totalCount%pageSize==0 ����   	
		 * 	totalCount/pageSize ����   totalCount/pageSize +1
		 */
		if (totalCount%pageSize==0 ) {
			totalPage = totalCount/pageSize;
		} else {
			totalPage = totalCount/pageSize+1;
		}
		return totalPage;
	}
	public Page(int currentPage,  int totalCount, int pageSize, List<T> lists) {
		super();
		this.currentPage = currentPage;
		this.totalCount = totalCount;
		this.pageSize = pageSize;
		this.lists = lists;
	}
	public Page() {
		super();
	}
	public int getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	
	
	public int getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public List<T> getLists() {
		return lists;
	}
	public void setLists(List<T> lists) {
		this.lists = lists;
	}
	
	
}
