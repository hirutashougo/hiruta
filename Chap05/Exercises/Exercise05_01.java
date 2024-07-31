package Chap05.Exercises;

//Scannerパッケージの読み込み
import java.util.Scanner;

/*
 * クラス名:Exercise05_01
 * 概要:10進数を読み込み、その値を8進数と16進数で表示する
 * 作成者:S.Hiruta
 * 作成日:2024/04/15
 */
public class Exercise05_01 {

	/*
	 * 関数名：main
	 * 概要:10進数を読み込み、その値を8進数と16進数で表示する
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/04/15
	*/
	public static void main(String[] args) {

		//Scannerのクラスの変数の定義
		Scanner standardInput = new Scanner(System.in);

		//整数の入力を促す
		System.out.print("整数:");
		//入力された10進数を読み込む
		int desimalNumber = standardInput.nextInt();

		//8進数であると表示
		System.out.print("８進数で表わすと");
		//入力値を8進数で表示
		System.out.printf("%o", desimalNumber);
		//「です。」と表示
		System.out.print("です。\n");
		//16進数であると表示
		System.out.print("16進数で表わすと");
		//入力値を16進数で表示
		System.out.printf("%x", desimalNumber);
		//「です。」と表示
		System.out.print("です。");
	}
}