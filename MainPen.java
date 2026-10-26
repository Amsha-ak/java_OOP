class MainPen{
	public static void main (String args[]){
		Pen P;
		P =new Pen();
		
		//System.out.println(P.colour);
		P.colour ="red";
		//System.out.println(P.height);
		P.height =5.3;
		P.weight =1.3;
		P.brand ="Arrow";
		P.price = 30.00;
		P.madein ="Sri Lanka";
	
		P.write ();
		System.out.println(P.colour);
		System.out.println(P.height);
	}
}