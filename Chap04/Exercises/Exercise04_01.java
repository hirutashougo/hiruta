package Chap04.Exercises;

//スキャナーのインポート
import java.util.Scanner;

/*
 * クラス名:Exercise04_01
 * 概要：整数値の符号の判断
 * 作成者:S.Hiruta
 * 作成日:2024/04/08
 */
public class Exercise04_01 {

	/*
	・関数名：main
	・概要：整数値の符号の判断
	・引数：なし
	・戻り値：なし
	・作成者：hiruta
	・作成日：2024/04/08
	*/

	public static void main(String[] arg) {

		//入力ストリームの指定
		Scanner standardInput = new Scanner(System.in);

		//もう一度処理を行う為の変数を定義
		int retrySelection = 0;

		//ループに用いる変数を定義
		final int selectionNumber = 1;

		//ループに用いる変数を定義
		final int cancellationNumber = 0;

		//入力された整数の符号を求める処理のループ
		do {

			//整数値の入力を求める
			System.out.print("符号を求めます。\n整数を入力してください。：");
			//入力された整数値の読み込み
			int integralNumber = standardInput.nextInt();

			//入力された整数値が0より大きい場合
			if (integralNumber > 0)
				//正であることを伝える
				System.out.println("正です。");
			//入力された整数値が0より小さい場合
			else if (integralNumber < 0)
				//負であることを伝える
				System.out.println("負です。");
			//入力された整数が0の場合
			else
				//符号はないことを伝える
				System.out.println("符号はありません。");
			
			//再度処理を行うか確認
			do {
			//1か0の入力を求める
			System.out.println("もう一度？　1…Yes/0…No：");
			//入力された1か0を読み込む
			retrySelection = standardInput.nextInt();
			//1と0以外の整数が確認された場合
			if (retrySelection != selectionNumber && retrySelection != cancellationNumber) {
				//0か1を入力するように促す
				System.out.println("0か1を入力してください");
			}
			//1か0を選択しない限り、処理は繰り返される
			} while (retrySelection != selectionNumber && retrySelection != cancellationNumber);
			
			//1であればもう一度ループする
		} while (retrySelection == selectionNumber);
		
		//終了する旨を伝える
		System.out.println("終わります。");
	}

}