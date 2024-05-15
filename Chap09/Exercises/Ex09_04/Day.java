package Chap09.Exercises.Ex09_04;

/*
* クラス名:Day
* 概要:日付に関する情報を管理する
* 作成者:S.Hiruta
* 作成日:2024/05/14
*/
public class Day {

	//年数の初期値を表す定数を定義
	final int DEFAULT_YEAR = 1;
	//月数の初期値を表す定数を定義
	final int DEFAULT_MONTH = 1;
	//日数の初期値を表す定数を定義
	final int DEFAULT_DATE = 1;

	//年を表わすフィールドを宣言
	private int yearData = DEFAULT_YEAR;
	//月を表わすフィールドを宣言
	private int monthData = DEFAULT_MONTH;
	//日を表わすフィールドを宣言
	private int dateData = DEFAULT_DATE;

	/*
	 * コンストラクタ名：Day
	 * 概要:日付に関する情報のインスタンスを、各クラス型変数を初期値で宣言
	 * 引数：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/14
	*/
	public Day() {}

	/*
	 * コンストラクタ名：Day
	 * 概要:日付に関する情報のインスタンスを、年数のみ初期値から変更して宣言
	 * 引数：年数(int型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/14
	*/
	public Day(int yearData) {
		//入力された年数の情報を初期値としてフィールドを宣言
		this.yearData = yearData;
	}

	/*
	 * コンストラクタ名：Day
	 * 概要:日付に関する情報のインスタンスを、年数・月数を初期値から変更して宣言
	 * 引数：年数,月数(int型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/14
	*/
	public Day(int yearData, int monthData) {
		//コンストラクタを用いて入力された年数の情報を初期値としてフィールドを宣言
		this(yearData);
		//入力された月数の情報を初期値としてフィールドを宣言
		this.monthData = monthData;
	}

	/*
	 * コンストラクタ名：Day
	 * 概要:日付に関する情報のインスタンスを、各情報を初期値から変更して宣言
	 * 引数：年数,月数,日数(int型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/14
	*/
	public Day(int yearData, int monthData, int dateData) {
		//コンストラクタを用いて入力された年数・月数の情報を初期値としてフィールドを宣言
		this(yearData, monthData);
		//入力された日数の情報を初期値としてフィールドを宣言
		this.dateData = dateData;
	}

	/*
	 * コンストラクタ名：Day
	 * 概要:日付に関する情報のインスタンスを、各情報を他の日付のインスタンスの値にして宣言
	 * 引数：特定の日付(Day型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/14
	*/
	public Day(Day paticularDay) {
		//他の日付の情報を初期値としてフィールドを宣言
		this(paticularDay.yearData, paticularDay.monthData, paticularDay.dateData);
	}

	/*
	 * ゲッタ名：getYear
	 * 概要:年に関するフィールドの値を取得
	 * 引数：なし
	 * 戻り値：年数(int型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/14
	*/
	public int getYear() {
		//年に関する情報を返却
		return yearData;
	}

	/*
	 * ゲッタ名：getMonth
	 * 概要:月に関するフィールドの値を取得
	 * 引数：なし
	 * 戻り値：月数(int型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/14
	*/
	public int getMonth() {
		//月に関する情報を返却
		return monthData;
	}

	/*
	 * ゲッタ名：getDate
	 * 概要:日に関するフィールドの値を取得
	 * 引数：なし
	 * 戻り値：日数(int型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/14
	*/
	public int getDate() {
		//月に関する情報を返却
		return dateData;
	}

	/*
	 * セッタ名：setYear
	 * 概要:年に関するフィールドの値を設定
	 * 引数：年に関するフィールド(int型)
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/14
	*/
	public void setYear(int yearData) {
		//年の情報のクラス型変数を初期化
		this.yearData = yearData;
	}

	/*
	 * セッタ名：setMonth
	 * 概要:月に関するフィールドの値を設定
	 * 引数：月に関するフィールド(int型)
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/14
	*/
	public void setMonth(int monthData) {
		//月の情報のクラス型変数を初期化
		this.monthData = monthData;
	}

	/*
	 * セッタ名：setDate
	 * 概要:日に関するフィールドの値を設定
	 * 引数：日に関するフィールド(int型)
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/14
	*/
	public void setDate(int dateData) {
		//日の情報のクラス型変数を初期化
		this.dateData = dateData;
	}

	/*
	 * 関数名：setDate
	 * 概要:日付に関するオブジェクトの全てのフィールドに値を設定する
	 * 引数：年数、月数、日数(int型)
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/14
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
	 * 戻り値：日付の曜日を表わす数字(0～6：日～土)(int型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/14
	*/
	public int deriveDayOfWeek() {
		//曜日を表す数字を格納する変数(返却値)を宣言
		int dayOfWeek = 0;

		//1月を表す定数
		final int JANUARY_CONSTANT = 1;
		//2月を表す定数
		final int FEBRUARY_CONSTANT = 2;
		//計算の為に調整する月の数12を定数化
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
		//ツェラーの公式を用いて算出した曜日を表す数字を、返却値に格納
		dayOfWeek = (targetYear + (targetYear / 4) - (targetYear / 100) + (targetYear / 400) + ((13 * targetMonth + 8) / 5) + dateData) % 7;

		//算出された曜日を表す数字を返却
		return dayOfWeek;
	}

	/*
	 * 関数名：isSameDay
	 * 概要：とある日付と等しいか比較
	 * 引数：とある日付の情報(Day型)
	 * 戻り値：等しいか等しくないか(true,false)(boolean型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/14
	*/
	public boolean isSameDay(Day someDay) {
		//日付の一致の判定結果を格納する変数を初期値falseで宣言
		boolean retrnValue = false;
		//日付が一致している場合
		if (yearData == someDay.yearData && monthData == someDay.monthData && dateData == someDay.dateData) {
			//返却値にtrueを代入
			retrnValue = true;
		}
		//日付の一致の判定結果を返却
		return retrnValue;
	}

	/*
	 * 関数名：toString
	 * 概要：特定の日付の曜日を表示
	 * 引数：なし
	 * 戻り値：日付と、その曜日の表記(String型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/14
	*/
	public String toString() {
		//一週間の曜日の表記を格納する配列を定義
		String[] weekDays = { "日", "月", "火", "水", "木", "金", "土", };
		//日付と曜日の表記を返却
		return String.format("%04d年%02d月%02d日(%s)", yearData, monthData, dateData, weekDays[deriveDayOfWeek()]);
	}
}
