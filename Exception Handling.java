class exception{
	public static void main(String args[]){
		try{
			int a=50/0;
		}
		catch(ArithmeticException e){
			System.out.println(e);
		}
		try{
			int arr[]= new int[5];
			arr[6]=4;
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e);
		}
	}
}
