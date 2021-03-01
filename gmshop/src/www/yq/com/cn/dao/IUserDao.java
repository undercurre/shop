package www.yq.com.cn.dao;

import java.util.List;

import www.yq.com.cn.dao.po.User;
import www.yq.com.cn.utils.Page;

/**
 * �ӿڵķ�����εõ���
 * @author Administrator
 *
 */
public interface IUserDao {
	/**
	 * ��ѯȫ���û���Ϣ
	 * @return ����ȫ���û���Ϣ
	 */
	public List<User> listAll() ;
	/**
	 * ����idɾ��һ���û���Ϣ
	 * @param id  ����
	 * @return ɾ���ɹ�������Ӱ���������ʧ�ܷ���-1
	 */
	public int deleteById(long id);
	/**
	 * �޸�һ���û���Ϣ
	 * @param user
	 * @return �޸ĳɹ�������Ӱ���������ʧ�ܷ���-1
	 */
	public int update(User user);
	/**
	 * ���һ���û���Ϣ
	 * @param user
	 * @return ��ӳɹ�������Ӱ���������ʧ�ܷ���-1
	 */
	public int save(User user);
	/**
	 * ����id��ѯһ���û���Ϣ
	 * @param id ����
	 * @return ��ѯ�ɹ�����һ���û���Ϣ��ʧ�ܷ���null
	 */
	public User getById(long id);
	/**
	 * ��¼����
	 * @param loginName �û���
	 * @param pass ����
	 * @return ��¼�ɹ�����һ���û���Ϣ��ʧ�ܷ���null
	 */
	public User loing(String loginName,String pass);
	/**
	 * �õ��ܼ�¼����
	 * @return ��ѯ�ɹ������ܼ�¼���������򷵻�-1
	 */
	public int getTotalCount() ;
	/**
	 * �õ�һҳ�е���ϸ��Ϣ
	 * @param currentPage ��ǰҳ��
	 * @param pageSize ÿҳ��ʾ������
	 * @return
	 */
	public List<User> getOnePageInfo(int currentPage,int pageSize);
	/**
	 * ��װһҳ�е�ȫ����Ϣ
	 * @param currentPage  ��ǰҳ��
	 * @param pageSize ÿҳ��ʾ������
	 * @return
	 */
	public Page<User> getPage(int currentPage,int pageSize) ;
	
}
