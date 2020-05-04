public class test {
int a=25;
 public void myMeth(){
     System.out.println("hi im from chiled class");

    }
}
class test2 extends test{
    public static void main(String[] args){
        test2 myObj=new test2();
        myObj.myMeth();
    }

}
