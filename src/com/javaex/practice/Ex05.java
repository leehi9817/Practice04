package com.javaex.practice;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int[] intAver = new int[5];
		int sum = 0;
		int count = 0;
		double aver;
		
		for (int i=0; i<intAver.length; i++) {
			intAver[i] = sc.nextInt();
			sum += intAver[i];
			count++;
		}
		
		aver = sum / count;
		
		System.out.println("평균은 " + aver + " 입니다.");
		
		sc.close();

	}

}
