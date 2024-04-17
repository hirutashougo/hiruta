package Chap06.Lists;

//
import java.util.Random;
//
import java.util.Scanner;

/*
 * クラス名:List06_09
 * 概要:線形探索
 * 作成者:S.Hiruta
 * 作成日:2024/04/17
 */
public class List06_09 {

	/*
	 * 関数名：main
	 * 概要:線形探索 
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/04/17
	*/
	public static void main(String[] arg) {
		//Scannerクラスの変数の定義
		Scanner satndardInput = new Scanner(System.in);
		//Randomクラスの変数の定義
		Random randomNumber = new Random();
		
		//乱数生成の範囲を定義する定数を定義
		final int RANDOM_CONSTANT = 10;
		//要素数の定数を定義
		final int ELEMENT_CONSTANT = 12;
		//定義した要素数を持つint型配列を宣言
		int[] a = new int[ELEMENT_CONSTANT];
		
		//int型配列の各インデックスに乱数を代入していく
		for (int j = 0; j < ELEMENT_CONSTANT; j++) {
			//各インデックスに乱数を代入していく
			a[j] = randomNumber.nextInt(RANDOM_CONSTANT);
		}
		
		//配列の要素数を表示すると示唆
		System.out.print("配列aの全要素の値\n{");
		//int型配列の各インデックスの値を表示する
		for (int j = 0; j < ELEMENT_CONSTANT; j++) {
			//見やすいように間隔をあける
			System.out.println(a[j] + " ");
		}
		//括弧を閉じる
		System.out.println("}");
		//線形探索の対象の入力を促す
		System.out.print("探す数値：");
		//入力された線形探索の対象値を読み込む
		int key = satndardInput.nextInt();
		
		//繰り返し処理を行うための変数を宣言
		int i = 0;
		//対象を線形探索する
		for (i = 0; i < ELEMENT_CONSTANT; i++) {
			//対象が見つかった場合
			if (a[i] == key) {
				//探索処理を抜ける
				break;
			}
		}
		//探索対象が見つかった場合
		if (i < ELEMENT_CONSTANT) {
			//どの配列に対象が存在するか表示する
			System.out.println("それはa[" + i + "]にあります。");
		//探索対象が見つからなかった場合
		} else {
			//探索対象が見つからなかったと表示
			System.out.println("それはありません。");
		}
	}
}
















