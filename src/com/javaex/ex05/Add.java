package com.javaex.ex05;

public class Add {
    
    private int a;
    private int b;
    
    public void setValue(int a, int b) {
    	// 내부데이터를 셋팅하는 것
    	this.a = a;
    	this.b = b;
    } 

    public int calculate() {
    	return a + b;
    }

}
