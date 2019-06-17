package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String [] reverse = {"W", "e", "l", "c", "o", "m", "e"};
        //String [] normal = new String[7];
        for (int i = 6; i > -1; i--){
          //  normal = normal + reverse[i];
            System.out.print(reverse[i]);
        }
    }
}