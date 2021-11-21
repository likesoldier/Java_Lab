
class Personel {
	String name; // 姓名
	int bornIn; // 出生年
	
	public Personel(String name,int bornIn) {
		this.name = name;
		this.bornIn = bornIn;
	}
	void show() {
		
	}

}

class Student extends Personel {
	String id; // 學號，六位數字
	int grade; // 年級，1~6
	String c1,c2;  //修課科目1, 2
	
	public Student(String name,int bornIn,String id,int grade, String c1,String c2) {
		super(name,bornIn);
		this.id = id;
		this.grade = grade;
		this.c1=c1;
		this.c2=c2;
	}
	void show() {			// override
		System.out.println("name:"+this.name);
		System.out.println("Date of Born:"+this.bornIn);
		System.out.println("Id:"+ this.id);
		System.out.println("grade:"+this.grade);
		System.out.println("course1:"+this.c1);
		System.out.println("course2:"+this.c2);
	}

}

class Teacher extends Personel {
	String course; // 教授科目，國文、英文、數學
	public Teacher(String name,int bornIn,String course) {
		super(name,bornIn);
		this.course = course;
	}
	void show() {				//override
		System.out.println("name:"+this.name);
		System.out.println("Date of Born:"+this.bornIn);
		System.out.println("Course:"+this.course);

	}
	
}

public class J01 {
	public static void main(String[] argv) {
		int i;
		Personel[] persons = new Personel[4];
			
		persons[0]=new Student("張三",88,"940001",1, "國文","英文");
		persons[1]=new Student("王五",87,"930001",2,"數學","英文");
		persons[2]=new Teacher("張九",60,"英文");
		persons[3]=new Teacher("蕭十",62,"國文");
		
		for (i=0;i<persons.length;i++) {
			persons[i].show();
			System.out.println("----------------------");
		}
		
	}
}
