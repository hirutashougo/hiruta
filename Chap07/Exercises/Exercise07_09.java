package Chap07.Exercises;

//Scannerのインポート
import java.util.Scanner;

/*
* クラス名:Exercise07_09
* 概要:整数の値を入力し、それが正の整数なら表示される
* 作成者:S.Hiruta
* 作成日:2024/04/23
*/
public class Exercise07_09 {

	//入力読み込みの為のクラスの変数を定義
	static Scanner standardInput = new Scanner(System.in);

	/*
	 * 関数名：readPulsInt
	 * 概要：入力された整数の値を読み込み、正の整数であれば返却する。
	         0や負の整数が入力された場合、再入力させる。
	 * 引数：なし
	 * 戻り値：返却する整数(int型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/04/23
	*/
	static int readPulsInt() {
		//入力される整数を表す変数を宣言
		int integralNumber = 0;
		//正の整数が入力されるまで繰り返す処理
		do {
			//正の整数値の入力を促す
			System.out.print("正の整数：");
			//整数を読み込む
			integralNumber = standardInput.nextInt();
		//正の整数が入力されない限り処理は繰り返す
		} while (integralNumber <= 0);
		//入力された正の整数を返却する
		return integralNumber;
	}

	/*
	 * 関数名：main
	 * 概要：整数の値を入力し、それが正の整数なら表示される
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/04/23
	*/
	public static void main(String[] arg) {

		//関数readPulsIntを呼び出して正の整数が返却されているか確認する
		System.out.print("返却された値は" + readPulsInt() + "です。");
		
	}
}
