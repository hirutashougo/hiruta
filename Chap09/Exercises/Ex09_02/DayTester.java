package Chap09.Exercises.Ex09_02;

//Scannerのインポート
import java.util.Scanner;

/*
* クラス名:DayTester(Exercise09_02)
* 概要:2つの日付を入力し、生成するインスタンスに応じた日付を表示する
* 作成者:S.Hiruta
* 作成日:2024/05/14
*/
public class DayTester {

	//Scannerクラスの変数の定義
	static Scanner standardInput = new Scanner(System.in);

	/*
	 * 関数名：outputMonthDayCount
	 * 概要:特定の年の特定の月の日数を返却
	 * 引数：年数、月数(int型)
	 * 戻り値：その年の月の日数(int型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/14
	*/
	static int outputMonthDayCount(int yearNumber, int monthNumber) {
		//返却する月の二数を格納する変数を宣言
		int dayCount = 0;
		//月の数値を、配列のインデックスに調整(-1する)
		monthNumber--;
		//平年における1～12月の日数を格納する定数配列を宣言(順番に1月～12月の日数を格納)
		final int[] NORMAL_YEAR_MONTH_DAY_COUNT = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		//うるう年における1～12月の日数を格納する定数配列を宣言(順番に1月～12月の日数を格納)
		final int[] REAP_YEAR_MONTH_DAY_COUNT = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		//うるう年を算出する条件に用いる定数を格納する配列を宣言
		final int[] REAP_YEAR_CALCULATION_CONSTANT = { 4, 100, 400 };
		//その年がうるう年でない場合
		if (yearNumber % REAP_YEAR_CALCULATION_CONSTANT[0] != 0
				|| (yearNumber % REAP_YEAR_CALCULATION_CONSTANT[1] == 0
						&& yearNumber % REAP_YEAR_CALCULATION_CONSTANT[2] != 0)) {
			//平年の各月の日数を返却値に格納
			dayCount = NORMAL_YEAR_MONTH_DAY_COUNT[monthNumber];
			//その年がうるう年の場合
		} else {
			//平年の各月の日数を返却値に格納
			dayCount = REAP_YEAR_MONTH_DAY_COUNT[monthNumber];
		}
		//指定の年月の日数を返却
		return dayCount;
	}

	/*
	 * 関数名：inputYear
	 * 概要:年数を入力させる
	 * 引数：なし
	 * 戻り値：入力された年(int型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/14
	*/
	static int inputYear() {
		//グレゴリオ暦が採用された年を表す定数を宣言
		final int GUREGORIAN_YEAR = 1582;
		//年の入力を促す
		System.out.print("何年?：");
		//入力された年の数値を読み込む
		int yearData = standardInput.nextInt();
		//グレゴリオ暦の範囲内で数値を入力させる
		while (yearData < GUREGORIAN_YEAR) {
			//グレゴリオ暦採用以降の日付の入力を促す
			System.out.println("グレゴリオ暦採用(" + GUREGORIAN_YEAR +"年)以降の年で入力してください。");
			//再度、年の入力を促す
			System.out.print("何年?：");
			//入力された年の数値を読み込む
			yearData = standardInput.nextInt();
		}
		//入力された年数を返却
		return yearData;
	}

	/*
	 * 関数名：inputMonth
	 * 概要:月数を入力させる
	 * 引数：なし
	 * 戻り値：入力された月(int型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/14
	*/
	static int inputMonth() {

		//存在する月数の上限を表す定数
		final int MONTH_UPPER_LIMIT = 1;
		//存在する月数の下限を表す定数
		final int MONTH_LOWER_LIMIT = 12;
		//月の入力を促す
		System.out.print("何月?：");
		//入力された月の数値を読み込む
		int monthData = standardInput.nextInt();
		//存在する月の範囲内で数値を入力させる
		while (monthData > MONTH_LOWER_LIMIT || monthData < MONTH_UPPER_LIMIT) {
			//存在する月の入力を促す
			System.out.println("存在する月(" + MONTH_UPPER_LIMIT + "～" + MONTH_LOWER_LIMIT +"月)で入力してください。");
			//再度、月の入力を促す
			System.out.print("何月?：");
			//入力された月の数値を読み込む
			monthData = standardInput.nextInt();
		}
		//入力された月数を返却
		return monthData;
	}

