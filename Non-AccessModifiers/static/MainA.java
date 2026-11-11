class MainA{
	int x=10;
	public static void main(String args[]){
		A obja = new A();
		obja.getX();
		//obja.x=70;
		//System.out.println("Staticx: "+A.x);
		//System.out.println(args[0]);
		//System.out.println(args[1]);
		for(int i = 0; i<args.length; i++)
			System.out.println(args[i]);
		//System.out.println(x);
		
		//MainA obja1 = new MainA();
		//System.out.println( obja.x);
		
	}
}