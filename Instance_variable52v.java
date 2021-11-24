public class Instance_variable52v {
    public static void main(String[] args) {
        Test obj = new Test();
        Test obj1 = new Test();
        obj1.roll = 13;
        obj1.mark = 150;
        obj.mark = 100;
        System.out.println("Roll1: "+obj1.roll);
        System.out.println("Mark1: "+obj1.mark);
        System.out.println("Roll: "+obj.roll);
        System.out.print("Mark: "+obj.mark);
    }
}
class Test
{
    int roll= 10;   // instance variable 
    int mark;      // instance variable   
}