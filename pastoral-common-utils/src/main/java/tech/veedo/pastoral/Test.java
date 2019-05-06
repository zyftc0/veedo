package tech.veedo.pastoral;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        List<Integer> origin = new ArrayList<>();

//        origin.add(1);
//        origin.add(2);
//        origin.add(3);
//        origin.add(4);
//        origin.add(9);
        origin.add(10);
        origin.add(13);
        origin.add(23);
        origin.add(53);
        origin.add(54);

        System.out.println(MathUtils.findMinDiscreteInt(origin));

    }

}
