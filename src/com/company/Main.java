package com.company;

public class Main {

    public static void main(String[] args) {
        ParentA method1 = new ParentA();
        System.out.println(method1.compare2Strings());

        InheritorB method3 = new InheritorB();
        System.out.println(method3.compare2Strings());
        method3.presentation();
        method3.ascList(true);
        method3.removeNull();
        method3.numerList();


        ParentA method2 = new ParentA();
        method2.stringGrater4();


     }
}
