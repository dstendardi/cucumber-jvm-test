package com.github.dstendardi;


public class World {


    private static Short count = 0;

    public World() {
        System.out.println("=!!!!!===> new world !");
    }

    public void hello() {
        count++;
        System.out.println(String.format("====> Hello world %d", count));
    }
}
