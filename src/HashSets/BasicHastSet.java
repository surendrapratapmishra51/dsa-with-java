package HashSets;

import java.util.HashSet;

public class BasicHastSet {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(10);
        set.add(50);
        set.add(29);
        set.add(87);
        System.out.println("set = "+ set + "\n" +"Size = "+ set.size());
        set.remove(29);
        System.out.println("set = "+ set + "\n" +"Size = "+ set.size());
        System.out.println(set.contains(50));
    }
}
