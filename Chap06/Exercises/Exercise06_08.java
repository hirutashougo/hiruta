package Chap06.Exercises;

//Scannerの読み込み
import java.util.Scanner;

/*
 * クラス名:Exercise06_08
 * 概要:double型配列の全要素の合計と平均を求める。
        (全要素数と代入する値はキーボードから入力)
 * 作成者:S.Hiruta
 * 作成日:2024/04/17
 */
public class Exercise06_08 {

	/*
	 * 関数名：main
	 * 概要:double型配列の全要素の合計と平均を求める。
	        (全要素数と代入する値はキーボードから入力)
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/04/17
	*/
	public static void main(String[] arg) {

		//Scannerクラスの変数の定義
		Scanner satndardInput = new Scanner(System.in);

		//要素数の入力を促す
		System.out.print("要素数:");
		//入力された要素数を読み込む
		int elementCount = satndardInput.nextInt();
		//要素数が正の整数で入力されるまで繰り返す処理
		while (elementCount <= 0) {
			//正の整数で入力するように促す
			System.out.println("正の整数で入力してください。");
			//要素数の入力を促す
			System.out.print("要素数:");
			//入力された要素数を読み込む
			elementCount = satndardInput.nextInt();
		}

		//定義した要素数を持つint型配列を宣言
		double[] scoreArray = new double[elementCount];

		//各要素に値を入力するように促す
		System.out.println("各要素の値を入力してください。");
		//各要素へ値を入力する
		for (int i = 0; i < elementCount; i++) {
			//要素への値の入力を促す
			System.out.print("a[" + i + "] = ");
			//入力された値を読み込む
			scoreArray[i] = satndardInput.nextDouble();
		}

		//全要素の合計を求めるためのdouble型の変数を定義
		double elementSum = 0;
		//拡張for文による走査を用いて、要素の値の加算処理を行う
		for (double i : scoreArray) {
			//要素の値を足していく
			elementSum += i;
		}
		//全要素の平均を求める
		double elementAverage = elementSum / elementCount;

		//全要素の合計を表示する
		System.out.println("全要素の合計は" + elementSum + "です。");
		//全要素の平均を表示する
		System.out.println("全要素の平均は" + elementAverage + "です。");
	}
}



