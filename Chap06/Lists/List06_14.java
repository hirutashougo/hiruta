package Chap06.Lists;

//乱数生成パッケージの読み込み
import java.util.Random;
//Scannerの読み込み
import java.util.Scanner;

/*
 * クラス名:List06_14
 * 概要:月を表わす英単語の学習プログラム
 * 作成者:S.Hiruta
 * 作成日:2024/04/18
 */
public class List06_14 {

	/*
	 * 関数名：main
	 * 概要:月を表わす英単語の学習プログラム
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/04/18
	*/
	public static void main(String[] arg) {
		//Scannerクラスの変数の定義
		Random randomNumber = new Random();
		//Randomクラスの変数の定義
		Scanner standardInput = new Scanner(System.in);
		
		String[] monthString = {
				"January", "February", "March", "April", "May", "June", "July",
				"August", "September", "Octorber", "November", "December" 
		};
		
		int month = randomNumber.nextInt(12);
		System.out.println("問題は" + monthString[month]);
		
		while (true) {
			System.out.print("何月かな：");
			int m = standardInput.nextInt();
			
			if (m == month + 1) break;
			System.out.println("違います。");
		}
		System.out.println("正解です。");
	}
}
