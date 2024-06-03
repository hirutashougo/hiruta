package Chap15.Exercises;

//dayパッケージのDayクラスをインポート
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
	 * 概要:コマンドライン引数で与えられた情報に基づいて、カレンダーを表示する
	 * 引数：カレンダーの情報(String[]型)
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/30
	*/
	public static void main(String[] args) {
		//年数を表すコマンドライン引数のインデックス数を定数化
		final int YEAR_INDEX = 0;
		//月数を表すコマンドライン引数のインデックス数を定数化
		final int MONTH_INDEX = 1;
		//年数のみのコマンドライン引数の数を定数化
		final int YEAR_FACTOR_ONLY = 1;
		//カレンダー表示に必要なコマンドライン引数の数を定数化
		final int CALENDER_FACTOR_NUMBER = 2;
		//月数の最初の数字を定数化
		final int FIRST_MONTH_NUMBER = 1;
		//月数の最後の数字を定数化
		final int FINAL_MONTH_NUMBER = 12;

		//コマンドライン引数がない場合
		if (args.length == 0) {
			//与えられた年月を持つインスタンスを生成
			Day particularDay = new Day();
			//実行日の月のカレンダーを表示
			particularDay.printCalender();
			
			//年数のみ、コマンドライン引数として与えらている場合
		} else if (args.length == YEAR_FACTOR_ONLY) {
			//その年のすべてのカレンダーを表示
			for (int i = FIRST_MONTH_NUMBER; i <= FINAL_MONTH_NUMBER; i++) {
				//指定年数における、各月のインスタンスを生成
				Day particularDay = new Day(Integer.parseInt(args[YEAR_INDEX]), i);
				//各月のカレンダーを生成
				particularDay.printCalender();
			}
			
			//年月が、コマンドライン引数として与えらている場合
		} else if (args.length == CALENDER_FACTOR_NUMBER) {
			//カレンダー表示のための年数を変数に格納
			int calenderYear = Integer.parseInt(args[YEAR_INDEX]);
			//カレンダー表示のための月数を変数に格納
			int calenderMonth  = Integer.parseInt(args[MONTH_INDEX]);

			//与えられた年月を持つインスタンスを生成
			Day particularDay = new Day(calenderYear, calenderMonth);

			//指定年月のカレンダーを表示
			particularDay.printCalender();
		}
	}

}
