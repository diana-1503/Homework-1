package com.company;
import ibadts.IBCollection;
public class Main {

    public static void main(String[] args) {
        final int limit = 2;
        IBCollection <String> names = new IBCollection<>();
        names.add (new String[] {"John", "Marie"});
        int count = 0;
        while (names.hasNext()) {
            String n = names.getNext();
            if (count > limit)
                count = count + 1;
        }
        System.out.println(count);



        }

    }

