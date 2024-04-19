package Chap07.Lists;

//Scannerの読み込み
import java.util.Scanner;

/*
* クラス名:List07_01
* 概要:3人の身長・体重・年齢の最大値を求めて表示
* 作成者:S.Hiruta
* 作成日:2024/04/19
*/
public class List07_01 {

	/*
	 * 関数名：main
	 * 概要:3人の身長・体重・年齢の最大値を求めて表示
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/04/18
	*/
	public static void main(String[] arg) {
		//Randomクラスの変数の定義
		Scanner standardInput = new Scanner(System.in);

		//身長の配列の宣言
		int[] heightNumber = new int[3];
		//体重の配列の宣言
		int[] weightNumber = new int[3];
		//年齢の配列の宣言
		int[] ageNumber = new int[3];

		//身長・体重・年齢の読み込み
		for (int i = 0; i < 3; i++) {
			//何人目であるかを表示
			System.out.print("[" + (i + 1) + "]");
			//身長の入力を促す
			System.out.print("身長：");
			//体重の配列に入力された数値を格納する
			heightNumber[i] = standardInput.nextInt();
			//体重の入力を促す
			System.out.print("体重：");
			//体重の配列に入力された数値を格納する
			weightNumber[i] = standardInput.nextInt();
			//年齢の入力を促す
			System.out.print("年齢：");
			//年齢の配列に入力された数値を格納する
			ageNumber[i] = standardInput.nextInt();
		}

		//身長の最大値を求める
		//初めに1人目が最大身長であると過程
		int maxHeight = heightNumber[0];
		//2人目の身長が最大身長よりも大きい場合
		if (heightNumber[1] > maxHeight) {
			//最大身長を入れ替える
			maxHeight = heightNumber[1];
		}
		//3人目の身長が最大身長よりも大きい場合
		if (heightNumber[2] > maxHeight) {
			//最大身長を入れ替える
			maxHeight = heightNumber[2];
		}

		//体重の最大値を求める
		//初めに1人目が最大体重であると過程
		int maxWeight = weightNumber[0];
		//2人目の体重が最大体重よりも大きい場合
		if (weightNumber[1] > maxWeight) {
			//最大体重を入れ替える
			maxWeight = weightNumber[1];
		}
		//3人目の体重が最大体重よりも大きい場合
		if (weightNumber[2] > maxWeight) {
			//最大体重を入れ替える
			maxWeight = weightNumber[2];
		}

		//年齢の最大値を求める
		//初めに1人目が最大年齢であると過程
		int maxAge = ageNumber[0];
		//2人目の年齢が最大年齢よりも大きい場合
		if (ageNumber[1] > maxAge) {
			//最大年齢を入れ替える
			maxAge = ageNumber[1];
		}
		//3人目の年齢が最大年齢よりも大きい場合
		if (ageNumber[2] > maxAge) {
			//最大年齢を入れ替える
			maxAge = ageNumber[2];
		}

		//身長の最大値を表示
		System.out.println("身長の最大値は" + maxHeight + "です。");
		//体重の最大値を表示
		System.out.println("体重の最大値は" + maxWeight + "です。");
		//年齢の最大値を表示
		System.out.println("年齢の最大値は" + maxAge + "です。");
	}
}
