
class OutException extends Exception
{ }
class InException extends Exception
{ }
class CenterException extends Exception
{ }

public class J02
{
   public static void main(String args[])
   {  
      double radius=10.0;
      double x1=7.5;
      double y1=6.8;
      double x2=0.2;
      double y2=15.5;
      double dist=Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
      
      try
      {
         if(x1==x2 && y1==y2)
            throw new CenterException();
         else if(dist<=radius)
            throw new InException();
         else if(dist>radius)
            throw new OutException();         
      }
      catch(CenterException e)
      {
         System.out.print("("+x1+","+y1+")");
         System.out.print("在半徑"+radius);
         System.out.println(",圓心("+x2+","+y2+")的圓心上");  
      }      
      catch(OutException e)
      {
         System.out.print("("+x1+","+y1+")");
         System.out.print("不在半徑"+radius);
         System.out.println(",圓心("+x2+","+y2+")的圓內");  
      }      
      catch(InException e)
      {
         System.out.print("("+x1+","+y1+")");
         System.out.print("在半徑"+radius);
         System.out.println(",圓心("+x2+","+y2+")的圓內");
      }
   }
}  

/* output--------------------------------
(5.3,6.8)在半徑10.0,圓心(0.2,9.5)的圓內
---------------------------------------*/ 