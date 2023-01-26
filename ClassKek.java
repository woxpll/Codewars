package com.company;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ClassKek {
    public static void main(String[] args) {

    }
}

class KekKek{
    public int GetStatus(String login) {
        Map<String, Integer> mass = new HashMap<>();

        for (Map.Entry<String, Integer> map : mass.entrySet()) {
            if (map.getKey().equals(login)) {
                return map.getValue();
            }
        }
        return -1;
    }
}