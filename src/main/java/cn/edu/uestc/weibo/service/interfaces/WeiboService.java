/**   
 * @Title: WeiboService.java    
 * @Package cn.edu.uestc.weibo.service.interfaces    
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author 刘月清	505876704@qq.com
 * @date 2016年5月26日 上午9:08:34    
 * @version V1.0   
 */
package cn.edu.uestc.weibo.service.interfaces;

import cn.edu.uestc.weibo.dto.PageInfo;
import cn.edu.uestc.weibo.entity.Weibo;

/**   
 * @ClassName: WeiboService    
 * @Description: TODO(这里用一句话描述这个类的作用)    
 * @author 刘月清 	505876704@qq.com
 * @date 2016年5月26日 上午9:08:34    
 *         
 */
public interface WeiboService {

	/**
	 * 
	 * @Title: weibo    
	 * @Description: TODO(这里用一句话描述这个方法的作用)    
	 * @param @param accountId
	 * @param @param current
	 * @param @return
	 * @param @throws Exception    设定文件    
	 * @return PageInfo<Weibo>    返回类型    
	 * @throws
	 */
	PageInfo<Weibo> weibo( int accountId, int current) throws Exception;
}
