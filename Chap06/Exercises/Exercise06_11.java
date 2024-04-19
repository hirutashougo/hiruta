package Chap06.Exercises;

//乱数生成パッケージの読み込み
import java.util.Random;
//Scannerの読み込み
import java.util.Scanner;

/*
 * クラス名:Exercise06_11
 * 概要:演習06_09を変更。要素が同じ値を持つことのないように改良。
 * 作成者:S.Hiruta
 * 作成日:2024/04/18
 */
public class Exercise06_11 {

	/*
	 * 関数名：main
	 * 概要:演習06_09を変更。要素が同じ値を持つことのないように改良。
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/04/18
	*/
	public static void main(String[] arg) {
		//Scannerクラスの変数の定義
		Random randomNumber = new Random();
		//Randomクラスの変数の定義
		Scanner standardInput = new Scanner(System.in);

		//要素数の入力を促す
		System.out.print("要素数：");
		//入力された要素数を読み込む
		int elementCount = standardInput.nextInt();
		//要素数が1～10の範囲で入力されるまで繰り返す処理
		while (elementCount < 1 || elementCount > 10) {
			//1～10の範囲で入力するように促す
			System.out.println("1～10の範囲で入力してください。");
			//要素数の入力を促す
			System.out.print("要素数：");
			//入力された要素数を読み込む
			elementCount = standardInput.nextInt();
		}
		
		//入力された要素数を持つ配列を宣言
		int[] numberArray = new int[elementCount];

		//生成する乱数の範囲を表す定数の定義
		final int RANDOM_RANGE = 10;
		//生成する乱数の範囲を調節する定数の定義
		final int ADJUSTMENT_NUMBER = 1;
		//乱数を一時的に代入しておく変数の定義
		int assigmentVariable = 0;
		//処理の実行回数を後追いで記録する変数の定義
		int executionCount = 0;

		//配列の各要素に乱数を代入していく
		for (int i = 0; i < elementCount; i++) {
			//初回の乱数代入の場合
			if (i == 0) {
				//1～10の範囲に調整して乱数を生成し、各要素に代入
				numberArray[i] =  ADJUSTMENT_NUMBER + randomNumber.nextInt(elementCount);
				//処理回数が2回目以降の場合
			} else {
				//処理通過を判断するboolean型の変数を定義
				boolean judgementCount  = false;
				//要素に1つ前の要素と違う値が入るまで繰り返す処理
				do {
					//生成した乱数を一時的に代入用変数に格納
					assigmentVariable = ADJUSTMENT_NUMBER + randomNumber.nextInt(elementCount);
					//前段階までの配列の要素と、今回生成した乱数が被っていないか判断する処理
					for (executionCount = 0; executionCount < i; executionCount++) {
						//前段階までの配列の中に今回生成した乱数が存在する場合
						if (numberArray[executionCount] == assigmentVariable) {
							//この繰り返し処理を抜ける
							break;
						} 
					}
					//前段階までの配列の要素の中に、今回生成した乱数が無い場合
					if (executionCount == i) {
						//要素に1つ前の要素と違う値が入るまで繰り返す処理を抜ける
						judgementCount = true;
					}
				//処理通過の判断変数がtrueを示さない限り処理を繰り返す
				} while (judgementCount == false);
				//配列の要素に、代入用変数に格納しておいた値を代入
				numberArray[i] = assigmentVariable;
			}
		}
		
		//要素の値の表示の際、インデックスの数値の調整に用いる定数の定義
		final int ADJUSTMENT_COUNT = 1;
		
		//配列の要素数を表示すると示唆(配列aの表示は教科書準拠)
		System.out.print("配列aの全要素の値\n{ ");
		//int型配列の各インデックスの値を表示する
		for (int j = 0; j < elementCount; j++) {
			//最後の要素でない場合
			if (j < elementCount - ADJUSTMENT_COUNT) {
			//見やすいように間隔をあけ、カンマを付ける
			System.out.print(numberArray[j] + ", ");
			//最後の要素の場合
			} else {
				//何も付属せずに要素の値のみを表示
				System.out.print(numberArray[j]);
			}
		}
		//括弧を閉じる
		System.out.println("}");
	}
}