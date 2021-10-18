package day13solutions;
import java.lang.constant.Constable;

public class StringGreatest {
    public String greatestString(String a, String b,String c) {
        Integer x = a.compareTo(b);
        Integer y = b.compareTo(c);
        String z ;
        Integer result = x+y;
        if(result < 0){
            if(b.compareTo(c)<0){
                z=c;
            }
            else
                z=b;
        }
        else {
            if(a.compareTo(b)<0){
                z=b;
            }
            else
                z=a;
        }
        return z;
    }
}

