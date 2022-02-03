package com.technews;

public class VariableTypes {
    public static void main(String[] args) {
        String name = "Cleopatra";
        int age = 2016 + 69;
        double price = 1999.99;
        boolean truth = true;
        boolean falseness = !truth;

        /*
        A)
        Create two variables—one int and one double.  Add them together to find the sum, and store the result as a
        variable called sum. What type is sum?
        B)
        Create a String variable. Add it to your int and store the result as a variable. What type is it?
        ..
        ..
        When you think you know the data types of the resultant variables, use System.out.println to check the values.
        ..
        ..
        Is sum a whole number or a decimal value? Decimal value, as b is a decimal value.
         */

        int birthyear = 2022 - 56;
        System.out.println("birthyear: " + birthyear);

        /*
        A)
        When one operand is an int and the other is a double, Java creates a new temporary value that is the double
        version of the int operand. For example, suppose that we are adding dd + ii where ii is an int variable.
        Suppose the value of ii is 3. Java creates a temporary value 3.0 that is the corresponding double value.
         */

        double sum = age + price;
        System.out.println("sum (int price added to double price): " + sum);

        /*
        B)
        Can you add a string and an int?
        When you add a string and an integer together, it performs "String concatenation", where it's converting your
        integer into a string and sticking it on the end of the other string. So your result will be the first
        string with the characters 12 stuck on after it.
         */

        String eleven = "11";
        String elevenPlusAge = eleven + age;
        System.out.println("elevenPlusAge: "+ elevenPlusAge);


    }
}
