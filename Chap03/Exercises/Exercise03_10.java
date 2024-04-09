package Chap03.Exercises;

//Scannerの読み込み
import java.util.Scanner;

/*
 * クラス名:Exercise03_10
 * 概要:読み込んだ二つの整数の差を表示
 * 作成者:S.Hiruta
 * 作成日:2024/04/02
 */
public class Exercise03_10 {

	/*
	 *関数名:main
	 *概要:概要:読み込んだ二つの整数の差を表示
	 *引数:なし
	 *戻り値:なし
	 *作成者:S.Hiruta
	 *作成日:2024/04/02
	 */
	public static void main(String[] args) {

		//Scannerクラスの変数の定義
		Scanner standardInput = new Scanner(System.in);

		//1つめの整数の入力を促す
		System.out.print("1つめの整数:");

		//入力された1つめ整数を読み込む
		int firstNumber = standardInput.nextInt();

		//２つめの整数の入力を促す
		System.out.print("2つめの整数:");

		//入力された２つめの整数を読み込む
		int secondNumber = standardInput.nextInt();

		//整数の値の差を求めるため、2つの整数のうち大きい値から小さい値を引く処理
		int numberDifference = firstNumber >= secondNumber ? firstNumber - secondNumber : secondNumber - firstNumber;

		//２つの整数の値の差を表示
		System.out.println("二つの整数の差は" + numberDifference + "です。");
	}

}
