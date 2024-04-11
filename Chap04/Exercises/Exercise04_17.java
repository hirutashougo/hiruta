package Chap04.Exercises;

import java.util.Scanner;

/*
 * クラス名:Exercise04_17
 * 概要：List4_13を書き換えて、約数の個数も表示する様に変更
 * 作成者:S.Hiruta
 * 作成日:2024/04/11
 */
public class Exercise04_17 {

	/*
	 * 関数名：main
	 * 概要：入力された整数の約数を表示した後に、その個数も表示
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/04/11
	*/
	public static void main(String[] args) {
		
		//Scannerクラスの変数の宣言
		Scanner standardInput = new Scanner(System.in);
		
		//整数値の入力を促す
		System.out.print("整数値：");
		//入力された整数値の読み込み
		int integralNumber = standardInput.nextInt();
		
		//0が入力された場合
		if (integralNumber == 0) {
			//0は全ての倍数になりうると表示
			System.out.println("0は全ての倍数です。");
		//入力された値が負の整数の場合
		} else if (integralNumber < 0) {
			//負の整数を正の整数に変換する定数の定義
			int negativeConstant = -1;
			//負の整数を正の整数に変換
			integralNumber *= (negativeConstant);
		}
		
		//約数の個数を記録する変数の定義
		int countNumber = 0;
		
		//整数値を、インクリメントした数値で割る処理のループ
		for (int i = 1; i <= integralNumber; i++ ) {
			//インクリメントした数値で割り切れる場合
			if (integralNumber % i == 0) {
				//インクリメントした数値を整数値の約数として表示する
				System.out.println(i);
				//整数値の約数の個数を記録する
				countNumber++;
			}
		}
		//整数値の約数の個数の表示
		System.out.print("約数は" + countNumber + "個です。");
	}
}