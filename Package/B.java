package PackB;
import PackA.A;
public class B extends A{
	public int y;
	public B(){
		this.y=20;
	}
	public void getY(){
		super.getX();
		System.out.println("B: "+this.y);
	}
}