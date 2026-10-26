class MainComputer{
	public static void main(String args[]){
		Computer A;
		A = new Computer();//Creating an object
		A.colour = "Black";
		A.brand = "Acer";
		A.price = 450000.00;
		A.RAM = 512;
		A.processor = "i9"                                                                                                 ;
	
		A.code();
		System.out.println ("A colour: "+A.colour);
		
		
	}
}