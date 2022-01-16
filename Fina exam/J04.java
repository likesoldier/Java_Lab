import java.lang.*;
abstract class CShape                          //抽象類別
{
  public int number;                   //邊數
  public int totalAngle;       //內角和,公式為totalAangle=(number-2)*180
  public abstract void angle();        //抽象方法
  @Override public String toString()   //(b)
  {
    return "正" + number + "邊形每一角為" + (totalAngle/number) + "度";
  }
}

class CTriangle extends CShape		//正三角形
{
 @Override public void angle()  //(a) 
 {
     	number=3;
     	totalAngle=(number-2)*180;     
 }
 
}
class CRect extends CShape		//正四邊形
{
  @Override public void angle() //(a)
  {
     	number=4;
     	totalAngle=(number-2)*180;
  }  
}
class CPentagon extends CShape		//正五邊形
{
  @Override public void angle() //(a)
  {
     	number=5;
     	totalAngle=(number-2)*180;
  }
}
//===========================================================
public class J04         //主類別
{
    public static void main(String args[])                
    {
         CShape objArr[] = new CShape[3];
         objArr[0]=new CTriangle();      
         objArr[1]=new CRect();                        
         objArr[2]=new CPentagon();                   
         for(int i=0;i<objArr.length;i++)		//(c)
            objArr[i].angle();           
         for(int i=0;i<objArr.length;i++)		//(c)
            System.out.println(objArr[i].toString());
         
    }    
}    

