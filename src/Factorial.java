
public class Factorial {

	public static void main(String[] args){
		
		try{
			int num = Integer.parseInt(args[0]);
			System.out.println(computeFactorial(num));
		}catch(Exception e){
			System.out.println("Error: please provide a valid integer");
		}
	}
	
	public static int computeFactorial(int val){
		if(val <= 0)
			return 1;
		else
			return val*computeFactorial(val-1);
	}
}
