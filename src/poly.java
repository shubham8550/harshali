public class poly {

    public  void show(int a){
        System.out.println("hii"+a);
    }
    public  void show(String b){
        System.out.println("hellow "+b);
    }

    public static void main(String[] arg){
    poly obj= new poly();
    obj.show(2);
    obj.show("welcome");
    }
}
