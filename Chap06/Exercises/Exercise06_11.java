package Chap06.Exercises;

//乱数生成パッケージの読み込み
import java.util.Random;
//Scannerの読み込み
import java.util.Scanner;

/*
 * クラス名:Exercise06_11
 * 概要:List06_09を変更。要素が同じ値を持つことのないように改良。
 * 作成者:S.Hiruta
 * 作成日:2024/04/17
 */
public class Exercise06_11 {

	/*
	 * 関数名：main
	 * 概要:List06_09を変更。要素が同じ値を持つことのないように改良。
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/04/17
	*/
	public static void main(String[] arg) {
		//Scannerクラスの変数の定義
		Random randomNumber = new Random();
		//Randomクラスの変数の定義
		Scanner standardInput = new Scanner(System.in);

		//乱数の範囲を表す定数を定義
		final int RANDOM_RANGE = 10;

		//要素数の入力を促す
		System.out.print("要素数：");
		//入力された要素数を読み込む
		int elementCount = standardInput.nextInt();
		//要素数が0～乱数上限値で入力されるまで繰り返す処理
		while (elementCount <= 0 || elementCount > RANDOM_RANGE) {
			//0～乱数上限値で入力するように促す
			System.out.println("1～10で入力してください");
			//要素数の入力を促す
			System.out.print("要素数：");
			//入力された要素数を読み込む
			elementCount = standardInput.nextInt();
		}

		//入力された要素数を持つ配列を宣言
		int[] numberArray = new int[elementCount];
		//配列の各要素に乱数を代入していく
		for (int j = 0; j < elementCount; j++) {
			//各要素に乱数を代入していく
			numberArray[j] = randomNumber.nextInt(RANDOM_RANGE);
			//2回目以降の処理の場合
			if (j > 0) {
				//1つ前の要素と違う数値が代入されるまで繰り返す処理
				while (numberArray[j] == numberArray[j - 1]) {
					//要素に乱数を代入する
					numberArray[j] = randomNumber.nextInt(RANDOM_RANGE);
				}
			}
		}

		//配列の要素数を表示すると示唆(配列aの表示は教科書準拠)
		System.out.print("配列aの全要素の値\n{ ");
		//int型配列の各インデックスの値を表示する
		for (int j = 0; j < elementCount; j++) {
			//見やすいように間隔をあける
			System.out.print(numberArray[j] + " ");
		}
		//括弧を閉じる
		System.out.println("}");
		//線形探索の対象の入力を促す
		System.out.print("探す数値：");
		//入力された線形探索の対象値を読み込む
		int searchNumber = standardInput.nextInt();

		//繰り返し処理を行うための変数を宣言
		int i = 0;
		//対象を線形探索する
		for (i = 0; i < elementCount; i++) {
			//対象が見つかった場合
			if (numberArray[i] == searchNumber) {
				//探索処理を抜ける
				break;
			}
		}

		//探索対象が見つかった場合
		if (i < elementCount) {
			//どの配列に対象が存在するか表示する
			System.out.println("それはa[" + i + "]にあります。");
			//探索対象が見つからなかった場合
		} else {
			//探索対象が見つからなかったと表示
			System.out.println("それはありません。");
		}
	}
}
