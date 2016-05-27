/**   
 * @Title: Account.java    
 * @Package cn.edu.uestc.weibo.entity    
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author 刘月清	505876704@qq.com
 * @date 2016年5月23日 下午3:39:19    
 * @version V1.0   
 */
package cn.edu.uestc.weibo.entity;

/**   
 * @ClassName: Account    
 * @Description: TODO(帐号对象)    
 * @author 刘月清 	505876704@qq.com
 * @date 2016年5月23日 下午3:39:19    
 *         
 */
public class Account {
	private int accountid;
	private String email;
	private String password;
	private String nickname;
	private String pic;
	private int fans;
	private int attention;
	
	
	public int getAccountid() {
		return accountid;
	}
	public void setAccountid(int accountid) {
		this.accountid = accountid;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getPic() {
		return pic;
	}
	public void setPic(String pic) {
		this.pic = pic;
	}
	public int getFans() {
		return fans;
	}
	public void setFans(int fans) {
		this.fans = fans;
	}
	public int getAttention() {
		return attention;
	}
	public void setAttention(int attention) {
		this.attention = attention;
	}
	@Override
	public String toString() {
		return "Account [accountid=" + accountid + ", email=" + email + ", password=" + password + ", nickname="
				+ nickname + ", pic=" + pic + ", fans=" + fans + ", attention=" + attention + "]";
	}
	
}
