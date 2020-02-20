package manualAOP;
/**
 * 这是目标类，就是核心代码。
 */
		
public class TargetDemoImpl implements TargetDemo {

	public void execute() {
		System.out.println("我就是要执行个方法而已，看看会不会切入aop");
	}

}
