import java.util.Scanner;
public class do_2 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int i;
        System.out.println("Enter 0 to Exit......");
        do{
            System.out.println("Enter any value: ");
            i = obj.nextInt();
            System.out.println("You entered: "+i);
        }while(i!=0);
    }
}
