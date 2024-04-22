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
	 * 概要:int型の引値m(教科書準拠)が、3,4,5であれば「春」、6,7,8であれば「夏」
	        9,10,11であれば「秋」、12,1,2であれば「冬」と表示する
	 * 引数：整数(int型)
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/04/22
	*/
	static void printSeason(int m) {
		//引値m(教科書準拠)が3,4,5の場合
		if (m >= 3 && m <= 5) {
			//「春」と表示
			System.out.println("春");
		}
		//引値m(教科書準拠)が6,7,8の場合
		if (m >= 6 && m <= 8) {
			//「夏」と表示
			System.out.println("夏");
		}
		//引値m(教科書準拠)が9,10,11の場合
		if (m >= 9 && m <= 11) {
			//「秋」と表示
			System.out.println("秋");
		}
		//引値m(教科書準拠)が12,1,2の場合
		if (m == 12 || m == 1 || m == 2) {
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

		//季節を表示する
		//これから季節を表示すると伝える
		System.out.println("季節を表示します。");
		//月の入力を促す。
		System.out.print("月は：");
		//入力された月を読み込む
		int monthNumber = standardInput.nextInt();
		//月が1～12の範囲で入力されるようにする
		while (monthNumber <= 1 || monthNumber >= 12) {
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
