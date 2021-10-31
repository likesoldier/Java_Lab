import java.util.Scanner;

public class Class02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyin = new Scanner(System.in);  //輸人
		System.out.print("Input a number:");
		int n=keyin.nextInt();
		boolean r=is_prime(n);
		if(r==true) System.out.println(n+"    Yes");
		else  System.out.println(n+"    No");
		
	}
    public static boolean is_prime(int n){
    	boolean r=true;
    	for(int i=2;i<n;i++) {
			if(n% i==0) {
				r=false;break;
			}
							 
		}
    	return r;
    }
}
