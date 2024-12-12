package others;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;

/**
 * @description:
 * @author: Lenovo
 * @time: 2024/9/12 下午6:47
 */
public class RandomizedSet {
    HashSet<Integer> set;
    public RandomizedSet() {
        set=new HashSet<>();
    }

    public boolean insert(int val) {
        boolean res = !set.contains(val);
        set.add(val);
        return res;
    }

    public boolean remove(int val) {
        boolean res = set.contains(val);
        set.remove(val);
        return res;
    }

    public int getRandom() {
        ArrayList<Integer> list=new ArrayList<>(set);
        int randomindex = new Random().nextInt(list.size());
        return list.get(randomindex);
    }
}
