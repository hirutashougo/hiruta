package Chap05.Exercises;

//Scannerパッケージの読み込み
import java.util.Scanner;

/*
 * クラス名:Exercise05_03
 * 概要:理論値の変数にtrueやfalseを代入して、その値を表示する
 * 作成者:S.Hiruta
 * 作成日:2024/04/15
 */
public class Exercise05_03 {

	/*
	 * 関数名：main
	 * 概要:理論値の変数にtrueやfalseを代入して、その値を表示する
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/04/15
	*/
	public static void main(String[] args) {

		//Scannerのクラスの変数の定義
		Scanner standardInput = new Scanner(System.in);
		
		//理論型の変数にtrueを代入
		boolean firstJutgment = true;
		//理論型の変数にfalseを代入
		boolean secondJutgment = false;
		
		//理論型の変数の値を出力
		System.out.println(firstJutgment);
		//理論型の変数の値を出力
		System.out.print(secondJutgment);
	}
}