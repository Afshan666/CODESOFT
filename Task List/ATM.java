import java.util.*;
public class ATM {
      public static void main(String[] args) {
        int Pin = 4789;
        double Balance = 5000.00;
        Scanner sc=new Scanner(System.in);
        
        System.out.println("INSERT YOU CARD");
        System.out.println("1: Check Balance");
        System.out.println("2:Witdhrowl");
        System.out.println("3:Deposit Amount");
        System.out.println("4:user details");
        int key=sc.nextInt();
        switch (key) {
            case 1:
            CheckBalanace(Pin,Balance);
            break;
            case 2:
            witdraw(Pin,Balance);
            break;
            case 3:
            Deposit(Pin,Balance);
            break;
            case 4:
            UserDetails ub=new UserDetails();
            break;

            default:
            System.out.println("jhgfgf");
            
                break;
        }
       
    }
    public static void witdraw(int Pin,double Balance){
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter You Pin");
        int correct=sc.nextInt();
        if (Pin==correct) {  
        System.out.println("1.Credit Account");
        System.out.println("2.Current Account");
        System.out.println("3.Saving Account");
        int key=sc.nextInt();
        System.out.println("Enter the Amount");
       int Amount=sc.nextInt();
       double rem;
       if (Amount<=Balance) {
        System.out.println("Please Collect Your Cash");
        System.out.println("Transection Successful");
        rem=Balance-Amount;
        System.out.println("Available Balance is :"+rem);

       }
       else
       System.out.println("Insufficent Balance");
    }
    else
    System.out.println("Inncorect Pin");
    }
    public static void CheckBalanace(int Pin,double Balance){
     Scanner sc=new Scanner(System.in);
        System.out.println("1.Credit Account");
        System.out.println("2.Current Account");
        System.out.println("3.Saving Account");
        int key=sc.nextInt();
        System.out.println("Enter Your Pin");
        int correct=sc.nextInt();
        if (Pin==correct) {
            System.out.println("Balance : "+Balance);
        }
        else
        System.out.println("Incorrect Pin");
     
    }
    public static void Deposit(int Pin,double Balance){
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter Account Number");
        long  Accountnum=sc.nextInt();
            System.out.println("Name : Afshan");
            System.out.println("Account Number :"+Accountnum);
            System.out.println("Enter Amount");
            int Amount=sc.nextInt();
            double sum=Amount+Balance;
            System.out.println("Balance Added Succesfully");
            System.out.println("New Balance"+sum);
            

         }


    }
    


