package Chap09.Exercises.Ex09_03;

//Scannerのインポート
import java.util.Scanner;

/*
* クラス名:AccountTster
* 概要:口座の情報と開設日を入力し、表示する
* 作成者:S.Hiruta
* 作成日:2024/05/15
*/
public class AccountTster {

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
		//グレゴリオ暦が採用された月を表す定数を宣言
		final int GUREGORIAN_MONTH = 10;
		//グレゴリオ暦が採用された日を表す定数を宣言
		final int GUREGORIAN_DAY = 15;
		//年の入力を促す
		System.out.print("何年?：");
		//入力された年の数値を読み込む
		int yearData = standardInput.nextInt();
		//グレゴリオ暦の範囲内で数値を入力させる
		while (yearData < GUREGORIAN_YEAR) {
			//グレゴリオ暦採用以降の日付の入力を促す
			System.out.println("グレゴリオ暦採用(" + GUREGORIAN_YEAR + "年)以降の年で入力してください。");
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
	 * 関数名：inputInteger
	 * 概要:0以上の整数を入力させる
	 * 引数：なし
	 * 戻り値：0以上の整数(long型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/15
	*/
	static long inputInteger() {
		long integralNumber = 0;
		//入力された整数を読み込む
		integralNumber = standardInput.nextLong();
		//入力された整数が負である場合
		while (integralNumber < 0) {
			//0以上の整数での入力を促す
			System.out.print("0以上の整数で入力してください;");
			//入力された整数を読み込む
			integralNumber = standardInput.nextLong();
		}
		//0以上の整数を返却
		return integralNumber;
	}

	/*
	 * 関数名：main
	 * 概要:口座の情報と開設日を入力し、表示する
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/15
	*/
	public static void main(String[] args) {

		//口座名義を入力させる
		System.out.print("口座名義；");
		//入力された口座名義を読み込む
		String accountName = standardInput.next();
		//口座番号を入力させる
		System.out.print("口座番号：");
		//入力された口座番号を読み込む
		String accountNumber = standardInput.next();
		//預金残高を入力させる
		System.out.print("預金残高：");
		//入力された預金残高を読み込む
		long depositBalance = inputInteger();

		//口座の情報に関するインスタンスを生成
		Account pticularAcccount = new Account(accountName, accountNumber, depositBalance);
		//口座の情報を表示
		pticularAcccount.putAccountSpec();

		//口座開設日の入力を促す
		System.out.println("口座開設日を入力してください。");
		//入力された年数を読み込む
		int openingYear = inputYear();
		//入力された月数を読み込む
		int openingMonth = inputMonth();
		//入力された日数を読み込む
		int openingDate = inputDate(openingYear, openingMonth);

		//口座開設日に関するインスタンスを生成
		Day openingDay = new Day(openingYear, openingMonth, openingDate);

		//口座の情報に関するインスタンスを生成
		Account acccountInformation = new Account(accountName, accountNumber, depositBalance, openingDay);
		//口座に関する全ての情報を表示
		System.out.println(acccountInformation.toString());
	}

}