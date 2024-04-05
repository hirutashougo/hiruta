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
		Scanner standardInput = new Scanner(System.in);
		
		//変数aの入力と読み込み(変数aは教科書準拠)
		System.out.print("変数a:");
		
		//入力された変数aを読み込む
		double a = standardInput.nextDouble();
		
		//変数bの入力と読み込み(変数bは教科書準拠)
		System.out.print("変数b:");
		
		//入力された変数bを読み込む
		double b = standardInput.nextDouble();
		
		
		/*
		 * 3つの条件分けによる分岐
		 *①変数aが変数bよりも大きい場合
		 */
		if ( a > b ) {
			
			//変数aの方が大きいと伝える
			System.out.println("aの方が大きいです。");
		}
		
		//②変数aが変数bよりも小さい場合
		else if  ( a < b ) {
			
			//変数bの方が大きいと伝える
			System.out.println("bの方が大きいです。");
		}
		
		//③変数aと変数bが同じ値の場合
		else {
			//変数aと変数bが同じ値であると伝える
			System.out.println("aとbは等しいです。");
		}

	}

}
