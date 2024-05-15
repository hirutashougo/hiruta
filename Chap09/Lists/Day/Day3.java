package Chap09.Lists.Day;

/*
* クラス名:Day3(List09_12)
* 概要:日付に関する情報を管理する
* 作成者:S.Hiruta
* 作成日:2024/05/13
*/
class Day3 {

	//年を表わすフィールドを宣言
	private int yearData = 1;
	//月を表わすフィールドを宣言
	private int monthData = 1;
	//日を表わすフィールドを宣言
	private int dateData = 1;

	/*
	 * コンストラクタ名：Day2
	 * 概要:日付に関する情報のインスタンスの、各クラス型変数を初期化して宣言
	 * 引数：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/13
	*/
	public Day3() {}

	/*
	 * コンストラクタ名：Day2
	 * 概要:日付に関する情報のインスタンスの、各クラス型変数を初期化して宣言
	 * 引数：年
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/13
	*/
	public Day3(int yearData) {
		//
		this.yearData = yearData;
	}

	/*
	 * コンストラクタ名：Day2
	 * 概要:日付に関する情報のインスタンスの、各クラス型変数を初期化して宣言
	 * 引数：年,月
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/13
	*/
	public Day3(int yearData, int monthData) {
		//
		this(yearData);
		//
		this.monthData = monthData;
	}

	/*
	 * コンストラクタ名：Day2
	 * 概要:日付に関する情報のインスタンスの、各クラス型変数を初期化して宣言
	 * 引数：年,月,日
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/13
	*/
	public Day3(int yearData, int monthData, int dateData) {
		//
		this(yearData, monthData);
		//
		this.dateData = dateData;
	}

	/*
	 * コンストラクタ名：Day2
	 * 概要:日付に関する情報のインスタンスの、各クラス型変数を初期化して宣言
	 * 引数：特定の日の、年,月,日
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/13
	*/
	public Day3(Day3 paticularDay) {
		//
		this(paticularDay.yearData, paticularDay.monthData, paticularDay.dateData);
	}

	/*
	 * ゲッタ名：getYear
	 * 概要:年に関するフィールドの値を取得
	 * 引数：なし
	 * 戻り値：年に関する情報
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/13
	*/
	public int getYear() {
		//年に関する情報を返却
		return yearData;
	}

	/*
	 * ゲッタ名：getMonth
	 * 概要:月に関するフィールドの値を取得
	 * 引数：なし
	 * 戻り値：月に関する情報
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/13f
	*/
	public int getMonth() {
		//月に関する情報を返却
		return monthData;
	}

	/*
	 * ゲッタ名：getDate
	 * 概要:日に関するフィールドの値を取得
	 * 引数：なし
	 * 戻り値：日に関する情報
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/13
	*/
	public int getDate() {
		//月に関する情報を返却
		return dateData;
	}

	/*
	 * セッタ名：setYear
	 * 概要:年に関するフィールドの値を設定
	 * 引数：年に関するフィールド
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/13
	*/
	public void setYear(int yearData) {
		//年の情報のクラス型変数を初期化
		this.yearData = yearData;
	}

	/*
	 * セッタ名：setMonth
	 * 概要:月に関するフィールドの値を設定
	 * 引数：月に関するフィールド
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/13
	*/
	public void setMonth(int monthData) {
		//月の情報のクラス型変数を初期化
		this.monthData = monthData;
	}

	/*
	 * セッタ名：setDate
	 * 概要:日に関するフィールドの値を設定
	 * 引数：日に関するフィールド
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/13
	*/
	public void setDate(int dateData) {
		//日の情報のクラス型変数を初期化
		this.dateData = dateData;
	}

	/*
	 * 関数名：setDate
	 * 概要:日付に関するオブジェクトの全てのフィールドに値を設定する
	 * 引数：なし
	 * 戻り値：日に関する情報
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/13
	*/
	public void setData(int yearData, int monthData, int dateData) {
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
	 * 作成日：2024/05/13
	*/
	public int deriveDayOfWeek() {
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
		//計算の為に調整する月数12を定数化
		final int SHIFTED_MONTH = 12;

		//年の情報を計算用の変数に格納
		int targetYear = yearData;
		//月の情報を計算用の変数に格納
		int targetMonth = monthData;
		//月が1月か2月である場合、公式に合わせて年と月の変数を調整する
		if (targetMonth == JANUARY_CONSTANT || targetMonth == FEBRUARY_CONSTANT) {
			//年の値を1下げる
			targetYear--;
			//月の値を12上げる
			targetMonth += SHIFTED_MONTH;
		}

		//曜日を求めるために、ツェラーの公式を用いる
		//ツェラーの公式:(年数+(年数/4)-(年数/100)+(年数/400)+(13*月数+8)/5+日数)%7
		//ツェラーの公式を用いて算出した曜日を表す数字を、返却値に格納
		dayOfweek = (targetYear + (targetYear / FIRST_ZELLER_CONSTANT) - (targetYear / SECONT_ZELLER_CONSTANT)
				+ (targetYear / THIRD_ZELLER_CONSTANT)
				+ ((FORTH_ZELLER_CONSTANT * targetMonth + FIFTH_ZELLER_CONSTANT) / SIXTH_ZELLER_CONSTANT) + dateData)
				% SEVENTH_ZELLER_CONSTANT;

		//算出された曜日を表す数字を返却
		return dayOfweek;
	}

	/*
	 * 関数名：isSameDay
	 * 概要：とある日付と等しいか比較
	 * 引数：なし
	 * 戻り値：等しいか等しくないか(true,fals)
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/13
	*/
	public boolean isSameDay(Day3 someDay) {
		//返却値となる変数にfaiseを代入
		boolean retrnValue = false;
		//日付が一致している場合
		if (yearData == someDay.yearData && monthData == someDay.monthData && dateData == someDay.dateData) {
			//返却値にtrueを代入
			retrnValue = true;
		}
		//返却値を返却
		return retrnValue;
	}

	/*
	 * 関数名：printWeekDay
	 * 概要：特定の日付の曜日を表示
	 * 引数：なし
	 * 戻り値：日付の曜日を表わす表記
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/13
	*/
	public String toString() {
		//一週間の曜日の表記を格納する配列を定義
		String[] weekDays = { "日", "月", "火", "水", "木", "金", "土", };
		//日付と曜日の表記を返却
		return String.format("%04d年％%02d月%02d日(%s)", yearData, monthData, dateData, weekDays[deriveDayOfWeek()]);
	}
}
