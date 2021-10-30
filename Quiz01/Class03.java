/***********第三題*******************/
class Data
{
	
	private String name;	
	private Test score;   // 類別型態
	private  Test data ;
	 public Data(String na , int en, int m ) {				//外部建構元
		 this.name=na;
		 data=new Test(en, m);
	 }
	 /***********使用巢狀類別*******************/
	 class Test 				//(1)內部類別
	 {
		 public Test() {
		 }
		 
		 public Test (int eng,int m)    // (2) 建構元
			{
				english=eng;
				math=m;
			}
		int english;			//(1) 成員
		int math;
		double avg()				//(3) 方法1
		{
			return (english+math)/2;
			
		}
	
	 }

	void show ()				//(4) 方法2
	{
		Test t=new Test();
		System.out.print("name:"+name);
		System.out.println(" english="+t.english+" math="+t.math);
		
	}

}

public class Class03 {

	public static void main(String[] args)
	{
		Data[] a;			//(5)物件陣列 a
		a=new Data[2];
		
		a[0]=new Data("Annie",85,92);  
		a[1]=new Data("Brian",77,56);
				
		  a[0].show();
		  a[1].show();
	}

}


