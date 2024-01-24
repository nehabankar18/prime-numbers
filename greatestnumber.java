import java.util.Scanner;

public class greatestnumber {
    void greatest_num(int a,int b,int c){
        if(a>b&&a>c){
           System.out.println(" "+a+" is the greatest number among "+a+","+b+","+c);
        } else if(b>a&&b>c){
            System.out.println(" "+b+" is the greatest number among "+a+","+b+","+c);
        }else{
            System.out.println(" "+c+" is the greatest number among "+a+","+b+","+c);
        }    
    }
}
class Main{
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        try (Scanner g = new Scanner(System.in)) {
            System.out.println("Enter the 1st num: ");
            a=g.nextInt();
            System.out.println("Enter the 2st num: ");
            b=g.nextInt();
            System.out.println("Enter the 3st num: ");
            c=g.nextInt();
        }
        greatestnumber obj= new greatestnumber();
        obj.greatest_num(a, b, c); 
    }
}
