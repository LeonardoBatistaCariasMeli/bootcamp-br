package com.digitalhouse.bootcamp.aula1.radixSort;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RadixSort {

    public static void main(String[] args) {
        RadixSort radix = new RadixSort();

        radix.radixSort();
    }
    public void radixSort() {
        int iArr[] = { 16223, 898, 13, 906, 235, 23, 9, 1532, 6388, 2511, 8 };

        String str = Arrays.toString(iArr).replaceAll("\\s+", "");

        String[] iArrStr = str.substring(1, str.length() - 1).split(",");

        int maxLength = findMaxLength(iArrStr);

        String[] finalArr = sort(iArrStr, maxLength,1);

        for(String elem : finalArr) {
            System.out.print(elem);
            System.out.print("\t");
        }


    }

    private String[] sort(String[] iArrStr, int maxLength, int actualPosition) {
        if(actualPosition > maxLength) {
            return iArrStr;
        }

        HashMap<Integer, Integer> values = getNewHashMap();
        preencheHashMap(values, iArrStr, actualPosition);

        for(Map.Entry<Integer, Integer> entry : values.entrySet()) {
            int key = entry.getKey();
            if(!(key == 0)) {
                int value = entry.getValue();
                int auxKey = entry.getKey() - 1;
                int auxValue = values.get(auxKey);
                values.put(key, auxValue + value);
            }
        }

        String[] newArrStr = new String[iArrStr.length];
        for(int i = iArrStr.length - 1; i > -1; i --) {
            String elem = iArrStr[i];
            int digit = 0;

            if(!(elem.length() < actualPosition)) {
                digit = Integer.parseInt(elem.substring(elem.length()-actualPosition, elem.length()-actualPosition +1));
            }
            
            int value = values.get(digit);
            values.put(digit, --value);
            newArrStr[value] = iArrStr[i];
        }

        return sort(newArrStr, maxLength, ++actualPosition);
    }

    public int findMaxLength(String[] iArrStr) {
        int max = 0;
        for(String elem : iArrStr) {
           int auxMax = elem.length();

           if(max < auxMax)
               max = auxMax;
        }
       return max;
    }

    private HashMap<Integer,Integer> getNewHashMap() {
        HashMap<Integer, Integer> values = new HashMap<>();
        values.put(0, 0);
        values.put(1, 0);
        values.put(2, 0);
        values.put(3, 0);
        values.put(4, 0);
        values.put(5, 0);
        values.put(6, 0);
        values.put(7, 0);
        values.put(8, 0);
        values.put(9, 0);
        return values;
    }

    public void preencheHashMap(HashMap<Integer, Integer> values, String[] iArrStr, int actualPosition) {
        for(String elem : iArrStr) {
            int digit = 0;
            if(!(elem.length() < actualPosition)) {
                digit = Integer.parseInt(elem.substring(elem.length()-actualPosition, elem.length()-actualPosition +1));
            }
            int value = values.get(digit);
            values.put(digit, ++value);
        }
    }

}
