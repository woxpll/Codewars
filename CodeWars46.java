package com.company;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class CodeWars46 {
    public static void main(String[] args) {

        Ball ball = new Ball();
        System.out.println(ball.maxBall(85));

    }
}

class Ball {

    public static int maxBall(int v0) {

        double ms = v0 / 3.6;
        double t = (ms / 9.81) * 100;
        int tRes = (int) (5 * (Math.ceil(Math.abs(t/5))));
        return tRes / 10;
    }
}