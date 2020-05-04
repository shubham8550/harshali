import java.sql.SQLOutput;

public class arr {
    public static void main(String[] arg){
        int [][]a={{4,2,6,8},{7,9}};
        int max=a[0];
        for(int i=1;i<a.length;i++){
            if(max<a[i]){
                max=a[i];
            }
        }
        System.out.println(max);
    }
}
