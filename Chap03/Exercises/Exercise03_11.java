package Chap03.Exercises;

//Scannerの読み込み
import java.util.Scanner;

/*
 * クラス名:Exercise03_11
 * 概要:読み込んだ二つの整数の差が10以上か10以下か判定
 * 作成者:S.Hiruta
 * 作成日:2024/04/02
 */
public class Exercise03_11 {

	/*
	 *関数名:main
	 *概要:読み込んだ二つの整数の差が10以上か10以下か判定
	 *引数:なし
	 *戻り値:なし
	 *作成者:S.Hiruta
	 *作成日:2024/04/02
	 */
	public static void main(String[] args) {

		//Scannerクラスの変数の定義
		Scanner standardInput = new Scanner(System.in);

		//整数Aの入力を促す(変数Aは教科書準拠)
		System.out.print("整数A:");

		//入力された整数Aを読み込む
		int A = standardInput.nextInt();

		///整数Bの入力を促す(変数Bは教科書準拠)
		System.out.print("整数B:");

		//入力された整数Bを読み込む
		int B = standardInput.nextInt();

		//２つの条件による分岐
		//①整数AとBの値の差が10以下であるとき
		if (A - B <= 10 && A - B >= -10) {

			//整数AとBの値の差が10以下であると伝える
			System.out.println("それらの差は10以下です。");
		}

		//②整数AとBの値の差が11以上であるとき

		else {

			//整数AとBの値の差が10以上であると伝える
			System.out.println("それらの差は11以上です。");
		}

	}

}
