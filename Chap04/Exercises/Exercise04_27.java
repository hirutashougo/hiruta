package Chap04.Exercises;

//乱数生成パッケージの読み込み
import java.util.Random;
//Scannerパッケージの読み込み
import java.util.Scanner;

/*
 * クラス名:Exercise04_27
 * 概要:List04_3を変更。数値の入力回数に制限を付ける。
 * 作成者:S.Hiruta
 * 作成日:2024/04/12
 */
public class Exercise04_27 {

	/*
	 * 関数名：main
	 * 概要:制限回数内に0～99の数を当てるゲーム
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/04/12
	*/
	public static void main(String[] args) {

		//Scannerのクラスの変数の定義
		Scanner standardInput = new Scanner(System.in);
		//Scannerのクラスの変数の定義
		Random randomNumber = new Random();
		
		//生成する乱数の幅を定義する定数の宣言
		final int RANDOM_RANGE = 100;
		//0～99の間で乱数を生成
		int correctNumber = randomNumber.nextInt(RANDOM_RANGE);

		//ゲームへ誘導する表示
		System.out.println("数当てゲーム開始！！");
		//ゲームの入力回数の指定を求める表示
		System.out.print("入力する回数を決めてください。\n入力回数:");
		//入力回数の読み込み
		int inputTimes = standardInput.nextInt();
		//回数に正の整数が入力されるまで繰り返す処理
		while (inputTimes <= 0) {
			//正の整数で入力するように促す
			System.out.print("正の整数で入力してください。\n入力回数：");
			//入力された個数を読み込む
			inputTimes = standardInput.nextInt();
		}

		//ゲームルールの説明
		System.out.println("0～99の数を当ててください。");

		//生成される乱数の上限の数を低数値して定義
		final int MAXIMUM_NUMBER = 99;
		//生成される乱数の下限の数を低数値して定義
		final int MINIMUM_NUMBER = 0;
		//入力される整数の変数を定義
		int integralNumber = 0;

		NumberGame: for (int j = 1; j <= inputTimes; j++) {
			//いくつか尋ねる表示
			System.out.print("いくつかな：");
			//入力された数を読み込む
			integralNumber = standardInput.nextInt();
			//0～99の整数が入力されるまで繰り返される処理
			while (integralNumber < MINIMUM_NUMBER || integralNumber > MAXIMUM_NUMBER) {
				//0～99の整数で入力されるように促す
				System.out.println("0～99の整数で入力してください。\nいくつかな:");
				//入力された整数を読み込む
				integralNumber = standardInput.nextInt();
			}
			//正解よりも小さい
			if (integralNumber > correctNumber && j < inputTimes) {
				//もっと小さいよと表示
				System.out.println("もっと小さいよ：");
			}
			//正解よりも大きい
			else if (integralNumber < correctNumber && j < inputTimes) {
				//もっと大きいよと表示
				System.out.println("もっと大きいよ：");
			}
			//正解を入力した場合
			else if (integralNumber == correctNumber) {
				//正解であることを伝える
				System.out.println("正解です。");
				//ゲームの繰り返しから抜ける
				break NumberGame;
			}
			//正解を入力できないまま、入力上限回数に達した場合
			else if (integralNumber != correctNumber && j == inputTimes) {
				//入力上限回数であることを伝えて、正解も表示する
				System.out.println("入力上限回数です。\n正解は" + correctNumber + "です。");
			}
		}
		//ゲームを終了すると表示
		System.out.println("ゲームを終了します。");
	}
}