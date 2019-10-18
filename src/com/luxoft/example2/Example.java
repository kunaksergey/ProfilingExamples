package com.luxoft.example2;

public class Example {
    private static final int IT = 1000000;

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("0");
        for (int i = 0; i < IT; i++) {
            sb.delete(0, 1);
            sb.append(i);
        }
        System.out.println(sb);
    }
}
