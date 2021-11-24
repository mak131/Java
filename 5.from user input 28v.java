import java.util.Scanner;

class Hell{
    public static void main(String args[]){
        int a;
        float b;
        String str;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter String: ");
        str = obj.nextLine();
        System.out.println("String: "+str);
        System.out.println("Enter Integer: ");
        a = obj.nextInt();
        System.out.println("Integer: "+a);
        
        System.out.println("Enter Float: ");
        b = obj.nextFloat();
        System.out.println("Float: "+b);
    }
}