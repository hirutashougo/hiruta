package Chap06.Lists;

//
import java.util.Scanner;

/*
 * クラス名:List06_08
 * 概要:点数を読み込んで最高点を表示
 * 作成者:S.Hiruta
 * 作成日:2024/04/16
 */
public class List06_08 {

	/*
	 * 関数名：main
	 * 概要:点数を読み込んで最高点を表示 
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/04/16
	*/
	public static void main(String[] arg) {
		//
		Scanner satndardInput = new Scanner(System.in);
		
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
		}
		
		//
		int max = tensu[0];
		//
		for (int i = 1; i < tensu.length; i++) {
			//
			if (tensu[i] > max) max = tensu[i];
		}
		
		//
		System.out.println("最高点は" + max + "です。");
	}
}