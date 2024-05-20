package Chap09.Exercises.Ex09_03;

import static java.util.Calendar.*;

import java.util.GregorianCalendar;

/*
* クラス名:Day3(Exercise10_04)
* 概要:日付に関する情報を管理する
* 作成者:S.Hiruta
* 作成日:2024/05/20
*/
class Day {

	//年数の初期値を表す定数を定義
	final int DEFAULT_YEAR = 1;
	//月数の初期値を表す定数を定義
	final int DEFAULT_MONTH = 1;
	//日数の初期値を表す定数を定義
	final int DEFAULT_DATE = 1;
	
	//
	GregorianCalendar today = new GregorianCalendar();

	//年を表わすフィールドを宣言
	private int yearData = DEFAULT_YEAR;
	//月を表わすフィールドを宣言
	private int monthData = DEFAULT_MONTH;
	//日を表わすフィールドを宣言
	private int dateData = DEFAULT_DATE;

	//
	static {
		//
		GregorianCalendar today = new GregorianCalendar();
		//
		int yearData = today.get(YEAR);
		//
		int monthData = today.get(MONTH) + 1;
		//
		int dateData = today.get(DATE);
	}

	/*
	 * コンストラクタ名：Day3
	 * 概要:日付に関する情報のインスタンスを、各クラス型変数を初期値で宣言
	 * 引数：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/20
	*/
	public Day() {
	}

	/*
	 * コンストラクタ名：Day3
	 * 概要:日付に関する情報のインスタンスを、年数のみ初期値から変更して宣言
	 * 引数：年数(int型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/20
	*/
	public Day(int yearData) {
		//入力された年数の情報を初期値としてフィールドを宣言
		this.yearData = yearData;
	}

	//実在する最小の月数である1を定数化
	final int MINIMUM_MONTH = 1;
	//実在する最大の月数である12を定数化
	final int MAXIMUM_MONTH = 12;

	/*
	 * コンストラクタ名：Day3
	 * 概要:日付に関する情報のインスタンスを、年数・月数を初期値から変更して宣言
	 * 引数：年数,月数(int型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/20
	*/
	public Day(int yearData, int monthData) {
		//コンストラクタを用いて入力された年数の情報を初期値としてフィールドを宣言
		this(yearData);
		/*入力された月数が、
		 * 1未満の場合1として、
		 * 12超過の場合12として、
		 * 実在する月の場合はその月数のまま、
		 * 初期値としてフィールドを宣言*/
		this.monthData = (monthData < MINIMUM_MONTH) ? MINIMUM_MONTH
				: ((monthData > MAXIMUM_MONTH) ? MAXIMUM_MONTH : monthData);
	}

	/*
	 * 関数名：isLeap
	 * 概要:特定の年が閏年であるか判定
	 * 引数：年数(int型)
	 * 戻り値：閏年であればtrue、そうでなければfalse(boolean型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/20
	*/
	static boolean isLeap(int targetYear) {
		//閏年であればtrue、そうでなければfalseを返却
		return targetYear % 4 == 0 && targetYear % 100 != 0 || targetYear % 400 == 0;
	}

