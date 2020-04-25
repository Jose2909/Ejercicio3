package com.company;


import java.util.ArrayList;




public class InheritorB extends  ParentA {
    ArrayList <String> orderList = new ArrayList<>();
    ArrayList <Integer> numerList = new ArrayList<>();
    ArrayList <Integer> numerosOnetoTen = new ArrayList<>();
    ArrayList <Integer> numerosFaltantes = new ArrayList<>();
    public InheritorB() {
        orderList.add("Text");
        orderList.add("Baseball");
        orderList.add("Automation");
        orderList.add("Java");
        orderList.add("Laptop");
        orderList.add(null);

        numerList.add(2);
        numerList.add(2);
        numerList.add(3);
        numerList.add(4);
        numerList.add(4);
        numerList.add(5);
        numerList.add(6);
        numerList.add(7);
        numerList.add(8);
        numerList.add(10);

        numerosOnetoTen.add(1);numerosOnetoTen.add(2);numerosOnetoTen.add(3);numerosOnetoTen.add(4);numerosOnetoTen.add(5);
        numerosOnetoTen.add(6);numerosOnetoTen.add(7);numerosOnetoTen.add(8);numerosOnetoTen.add(9);numerosOnetoTen.add(10);

    }
    public String compare2Strings(){
        if(super.compare2Strings().contains("Both Strings are equals.")) {
            return "\t\t\t\t\t\t\t The second string is: " + getStrg2();
        }
        else
            return "revisalo";
    }
    public void presentation(){
        System.out.println("Hello Interface");
    }

    public void ascList(boolean parameter) {
        InheritorB asceden = new InheritorB();
        InheritorB desceden = new InheritorB();

        if (!parameter) {
            asceden.ascending();
            asceden.descending();
        } else {
            desceden.descending();
            desceden.ascending();
        }
    }
        public void descending(){
            System.out.println("\nDescending  :\n");
            for (int stringasc = 0; stringasc < orderList.size(); stringasc++) {
                for (int strasc2 = 0; strasc2 < orderList.size() && stringasc != strasc2; strasc2++) {
                    if (orderList.get(stringasc) == null || orderList.get(strasc2) == null) {
                        continue;
                    }
                    if (orderList.get(stringasc).compareTo(orderList.get(strasc2)) > 0) {
                        String auxiliar = orderList.get(stringasc);
                        orderList.set(stringasc, orderList.get(strasc2));
                        orderList.set(strasc2, auxiliar);
                    }
                }
            }
            for (String show : orderList)
                System.out.println("\t" + show);
        }
        public void ascending(){
            System.out.println("\nAscending  :\t\n");
            for (int stringasc = 0; stringasc < orderList.size(); stringasc++) {
                for (int strasc2 = 0; strasc2 < orderList.size() && stringasc != strasc2; strasc2++) {
                    if (orderList.get(stringasc) == null || orderList.get(strasc2) == null) {
                        continue;
                    }
                    if (orderList.get(stringasc).compareTo(orderList.get(strasc2)) < 0) {
                        String auxiliar = orderList.get(stringasc);
                        orderList.set(stringasc, orderList.get(strasc2));
                        orderList.set(strasc2, auxiliar);
                    }
                }
            }
            for (String show : orderList)
                System.out.println("\t" + show);
        }
        public void removeNull(){
            int index = 0;
            System.out.println("\n List without null Element");
            for (String listNoNull:orderList) {
                index ++;
                if (orderList.get(index) == null)
                    orderList.remove(index);
                System.out.println("\t" + listNoNull);
             }
        }
        public void numerList() {
            System.out.println("\nMissing numbers: \n");
                for (Integer integer : numerosOnetoTen) {
                    if (!numerList.contains(integer)) {
                        numerosFaltantes.add(integer);
                    }
                }      System.out.println(numerosFaltantes);
        }
    }







/*Create an interface.
Do a declaration of a method:
Return type: Void - Body: NA - Parameters NA - Functionality: Print "Hello Interface"
Implement the interface in Class (B).
Create a list of strings with the following values:
"Text", "Baseball", "Automation", "Java", "Laptop", null
Create a method that orders by desc and asc order based on a parameter.
Create a method that removes null values
Create a list of integers with the following values:
2,2,3,4,4,5,6,7,8,10
Create a method that gives the missing number in 1 - 10.*/
