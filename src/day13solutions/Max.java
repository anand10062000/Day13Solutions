package day13solutions;

public class Max {
    public int greatest(Integer a, Integer b,Integer c) {
        Integer x = a.compareTo(b);
        Integer y = b.compareTo(c);
        Integer result = x.compareTo(y);
        if(result == 1||result == 0){
            result = a>c?a:c;
        }
        else if (result == -1){
            result=b;
        }
        return result;
    }

}

