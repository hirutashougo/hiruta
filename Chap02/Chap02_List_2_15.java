package Chap02;

//名前を読み込んで挨拶する

import java.util.Scanner;
//クラスの宣言
public class Chap02_List_2_15 {
	//mainメソッドの宣言
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("お名前は：");  //名前の入力を促す
		String s = stdIn.next();  //文字列を読み込む
		
		System.out.println("こんにちは" + s + "さん。");  //表示

	}

}
