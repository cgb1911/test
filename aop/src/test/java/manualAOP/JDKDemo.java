package manualAOP;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JDKDemo {
	public static void main(String[] args) {
		final TargetDemoImpl t = new TargetDemoImpl();
		TargetDemo demo = 	(TargetDemo) Proxy.newProxyInstance(JDKDemo.class.getClassLoader(), 
			TargetDemoImpl.class.getInterfaces(), new InvocationHandler() {
				
				public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
					AspectDemo.method();
					method.invoke(t, args);
					AspectDemo.method();
					return proxy;
				}
			});
	demo.execute();
	
	}

}