	/*
	 * 関数名：outputMonthDayCount
	 * 概要:特定の年の特定の月の日数を返却
	 * 引数：年数、月数(int型)
	 * 戻り値：その年の月の日数(int型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/20
	*/
	static int outputMonthDayCount(int yearNumber, int monthNumber) {
		//年間における1～12月の日数を格納する定数配列を宣言(順番に1月～12月の日数を格納)
		//閏年の場合、2月の日数が変化
		final int[] MONTH_DAY_COUNT = { 31, (isLeap(yearNumber) ? 29 : 28), 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		//月数を日う列のインデックスに対応させる。該当の月の日数を返却
		return MONTH_DAY_COUNT[--monthNumber];
	}

	//存在する最小の日数１を定数化
	final int MINIMUM_DATE = 1;

	/*
	 * コンストラクタ名：Day3
	 * 概要:日付に関する情報のインスタンスを、各情報を初期値から変更して宣言
	 * 引数：年数,月数,日数(int型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/20
	*/
	public Day(int yearData, int monthData, int dateData) {
		//コンストラクタを用いて入力された年数・月数の情報を初期値としてフィールドを宣言
		this(yearData, monthData);
		/*入力された日数が、
		 * 1未満の場合1として、
		 * その月の上限日数を超過している場合は、上限日数として、
		 * 実在する日数の場合はその日数のまま、
		 * 初期値としてフィールドを宣言*/
		this.monthData = (monthData < MINIMUM_DATE) ? MINIMUM_DATE
				: ((monthData > outputMonthDayCount(yearData, monthData)) ? outputMonthDayCount(yearData, monthData)
						: monthData);
	}

	/*
	 * コンストラクタ名：Day3
	 * 概要:日付に関する情報のインスタンスを、各情報を他の日付のインスタンスの値にして宣言
	 * 引数：特定の日付(Day3型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/20
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
	 * 作成日：2024/05/20
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
	 * 作成日：2024/05/20
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
	 * 作成日：2024/05/20
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
	 * 作成日：2024/05/20
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
	 * 作成日：2024/05/20
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
	 * 作成日：2024/05/20
	*/
	public void setDate(int dateData) {
		//日の情報のクラス型変数を初期化
		this.dateData = dateData;
	}

	/*
	 * 関数名：setDate
	 * 概要:日付に関するオブジェクトの全てのフィールドに値を設定する
	 * 引数：なし
	 * 戻り値：年数、月数、日数(int型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/20
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
	 * 関数名：calculateElapsedDays
	 * 概要:年内での経過日数を求める
	 * 引数：日付(Day型)
	 * 戻り値：年内での経過日数(int型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/20
	*/
	public int calculateElapsedDays() {
		//
		int elapsedDays = 0;
		//
		int monthCount = 0;
		//
		for (int i = 0; i < monthData; i++) {
			//
			elapsedDays += (monthData > ++monthCount)
					? outputMonthDayCount(yearData, monthData)
					: dateData;
		}

		//
		return elapsedDays;
	}

	//閏年の年間日数366を定数化
	final int LEAP_ANNUAL_DAYS = 366;
	//通常年の年間日数366を定数化
	final int NORMAL_ANNUAL_DAYS = 365;

	/*
	 * 関数名：caluculateRemainingDays
	 * 概要:日付の曜日を求める
	 * 引数：日付(Day型)
	 * 戻り値：年内の残り日数(int型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/20
	*/
	public int caluculateRemainingDays() {
		//
		return ((isLeap(yearData)) ? LEAP_ANNUAL_DAYS : NORMAL_ANNUAL_DAYS)
				- calculateElapsedDays();
	}
	
	/*
	 * 関数名：compareOtherDay
	 * 概要:他の日付との前後関係(前の日か/同じ日か/後の日か)を判定する
	 * 引数：日付(Day型)
	 * 戻り値：他の日付との前後関係(String型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/20
	*/
	public String compareOtherDay(Day particularDate) {
		//
		String comparedResult = toString() + "より前の日付です。";
		//
		if (isSameDay(particularDate)) {
			//
			comparedResult = toString() + "と等しい日付です。";
		}
		//
		if (calculateElapsedDays() < particularDate.calculateElapsedDays()) {
			//
			comparedResult = toString() + "より後ろの日付です。";
		}
		//
		return comparedResult;
	}
	
	/*
	 * 関数名：compareOtherDay
	 * 概要:2つの日付の前後関係(前の日か/同じ日か/後の日か)を判定する
	 * 引数：2つの日付(Day型)
	 * 戻り値：2つの日付の前後関係(String型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/20
	*/
	public String compareOtherDay(Day firstDate, Day secondDate) {
		//
		String comparedResult = firstDate.toString() + "は" + secondDate.toString() + "より前の日付です。";
		//
		if (firstDate.isSameDay(secondDate)) {
			//
			comparedResult = firstDate.toString() + "は" + secondDate.toString() + "と等しい日付です。";
		}
		//
		if (firstDate.calculateElapsedDays() < secondDate.calculateElapsedDays()) {
			//
			comparedResult = firstDate.toString() + "は" + secondDate.toString() + "より後ろの日付です。";
		}
		//
		return comparedResult;
	}
	
	/*
	 * 関数名：advanceDay
	 * 概要:日付を1つ後ろに進める
	 * 引数：なし
	 * 戻り値：1つ後ろに進めた日付(Day型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/20
	*/
	public Day advanceDay() {
		//
		Day advancedDate = new Day(yearData, monthData, ++dateData);
		//
		if (++dateData > outputMonthDayCount(yearData, monthData)) {
			//
			advancedDate = new Day(yearData, ++monthData);
			//
			if (monthData > MAXIMUM_MONTH) {
				//
				advancedDate = new Day(++yearData);
			}
		}
		//
		return advancedDate;
	}
	
	/*
	 * 関数名：printAdvanceDay
	 * 概要:日付を1つ後ろに進めた日付を表示
	 * 引数：進める日数(int型)
	 * 戻り値：進めた後の日付(Day型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/20
	*/
	public void printAdvanceDay() {
		//
		advanceDay();
	}
	
	/*
	 * 関数名：returnDay
	 * 概要:日付を一つ前に戻す
	 * 引数：なし
	 * 戻り値：一つ前に戻した日付(Day型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/20
	*/
	public Day returnDay() {
		//
		Day returnDate = new Day(yearData, monthData, --dateData);
		//
		if (--dateData <= 0) {
			//
			returnDate = new Day(yearData, --monthData);
			//
			if (monthData > MINIMUM_MONTH) {
				//
				returnDate = new Day(--yearData, MAXIMUM_MONTH, outputMonthDayCount(--yearData, MAXIMUM_MONTH));
			}
		}
		//
		return returnDate;
	}
	
	/*
	 * 関数名：printReturnedDay
	 * 概要:日付を一つ前に戻しあ日付を表示
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/20
	*/
	public void printReturnedDay() {
		//
		returnDay();
	}
	
	/*
	 * 関数名：advanceDays
	 * 概要:日付を一つ前に戻す
	 * 引数：進める日数(int型)
	 * 戻り値：進めた後の日付(Day型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/20
	*/
	public Day advanceDays(int advanceCount) {
		//
		Day advancedDate = new Day(yearData, monthData, dateData);
		//
		for (int i = 0; i > advanceCount; i++) {
			//
			advancedDate = advancedDate.advanceDay();
		}
		//
		return advancedDate;
	}
	
	/*
	 * 関数名：printAdvancedDays
	 * 概要:日付を一つ前に戻す
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/20
	*/
	public void printAdvancedDays(int advancecount) {
		//
		advanceDays(advancecount);
	}
	
	/*
	 * 関数名：returnDays
	 * 概要:日付を一つ前に戻す
	 * 引数：戻す日数(int型)
	 * 戻り値：戻した後の日付(Day型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/20
	*/
	public Day returnDays(int returnCount) {
		//
		Day returnedDate = new Day(yearData, monthData, dateData);
		//
		for (int i = 0; i > returnCount; i++) {
			//
			returnedDate = returnedDate.returnDay();
		}
		//
		return returnedDate;
	}
	
	/*
	 * 関数名：printReturnedDays
	 * 概要:日付を一つ前に戻す
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/20
	*/
	public void printReturnedDays(int returnCount) {
		//
		returnDays(returnCount);
	}
	
	

	/*
	 * 関数名：deriveDayOfWeek
	 * 概要:日付の曜日を求める
	 * 引数：なし
	 * 戻り値：日付の曜日を表わす数字(0～6：日～土)(int型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/20
	*/
	public int deriveDayOfWeek() {
		//曜日を表す数字を格納する変数(返却値)を宣言
		int dayOfweek = 0;

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
		dayOfweek = (targetYear + (targetYear / 4) - (targetYear / 100) + (targetYear / 400)
				+ ((13 * targetMonth + 8) / 5) + dateData) % 7;

		//算出された曜日を表す数字を返却
		return dayOfweek;
	}

	/*
	 * 関数名：isSameDay
	 * 概要：とある日付と等しいか比較
	 * 引数：なし
	 * 戻り値：等しいか等しくないか(true,fals)(boolean型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/20
	*/
	public boolean isSameDay(Day someDay) {
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
	 * 関数名：toString
	 * 概要：特定の日付の曜日を表示
	 * 引数：なし
	 * 戻り値：日付の曜日を表わす表記(String型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/20
	*/
	public String toString() {
		//一週間の曜日の表記を格納する配列を定義
		String[] weekDays = { "日", "月", "火", "水", "木", "金", "土", };
		//日付と曜日の表記を返却
		return String.format("%04d年%02d月%02d日(%s)", yearData, monthData, dateData, weekDays[deriveDayOfWeek()]);
	}
}
