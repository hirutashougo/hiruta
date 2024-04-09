package Chap04.Exercises;

import java.util.Scanner;

/*
 * クラス名:Exercise04_07
 * 概要：*と+を交互に表示する
 * 作成者:S.Hiruta
 * 作成日:2024/04/08
 */
public class Exercise04_07 {

	/*
	 * 関数名：main
	 * 概要：*と+を交互に表示する
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：hiruta
	 * 作成日：2024/04/08
	*/
	public static void main(String[] args) {

		//Scannerクラスの変数の定義
		Scanner standardInput = new Scanner(System.in);

		//記号を表示する個数を表わす定数の定義
		int countNumber = 0;

		do {
			//「*」の個数値の入力を促す
			System.out.print("*や+を何個を表示しますか : ");
			
			//入力された個数値を読み込む
			countNumber = standardInput.nextInt();
			
			//入力された値が0以下の場合
			if (countNumber <= 0) {
			//正の整数の入力を促す
			System.out.println("正の整数を入力してください ");
			}
			
			//入力された値が0以下である場合、処理を繰り返す
		} while (countNumber <= 0);

		/*インクリメントの為の変数(以下:インクリメント変数)
		 を初期状態1で宣言*/
		int incrementVariable = 0;

		/*偶数・奇数の判断に用いる定数の定義。
		 入力された値を割る数*/
		final int judgementCount = 2;
		/*偶数・奇数の判断に用いる定数の定義。
		 入力された値の余りを表す数*/
		final int remainderNumber = 1;

		//インクリメント変数が偶数か奇数かで表示する記号を変える
		//do文の開始
		do {
			//インクリメント変数が偶数の場合
			if (incrementVariable % judgementCount == 0) {
				//「*」を表示
				System.out.print('*');
				//インクリメント変数を後置増分演算子で増加
				incrementVariable++;
			}

			//インクリメント変数が奇数の場合
			else if (incrementVariable % judgementCount == remainderNumber) {
				//「+」を表示
				System.out.print('+');
				//インクリメント変数を後置増分演算子で増加
				incrementVariable++;
			}

			//インクリメント変数が入力された個数値を上回るまで繰り返される	
		} while (incrementVariable < countNumber);

		//改行文字を出力
		System.out.println();
	}

}