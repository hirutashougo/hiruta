package Chap09.Exercises.Ex09_05;

//Scannerのインポート
import java.util.Scanner;

/*
* クラス名:DayPeriodTester
* 概要:期間の開始日と終了日を入力させ、その期間の開始・終了を表示する
* 作成者:S.Hiruta
* 作成日:2024/05/16
*/
public class DayPeriodTester {

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
		//年の入力を促す
		System.out.print("何年?：");
		//入力された年の数値を読み込む
		int yearData = standardInput.nextInt();
		//1以上の年数で数値を入力させる
		while (yearData <= 0) {
			//1以上の年数での入力を促す
			System.out.println("1以上の年数で入力してください。");
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
		final int MONTH_UPPER_LIMIT = 12;
		//存在する月数の下限を表す定数
		final int MONTH_LOWER_LIMIT = 1;
		//月の入力を促す
		System.out.print("何月?：");
		//入力された月の数値を読み込む
		int monthData = standardInput.nextInt();
		//存在する月の範囲内で数値を入力させる
		while (monthData < MONTH_LOWER_LIMIT || monthData > MONTH_UPPER_LIMIT) {
			//存在する月の入力を促す
			System.out.println("存在する月(" + MONTH_UPPER_LIMIT + "～" + MONTH_LOWER_LIMIT + "月)で入力してください。");
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
	 * 概要：期間の開始日と終了日を入力させ、その期間の開始・終了を表示する
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/16
	*/
	public static void main(String[] args) {

		//期間開始日の入力を促す
		System.out.println("期間開始日を入力してください。");
		//入力された年数を読み込む
		int startYear = inputYear();
		//入力された月数を読み込む
		int startMonth = inputMonth();
		//入力された日数を読み込む
		int startDate = inputDate(startYear, startMonth);

		//期間開始日に関するインスタンスを生成
		Day startDay = new Day(startYear, startMonth, startDate);

		//期間終了日の入力を促す
		System.out.println("期間終了日を入力してください。");
		//入力された年数を読み込む
		int endYear = inputYear();
		//期間開始年よりも少ない年数が入力された場合
		while (endYear < startYear) {
			//開始年以上の値を入力を促す
			System.out.println("開始年以上の値を入力してください:");
			//入力された年数を読み込む
			endYear = inputYear();
		}

		//入力された月数を読み込む
		int endMonth = inputMonth();
		//開始年と終了年が等しい場合
		if (startYear == endYear) {
			//期間開始月よりも少ない月数が入力された場合
			while (endMonth < startMonth) {
				//開始月以上の値を入力を促す
				System.out.println("開始月以上の値を入力してください:");
				//入力された月数を読み込む
				endMonth = inputMonth();
			}
		}

		//入力された日数を読み込む
		int endDate = inputDate(endYear, endMonth);
		//開始年月と終了年月が等しい場合
		if (startYear == endYear && startMonth == endMonth) {
			//期間開始日よりも少ない日数が入力された場合
			while (endDate < startDate) {
				//開始日以上の値を入力を促す
				System.out.println("開始日以上の値を入力してください:");
				//入力された日数を読み込む
				endDate = inputDate(endYear, endMonth);
			}
		}

		//期間開始日に関するインスタンスを生成
		Day endDay = new Day(endYear, endMonth, endDate);

		//入力された開始日・終了日を持つ期間インスタンスを生成
		Period particularPeriod = new Period(startDay, endDay);

		//入力された開始日・終了日を持つ期間の情報を表示
		System.out.println(particularPeriod);
	}
}
