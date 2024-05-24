package day;

//カレンダークラスのインポート
import static java.util.Calendar.*;

//GregorianCalendarクラスのインポート
import java.util.GregorianCalendar;

/*
* クラス名:Day3
* 概要:日付に関する情報を管理する
* 作成者:S.Hiruta
* 作成日:2024/05/20
*/
public class Day {

	//初期の年数を表すクラス変数を宣言
	private static int yearCount = 0;
	//初期の月数を表すクラス変数を宣言
	private static int monthCount = 0;
	//初期の日数を表すクラス変数を宣言
	private static int dateCount = 0;

	//年を表わすフィールドを宣言
	private int yearData = yearCount;
	//月を表わすフィールドを宣言
	private int monthData = monthCount;
	//日を表わすフィールドを宣言
	private int dateData = dateCount;

	//グレゴリオカレンダーの月数出ryくの際に用いる定数1を宣言
	private static final int ADJUSTMENT_NUMBER = 1;
	//今回の処理における最少年数1を定数化
	final int MINIMUM_YEAR = 1;
	//実在する最小の月数である1を定数化
	final int MINIMUM_MONTH = 1;
	//実在する最大の月数である12を定数化
	final int MAXIMUM_MONTH = 12;
	//存在する最小の日数１を定数化
	final int MINIMUM_DATE = 1;
	//閏年の年間日数366を定数化
	final int LEAP_ANNUAL_DAYS = 366;
	//通常年の年間日数366を定数化
	final int NORMAL_ANNUAL_DAYS = 365;
	//日付を1遡る為の定数
	final int BACK_DATE = -1;

	//静的初期化子を用いて、年月日の初期値を実行日に設定
	static {
		//グレゴリオカレンダークラスの変数を設定
		GregorianCalendar today = new GregorianCalendar();
		//実行年を取得
		int todaYear = today.get(YEAR);
		//実行月を取得
		int todayMonth = today.get(MONTH) + ADJUSTMENT_NUMBER;
		//実行日を取得
		int todayDate = today.get(DATE);

		//初期年数を実行年に設定
		yearCount = todaYear;
		//初期月数を実行月に設定
		monthCount = todayMonth;
		//初期日数を実行日に設定
		dateCount = todayDate;
	}

	/*
	 * コンストラクタ名：Day
	 * 概要:日付に関する情報のインスタンスを、実行日を初期値として宣言
	 * 引数：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/20
	*/
	public Day() {
	}

	/*
	 * コンストラクタ名：Day
	 * 概要:日付に関する情報のインスタンスを、年数のみ初期値(実行日)から変更して宣言
	 * 引数：年数(int型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/20
	*/
	public Day(int yearData) {
		//入力された年数の情報を初期値としてフィールドを宣言(0以下の入力は1に変換)
		this.yearData = (yearData > 0) ? yearData : MINIMUM_YEAR;
	}

