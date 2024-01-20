import java.util.Scanner;

class calci{
   
   Float add(Float a, Float b){
     return a+b;
   }
   Float sub(Float a, Float b){
    return a-b; 
   }
   Float mul(Float a, Float b){
    return a*b;
   }
   Float div(Float a, Float b){
    return a/b;
   }
}
class Main{
  public static void main (String[] args){
    Float a;
    Float b;
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter the 1st number: ");
    a=sc.nextFloat();
    System.out.println("Enter the 2nd number: ");
    b=sc.nextFloat();

    calci c =new calci();

    System.out.println("Addition of 2 numbers: "+c.add(a,b));
    System.out.println("substraction of 2 numbers: "+c.sub(a,b));
    System.out.println("multiplication of 2 numbers: "+c.mul(a,b));
    System.out.println("division of 2 numbers: "+c.div(a,b));
    

}

}