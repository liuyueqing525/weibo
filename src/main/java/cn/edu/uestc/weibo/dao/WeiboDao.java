/**   
 * @Title: WeiboDao.java    
 * @Package cn.edu.uestc.weibo.dao    
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author 刘月清	505876704@qq.com
 * @date 2016年5月25日 下午1:52:16    
 * @version V1.0   
 */
package cn.edu.uestc.weibo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.edu.uestc.weibo.entity.Weibo;

/**   
 * @ClassName: WeiboDao    
 * @Description: TODO(这里用一句话描述这个类的作用)    
 * @author 刘月清 	505876704@qq.com
 * @date 2016年5月25日 下午1:52:16    
 *         
 */
public interface WeiboDao {
	
	/**
	 * 
	 * @Title: count    
	 * @Description:  获得关注微博的总条数  
	 * @param @param accountid
	 * @param @return    设定文件    
	 * @return int    返回类型    
	 * @throws
	 */
	int count (int accountid);
	
	List<Weibo> findById(@Param("accountId") int accountId, @Param("start")int start, @Param("size")int size);
}
