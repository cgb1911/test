package aspectDemo;

import java.lang.reflect.Method;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;
@Component
@Aspect
public class AOPDemo {
	@Around("execution(* aspectDemo..*.*(..))")
	 public Object arountObject(ProceedingJoinPoint jp) {
	 System.out.println("执行切面");
	  Object obj =null;
	  String methodName=null;
	   try {
	    obj = jp.proceed();
	   } catch (Throwable e) {
	    e.printStackTrace();
	    throw new RuntimeException(e);
	   }
	   Class<? extends Object> clazz = jp.getTarget().getClass();
	   MethodSignature ms = (MethodSignature) jp.getSignature();
	   System.out.println("getDeclaringType"+ms.getDeclaringType()); //userService 
	   System.out.println("clazz:"+clazz); //UserServiceImpl(login,UserService)
	   try {
	    Method method = clazz.getDeclaredMethod(ms.getName(), ms.getDeclaringType());
	     methodName = method.getName();
	   } catch (Exception e) {
	    e.printStackTrace();
	    throw new RuntimeException(e);
	   }
	   System.out.println("方法的类型:"+clazz);
	   System.out.println("方法的名称:"+methodName);
	  return obj;
	 }
	
}
