package Chap10.Lists;

//Scannerのインポート
import java.util.Scanner;

/*
* クラス名:DayPeriodTester
* 概要:期間の開始日と終了日を入力させ、その期間の開始・終了を表示する
* 作成者:S.Hiruta
* 作成日:2024/05/16
*/
public class DayTester {

	//Scannerクラスの変数の定義
	static Scanner standardInput = new Scanner(System.in);
	
	/*
	 * 関数名：isLeap
	 * 概要:特定の年が閏年であるか判定
	 * 引数：年数(int型)
	 * 戻り値：閏年であればtrue、そうでなければfalse(boolean型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/14
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
	 * 作成日：2024/05/14
	*/
	static int outputMonthDayCount(int yearNumber, int monthNumber) {
		//年間における1～12月の日数を格納する定数配列を宣言(順番に1月～12月の日数を格納)
		//閏年の場合、2月の日数が変化
		final int[] MONTH_DAY_COUNT = { 31, (isLeap(yearNumber) ? 29 : 28), 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		//月数を日う列のインデックスに対応させる。該当の月の日数を返却
		return MONTH_DAY_COUNT[--monthNumber];
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
		int someYear = inputYear();

		//閏年であるかどうか表示
		System.out.println("その年は閏年" +
				(Day.isLeapYear(someYear) ? "です。" : "ではありません。"));

		//期間開始日の入力を促す
		System.out.println("期間開始日を入力してください。");
		//入力された年数を読み込む
		int paticularYear = inputYear();
		//入力された月数を読み込む
		int paticularMonth = inputMonth();
		//入力された日数を読み込む
		int paticularDate = inputDate(paticularYear, paticularMonth);

		//期間開始日に関するインスタンスを生成
		Day paticularDay = new Day(paticularYear, paticularMonth, paticularDate);

		//閏年であるかどうか表示
		System.out.println(paticularDay.getYear() + "年は閏年" +
				(paticularDay.isLeapYear(someYear) ? "です。" : "ではありません。"));

	}
}
