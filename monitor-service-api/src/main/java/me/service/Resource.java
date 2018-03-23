/**
 * 
 */
package me.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import me.utils.RedisCache;
import me.utils.TimeUtil;

/**
 * @author BlackStone
 *
 */
public interface Resource {
	

	default public void addToRedis(RedisCache rc){
		
		String key=String.format("%s_%s",this.getType(),TimeUtil.getSimpeTimeStr());
		rc.putCache(key,this);
		
	}
	
	public List<String> getValue();
	
	public String getType();

}
