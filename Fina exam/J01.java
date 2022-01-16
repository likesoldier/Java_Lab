import java.io.*;

//定義成績通過的IPass介面
interface IPass {
int s1 = 80;  // 各科篩選標準
int s2 = 85;  // 獎學金最低成績
void Pass();
}

//定義CCollage類別實作IPass介面
class CCollage implements IPass {
int score1,score2,score3;
String title = "學期成績,";
String passOK;
double avg;

public void Pass() {
  avg=(score1+score2+score3)/3. ;
	
 if (score1 >= s1){
 	if(score2 >=s1){
 		if(score3 >=s1){
 			if(avg >= s2) passOK = "恭喜您!!達獎學金標準";
 			
 			else passOK = "未達獎學金標準";
 		}else passOK = "未達獎學金標準";
 	}else passOK = "未達獎學金標準";
 }else passOK = "未達獎學金標準";  
}   

}
/**************************************************************/
public class J01 {
  public static void main(String[] args) throws IOException {
    int chi_score01=82, eng_score01=83,math_score01=81;
    int chi_score02=81, eng_score02=88,math_score02=95;
	  //  第一位學生成績
    System.out.println("第一位學生成績");
	System.out.println("國文成績："+chi_score01);
    System.out.println("英文成績："+eng_score01);
    System.out.println("數學成績："+math_score01);
   
    CCollage pass1 = new CCollage();
    pass1.score1 = chi_score01;
    pass1.score2 = eng_score01;
    pass1.score3 = math_score01;
    pass1.Pass();
    System.out.print(pass1.title);
    System.out.println(pass1.avg);
    System.out.println(pass1.passOK); 
    System.out.println("--------------------------------");
    //  第二位學生成績
    System.out.println("第二位學生成績");
	System.out.println("國文成績："+chi_score02);
    System.out.println("英文成績："+eng_score02);
    System.out.println("數學成績："+math_score02);
    CCollage pass2 = new CCollage();
    pass2.score1 = chi_score02;
    pass2.score2 = eng_score02;
    pass2.score3 = math_score02;
    pass2.Pass();
    System.out.print(pass2.title);
    System.out.println(pass2.avg);
    System.out.println(pass2.passOK); 
    System.out.println("--------------------------------");
       
    
  }
}




