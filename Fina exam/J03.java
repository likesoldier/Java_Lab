
class PrePaid extends Thread		//(a)
{
   private static int sum=300;			//(b)
   private int fee;
   public  PrePaid(int x)
   {
	     fee=x;
   }
   public void run()				//(b)
   {
      
      if (sum>100)
      {
         
         talk(fee);
      }
   }
   public synchronized static void talk(int n)  //同步  (b)
   {
      int tmp=sum-n;
      try
      {
         sleep((int)(1000*Math.random()));			//(c)
      }
      catch(InterruptedException e){}
      if(tmp>0)
      {
         sum=tmp;
         System.out.println("通話費"+n+"元，餘額為"+sum+"元");
      }
   }
}

public class J03
{
   public static void main(String args[])
   {
      PrePaid phone1=new PrePaid(150);
      PrePaid phone2=new PrePaid(100);
      PrePaid phone3=new PrePaid(80);
     
      phone1.start();
      phone2.start();
      phone3.start();
     
   }
}
