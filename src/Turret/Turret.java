package Turret;

import java.io.*;
import java.util.Scanner;

public class Turret {

    public static void main(String[] args) {

        int x,y,r;
        x = 20000;
        y = 20000;

        int 조규현[][] =  new int[x][y];
        int 백승환[][] =  new int[x][y];
        int 류재명[][] =  new int[x][y];

        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int r1 = sc.nextInt();

        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int r2 = sc.nextInt();

        double dx = x2-x1;
        double dy = y2-y1;
        double d  = Math.sqrt(dx*dx+dy*dy);

        if (d == 0 && r1 == r2) {
            System.out.println(-1);
        } else if (d > r1 + r2) {
            System.out.println(0);
        } else if (d < Math.abs(r1 - r2)) {
            System.out.println(0);
        } else if (d == Math.abs(r1 - r2)) {
            System.out.println(1);
        } else if (d == r1 + r2) {
            System.out.println(1);
        } else {
            System.out.println(2);
        }


    }
}
