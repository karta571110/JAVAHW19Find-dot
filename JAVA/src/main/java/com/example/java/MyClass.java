package com.example.java;


import java.util.Scanner;

public class MyClass {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        float xdot[] = new float[10];
        float ydot[] = new float[10];
        float recx[] = new float[20];
        float recy[] = new float[20];
        float recinputtime = 0;
        float dotinputtime = 0;
        String judge;
        while (true) {
            System.out.println("�п�J�x�Τ��⳻�I(�̦h5��):");
            judge = scanner.next();
            if (judge.matches("r")) {
                for (int i = 0; i <= recx.length; i += 2) {

                    recx[i] = scanner.nextFloat();
                    recy[i] = scanner.nextFloat();
                    recx[i + 1] = scanner.nextFloat();
                    recy[i + 1] = scanner.nextFloat();
                    recinputtime++;
                    judge = scanner.next();
                    if (judge.equals("*")) {
                        break;
                    }

                }
            }
            System.out.println("�п�J�n�P�_�����I:");
            for (int i = 0; i < xdot.length; i++) {
                xdot[i] = scanner.nextFloat();
                ydot[i] = scanner.nextFloat();
                dotinputtime++;
                if (xdot[i] == (float) 9999.9 && ydot[i] == (float) 9999.9) {
                    dotinputtime--;
                    System.out.println("�}�l�P�_�O�_�I�b�x�Τ�:");
                    for (int j = 0; j < dotinputtime; j++) {
                        for (int k = 0; k < 2*recinputtime; k += 2) {
                            if (recx[k] < xdot[j] && xdot[j] < recx[k + 1] && recy[k] < ydot[j] && ydot[j] < recy[k + 1] ||
                                    recx[k] > xdot[j] && xdot[j] > recx[k + 1] && recy[k] > ydot[j] && ydot[j] > recy[k + 1] ||
                                    recx[k] < xdot[j] && xdot[j] < recx[k + 1] && recy[k] > ydot[j] && ydot[j] > recy[k + 1] ||
                                    recx[k] > xdot[j] && xdot[j] > recx[k + 1] && recy[k] < ydot[j] && ydot[j] < recy[k + 1]) {

                                    System.out.println("Point" + (j + 1) + "�]�t�b�x��" + (k / 2 + 1) + "�̡C");

                            }
                            else {

                                    System.out.println("Point" + (j + 1) + "���]�t�b�x��" + (k / 2 + 1) + "�̭�");

                            }


                        }
                    }
                }
            }
        }
    }

}
