package PackA;
public class A{
	protected int x;
	
	protected A(){
		this.x=10;
	}
	
	protected void getX(){
		System.out.println("A: "+this.x);
	}
}