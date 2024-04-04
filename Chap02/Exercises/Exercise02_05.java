package Chap02.Exercises;
//Scannerライブラリの読み込み
import java.util.Scanner;
/*
 * クラス名:Exercise02_05
 * 概要:読み込んだ二つの整数の合計値と平均値を表示
 * 作成者:S.Hiruta
 * 作成日:2024/04/01
 */
public class Exercise02_05 {
	/*
	 *関数名:main
	 *概要:読み込んだ二つの整数の合計値と平均値を表示
	 *引数:なし
	 *戻り値:なし
	 *作成者:S.Hiruta
	 *作成日:2024/04/01
	 */
	public static void main(String[] args) {
		//Scannerクラスの変数を宣言
		Scanner standardInput = new Scanner(System.in);
		
		//xの値の入力を促す
		System.out.print("xの値:");
		//xの実数値を読み込む
		double realNumberX = standardInput.nextDouble(); 
		
		//yの値の入力を促す
		System.out.print("yの値:");
		//yの実数値を読み込む
		double realNumberY = standardInput.nextDouble();
		
		// xNumberとyNumberの合計値を表示
		System.out.println("合計は" + ( realNumberX + realNumberY ) + "です。");
		// xxNumberとyNumberの平均値を表示
		System.out.println("平均は" + ( realNumberX + realNumberY ) / 2 + "です。");
				
	}
}