public class Logical32v {
    public static void main(String[] args) {
        
        int a = 20, b = 15;
        int c = 10, d = 5;
        boolean result = (a<b)&&(c<d);  //AND
        boolean result1 = (a>b)||(c<d);//OR
        System.out.println(result1);
    }
    
}
