package www.yq.com.cn.dao.impl;

import java.util.Date;
import java.util.List;

import com.sun.org.apache.xerces.internal.impl.dv.xs.DayDV;

import www.yq.com.cn.dao.IUserDao;
import www.yq.com.cn.dao.po.User;
import www.yq.com.cn.utils.Page;

public class TestUserDaoImpl {
	public static void main(String[] args) {
//		//���Բ�ѯȫ���û�
//		IUserDao userDao = new UserDaoImpl();
//		List<User> users = userDao.listAll();
//		for (User user : users) {
//			System.out.println(user);
//		}
		
//		//���Ը���Id��ѯһ���û���Ϣ
//		IUserDao userDao = new UserDaoImpl();
//		User user = userDao.getById(6);
//		System.out.println(user);
//		
//		//��¼����
//		IUserDao userDao = new UserDaoImpl();
//		User user =userDao.loing("tom", "123");
//		if (user!=null) {
//			System.out.println("��¼�ɹ�����");
//		} else {
//			System.out.println("��¼ʧ�ܣ���");
//		}
		
//		//���Ը���IDɾ��
//		
//		IUserDao userDao = new UserDaoImpl();
//		int rows = userDao.deleteById(31);
//		System.out.println(rows);
//		
		//������Ӳ���
//		IUserDao userDao = new UserDaoImpl();
//		for (int i = 0; i < 100; i++) {
//			User user = new User("�ŵ���", "zd4562"+i, "111", "zdz@qq.com", "��", "xxx.jpg", new Date());
//			int rows = userDao.save(user);
//			System.out.println(rows);
//		}
		
		
		//�޸Ĳ���
//		IUserDao userDao = new UserDaoImpl();
//		//User user = userDao.getById(29);
//		//user.setEmail("test@qq.com");
//		User user = new User(19,"�ŵ���222", "zdz9832", "111", "zdz@qq.com", "��", "xxx.jpg", new Date());
//		int rows = userDao.update(user);
//		System.out.println(rows);
		
//		//���Եõ��ܼ�¼����
//		
//		IUserDao userDao = new UserDaoImpl();
//		int totalCount = userDao.getTotalCount();
//		System.out.println(totalCount);
		
//		//�õ�һҳ�е���ϸ��Ϣ
//		
//		IUserDao userDao = new UserDaoImpl();
//		List<User> onePageUsers = userDao.getOnePageInfo(3, 50);
//		for (User user : onePageUsers) {
//			System.out.println(user);
//		}

		//�����Ǳ���
		int currentPage = 4;
		int pageSize = 10;
		IUserDao userDao = new UserDaoImpl();
		int totalCount = userDao.getTotalCount();
		List<User> lists = userDao.getOnePageInfo(currentPage, pageSize);
		//��װpageUser
		Page<User> pageUser = new Page<User>(currentPage, totalCount, pageSize, lists);
		
		//��ɽ
		//һ�����ݴ�Page����
		System.out.println("��"+pageUser.getCurrentPage()+"ҳ.");
		System.out.println("ÿҳ"+pageUser.getPageSize()+"�����ݣ�");
		System.out.println("�ܹ�"+pageUser.getTotalPage()+"ҳ����");
		System.out.println("�ܹ���"+pageUser.getTotalCount()+"����¼��");
		System.out.println("һҳ�е���ϸ��Ϣ��");
		List<User> onePageUsers = pageUser.getLists();
		for (User user : onePageUsers) {
			System.out.println(user);
		}
		
		
		
	}
}
