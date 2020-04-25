package com.company;
import java.lang.*;


public class ParentA {
    private String strg1;
    private String strg2 = "Este no lo muestra";


    public ParentA() {

    }

    protected String getStrg1() {
        return this.strg1;
    }

    protected void setStrg1(String strg1) {
        this.strg1 = strg1;
    }

    protected String getStrg2() {
        return strg2;
    }

    protected void setStrg2(String strg2) {

        this.strg2 = strg2;
    }

    public String compare2Strings(){
        ParentA setval1 = new ParentA();
        setval1.setStrg1("Este no lo muestra");
        String strg01 = setval1.getStrg1();
        setval1.setStrg2("Este no lo muestra");
        String strg02 = setval1.getStrg2();

        try {

            if (strg01.matches("[\\s+aA-zZ]+") && strg02.matches("[\\s+aA-zZ]+")) {
                if (strg01.equals(strg02)) {
                    return "Both Strings are equals.  \t The first string is: " + strg01 ;

                } else {
                    return "The strings are not equals.";
                }
            } else {
                return "Most be a valid input, just strings are allowed.";
            }
        } catch (Exception e) {
            return "Must enter a value";
        }
    }

    public void stringGrater4(){
        System.out.println("\n Method that checks if a string lenght is greater than 4: \n");
        ParentA setval2 = new ParentA();
        setval2.setStrg1("ASD");
        String strg03 = setval2.getStrg1();

        int count = 0;
        try{
            if(strg03.matches("[\\s+aA-zZ]+")){
                if(strg03.length() > 4){
                    System.out.println("The string is: "+ strg03);
                }
                else{
                    for(char cuenta:strg03.toCharArray()){
                        System.out.println("Char Num: " + count + " - Char: " + cuenta);
                        count++;
                    }
                    System.out.println("The string has " + count + " characters");
                }
            }
            else{
                System.out.println("Most be a valid input, just strings are allowed.");
            }
        }
        catch(Exception e){
            System.out.println("Must enter a value second method");
        }
    }
    interface  Hello{
        public void presentation();
    }
}

