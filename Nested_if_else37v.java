public class Nested_if_else37v {
    public static void main(String[] args) {
        if (5>3)
        {
            if(3<2)
            {
                System.out.println("Inner");
            }
            else{
                System.out.println("Inner Else");
            }
            System.out.println("Outer");
        }
        else
        {
            System.out.println("Outer Else");
        }
        System.out.println("End");
    }
}
