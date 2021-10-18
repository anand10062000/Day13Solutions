package day13solutions;


public class FloatGreatest {
    public float greatestFloat(Float a, Float b,Float c) {
        Integer x = a.compareTo(b);
        Integer y = b.compareTo(c);
        Integer result = x.compareTo(y);
        Float f=0.f ;
        if(result == 1||result == 0){
            f = a>c?a:c;
        }
        else if (result == -1){
            f=b;
        }
        return f;
    }
}
