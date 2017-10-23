package laboon;
public class Main{
	
	public static void main(String args[]){
				
			if(args.length > 1){
				System.out.println("Enter only 1 number");
				System.exit(1);
			}		
				
		try{
			
			int lazy = lazy(Integer.parseInt(args[0]));
			int tri = tri(Integer.parseInt(args[0]));
			System.out.println("Lazy( " + args[0] + ") = " + lazy);
			System.out.println("Tri (" + args[0] + ") = " + tri);
		}catch(Exception ArrayIndexOutOfBoundsException){
			System.out.println("Enter an integer to test");
			System.exit(1);
		}	

	
		
		
			
	}
	
	
	public static int tri(int n){
		int temp=0;
		for(int i =1; i <= n; i++){
			temp = temp + i;
		}		
		
		return temp;
	}
	
	public static int lazy(int n){
		
		return ((n*n + n + 2)/2);
		
	}
		
}