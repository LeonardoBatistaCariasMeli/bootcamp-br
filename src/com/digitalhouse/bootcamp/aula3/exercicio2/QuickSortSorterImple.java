package com.digitalhouse.bootcamp.aula3.exercicio2;

import java.util.Comparator;
import java.util.List;

public class QuickSortSorterImple implements Sorter {
    @Override
    public <T> List<T> sort(List<T> t, Comparator<T> comparator) {
        return List.of(new QuickSort<T>().sort((T[])t.toArray(),comparator));
    }
}
