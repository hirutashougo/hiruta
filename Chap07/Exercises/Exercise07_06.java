package Chap07.Exercises;

//Scannerのインポート
import java.util.Scanner;

/*
* クラス名:Exercise07_06
* 概要:入力された月の季節を表示する
* 作成者:S.Hiruta
* 作成日:2024/04/22
*/
public class Exercise07_06 {

	/*
	 * 関数名：printSeason
	 * 概要:int型の引数m(教科書準拠)が、3,4,5であれば「春」、6,7,8であれば「夏」
	        9,10,11であれば「秋」、12,1,2であれば「冬」と表示する
	 * 引数：月を表わす数値(int型)
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/04/22
	*/
	static void printSeason(int m) {

		//1月を表わす定数を定義
		final int januaryNumber = 1;
		//2月を表わす定数を定義
		final int februaryNumber = 2;
		//3月を表わす定数を定義
		final int marchNumber = 3;
		//5月を表わす定数を定義
		final int mayNumber = 5;
		//6月を表わす定数を定義
		final int juneNumber = 6;
		//8月を表わす定数を定義
		final int augustNumber = 8;
		//9月を表わす定数を定義
		final int septemberNumber = 9;
		//11月を表わす定数を定義
		final int nobemberNumber = 11;
		//12月を表わす定数を定義
		final int decemberNumber = 12;

		//引数m(教科書準拠)が3,4,5の場合
		if (m >= marchNumber && m <= mayNumber) {
			//「春」と表示
			System.out.println("春");
		}
		//引数m(教科書準拠)が6,7,8の場合
		if (m >= juneNumber && m <= augustNumber) {
			//「夏」と表示
			System.out.println("夏");
		}
		//引数m(教科書準拠)が9,10,11の場合
		if (m >= septemberNumber && m <= nobemberNumber) {
			//「秋」と表示
			System.out.println("秋");
		}
		//引数m(教科書準拠)が12,1,2の場合
		if (m == decemberNumber || m == januaryNumber || m == februaryNumber) {
			//「冬」と表示
			System.out.println("冬");
		}
	}

	/*
	 * 関数名：main
	 * 概要:入力された月の季節を表示する
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/04/22
	*/
	public static void main(String[] arg) {

		//Scannerクラスの変数の定義
		Scanner standardInput = new Scanner(System.in);

		//1月を表わす定数を定義
		final int januaryNumber = 1;
		//12月を表わす定数を定義
		final int decemberNumber = 12;

		//季節を表示する
		//これから季節を表示すると伝える
		System.out.println("季節を表示します。");
		//月の入力を促す。
		System.out.print("月は：");
		//入力された月を読み込む
		int monthNumber = standardInput.nextInt();
		//月が1～12の範囲で入力されるようにする
		while (monthNumber < januaryNumber || monthNumber > decemberNumber) {
			//月を1～12の範囲で入力するように促す
			System.out.println("1～12の範囲で入力してください。");
			//改めて、月の入力を促す。
			System.out.print("月は：");
			//入力された月を読み込む
			monthNumber = standardInput.nextInt();
		}
		//入力された月の季節を表示する
		printSeason(monthNumber);
	}

}
