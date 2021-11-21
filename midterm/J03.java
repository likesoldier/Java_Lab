
class Data{
	private String name;
	private Test score;     //內部類別變數;
	
	public Data(String name, int eng, int math) {		//out class constructor
		this.name=name;
		score= new Test(eng,math);			//建構
	}
	class Test{				// inner class
		int english,math;    //(1) member
		public Test(int eng,int m) {		//(2) inner constructor
			this.english=eng;
			this.math=m;
		}
		public double avg() {		//(3)
			return (english+ math)/2.0;
		}

	}
	void show() {				//(4)
		System.out.println("name:"+this.name);
		System.out.println("english socre:"+score.english);
		System.out.println("math score:"+score.math);
		System.out.println("avg:"+score.avg());
		if(score.english<60 ) System.out.println("english is fail");
		else if(score.math<60) System.out.println("math is fail");
		else
		System.out.println("You are all pass");
	}
	
	
	
}
//-----------------------------------------------------
public class J03{
	public static void main(String[] argv) {
			//(5)
	Data stu=new Data("Annie",85,56);
	Data stu1=new Data("James",85,96);
	stu.show();
	System.out.println("---------------------");
	stu1.show();
	}
	
	
}


