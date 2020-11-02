package com.company;
import ibadts.IBCollection;
public class Main {

    public static void main(String[] args) {
        Integer[] nums = {45, 6, 17, 9, 4, 21};
        IBCollection<Integer> values = new IBCollection<>();
        values.add (nums);
        values.resetNext ();
        int largest = 0;
        while (values.hasNext())
        {
            int v = values.getNext();
            if (v > largest)
                largest = v;

        }
        values.resetNext();
        while (values.hasNext())
        {
            int v = values.getNext();
            if (v < largest / 2)
                System.out.println (v);
        }


        }

    }

