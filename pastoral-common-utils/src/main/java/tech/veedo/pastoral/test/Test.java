package tech.veedo.pastoral.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Test {

    public static void main(String[] args) {
//        List<Integer> origin = new ArrayList<>();
//
////        origin.add(1);
////        origin.add(2);
////        origin.add(3);
////        origin.add(4);
////        origin.add(9);
//        origin.add(10);
//        origin.add(13);
//        origin.add(23);
//        origin.add(53);
//        origin.add(54);
//
//        System.out.println(MathUtils.findMinDiscreteInt(origin));

        HashMap<String, HashSet<String>> serialNumMap = new HashMap(){{
            put("11", new HashSet<>());
        }};

        HashSet<String> a = serialNumMap.get("11");

        a.add("cao");

        System.out.println(serialNumMap.get("11").size());
        System.out.println(a.size());



    }

}
