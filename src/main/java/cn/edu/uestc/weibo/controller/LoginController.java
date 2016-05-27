/**   
 * @Title: LoginController.java    
 * @Package cn.edu.uestc.weibo.controller    
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author 刘月清	505876704@qq.com
 * @date 2016年5月25日 上午9:11:06    
 * @version V1.0   
 */
package cn.edu.uestc.weibo.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.edu.uestc.weibo.entity.Account;
import cn.edu.uestc.weibo.service.interfaces.AccountService;

/**   
 * @ClassName: LoginController    
 * @Description: TODO(这里用一句话描述这个类的作用)    
 * @author 刘月清 	505876704@qq.com
 * @date 2016年5月25日 上午9:11:06    
 *         
 */
@Controller
public class LoginController {
	@Autowired
	private AccountService accountservice;
	
	@RequestMapping("/login")
	public String login(Account account,HttpSession session){
		
		try{
			account = accountservice.login(account);
			
			session.setAttribute("account", account);
		}catch(Exception e){
			e.printStackTrace();
		}
		//return "redirect:/u/"+account.getAccountId()+"/home";
		return "home/NewFile";
	}
}
