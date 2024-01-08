import java.util.*;
public class studentgrade {
public static void main(String[] args) {
    System.out.println("enter total subject");
    Scanner s=new Scanner(System.in);
    int num=s.nextInt();
    int total=0;
    for (int i = 0; i <num; i++) {
    System.out.println("Enter marks obtained in subjects"+":"+(i+1));
    int marks=s.nextInt();
    total+=marks;
}
int percentage=total/num;
System.out.println("Total marks :"+total);
System.out.println("Average percentage :"+percentage+"%");
gradecalculation(percentage);
}

public static void gradecalculation(int percentage){
if (percentage>=95) {
    System.out.println("Grade A++");
}
else if (percentage>=90 && percentage<95) {
    System.out.println("Grade A+");
}
else if (80<=percentage && percentage<90) {
    System.out.println("Grade A");   
}
else if (75<=percentage && percentage<80) {
    System.out.println("Grade B++");
    }
 else if (70<=percentage && percentage<75) {
    System.out.println("Grade B+");
 }   
 else if (60<=percentage && percentage<70) {
    System.out.println("Grade B");
 }
 else if (55<=percentage && percentage<60) {
    System.out.println("Grade C++");
 }
 else if (50<=percentage && percentage <55) {
    System.out.println("Grade C+");
 }
 else if (40<=percentage && percentage <50) {
    System.out.println("Grade C");
 }
 else{
 System.out.println("fail");
 }
}

}
