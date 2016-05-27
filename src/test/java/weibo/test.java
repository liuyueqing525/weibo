/**   
 * @Title: test.java    
 * @Package weibo    
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author 刘月清	505876704@qq.com
 * @date 2016年5月24日 下午2:25:28    
 * @version V1.0   
 */
package weibo;

import javax.annotation.Resource;
import javax.security.auth.login.LoginException;

import org.apache.ibatis.io.Resources;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.edu.uestc.weibo.entity.Account;
import cn.edu.uestc.weibo.service.interfaces.AccountService;
import junit.framework.Assert;

/**   
 * @ClassName: test    
 * @Description: TODO(这里用一句话描述这个类的作用)    
 * @author 刘月清 	505876704@qq.com
 * @date 2016年5月24日 下午2:25:28    
 *         
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring-dao.xml"})
public class test {
	@Autowired
	private AccountService accountService;
	/**
	 * @throws LoginException    
	 * @Title: main    
	 * @Description: TODO(这里用一句话描述这个方法的作用)    
	 * @param @param args    设定文件    
	 * @return void    返回类型    
	 * @throws    
	 */
	
	 @Test
	 public void testlogin() throws LoginException {
		 
		 Account ac =new Account();
		 ac.setEmail("12@qq.com");
		 ac.setPassword("123123");
		 
		 Account nc = accountService.login(ac);
		 
		 
		 System.out.println("nc的值是"+nc);
		 
	 }
	 @Test
	 public void testreg() throws Exception{
		 Account mc = new Account();
		 
		 mc.setEmail("ls@qq.com");
		 mc.setPassword("1333");
		 
		 int id = accountService.reg(mc);
		 System.out.println(id);
	 }

}
