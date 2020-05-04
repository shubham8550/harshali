public class poly2 {
    public void show(String a){
        System.out.println("wellcome " +a);
    }

}
 class test3 extends poly2{
     @Override
     public void show( String a) {
         System.out.println("hii" +a );
     }
     public static void main(String[] arg){
poly2 x= new poly2();
x.show("Miss Harshali");
test3 y= new test3();
y.show(" elon");
             }
 }
