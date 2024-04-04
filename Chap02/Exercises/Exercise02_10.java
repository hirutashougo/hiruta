package Chap02.Exercises;

import java.util.Scanner;

public class Exercise02_10 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("姓");   //姓の入力を促す
		String s = stdIn.next();  //文字列を読み込む
		
		System.out.print("名");   //名の入力を促す
		String n = stdIn.next();  //文字列を読み込む
		
		//名前の出力
		System.out.println("こんにちは" + s + n +  "さん。");

	}

}
