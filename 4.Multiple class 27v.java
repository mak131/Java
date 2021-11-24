class First{
    int a,b,total;
    void add(){
        total = a+b;
    }
}
class Mak{
    public static void main(String args[]){
        First obj = new First();
        obj.a = 15;
        obj.b = 15;
        obj.add();
        System.out.println("Addition "+obj.total);

    }
}