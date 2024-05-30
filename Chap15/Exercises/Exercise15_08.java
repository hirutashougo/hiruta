package Chap15.Exercises;

//
import day.Day;

/*
* クラス名:Exercise15_06
* 概要：コマンドライン引数で与えられた(年の)月のカレンダーを表示する
* 作成者:S.Hiruta
* 作成日:2024/05/30
*/
public class Exercise15_08 {

	/*
	 * 関数名：main
	 * 概要:コマンドライン引数で与えられた(年の)月のカレンダーを表示する
	 * 引数：年月(String[]型)
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/30
	*/
	public static void main(String[] args) {
		//年数を表すコマンドライン引数を受け取るインデックス数を定数化
		final int YEAR_INDEX = 0;
		//月数を表すコマンドライン引数を受け取るインデックス数を定数化
		final int MONTH_INDEX = 1;
		//カレンダーを表示するための因数の数を定数化
		final int FACTOR_COUNT = 2;

		//
		int[] calenderFaactor = new int[FACTOR_COUNT];
		//カレンダー表示のための年数を変数に格納
		calenderFaactor[YEAR_INDEX] = Integer.parseInt(args[YEAR_INDEX]);
		//カレンダー表示のための月数を変数に格納
		calenderFaactor[MONTH_INDEX] = Integer.parseInt(args[MONTH_INDEX]);
		
		//与えられた年月を持つインスタンスを生成
		Day particularDay = new Day(calenderFaactor[YEAR_INDEX], calenderFaactor[MONTH_INDEX]);
		
		//
		particularDay.printCalender();
	}

}
