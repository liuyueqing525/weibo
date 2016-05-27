/**   
 * @Title: WeiboSvImpl.java    
 * @Package cn.edu.uestc.weibo.service.impl    
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author 刘月清	505876704@qq.com
 * @date 2016年5月26日 上午9:09:37    
 * @version V1.0   
 */
package cn.edu.uestc.weibo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import cn.edu.uestc.weibo.dao.WeiboDao;
import cn.edu.uestc.weibo.dto.PageInfo;
import cn.edu.uestc.weibo.entity.Weibo;
import cn.edu.uestc.weibo.service.interfaces.WeiboService;

/**   
 * @ClassName: WeiboSvImpl    
 * @Description: TODO(这里用一句话描述这个类的作用)    
 * @author 刘月清 	505876704@qq.com
 * @date 2016年5月26日 上午9:09:37    
 *         
 */
public class WeiboSvImpl implements WeiboService {

	/* (非 Javadoc)   
	 * <p>Title: weibo</p>    
	 * <p>Description: </p>    
	 * @param accountId
	 * @param current
	 * @return
	 * @throws Exception    
	 * @see cn.edu.uestc.weibo.service.interfaces.WeiboService#weibo(int, int)    
	 */
	@Autowired
	private WeiboDao WeiboDao;
	@Override
	public PageInfo<Weibo> weibo(int accountId, int current) throws Exception {
		// TODO Auto-generated method stub
		PageInfo<Weibo> pi = new PageInfo<Weibo>( current );
		
		int count = WeiboDao.count(accountId);
		
		List<Weibo> list = WeiboDao.findById(accountId, pi.getStart(), pi.getSize());
		
		pi.setCount(count);
		pi.setList(list);
		
		return pi;
	}

}
