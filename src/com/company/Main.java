package com.company;

public class Main {

    public static void main(String[] args) {
	int birinchi= 5;
	int ikkinchi= 10;
	int uchunchi=8;

	ikkinchi=birinchi;
	birinchi=uchunchi;
	uchunchi=ikkinchi;
        System.out.println("birinchi " +  birinchi + " ikkinchi "  + ikkinchi +" uchhunchi "  + uchunchi);
    }
}
