import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        int min,max,count=0;
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the minimum value : ");
        min=sc.nextInt();
        System.out.print("Enter the maximum value : ");
        max=sc.nextInt();
        System.out.print("The prime numbers are : ");
        for(int i=min;i<=max;i++){
            for(int j=2;j<i;j++){
                if(i%j==0){
                    count=1;
                    break;
                }
            }
            if(count==0){
               System.out.print(i+" ");
            }
            count=0;
        }
    }
}
