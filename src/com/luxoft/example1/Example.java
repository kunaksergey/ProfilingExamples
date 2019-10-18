package com.luxoft.example1;

public class Example {
    private static final int IT = 100000000;
    private static int index;

    public static void main(String[] args) {
        Example example = new Example();
        while (true) {
            example.start();
        }
    }

    private void start() {
        index = 0;
        increase();
        System.out.println(index);
    }

    private void increase() {
        for (int i = 0; i < IT; i++) {
            index++;
        }
    }
}
