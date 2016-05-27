/**   
 * @Title: AccountDao.java    
 * @Package cn.edu.uestc.weibo.dao.interfaces    
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author 刘月清	505876704@qq.com
 * @date 2016年5月23日 下午3:39:10    
 * @version V1.0   
 */
package cn.edu.uestc.weibo.dao;

import javax.security.auth.login.LoginException;

import cn.edu.uestc.weibo.entity.Account;

/**   
 * @ClassName: AccountDao    
 * @Description: TODO(这里用一句话描述这个类的作用)    
 * @author 刘月清 	505876704@qq.com
 * @date 2016年5月23日 下午3:39:10    
 *         
 */
public interface AccountDao {
	/**
	 * 
	 * @Title: findByAccount    
	 * @Description: TODO(这里用一句话描述这个方法的作用)    
	 * @param @param account
	 * @param @return    设定文件    
	 * @return Account    返回类型    
	 * @throws
	 */
	Account findByAccount(String account) throws LoginException;
	
	
	int insert(Account account);
	
}
