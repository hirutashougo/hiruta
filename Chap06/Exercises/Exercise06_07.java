package Chap06.Exercises;

//乱数生成パッケージの読み込み
import java.util.Random;
//Scannerの読み込み
import java.util.Scanner;

/*
 * クラス名:Exercise06_07
 * 概要:List06_09を変更。探索するキー値が複数存在する場合、末尾の要素を見つける
 * 作成者:S.Hiruta
 * 作成日:2024/04/17
 */
public class Exercise06_07 {

	/*
	 * 関数名：main
	 * 概要:List06_09を変更。探索するキー値が複数存在する場合、末尾の要素を見つける
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/04/17
	*/
	public static void main(String[] arg) {

		//Scannerクラスの変数の定義
		Scanner standardInput = new Scanner(System.in);
		//Randomクラスの変数の定義
		Random randomNumber = new Random();

		//乱数生成の範囲を定義する定数を定義
		final int RANDOM_CONSTANT = 10;
		//要素数の定数を定義
		final int ELEMENT_CONSTANT = 12;
		//定義した要素数を持つint型配列を宣言
		int[] numberArray = new int[ELEMENT_CONSTANT];

		//int型配列の各インデックスに乱数を代入していく
		for (int j = 0; j < ELEMENT_CONSTANT; j++) {
			//各インデックスに乱数を代入していく
			numberArray[j] = randomNumber.nextInt(RANDOM_CONSTANT);
		}

		//配列の要素数を表示すると示唆
		System.out.print("配列numberArrayの全要素の値\n{");
		//int型配列の各インデックスの値を表示する
		for (int j = 0; j < ELEMENT_CONSTANT; j++) {
			//見やすいように間隔をあける
			System.out.print(numberArray[j] + " ");
		}
		//括弧を閉じる
		System.out.println("}");
		
		//生成される乱数の上限を表す定数
		final int MUXIMUM_VUMBER = 9;
		//生成される乱数の下限を表す定数
		final int MINIMUM_VUMBER = 0;
		
		//線形探索の対象の入力を促す
		System.out.print("探す数値：");
		//入力された線形探索の対象値を読み込む
		int searchedNumber = standardInput.nextInt();
		//探索の対象値に生成された範囲の整数が入力されるまで繰り返す処理
		while (searchedNumber < MINIMUM_VUMBER || searchedNumber > MUXIMUM_VUMBER) {
			//生成乱数の範囲内で入力するように促す
			System.out.println("0～9の範囲内で入力してください。");
			//対象値の入力を促す
			System.out.print("探す数値:");
			//入力された対象値を読み込む
			searchedNumber = standardInput.nextInt();
		}

		//繰り返し処理の変数の初期値調整のための定数の定義
		final int ADJUSTMENT_CONSTANT = 1;
		//繰り返し処理を行うための変数を宣言
		int repeatVariable = 0;
		//対象を線形探索する
		for (repeatVariable = ELEMENT_CONSTANT - ADJUSTMENT_CONSTANT; repeatVariable >= 0; repeatVariable--) {
			//対象が見つかった場合
			if (numberArray[repeatVariable] == searchedNumber) {
				//探索処理を抜ける
				break;
			}
		}
		//探索対象が見つかった場合
		if (repeatVariable > 0) {
			//どの配列に対象が存在するか表示する
			System.out.println("それはnumberArray[" + repeatVariable + "]にあります。");
			//探索対象が見つからなかった場合
		} else {
			//探索対象が見つからなかったと表示
			System.out.println("それはありません。");
		}
	}
}