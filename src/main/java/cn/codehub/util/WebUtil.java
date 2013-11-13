package cn.codehub.util;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

public class WebUtil {

	public static String User_Info = "User_Info";
	public static String User_Role = "User_Role";
	
	 
	public static HttpServletRequest getRequest() {
		HttpServletRequest request = ((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest();
		return request;
	}
	
	public static String getContextPath() {
		return getRequest().getContextPath();
	}
	 
}