	/*
	 * 関数名：inputDate
	 * 概要:日数を入力させる
	 * 引数：入力する日付の年数・月数(int型)
	 * 戻り値：入力された日(int型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/14
	*/
	static int inputDate(int yearData, int monthData) {

		//日の入力を促す
		System.out.print("何日?：");
		//入力された日の数値を読み込む
		int dateData = standardInput.nextInt();
		//存在する日の範囲内で数値を入力させる
		while (dateData <= 0 || dateData > outputMonthDayCount(yearData, monthData)) {
			//存在する日の入力を促す
			System.out.println("1～" + outputMonthDayCount(yearData, monthData) + "日以内で入力してください。");
			//再度、日の入力を促す
			System.out.print("何日?：");
			//入力された日の数値を読み込む
			dateData = standardInput.nextInt();
		}

		//入力された日数を返却
		return dateData;
	}

	/*
	 * 関数名：main
	 * 概要:2つの日付を入力し、生成するインスタンスに応じた日付を表示する
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/14
	*/
	public static void main(String[] args) {

		//日付その1を入力させる
		System.out.println("日付その1を入力してください");
		//年数を入力させる
		int firstYearData = inputYear();
		//月数を入力させる
		int firstMonthData = inputMonth();
		//日数を入力させる
		int firstDateData = inputDate(firstYearData, firstMonthData);

		//日付その2を入力させる
		System.out.println("日付その2を入力してください");
		//年数を入力させる
		int secondYearData = inputYear();
		//月数を入力させる
		int secondMonthData = inputMonth();
		//日数を入力させる
		int secondDateData = inputDate(secondYearData, secondMonthData);

		//日付の全ての情報が初期値の1で設定されているインスタンスを生成
		Day3 initializateAllData = new Day3();
		//日付その1の年の情報のみ設定されているインスタンスを生成
		Day3 inputYearData = new Day3(firstYearData);
		//日付その1の年と月の情報が設定されているインスタンスを生成
		Day3 inputYearMonthData = new Day3(firstYearData, firstMonthData);
		//日付その1の情報が設定されているインスタンスを生成
		Day3 inputYearMonthDateData = new Day3(firstYearData, firstMonthData, firstDateData);
		//日付その2のインスタンスを生成
		Day3 secondDate = new Day3(secondYearData, secondMonthData, secondDateData);
		//日付その2情報を設定したインスタンスを生成
		Day3 inputSecondDateData = new Day3(secondDate);

		//日付の全ての情報が初期値の1で設定されているインスタンスの表示を示唆
		System.out.println("日付の全ての情報が初期値の1で設定");
		//日付の全ての情報が初期値の1で設定されているインスタンスの曜日を含めた日付を表示
		System.out.println(initializateAllData.printWeekDay());
		//日付その1の年の情報のみ設定されているインスタンスの表示を示唆
		System.out.println("日付その1の年の情報のみ設定");
		//日付その1の年の情報のみ設定されているインスタンスの曜日を含めた日付を表示
		System.out.println(inputYearData.printWeekDay());
		//日付その1の年と月の情報が設定されているインスタンスの表示を示唆
		System.out.println("日付その1の年と月の情報が設定");
		//日付その1の年と月の情報が設定されているインスタンスの曜日を含めた日付を表示
		System.out.println(inputYearMonthData.printWeekDay());
		//日付その1の情報が設定されているインスタンスの表示を示唆
		System.out.println("日付その1の情報が設定");
		//日付その1の情報が設定されているインスタンスの曜日を含めた日付を表示
		System.out.println(inputYearMonthDateData.printWeekDay());
		//日付その2情報を設定したインスタンスの表示を示唆
		System.out.println("日付その2情報を設定");
		//日付その2情報を設定したインスタンスの曜日を含めた日付を表示
		System.out.println(inputSecondDateData.printWeekDay());
	}
}
