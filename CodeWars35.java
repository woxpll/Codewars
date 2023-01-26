package com.company;

import java.util.HashMap;
import java.util.Map;

public class CodeWars35 {

    public static void main(String[] args) {

    }

}

class BattleShips {

    private static final String SUNK = "sunk";
    private static final String DAMAGED = "damaged";
    private static final String NOT_TOUCHED = "notTouched";
    private static final String POINTS = "points";

    public static Map<String,Double> damagedOrSunk(final int[][] board, final int[][] attacks) {

        Map<Integer, Integer> shipsPre = new HashMap<>();
        Map<Integer, Integer> shipsPost = new HashMap<>();
        Map<String, Double> result = new HashMap<>();

        checkShip(board, shipsPre);
        attack(board,attacks);



        return null;
    }

    private static void checkShip(int[][] board, Map<Integer, Integer> shipsPre){
        for (int[] row : board){
            for(int val : row){
                if(val > 0){
                    shipsPre.put(val, 1 + shipsPre.getOrDefault(val, 0));
                }
            }
        }
    }

    private static void attack(int[][] board, int [][] attack){
        for (int[] attacks : attack){
            board[board.length - 1][attacks[0] - 1]= 0;
        }
    }



}