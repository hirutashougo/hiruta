package Chap06.Lists;

//
import java.util.Scanner;

/*
 * クラス名:List06_07
 * 概要:点数を読み込んで合計点・平均点を表示(配列版)
 * 作成者:S.Hiruta
 * 作成日:2024/04/16
 */
public class List06_07 {

	/*
	 * 関数名：main
	 * 概要:点数を読み込んで合計点・平均点を表示(配列版) 
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/04/16
	*/
	public static void main(String[] arg) {
		//
		Scanner satndardInput = new Scanner(System.in);
		
		//
		int sum = 0;
		//
		final int ninzu = 5;
		//
		int[] tensu = new int[ninzu];
		
		//
		System.out.println(ninzu + "人の点数を入力せよ。");
		//
		for (int i = 0; i < ninzu; i++) {
			//
			System.out.print((i + 1)+ "番の点数：");
			//
			tensu[i] = satndardInput.nextInt();
			//
			sum += tensu[i];
		}
		
		//
		System.out.println("合計は" + sum + "です。");
		//
		System.out.println("平均は" + (double)sum / ninzu + "です。");
	}
}