import java.util.Scanner;

public class area_of_circle {
    public static void main(String []args ){
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Enter the radius : ");
        int r=sc.nextInt();
        float pie = 3.14f;
        
        float z=pie*r*r;
        System.out.print("Area of circle is : ");
        System.out.print(z);


    }
}



