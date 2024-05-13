package Chap09.Lists;

//Scannerのインポート
import java.util.Scanner;

/*
* クラス名:DayArrayError(List09_07, List09_08)
* 概要:クラスDay型インスタンスの配列を作成、表示する
* 作成者:S.Hiruta
* 作成日:2024/05/13
*/
public class DayArrayError {

	/*
	 * 関数名：main
	 * 概要:クラスDay型インスタンスの配列を作成、表示する
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/13
	*/
	public static void main(String[] args) {

		//Scannerクラスの変数の定義
		Scanner standardInput = new Scanner(System.in);

		//一週間の曜日の表記を格納する配列を定義
		String[] weekDays = { "日", "月", "火", "水", "木", "金", "土", };

		//表示する日付の数の入力を促す
		System.out.print("日付は何個：");
		//入力されは日付の個数を読み込む
		int dayCount = standardInput.nextInt();
		
		//表示する日付の個数分の要素数を持つクラスDay型の配列を宣言
		Day1[] firstDay = new Day1[dayCount];
		
//		//日付を格納している配列の各要素に日付を与えていく(エラーが出る)
//		for (int i = 0; i < firstDay.length; i++) {
//			//要素に日付を与える
//			firstDay[i].setData(2017, 10, 15);
//		}
		//日付を格納している配列の各要素に日付のインスタンスを与えていく
		for (int i = 0; i < firstDay.length; i++) {
			//要素に日付のインスタンスを与える
			firstDay[i] = new Day1(2017, 10, 15);
		}
		//日付を格納している配列を表示していく
		for (int i = 0; i < firstDay.length; i++) {
			//各要素の日付を表示する
			System.out.println("a[" + i + "] = " + firstDay[i].getYear() + "年" + firstDay[i].getMonth() + "月" + firstDay[i].getDate() + "日(" + weekDays[firstDay[i].deriveDayOfWeek()] + ")");
		}
	}
}
