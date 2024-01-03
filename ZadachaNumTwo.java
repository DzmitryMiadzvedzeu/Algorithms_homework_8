package com.telran.algorithms.Practic;

import java.util.ArrayList;
import java.util.List;

public class ZadachaNumTwo {
    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3, 4, 5, 6, 9, 11, 12};
        String result = getRangeString(array);
        System.out.println(result);
    }

    public static String getRangeString(int[] array) {
        List<String> ranges = new ArrayList<>();
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < array.length; i++) {
            int start = array[i];

            while (i < array.length - 1 && array[i + 1] == array[i] + 1) {
                i++;
            }

            int end = array[i];
            ranges.add(getRange(start, end));
        }

        for (String range : ranges) {
            stringBuilder.append(range);
            stringBuilder.append(",");
        }

        if (stringBuilder.length() > 0) {
            stringBuilder.setLength(stringBuilder.length() - 1);
        }

        return stringBuilder.toString();
    }

    public static String getRange(int start, int end) {
        if (start == end) {
            return String.valueOf(start);
        } else {
            return start + "-" + end;
        }
    }
}
