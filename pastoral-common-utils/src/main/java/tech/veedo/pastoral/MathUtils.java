package tech.veedo.pastoral;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 数学工具集，包含算法工具方法
 */
public class MathUtils {

    /**
     * 找寻一个整数列表中，最先出现的不连续的数字。
     * 例如：1，2，3，4，9，10，23 返回【4】
     * 5，4，1，4，19 返回【5】
     * @param origin
     * @return
     */
    public static Integer findMinDiscreteInt(List<Integer> origin) {
        if (origin == null || origin.size() <= 0) {
            return null;
        }
        if (origin.size() == 1) {
            return origin.get(0);
        }
        if (origin.size() == 2) {
            return origin.get(0)+1==origin.get(1)?origin.get(1):origin.get(0);
        }

        List<Integer> indexs = Stream.iterate(0, i -> i+1).limit(origin.size() - 1)
                .filter(integer -> (origin.get(integer)+1)!=origin.get(integer+1))
                .collect(Collectors.toList());

        if (indexs.size() == 0) return origin.get(origin.size() - 1);

        return origin.get(indexs.get(0));
    }

}
