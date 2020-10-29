package com.company;
import ibadts.IBCollection;
public class Main {

    public static void main(String[] args) {
        final int limit = 40;
        IBCollection<Integer> temps = new IBCollection<>();
        temps.add(new Integer[]{19, 44, 76, 100});
        temps.addItem(56);
        int count = 0;
        while (temps.hasNext()) {
            int t = temps.getNext();
            if (t > limit)
                count++;
        }
        System.out.println(count);
    }
}
