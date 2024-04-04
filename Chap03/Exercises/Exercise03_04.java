package Chap03.Exercises;

//Scannerの読み込み
import java.util.Scanner;

/*
 * クラス名:Exercise03_04
 * 概要:読み込んだ二つの整数値の大小関係を判定して表示
 * 作成者:S.Hiruta
 * 作成日:2024/04/02
 */
public class Exercise03_04 {
	
	/*
	 *関数名:main
	 *概要:読み込んだ二つの整数値の大小関係を判定して表示
	 *引数:なし
	 *戻り値:なし
	 *作成者:S.Hiruta
	 *作成日:2024/04/02
	 */
	public static void main(String[] args) {
		
		//Scannerクラスの変数の定義
		Scanner standerdImput = new Scanner(System.in);
		
		//変数aの入力と読み込み
		System.out.print("変数a:"); double a = standerdImput.nextDouble();
		//変数bの入力と読み込み
		System.out.print("変数b:"); double b = standerdImput.nextDouble();
		
		//変数aが変数bよりも大きい場合
		if ( a > b ) {
			//変数aの方が大きいと伝える
			System.out.println("aの方が大きいです。");
		}
		//変数aが変数bよりも小さい場合
		else if  ( a < b ) {
			//変数bの方が大きいと伝える
			System.out.println("bの方が大きいです。");
		}
		//変数aと変数bが同じ値の場合
		else {
			//変数aと変数bが同じ値であると伝える
			System.out.println("aとbは等しいです。");
		}

	}

}
