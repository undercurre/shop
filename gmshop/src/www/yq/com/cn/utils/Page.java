package www.yq.com.cn.utils;

import java.util.ArrayList;
import java.util.List;

/**
 * 分页bean,通用到任何项目中
 * @author Administrator
 * T表示任何表映射的类
 */
public class Page<T> {
	private int currentPage; //当前页码 客户端传入，或者手工赋值
	//计算得到的数据不用装进去。 总页数，totalCount 10  pageSize  3  3页  计算：totalCount%pageSize==0 整除   		totalCount/pageSize 否则：   totalCount/pageSize +1
	private int totalPage;
	private int totalCount;// 总记录条数，从数据库中查询得到
	private int  pageSize;// 每页显示的条数 ，客户端传入，或者手工赋值
	private List<T>  lists = new ArrayList<T>();//一页的详细记录信息，从数据库中查询得到
	public int getTotalPage() {
		/*
		 * 计算得到的数据不用装进去。 总页数，
		 * totalCount 10  pageSize  3  3页  计算：totalCount%pageSize==0 整除   	
		 * 	totalCount/pageSize 否则：   totalCount/pageSize +1
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
