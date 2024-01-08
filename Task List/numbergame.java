 import java.util.*;
import java.util.random.*;
public class numbergame {
public static void main(String[] args) {
    int n;
        
        do {
int Ans;
Random random=new Random();
Ans=random.nextInt(100);
 int k=3;
    int count=0;   
    while (k>0) {  
    System.out.println("enter the guess number");
       Scanner s=new Scanner(System.in);
       int num=s.nextInt();
    

    if (num==Ans) {
        System.out.println("you win");
        break;
    }
    else if(num>Ans){
    System.out.println("too high");
    k--;
    }
    else{
    System.out.println("your answer is too low");
    k--;
    }
    count++;
}
if (count==0||count==1) {
    System.out.println("your Score is 100%");
}
else if (count==2) {
    System.out.println("your Score is 60%");
}
else
System.out.println("you lose "+"\n"+"your score is 0");

System.out.println("press 0 to exit");
       Scanner s=new Scanner(System.in);
       n = s.nextInt();

        } while (n==1);

}
}