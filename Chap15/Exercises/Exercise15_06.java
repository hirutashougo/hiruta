package Chap15.Exercises;

//Scannerをインポート
import java.util.Scanner;

/*
* クラス名:Exercise15_06
* 概要：コマンドライン引数で与えられた半径を持つ円の円周の長さと面積を求めて表示する
* 作成者:S.Hiruta
* 作成日:2024/05/30
*/
public class Exercise15_06 {

	//Scannerクラスの変数を設定
	static Scanner standardInput = new Scanner(System.in);

	/*
	 * 関数名：main
	 * 概要:コマンドライン引数で与えられた半径を持つ円の円周の長さと面積を求めて表示する
	 * 引数：半径(String[]型)
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/30
	*/
	public static void main(String[] args) {
		//円の半径をコマンドライン引数に設定
		Double radiusLength = Double.parseDouble(args[0]);
		//半径としてコマンドライン引数に設定された数値が0以下の場合
		if (radiusLength <= 0) {
			//半径が0以下の値であるため、円周と面積は求められないことを伝える
			System.out.println("半径が0以下の値であるため、円周と面積は求められません。");
			//半径としてコマンドライン引数に設定された数値が正の値の場合
		} else {
			//円周を求める
			double circumferenceLength = (radiusLength + radiusLength) * Math.PI;
			//面積を求める
			double circleArea = (radiusLength * radiusLength) * Math.PI;
			//半径を表示
			System.out.println("半径：" + radiusLength);
			//円周を表示
			System.out.println("円周：" + circumferenceLength);
			//面積を表示
			System.out.println("面積：" + circleArea);
		}
	}

}
