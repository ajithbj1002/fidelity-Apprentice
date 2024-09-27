import java.util.Scanner;

public class booleanresult {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of X: ");
        int x = sc.nextInt();
        System.out.println("Enter value of Y: ");
        int y = sc.nextInt();
        boolean z;
        if(x<y){
            z=true;
        }else{
            z=false;
        }
        System.out.println("The result of weather x is less then y is "+z);
    }
}
