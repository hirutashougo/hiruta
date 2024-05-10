package Chap09.Lists;

//Scannerのインポート
import java.util.Scanner;

/*
* クラス名:DayAssign1(List09_04)
* 概要:2つの日付を入力させ、等しいか比較する
* 作成者:S.Hiruta
* 作成日:2024/05/10
*/
public class DayComparator1 {

	/*
	 * 関数名：main
	 * 概要:2つの日付を入力させ、等しいか比較する(インスタンスごとの比較のため常に等しくない)
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/10
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
		Day firstDate = new Day(firstYearData, firstMonthData, firstDateData);

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
		Day secondDate = new Day(secondYearData, secondMonthData, secondDateData);
		
		//日付(その1)と日付(その2)が等しい場合
		if (firstDate == secondDate) {
			//等しいと表示
			System.out.println("等しいです。");
			//日付(その1)と日付(その2)が等しくない場合
		} else {
			//等しくないと表示
			System.out.println("等しくないです。");
		}
	}

}
