package Chap05.Exercises;

//Scannerパッケージの読み込み
import java.util.Scanner;

/*
 * クラス名:Exercise05_02
 * 概要:float型の変数とdouble型の変数に値を読み込んで表示する
 * 作成者:S.Hiruta
 * 作成日:2024/04/15
 */
public class Exercise05_02 {

	/*
	 * 関数名：main
	 * 概要:float型の変数とdouble型の変数に値を読み込んで表示する
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/04/15
	*/
	public static void main(String[] args) {

		//Scannerのクラスの変数の定義
		Scanner standardInput = new Scanner(System.in);
		
		//float型の変数の入力を促す(変数xは教科書準拠)
		System.out.print("x ： ");
		//float型の変数を読み込む
		float x = standardInput.nextFloat();

		//double型の変数の入力を促す(変数yは教科書準拠)
		System.out.print("y ： ");
		//double型の変数を読み込む
		double y = standardInput.nextDouble();
		
		//変数xを表示
		System.out.println("x = " + x);
		//変数yを表示
		System.out.print("y = " + y);
	}
}