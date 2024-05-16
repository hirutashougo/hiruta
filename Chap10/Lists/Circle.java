package Chap10.Lists;

//Scannerのインポート
import java.util.Scanner;

/*
* クラス名:Math
* 概要:円周の長さと円の面積を求める(円周率はMath.PIを利用)
* 作成者:S.Hiruta
* 作成日:2024/05/16
*/
public class Circle {

	//Scannerクラスの変数の定義
	static Scanner standardInput = new Scanner(System.in);

	/*
	* クラス名:main
	* 概要:円周の長さと円の面積を求める(円周率はMath.PIを利用)
	* 作成者:S.Hiruta
	* 作成日:2024/05/16
	*/
	public static void main(String[] args) {

		//半径の入力を促す
		System.out.print("半径：");
		//入力された値を読み込む
		double r = standardInput.nextInt();
		
		//円周を表示
		System.out.println("円周の長さは" + 2 * Math.PI * r + "です。");
		//面積を表示
		System.out.println("面積は" + Math.PI * r * r + "です。");
	}
}
