public class Ststic_variable53 {
    public static void main(String args[]) {
        Test obj = new Test();
        Test obj1 = new Test();
        obj.mark = 100;
        obj1.mark = 400;
        System.out.println("Roll: "+obj.mark);
        System.out.println("Mark: "+obj1.mark);
    }    
}
class Test{
    static int roll = 10;   // static variable
    static int mark;       // static variable
}
