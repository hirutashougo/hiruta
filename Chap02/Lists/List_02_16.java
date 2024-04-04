package Chap02.Lists;

//名前を読み込んで挨拶する

import java.util.Scanner;
//クラスの宣言
public class List_02_16 {
	//mainメソッドの宣言
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("お名前は：");  //名前の入力を促す
		String s = stdIn.nextLine();  //文字列を読み込む
		
		System.out.println("こんにちは" + s + "さん。");  //表示

	}

}