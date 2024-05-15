package Chap09.Lists.Day;

/*
* クラス名:Day(List09_01)
* 概要:日付に関する情報を管理する
* 作成者:S.Hiruta
* 作成日:2024/05/10
*/
public class Day1 {

	//年を表わすフィールドを宣言
	private int yearData;
	//月を表わすフィールドを宣言
	private int monthData;
	//日を表わすフィールドを宣言
	private int dateData;

	/*
	 * コンストラクタ名：Day
	 * 概要:日付に関する情報のインスタンスの、各クラス型変数を初期化して
	 * 引数：年,月,日
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/10
	*/
	Day1(int yearData, int monthData, int dateData) {
		//年の情報のクラス型変数を初期化
		this.yearData = yearData;
		//月の情報のクラス型変数を初期化
		this.monthData = monthData;
		//日の情報のクラス型変数を初期化
		this.dateData = dateData;
	}

	/*
	 * ゲッタ名：getYear
	 * 概要:年に関するフィールドの値を取得
	 * 引数：なし
	 * 戻り値：年に関する情報
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/10
	*/
	int getYear() {
		//年に関する情報を返却
		return yearData;
	}

	/*
	 * ゲッタ名：getMonth
	 * 概要:月に関するフィールドの値を取得
	 * 引数：なし
	 * 戻り値：月に関する情報
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/10
	*/
	int getMonth() {
		//月に関する情報を返却
		return monthData;
	}

	/*
	 * ゲッタ名：getDate
	 * 概要:日に関するフィールドの値を取得
	 * 引数：なし
	 * 戻り値：日に関する情報
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/10
	*/
	int getDate() {
		//月に関する情報を返却
		return dateData;
	}

	/*
	 * セッタ名：setYear
	 * 概要:年に関するフィールドの値を設定
	 * 引数：年に関するフィールド
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/10
	*/
	void setYear(int yearData) {
		//年の情報のクラス型変数を初期化
		this.yearData = yearData;
	}

	/*
	 * セッタ名：setMonth
	 * 概要:月に関するフィールドの値を設定
	 * 引数：月に関するフィールド
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/10
	*/
	void setMonth(int monthData) {
		//月の情報のクラス型変数を初期化
		this.monthData = monthData;
	}

	/*
	 * セッタ名：setDate
	 * 概要:日に関するフィールドの値を設定
	 * 引数：日に関するフィールド
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/10
	*/
	void setDate(int dateData) {
		//日の情報のクラス型変数を初期化
		this.dateData = dateData;
	}

	/*
	 * 関数名：setDate
	 * 概要:日付に関するオブジェクトの全てのフィールドに値を設定する
	 * 引数：なし
	 * 戻り値：日に関する情報
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/10
	*/
	void setData(int yearData, int monthData, int dateData) {
		//年の情報のクラス型変数を初期化
		this.yearData = yearData;
		//月の情報のクラス型変数を初期化
		this.monthData = monthData;
		//日の情報のクラス型変数を初期化
		this.dateData = dateData;
	}

	/*
	 * 関数名：deriveDayOfWeek
	 * 概要:日付の曜日を求める
	 * 引数：なし
	 * 戻り値：日付の曜日を表わす数字(0～6：日～土)
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/10
	*/
	int deriveDayOfWeek() {
		//曜日を表す数字を格納する変数(返却値)を宣言
		int dayOfweek = 0;

		//ツェラーの公式で用いる定数その1を宣言
		final int FIRST_ZELLER_CONSTANT = 4;
		//ツェラーの公式で用いる定数その2を宣言
		final int SECONT_ZELLER_CONSTANT = 100;
		//ツェラーの公式で用いる定数その3を宣言
		final int THIRD_ZELLER_CONSTANT = 400;
		//ツェラーの公式で用いる定数その4を宣言
		final int FORTH_ZELLER_CONSTANT = 13;
		//ツェラーの公式で用いる定数その5を宣言
		final int FIFTH_ZELLER_CONSTANT = 8;
		//ツェラーの公式で用いる定数その6を宣言
		final int SIXTH_ZELLER_CONSTANT = 5;
		//ツェラーの公式で用いる定数その7を宣言
		final int SEVENTH_ZELLER_CONSTANT = 7;

		//1月を表す定数
		final int JANUARY_CONSTANT = 1;
		//2月を表す定数
		final int FEBRUARY_CONSTANT = 2;
		//12月を表す定数
		final int DECEMBER_CONSTANT = 12;

		//年の情報を計算用の変数に格納
		int targetYear = yearData;
		//月の情報を計算用の変数に格納
		int targetMonth = monthData;
		//月が1月か2月である場合、公式に合わせて年と月の変数を調整する
		if (targetMonth == JANUARY_CONSTANT || targetMonth == FEBRUARY_CONSTANT) {
			//年の値を1下げる
			targetYear--;
			//月の値を12上げる
			targetMonth += DECEMBER_CONSTANT;
		}

		//ツェラーの公式を用いて算出した、曜日を表す数字を返却値に格納
		dayOfweek = (targetYear + (targetYear / FIRST_ZELLER_CONSTANT) - (targetYear / SECONT_ZELLER_CONSTANT)
				+ (targetYear / THIRD_ZELLER_CONSTANT)
				+ ((FORTH_ZELLER_CONSTANT * targetMonth + FIFTH_ZELLER_CONSTANT) / SIXTH_ZELLER_CONSTANT) + dateData)
				% SEVENTH_ZELLER_CONSTANT;

		//算出された曜日を表す数字を返却
		return dayOfweek;
	}
}
