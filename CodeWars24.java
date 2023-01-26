package com.company;

import java.util.Arrays;

public class CodeWars24 {
    public static void main(String[] args) {

        String[] name = {"Jacob", "Alex"};
        Solution solution = new Solution();
        System.out.println(solution.whoLikesIt(name));

    }
}

class Solution {
    public static String whoLikesIt(String... names) {

        int count = (int) Arrays.stream(names).count();
        if (count == 0){
            return "no one likes this";
        }else if (count == 1){
            String str = String.format("%s likes this" , names[0]);
            return str;
        }else if (count == 2){
            String str = String.format("%s adn %s likes this" , names[0],names[1]);
            return str;
        }else if(count == 3){
            String str = String.format("%s, %s and %s likes this" , names[0], names[1], names[2]);
            return str;
        }else if(count <= 4){
            int co = count - 2;
            String str = String.format("%s, %s and %d likes this" , names[0], names[1], co);
            return str;
        }
        return "";
    }
}