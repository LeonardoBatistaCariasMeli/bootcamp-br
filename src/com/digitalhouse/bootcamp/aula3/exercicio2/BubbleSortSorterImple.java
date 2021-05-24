package com.digitalhouse.bootcamp.aula3.exercicio2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class BubbleSortSorterImple implements Sorter{
    @Override
    public <T> List<T> sort(List<T> t, Comparator<T> comparator) {
        var n = t.size();
        var c = new ArrayList<T>(t);

        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j < n - i - 1; j++) {

                if (comparator.compare(c.get(j),c.get(j + 1) ) < 0) {
                    var temp = c.get(j);
                    c.set(j,c.get(j + 1));
                    c.set(j + 1 , temp);
                }
            }
        }

        return c;
    }
}
