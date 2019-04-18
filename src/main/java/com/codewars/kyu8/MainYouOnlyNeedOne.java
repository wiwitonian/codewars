package com.codewars.kyu8;

public class MainYouOnlyNeedOne {
    public static void main(String[] args) {
        boolean a = YouOnlyNeedOne.check(new Object[] {80, 117, 115, 104, 45, 85, 112, 115}, 45);
        boolean b = YouOnlyNeedOne.check(new Object[] {'t', 'e', 's', 't'}, 'e');
        boolean c = YouOnlyNeedOne.check(new Object[] {"what", "a", "great", "kata"}, "kat");
    }
}
