package Chap09.Lists.Day;

//Scannerのインポート
import java.util.Scanner;

/*
* クラス名:DayAssign3(List09_06)
* 概要:2つの日付を入力させ、等しいか比較する
* 作成者:S.Hiruta
* 作成日:2024/05/13
*/
public class DayComparator3 {

	/*
	 * 関数名：compareDay
	 * 概要:入力された2つの日付が等しいか比較する
	 * 引数：二つの日付
	 * 戻り値：true,false
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/13
	*/
	static boolean compareDay(Day1 firstDay, Day1 secondDay) {
		//返却する値を変数に格納しておく
		boolean returnValue = false;
		//1つめの日付と2つめの日付が等しい場合
		if (firstDay.getYear() == secondDay.getYear() && firstDay.getMonth() == secondDay.getMonth() && firstDay.getDate() == secondDay.getDate()) {
			//返却値にtrueを格納する
			returnValue = true;
		}
		//最終的な返却値を返却する
		return returnValue;
	}

	/*
	 * 関数名：main
	 * 概要:2つの日付を入力させ、等しいか比較する
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/13
	*/
	public static void main(String[] args) {

		//Scannerクラスの変数の定義
		Scanner standardInput = new Scanner(System.in);

		//日付(その1)を西暦で入力するように促す
		System.out.println("日付(その1)を西暦で入力せよ。");
		//年の入力を促す
		System.out.print("年:");
		//入力された年を読み込む
		int firstYearData = standardInput.nextInt();
		//月の入力を促す
		System.out.print("月:");
		//入力された月を読み込む
		int firstMonthData = standardInput.nextInt();
		//日の入力を促す
		System.out.print("日:");
		//入力された日を読み込む
		int firstDateData = standardInput.nextInt();

		//日付(その1)に関するインスタンスを生成
		Day1 firstDate = new Day1(firstYearData, firstMonthData, firstDateData);

		//日付(その2)を西暦で入力するように促す
		System.out.println("日付(その2)を西暦で入力せよ。");
		//年の入力を促す
		System.out.print("年:");
		//入力された年を読み込む
		int secondYearData = standardInput.nextInt();
		//月の入力を促す
		System.out.print("月:");
		//入力された月を読み込む
		int secondMonthData = standardInput.nextInt();
		//日の入力を促す
		System.out.print("日:");
		//入力された日を読み込む
		int secondDateData = standardInput.nextInt();

		//日付(その2)に関するインスタンスを生成
		Day1 secondDate = new Day1(secondYearData, secondMonthData, secondDateData);

		//二つの日付が等しい場合
		if (compareDay(firstDate, secondDate)) {
			//等しいと表示
			System.out.println("等しいです。");
			//二つの日付が等しくない場合
		} else {
			//等しくないと表示
			System.out.println("等しくないです。");
		}
	}

}
