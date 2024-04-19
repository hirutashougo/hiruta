package Chap07.Lists;

//Scannerの読み込み
import java.util.Scanner;

/*
* クラス名:List07_02
* 概要:3人の身長・体重・年齢の最大値を求めて表示(メソッド版)
* 作成者:S.Hiruta
* 作成日:2024/04/19
*/
public class List07_02 {
	
	//---a, b, cの最大値を返却---//
	static int max (int a, int b, int c) {
		int max = a;
		if (b > max) max = b;
		if (c > max) max = c;
		return max;
	}

	/*
	 * 関数名：main
	 * 概要:3人の身長・体重・年齢の最大値を求めて表示(メソッド版)
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/04/18
	*/
	public static void main(String[] arg) {
		//Randomクラスの変数の定義
		Scanner standardInput = new Scanner(System.in);

		//身長の配列の宣言
		int[] weightnumber = new int[3];
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
			weightnumber[i] = standardInput.nextInt();
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
		int maxHeight = max(weightnumber[0], weightnumber[1], weightnumber[2]);

		//体重の最大値を求める
		//初めに1人目が最大体重であると過程
		int maxWeight = max(weightnumber[0], weightnumber[1], weightnumber[2]);

		//年齢の最大値を求める
		//初めに1人目が最大年齢であると過程
		int maxAge = max(ageNumber[0], ageNumber[1], ageNumber[2]);

		//身長の最大値を表示
		System.out.println("身長の最大値は" + maxHeight + "です。");
		//体重の最大値を表示
		System.out.println("体重の最大値は" + maxWeight + "です。");
		//年齢の最大値を表示
		System.out.println("年齢の最大値は" + maxAge + "です。");
	}
}
