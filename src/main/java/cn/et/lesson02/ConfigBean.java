package cn.et.lesson02;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.alibaba.druid.support.http.StatViewServlet;

@Configuration
public class ConfigBean {
	/**
	 *  这个类就相当于是Druid的web.xml配置
	 * 
	 * 相当于
	 * 		<bean id="druidStatView" class="cn.xxx.ServletRegistrationBean"/>
	 * @return
	 */
	@Bean
	public ServletRegistrationBean druidStatView(){
		ServletRegistrationBean srb = new ServletRegistrationBean();
		// 相当于web.xml中的 <servlet-name>DruidStatView</servlet-name>
		srb.setName("DruidStatView");
		// <servlet-class>com.alibaba.druid.support.http.StatViewServlet</servlet-class>
		StatViewServlet svs = new StatViewServlet();
		srb.setServlet(svs);
		// 	<url-pattern>/druid/*</url-pattern>
		String url = "/druid/*";
		//  <servlet-mapping>   是一个数组
		List<String> urls=new ArrayList<String>();
		urls.add(url);
		srb.setUrlMappings(urls);
		// <init-param> 用户名和密码
		LinkedHashMap<String,String> linkedHashMap=new LinkedHashMap<String,String>();
		linkedHashMap.put("loginUsername", "admin");
		linkedHashMap.put("loginPassword", "123456");
		srb.setInitParameters(linkedHashMap);
		return srb;
	}
}
