import java.util.Scanner;

public class armstrong{
    public static void main(String []args ){
        int temp=0;
    Scanner sc =new Scanner (System.in);
    System.out.println("Enter the 3 digit number : ");
    int n=sc.nextInt();

    int x=n;
    while(n!=0){
        int y= n%10;
        temp=temp+(y*y*y);
        n=n/10;
        
    }
    System.out.println("calculated : " + temp);
    if(temp==x){
        System.out.println(" it is armstrong no. ");
    }
    else{
        System.out.println(" it isnot a  armstrong no. ");
    }

    

    }
}