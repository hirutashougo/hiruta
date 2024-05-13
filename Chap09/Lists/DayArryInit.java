package Chap09.Lists;

//Scannerのインポート
import java.util.Scanner;

/*
* クラス名:DayArryInit(List09_09)
* 概要:日付クラスDayの配列(その3：初期化)
* 作成者:S.Hiruta
* 作成日:2024/05/13
*/
public class DayArryInit {

	/*
	 * 関数名：main
	 * 概要:2つの日付を入力させ、等しいか比較する
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

		//
		Day1[] paticularDay = { new Day1(1868, 9, 8),
				new Day1(1912, 7, 30),
				new Day1(1926, 12, 25),
				new Day1(1989, 1, 8)
		};
		
		//
		for (int i = 0; i < paticularDay.length; i++) {
			//
			System.out.println("x[" + i + "] = "
					+ paticularDay[i].getYear()+ "年"
					+ paticularDay[i].getMonth()+ "月"
					+ paticularDay[i].getDate()+ "日("
					+ weekDays[paticularDay[i].deriveDayOfWeek()] + ")");
		}
	}

}
