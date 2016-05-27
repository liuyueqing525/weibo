/**   
 * @Title: AccountSvImpl.java    
 * @Package cn.edu.uestc.weibo.service.impl    
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author 刘月清	505876704@qq.com
 * @date 2016年5月24日 上午11:27:58    
 * @version V1.0   
 */
package cn.edu.uestc.weibo.service.impl;

import javax.security.auth.login.LoginException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.edu.uestc.weibo.dao.AccountDao;
import cn.edu.uestc.weibo.entity.Account;
import cn.edu.uestc.weibo.service.interfaces.AccountService;

/**   
 * @ClassName: AccountSvImpl    
 * @Description: TODO(这里用一句话描述这个类的作用)    
 * @author 刘月清 	505876704@qq.com
 * @date 2016年5月24日 上午11:27:58    
 *         
 */
@Service
public class AccountSvImpl implements AccountService {

	/* (非 Javadoc)   
	 * <p>Title: login</p>    
	 * <p>Description: </p>    
	 * @param account
	 * @return
	 * @throws LoginException    
	 * @see cn.edu.uestc.weibo.service.interfaces.AccountService#login(cn.edu.uestc.weibo.entity.Account)    
	 */
	@Autowired
	private AccountDao accountDao;
	
	@Override
	public Account login(Account account) throws LoginException {
		// TODO Auto-generated method stub
		Account ac = accountDao.findByAccount(account.getEmail());
		
		if(ac==null){
			throw new LoginException("该用户不存在！！！");
		}else if( !account.getPassword().equals( ac.getPassword() )){
			throw new LoginException("密码错误！！！");
		}
		return ac;
	}

	/* (非 Javadoc)   
	 * <p>Title: reg</p>    
	 * <p>Description: </p>    
	 * @param account
	 * @return
	 * @throws Exception    
	 * @see cn.edu.uestc.weibo.service.interfaces.AccountService#reg(cn.edu.uestc.weibo.entity.Account)    
	 */
	@Override
	public int reg(Account account) throws Exception {
		// TODO Auto-generated method stub
		int count = accountDao.insert(account);
		
		return account.getAccountid();
	}
	
}
