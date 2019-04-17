package com.codewars.kyu4;

import java.util.List;
import java.util.ArrayList;

public class ObservedPin {
    public static List<String> getPINs(String observed) {
        List<String> list = new ArrayList<String>();
        String[][] p = new String[10][];

        p[0] = new String[]{"0", "8"};
        p[1] = new String[]{"1", "2", "4"};
        p[2] = new String[]{"1", "2", "3", "5"};
        p[3] = new String[]{"2", "3", "6"};
        p[4] = new String[]{"1", "4", "5", "7"};
        p[5] = new String[]{"2", "4", "5", "6", "8"};
        p[6] = new String[]{"3", "5", "6", "9"};
        p[7] = new String[]{"4", "7", "8"};
        p[8] = new String[]{"0", "5", "7", "8", "9"};
        p[9] = new String[]{"6", "8", "9"};

        for(int i = 0; i < observed.length(); i++) {
            int key = Integer.parseInt(""+observed.charAt(i));
            int size = list.size();
            if (size == 0) {
                for(int j = 0; j < p[key].length; j++) {
                    list.add(p[key][j]);
                }
            } else {
                for(int j = 0; j < size; j++) {
                    String s = list.remove(0);
                    for (int k = 0; k < p[key].length; k++) {
                        list.add(s+p[key][k]);
                    }
                }
            }
        }

        return list;
    } // getPINs

} // ObservedPin
