package Chap05.Lists;

//Scannerの読み込み
import java.util.Scanner;

/*
 * クラス名:List05_06
 * 概要:二つの整数値の平均を実数値で求める(合計を2.0で割る)
 * 作成者:S.Hiruta
 * 作成日:2024/04/15
 */
public class List05_06 {

	/*
	 * 関数名：main
	 * 概要:二つの整数値の平均を実数値で求める(合計を2.0で割る)
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/04/15
	*/
	public static void main(String[] arg) {
		//Scannerクラスの変数の宣言
		Scanner standardInput = new Scanner(System.in);

		System.out.println("整数値xと整数値yの平均値を求めます。");
		System.out.print("xの値：");
		int x = standardInput.nextInt();
		System.out.print("yの値：");
		int y = standardInput.nextInt();
		
		double ave =(x + y) / 2.0;
		System.out.println("xとyの平均値は：" + ave + "です。");
	}
}