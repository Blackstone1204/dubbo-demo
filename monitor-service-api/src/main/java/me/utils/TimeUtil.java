/**
 * 
 */
package me.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author BlackStone
 *
 */
public class TimeUtil {
	/** 
	 * @ClassName: TimeUtil 
	 * @Description: TODO(这里用一句话描述这个类的作用) 
	 * @date 2018年3月9日 下午3:25:48 
	 * 
	 */
	
	public static String getSimpeTimeStr(){
		Date now=new Date();
		SimpleDateFormat f=new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss");
		//System.out.println(f.format(now));
		return f.format(now);

		
	}
}
