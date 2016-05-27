/**   
 * @Title: AccountService.java    
 * @Package cn.edu.uestc.weibo.service.interfaces    
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author 刘月清	505876704@qq.com
 * @date 2016年5月23日 下午3:59:10    
 * @version V1.0   
 */
package cn.edu.uestc.weibo.service.interfaces;

import javax.security.auth.login.LoginException;


import cn.edu.uestc.weibo.entity.Account;

/**   
 * @ClassName: AccountService    
 * @Description: TODO(用户服务接口)    
 * @author 刘月清 	505876704@qq.com
 * @date 2016年5月23日 下午3:59:10    
 *         
 */
public interface AccountService {
	/**
	 * 
	 * @Title: login    
	 * @Description: TODO(这里用一句话描述这个方法的作用)    
	 * @param @param accoount
	 * @param @return
	 * @param @throws LoginException    设定文件    
	 * @return Account    返回类型    
	 * @throws
	 */
	Account login(Account account)throws LoginException;
	/**
	 * 
	 * @Title: reg    
	 * @Description: TODO(这里用一句话描述这个方法的作用)    
	 * @param @param account
	 * @param @return
	 * @param @throws Exception    设定文件    
	 * @return int    返回类型    
	 * @throws
	 */
	int reg(Account account) throws Exception;
}
