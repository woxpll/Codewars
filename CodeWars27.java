package com.company;

public class CodeWars27 {
    public static void main(String[] args) {

        BlackOrWhiteKey blackOrWhiteKey = new BlackOrWhiteKey();
        System.out.println(blackOrWhiteKey.blackOrWhiteKey(200));
    }
}

class BlackOrWhiteKey {
    public static String blackOrWhiteKey(int keyPressCount) {

        if(keyPressCount >= 15 && keyPressCount <= 88){
            while (keyPressCount >= 15){
                keyPressCount = keyPressCount - 12;
            }
        }else if (keyPressCount > 88){
            while (keyPressCount > 88){
                keyPressCount = keyPressCount - 88;
            }
            while (keyPressCount >= 15){
                keyPressCount = keyPressCount - 12;
            }
        }

        switch (keyPressCount){
            case 1 : return "white";
            case 2 : return "black";
            case 3 : return "white";
            case 4 : return "white";
            case 5 : return "black";
            case 6 : return "white";
            case 7 : return "black";
            case 8 : return "white";
            case 9 : return "white";
            case 10 : return "black";
            case 11 : return "white";
            case 12 : return "black";
            case 13 : return "white";
            case 14 : return "black";
            case 15 : return "white";
        }
        return "";

//        for (int i = 0; i < 10000; i++) {
//
//
//
//        }


//        for (int i = 0; i < 667; i++) {
//
//            int pattern1 = keyPressCount - (3 * i);
//            int pattern2 = keyPressCount - 8;
//
//            if (keyPressCount <= 3){
//                if(keyPressCount % 2 == 0){
//                    return "black";
//                }else
//                    return "white";
//            }else if(keyPressCount >= 3 && keyPressCount <= 7){
//                if(pattern1 % 2 == 0){
//                    return "black";
//                }else{
//                    return "white";
//                }
//            }else if(keyPressCount >= 8 && keyPressCount <= 15){
//                if(pattern2 % 2 == 0){
//                    return "black";
//                }else{
//                    return "white";
//                }
//            }
//
//        }
//
//        return  "";
    }
}