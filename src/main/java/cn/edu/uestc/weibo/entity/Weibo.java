/**   
 * @Title: Weibo.java    
 * @Package cn.edu.uestc.weibo.entity    
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author 刘月清	505876704@qq.com
 * @date 2016年5月23日 下午3:39:30    
 * @version V1.0   
 */
package cn.edu.uestc.weibo.entity;

/**   
 * @ClassName: Weibo    
 * @Description: TODO(这里用一句话描述这个类的作用)    
 * @author 刘月清 	505876704@qq.com
 * @date 2016年5月23日 下午3:39:30    
 *         
 */
public class Weibo {
	private int wid;
	private int accountid;
	private String contain;
	private int liked;
	private String date;
	public int getWid() {
		return wid;
	}
	public void setWid(int wid) {
		this.wid = wid;
	}
	public int getAccountid() {
		return accountid;
	}
	public void setAccountid(int accountid) {
		this.accountid = accountid;
	}
	public String getContain() {
		return contain;
	}
	public void setContain(String contain) {
		this.contain = contain;
	}
	public int getLiked() {
		return liked;
	}
	public void setLiked(int liked) {
		this.liked = liked;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
}
