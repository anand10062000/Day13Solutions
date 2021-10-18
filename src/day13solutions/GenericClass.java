package day13solutions;

import java.util.ArrayList;
import java.util.List;

public class GenericClass implements Comparable<GenericClass> {
    int obj1;

    public GenericClass(int obj1) {
        this.obj1 = obj1;
    }

    public int getObj1() {
        return obj1;
    }

    @Override
    public int compareTo(GenericClass o) {
        return this.obj1-o.getObj1();
    }

    public static void main(String[] args) {
        List<GenericClass> list = new ArrayList<>();
        list.add(new GenericClass(23));
        list.add(new GenericClass(223));
        list.add(new GenericClass(3));
        for (GenericClass l : list) {
            System.out.println(l.getObj1());
        }
        //  System.out.println(list);

    }
}
