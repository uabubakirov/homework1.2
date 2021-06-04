package com.company;


public class Main {

    public static int generateRandomAge() {
        int randomAge = (int) (Math.random() * 101);
        return randomAge;

    }

    public static void main(String[] args) {

        String result = walk(25, 26);
        String result2 = walk(10, 14);
        String result3 = walk(50, 28);
        String result4 = walk(68, 11);
        String result5 = walk(4, 9);
        String randomAgeResult = walk(generateRandomAge(), 26);
        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);
        System.out.println(randomAgeResult);
    }




    public static String walk(int age, int temp) {
        if (age >= 20 && age <= 40 && temp >= -20 && temp <= 30) {
            return ("Можно идти гулять");
        } else if (age < 20 && temp >= 0 && temp <= 28) {
            return ("Можно идти гулять");
        } else if (age > 45 && temp >= -10 && temp <= 25) {
            return ("Можно идти гулять");
        } else {
            return ("Оставайтесь дома");
        }

    }


}

