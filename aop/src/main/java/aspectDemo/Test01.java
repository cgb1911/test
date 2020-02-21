package aspectDemo;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test01{

	
	  @org.junit.Test
	    public void Test(){
				ApplicationContext context = new ClassPathXmlApplicationContext("springmvc.xml");
				UserService u =  (UserService) context.getBean("userServiceImpl");
				u.login();
				System.out.println(u);
	    }
	  //测试4
}