	/*
	 * コンストラクタ名：Day
	 * 概要:日付に関する情報のインスタンスを、年数・月数を初期値(実行日)から変更して宣言
	 * 引数：年数,月数(int型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/20
	*/
	public Day(int yearData, int monthData) {
		//入力された年数の情報を初期値としてフィールドを宣言(数値は適切に補正)
		this.yearData = new Day(yearData).getYear();
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
	 * 戻り値：その年月の日数(int型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/20
	*/
	static int outputMonthDayCount(int yearNumber, int monthNumber) {
		//年間における1～12月の日数を格納する定数配列を宣言(順番に1月～12月の日数を格納)
		//閏年の場合、2月の日数が変化
		final int[] MONTH_DAY_COUNT = { 31, (isLeap(yearNumber) ? 29 : 28), 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		//月数を配列のインデックスに対応させる。該当の月の日数を返却
		return MONTH_DAY_COUNT[--monthNumber];
	}

	/*
	 * コンストラクタ名：Day
	 * 概要:日付に関する情報のインスタンスを、各情報を初期値(実行日)から変更して宣言
	 * 引数：年数,月数,日数(int型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/20
	*/
	public Day(int yearData, int monthData, int dateData) {
		//入力された年数の情報を初期値としてフィールドを宣言(数値は適切に補正)
		this.yearData = new Day(yearData).getYear();
		//入力された年数の情報を初期値としてフィールドを宣言(数値は適切に補正)
		this.monthData = new Day(yearData, monthData).getMonth();
		/*入力された日数が、
		 * 1未満の場合1として、
		 * その月の上限日数を超過している場合は、上限日数として、
		 * 実在する日数の場合はその日数のまま、
		 * 初期値としてフィールドを宣言*/
		this.dateData = (dateData < MINIMUM_DATE) ? MINIMUM_DATE
				: ((dateData > outputMonthDayCount(yearData, getMonth())) ? outputMonthDayCount(yearData, getMonth())
						: dateData);
	}

	/*
	 * コンストラクタ名：Day
	 * 概要:日付に関する情報のインスタンスを、各情報を他の日付のインスタンスの値にして宣言
	 * 引数：特定の日付(Day型)
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
	 * 引数：年数、月数、日数(int型)
	 * 戻り値：なし
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
	 * 概要:日付の年内での経過日数を求める
	 * 引数：なし
	 * 戻り値：年内での経過日数(int型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/20
	*/
	public int calculateElapsedDays() {
		//経過日数を表わす変数を初期状態-1で宣言(指定日を含まない)
		int elapsedDays = -1;
		//月数をカウントする変数を宣言
		int monthCount = 0;
		//年内経過日数を、月ごとに加算して求めていく
		for (int i = 0; i < monthData; i++) {
			//日付より前の月ならその月の日数を、日付の月なら日付の日数を加算
			elapsedDays += (monthData > ++monthCount)
					? outputMonthDayCount(yearData, monthCount)
					: dateData;
		}
		//日付の年内での経過日数を返却
		return elapsedDays;
	}

	/*
	 * 関数名：caluculateRemainingDays
	 * 概要:日付の曜日を求める
	 * 引数：なし
	 * 戻り値：年内の残り日数(int型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/20
	*/
	public int caluculateRemainingDays() {
		//その年の日数(365 or 366)から、日付の年内での経過日数を引いた値を返却
		//年内残り日数に、対象の日付は含めない為、-1(定数:BACK_DATE)を加算
		return ((isLeap(yearData)) ? LEAP_ANNUAL_DAYS + BACK_DATE : NORMAL_ANNUAL_DAYS + BACK_DATE)
				- calculateElapsedDays();
	}

	/*
	 * 関数名：compareOtherDay
	 * 概要:他の日付との前後関係(前の日か/同じ日か/後の日か)を判定する
	 * 引数：比較する日付(Day型)
	 * 戻り値：比較する日付との前後関係(String型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/20
	*/
	public String compareOtherDay(Day particularDate) {
		//比較の結果として、「入力された日付が前の日付だった」場合の文言を設定
		String comparedResult = particularDate.toString() + "は\n" + toString() + "より前の日付です。";
		//比較対象の日付と同じ日付だった場合
		if (isSameDay(particularDate)) {
			//比較対象の日付と同じ日付だったと表示
			comparedResult = toString() + "と等しい日付です。";
		}
		//比較対象の日付よりも後の日付だった場合
		if (calculateElapsedDays() < particularDate.calculateElapsedDays()) {
			//比較対象の日付よりも後の日付だったと表示
			comparedResult = particularDate.toString() + "は\n" + toString() + "より後ろの日付です。";
		}
		//比較する日付との前後関係の文言を返却
		return comparedResult;
	}

	/*
	 * 関数名：compareOtherDay
	 * 概要:2つの日付の前後関係(前の日か/同じ日か/後の日か)を判定する
	 * 引数：なし
	 * 戻り値：2つの日付の前後関係(String型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/20
	*/
	public String compareOtherDay(Day firstDate, Day secondDate) {
		//較の結果として、「最初に入力した日付の方が前の日付だった」場合の文言を設定
		String comparedResult = firstDate.toString() + "は\n" + secondDate.toString() + "より前の日付です。";
		//2つの日付が同じだった場合
		if (firstDate.isSameDay(secondDate)) {
			//2つの日付が同じだったと表示
			comparedResult = "二つは等しい日付です。";
		}
		//最初に入力した日付の方が後の日付だった場合
		if (firstDate.calculateElapsedDays() > secondDate.calculateElapsedDays()) {
			//最初に入力した日付の方が後の日付だったと表示
			comparedResult = firstDate.toString() + "は\n" + secondDate.toString() + "より後ろの日付です。";
		}
		//二つの日付を比較した結果の文言を返却
		return comparedResult;
	}

	/*
	 * 関数名：advanceDay
	 * 概要:日付を1つ後ろに進める
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/20
	*/
	public void advanceDay() {

		//日数がその月の最大日数以上の場合
		if (dateData >= outputMonthDayCount(yearData, monthData)) {
			//翌月の1日に設定
			setData(yearData, ++monthData, MINIMUM_DATE);
			//月が12を超えてしまった場合
			if (monthData > MAXIMUM_MONTH) {
				//翌年の元旦に設定
				setData(++yearData, MINIMUM_MONTH, MINIMUM_DATE);
			}
			//日数がその月の最大日数に収まっているの場合
		} else {
			//
			setData(yearData, monthData, ++dateData);
		}
	}

	/*
	 * 関数名：printAdvanceDay
	 * 概要:日付を1つ後ろに進めた日付を表示
	 * 引数：進める日数(int型)
	 * 戻り値：進めた後の日付(Day型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/20
	*/
	public Day printAdvanceDay() {
		//入力値と同じインスタンスを生成
		Day returnDay = new Day(yearData, monthData, dateData);
		//日付を1つ後ろに進める
		returnDay.advanceDay();
		//日付を1つ後ろに進めた日付を返却
		return returnDay;
	}

	/*
	 * 関数名：returnDay
	 * 概要:日付を一つ前に戻す
	 * 引数：なし
	 * 戻り値：一つ前に戻した日付(Day型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/20
	*/
	public void returnDay() {

		//日数から一つ下げた値を用意
		int previousDate = dateData + BACK_DATE;

		//日数が1以下で、月数は1より大きい場合
		if (previousDate <= 0 && monthData > MINIMUM_MONTH) {
			//前月の最終日で設定
			setData(yearData, --monthData, outputMonthDayCount(yearData, monthData));
			//日数が1以下で、月数も1の場合
		} else if (previousDate <= 0 && monthData == MINIMUM_MONTH && yearData > MINIMUM_YEAR) {
			//前年の大みそかに設定
			setData(--yearData, MAXIMUM_MONTH, outputMonthDayCount(yearData, MAXIMUM_MONTH));
			//日付が0001年01月01日だった場合
		} else if (isSameOriginDay()) {
			//日付は0001年01月01日のままで設定
			setData(MINIMUM_YEAR, MINIMUM_MONTH, MINIMUM_DATE);
			//以降には遡れないことを伝える
			System.out.println("以降には遡れません。");
			//日数が2以上の場合
		} else {
			//日数を1下げて設定
			setData(yearData, monthData, --dateData);
		}
	}

	/*
	 * 関数名：printReturnedDay
	 * 概要:日付を一つ前に戻した日付を返却
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/20
	*/
	public Day printReturnedDay() {
		//対象の日付と同じ年月日を持つインスタンスを生成
		Day returnDay = new Day(yearData, monthData, dateData);
		//インスタンスの日付を一つ前に戻す
		returnDay.returnDay();
		//一つ前に戻した日付を返却
		return returnDay;
	}

	/*
	 * 関数名：advanceDays
	 * 概要:日付を数日進める
	 * 引数：進める日数(int型)
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/20
	*/
	public void advanceDays(int advanceCount) {
		//指定日数分、日付を進行させる
		for (int i = 0; i < advanceCount; i++) {
			//日付の進行
			advanceDay();
		}
	}

	/*
	 * 関数名：printAdvancedDays
	 * 概要:日付を一つ前に戻す
	 * 引数：進める日数(int型)
	 * 戻り値：指定の日数進行した日付(Day型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/20
	*/
	public Day printAdvancedDays(int advancecount) {
		//対象の日付と同じ年月日を持つインスタンスを生成
		Day returnDay = new Day(yearData, monthData, dateData);
		//インスタンスを指定日数分進行させる
		returnDay.advanceDays(advancecount);
		//指定の日数進行した日付を返却
		return returnDay;
	}

	/*
	 * 関数名：returnDays
	 * 概要:日付を数日戻す
	 * 引数：戻す日数(int型)
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/20
	*/
	public void returnDays(int returnCount) {
		//指定日数分、日付を遡る
		for (int i = 0; i < returnCount; i++) {
			//日付を遡る
			returnDay();
			//付が0001年01月01日であり、1日より多く遡る場合
			if (isSameOriginDay() && returnCount > 1) {
				//日付を遡る処理を終わらせるため、処理回数上限を下げる
				i = returnCount;
				//0001年01月01日以降には遡れないことを伝える
				System.out.println("以降には遡れません。");
			}
		}
	}

	/*
	 * 関数名：printReturnedDays
	 * 概要:日付を一つ前に戻す
	 * 引数：戻す日数(int型)
	 * 戻り値：戻した後の日付(Day型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/20
	*/
	public Day printReturnedDays(int returnCount) {
		//対象の日付と同じ年月日を持つインスタンスを生成
		Day returnDay = new Day(yearData, monthData, dateData);
		//インスタンスを指定日数分戻す
		returnDay.returnDays(returnCount);
		//指定の日数戻した日付を返却
		return returnDay;
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
	 * 関数名：isSameOriginDay
	 * 概要：0001年01月01日(最下限の日付)と等しいか比較
	 * 引数：なし
	 * 戻り値：等しいか等しくないか(true,fals)(boolean型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/20
	*/
	public boolean isSameOriginDay() {
		//返却値となる変数にfaiseを代入
		boolean retrnValue = false;
		//
		if (isSameDay(new Day(MINIMUM_YEAR, MINIMUM_MONTH, MINIMUM_DATE))) {
			//
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