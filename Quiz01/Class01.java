class CCal{
	int radius;
	int length;
	int width;
	int height;
	double pi = 3.1416;
	void Cal_area(int r) {              //多載1
		radius = r;
		show_b();
	}
	void Cal_area(int l, int w, int h) {			//多載2
		length = l;
		width = w;
		height = h;
		show_c();
	}
	void show_b() {
		System.out.println("半徑 = "+ radius);
		System.out.println("球形體積 = "+ 4*pi*radius*radius*radius/3);}
	void show_c() {
		System.out.println("長 = "+length+" ,寬 = "+width+" ,高 = "+height);
		System.out.println("立方體表面積 = "+ 2*(length*width+length*height+width*height));		
	}
}
public class Class01 {
	public static void main(String args[]) {
		CCal ca = new CCal();
		ca.Cal_area(10);
		System.out.println("");
		ca.Cal_area(4, 5, 6);
		//ca.show_b();
		
		//ca.show_c();
	}
}
