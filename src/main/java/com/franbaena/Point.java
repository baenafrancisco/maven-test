package com.franbaena;

/**
 * Hello world!
 *
 */
public class Point {

	private int x, y;

    public Point(int x, int y){
    	this.x = x;
    	this.y = y;
    }

    public int x(){
    	return x;
    }

    public int y(){
    	return y;
    }

    public double distance(Point p){
    	return Math.sqrt(Math.pow(p.x - x, 2)+Math.pow(p.y - y, 2));
    }

    public String toString(){
    	return "(" + x + "," + y + ")";
    }
}
