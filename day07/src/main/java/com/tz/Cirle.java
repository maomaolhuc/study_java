package com.tz;

public class Cirle {
    private Pointer center;
    private static final Pointer DEAFULT_CENTER = new Pointer(0, 0);
    private int radius;

    private Cirle(Pointer center) {
        this.center = center;
    }

    public Cirle(Pointer center, int radius) {
        this(center);
        this.radius = radius;
    }

    public Cirle(int radius) {
        this(DEAFULT_CENTER);
        this.radius = radius;
    }

    // 为什加static 因为所有的圆都需要这个pi 所以没必要都去创建一个 大家公用
    private final static double pi = Math.PI;

    public static double getPi() {
        return pi;
    }

    public Pointer getCenter() {
        return center;
    }

    public void setCenter(Pointer center) {
        this.center = center;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

}
