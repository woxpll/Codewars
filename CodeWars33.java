package com.company;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class CodeWars33 {

    public static void main(String[] args) {

    }
}


class Tour {

    public static int tour(String[] arrFriends, String[][] ftwns, Map<String, Double> h) {

        double result = 0;
        double[][] route = new double[arrFriends.length + 1][2];
        int prev = 0;

        for (int i = 0; i < arrFriends.length; i++) {
            for (int j = 0; j < ftwns.length; j++) {
                if (arrFriends[i].equals(ftwns[j][0])) {
                    if(i == 0){
                        route[i][0] = h.get(ftwns[j][1]);
                    }else {
                        route[i][0] = h.get(ftwns[j][1]);
                        route[i][1] = h.get(ftwns[prev][1]);
                    }
                    prev = j;

                }
            }
        }

        route[route.length - 1][0] = h.get(ftwns[prev][1]);
        for (int i = 0; i < route.length; i++) {
            result += Math.sqrt(Math.pow(route[i][0], 2) - Math.pow(route[i][1], 2));
        }
        return (int) Math.floor(result);

    }
}