package Chap03;

//読み込んだ二つの実数のうち、大きいほうの値を表示

import java.util.Scanner;

public class Chap03_9 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("整数a:"); double a = stdIn.nextDouble();//実数値の入力及び読み込み
		System.out.print("整数b:"); double b = stdIn.nextDouble();//実数値の入力及び読み込み
		
		double max = a > b ? a : b;         //大きいほうの実数値
		System.out.println("大きいほうの値は" + max + "です。" );
		
	}

}
