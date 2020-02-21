package aspectDemo;
public class Outer{
private int index = 10; 
class Inner{
	private int index = 20;
	void print(){ 
	System.out.println(index);
	System.out.println(Outer.this.index);
}
}
void print(){
	System.out.println(index);}


public static void main(String[] args){
	int[] a = new int[10];
	int[] b = new int[19];
	System.arraycopy(a, 0, b, 0, b.length);
		//测试2	
}
}
