package com.example.everything_s_ok;
import java.util.ArrayList;

public class Practice_0519 {
    /*
    3  1  3
    2  3  2(2*n) -1
    1  5  1
    0  7  0
    */

    public static void main(String[] args) {


        for(int a=0;a<7;a++){
            System.out.print("*"); }
        System.out.println();
        for(int a=0; a<4; a++){
            for(int i=0; i<1;i++){
                System.out.print(" ");
            }
            if(a==0){
                for(int i=0; i<5; i++){
                    System.out.print("*");
                }
            }
        }
        System.out.println();
        for (int a=0; a<4;a++){
            for(int i=0;i<2;i++){
                System.out.print(" ");
            }
            if(a==0) {
                for (int i = 0; i < 3; i++) {
                    System.out.print("*");
                }
            }else{System.out.print(" ");}

        }
        System.out.println();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 3; j++) {
                if (j == 0) {
                    System.out.print("*");
                }else{System.out.print(" ");}
            }return;
        }
    }
}
