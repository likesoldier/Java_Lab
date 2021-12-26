
// ¦h­«Ä~©Ó
interface iShape03
{   
   public void show();  
   public int area(); 
}
interface iColor
{
   public void showColor();
}
class CWin03 implements iShape03,iColor
{
   protected int width;
   protected int height;
   protected String color;
       
   public CWin03(int w,int h,String str)
   {
      width=w;
      height=h;
      color=str;      
   }
   public void show()
   {
      showColor();
      System.out.println("width="+width);
      System.out.println("height="+height);
      System.out.println("area="+area());
   }
   public int area()
   {
       return width*height;
   }
   public void showColor()
   {
      System.out.println("color="+color);
   }
}

public class J2
{
   public static void main(String args[])
   {
      CWin03 win=new CWin03(5,7,"Green");
      win.show();
   }
}

/* output---------
color=Green
width=5
height=7
area=35
----------------*/ 