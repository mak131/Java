public class Instance_method_with_parameter57v {
    public static void main(String[] args) {
        Instance_method_with_parameter57v obj = new Instance_method_with_parameter57v();
        obj.disp(5,10); //Calling Instance_method_with_parameter
        System.out.println("Mak");
    }
    void disp(int a,int b)  //Instance_method_with_parameter
    {
        int x = a;  //local variable
        int y = b;  //local variable
        int z = x+b;
        System.out.println("Addition: "+z);
    }
}
