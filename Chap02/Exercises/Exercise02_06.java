package Chap02.Exercises;
//Scannerライブラリの読み込み
import java.util.Scanner;
/*
 * クラス名:Exercise02_06
 * 概要:入力された底辺と高さの数値から、三角形の面積を求める
 * 作成者:S.Hiruta
 * 作成日:2024/04/01
 */
public class Exercise02_06 {
	/*
	 *関数名:main
	 *概要:入力された底辺と高さの数値から、三角形の面積を求める
	 *引数:なし
	 *戻り値:なし
	 *作成者:S.Hiruta
	 *作成日:2024/04/01
	 */
	public static void main(String[] args) {
		//Scannerクラスの変数を宣言
		Scanner standardInput = new Scanner(System.in);
		
		//底辺の値の入力を促す
		System.out.print("底辺:");
		//底辺の実数値を読み込む
		double triangleBase = standardInput.nextDouble();
		 //高さの値の入力を促す
		System.out.print("高さ:");
		//高さの値の入力を促す
		double triangleHeight = standardInput.nextDouble();
		
		// 面積の値を表示
		System.out.println("面積は" + ( triangleBase * triangleHeight ) / 2 + "です。");

	}
}