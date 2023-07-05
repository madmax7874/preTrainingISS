package madmax;

public class Exception {

	public static void main(String[] args) {
		try {
			divide(5,0);
		}catch(ArithmeticException e){
			System.out.println(e);
		}
		try {
			divideNum(5,0);
		}catch(ArithmeticException e){
			System.out.println(e);
		}
		try {
			int n=5/0;
		}catch(ArithmeticException e){
			System.out.println(e);
		}
	}
	
	public static int divide(int a,int b) {
		if(b==0) {
			throw new ArithmeticException("denominator cannot be 0");  
		}
		return a/b;
	}
	
	public static int divideNum(int a, int b) throws ArithmeticException {  
        int div = a / b;  
        return div;  
    }  
}