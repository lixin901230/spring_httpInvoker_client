package com.lx.httpinvoker.client;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.lx.httpinvoker.service.IHttpInvokerService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={
		//"file:src/main/webapp/WEB-INF/config/spring/applicationContext.xml"	//配置文件放到WEB-INF下时需要指定路径使用绝对路径去加载配置文件
		"classpath*:applicationContext.xml"
})
public class HttpInvokerClient {
	
	@Autowired
	private IHttpInvokerService httpInvokerService;

	/*private ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
			new String[]{"classpath*:applicationContext.xml"});
	{
		httpInvokerService = (IHttpInvokerService) ctx.getBean("httpInvokerService");
	}*/
	
	@Test
	public void testHttpInvoker() {
		
		String sayHello = httpInvokerService.sayHello(" this HttpInvoker remote interface call！");
		System.out.println("\n\n"+sayHello+"\n\n");
	}
}
