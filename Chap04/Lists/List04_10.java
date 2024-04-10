package Chap04.Lists;

import java.util.Scanner;

/*
 * クラス名:List4_10
 * 概要：正の整数を読み込んで逆順に表示
 * 作成者:S.Hiruta
 * 作成日:2024/04/08
 */
public class List04_10 {

	/*
	 * 関数名：main
	 * 概要：正の整数を読み込んで逆順に表示
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：hiruta
	 * 作成日：2024/04/08
	*/
	public static void main(String[] args) {

		//Scannerクラスの変数の宣言
		Scanner standardInput = new Scanner(System.in);
		
		//整数の入力を促す
		System.out.println("1からnまで和を求めます。");
		
		//変数nを宣言
		int n;
		
		//do文の開始
		do {
			
			//入力を促す
			System.out.print("nの値：");
			//読み込む
			n = standardInput.nextInt();
			
		//nが0以下になるまでループ
		} while (n <= 0);
		
		//変数sumを初期状態0で宣言
		int sum = 0;
		//変数iを初期状態1で宣言
		int i = 1;
		
		//変数iが変数n以下になった場合
		while (i <= n) {
			//複合代入演算子を用いて変数sumに変数iを追加していく
			sum += i;
			//後置増分演算子を用いて変数iに1ずつ追加
			i++;
		}
		
		//while文終了後、1から入力した整数までの和を表示
		System.out.println("1から" + n + "までの和は" + sum + "です。");
		System.out.println(i);

	}
}
