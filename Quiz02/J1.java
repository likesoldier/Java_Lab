
import java.util.*;
public class J1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int s1,s2;
		System.out.print("請輸入密碼:");
		s1=sc.nextInt();
		int count=0;
		for(;;)
		{
			System.out.print("請再次輸入密碼:");
			s2=sc.nextInt();
			if(s1==s2)
				break;
			else
				count++;
			if(count==3)
				throw new RuntimeException("輸入三次錯誤！程式停止！");
			else
				System.out.println("與第一次輸入的不同!");
		}
		System.out.println("密碼正確");
	}

}
