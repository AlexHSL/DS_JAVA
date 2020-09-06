package com.dataStructrue;

public class HanoiTower {
    public void buildTower(int n, String from, String to, String temp) {
        if (n == 1) {
            System.out.println("move from " + from + " to " + to);
        } else {
            buildTower(n-1,from,temp,to);
            buildTower(1,from,to,temp);
            buildTower(n-1,temp,to,from);
        }
    }
}
