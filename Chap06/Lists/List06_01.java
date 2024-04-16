package Chap06.Lists;

import java.util.Scanner;

/*
 * クラス名:List06_01
 * 概要:点数を読み込んで合計点・平均点を表示
 * 作成者:S.Hiruta
 * 作成日:2024/04/16
 */
public class List06_01 {

	/*
	 * 関数名：main
	 * 概要:点数を読み込んで合計点・平均点を表示 
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/04/16
	*/
	public static void main(String[] arg) {
		//Scannerクラスの変数の宣言
		Scanner standardInput = new Scanner(System.in);
		
		int sum = 0;
		System.out.println("5人の点数を入力せよ。");
		
		System.out.print("1番目の点数：");
		int yamane = standardInput.nextInt();
		sum += yamane;
		
		System.out.print("2番目の点数：");
		int takada = standardInput.nextInt();
		sum += takada;
		
		System.out.print("3番目の点数：");
		int kawachi = standardInput.nextInt();
		sum += kawachi;
		
		System.out.print("4番目の点数：");
		int koga = standardInput.nextInt();
		sum += koga;
		
		System.out.print("5番目の点数：");
		int tozuka = standardInput.nextInt();
		sum += tozuka;
		
		System.out.println("合計値は" + sum + "点です。");
		System.out.println("平均は" + (double)sum / 5 + "点です。");
	}
}