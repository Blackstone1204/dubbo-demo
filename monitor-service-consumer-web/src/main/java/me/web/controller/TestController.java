/**
 * 
 */
package me.web.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;

import me.model.CPU;
import me.service.IUserService;
import me.utils.SpringContextHolder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.support.RequestContextUtils;

import com.fasterxml.jackson.core.JsonProcessingException;

/**
 * @author BlackStone
 *
 */
 
@Controller
public class TestController {
	/** 
	 * @ClassName: UserController 
	 * @Description: TODO(这里用一句话描述这个类的作用) 
	 * @date 2017年8月30日 上午10:59:19 
	 * 
	 */
	
	private  final Logger log =Logger.getLogger(this.getClass().getName());
	


	@RequestMapping("/")
		public String index(){
			return "main";
			
		}

	
	@RequestMapping(value="/main")
	public String main(){
		
	
//		
	IUserService us=SpringContextHolder.getBean("userService");
 //	us.queryUserEntity();
		return "main";
		
	}


}
