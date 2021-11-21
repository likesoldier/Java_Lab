//********計算土地價格
class area{
	int price=3000;
	double c_area(double s){		//多載1
		return (price*s*s);
	}
	
	double c_area(double l, double w) {		//多載2
		return (price*l*w);
	}
	
}



public class J04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		area a= new area();
		double side=5.1;
		System.out.println("方形邊長="+side);
		System.out.println("方形面積價格="+a.c_area(side));
		//----------------------------------
		double length=5.1, width=7.2;
		
		System.out.println("長="+length+"寬="+width);
		System.out.println("矩形面積價格="+a.c_area(length,width));
		
	}