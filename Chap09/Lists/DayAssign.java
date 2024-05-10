package Chap09.Lists;

//Scannerのインポート
import java.util.Scanner;

/*
* クラス名:DayAssign(List09_03)
* 概要:生年月日を入力させ、その曜日も含めて表示する
* 作成者:S.Hiruta
* 作成日:2024/05/10
*/
public class DayAssign {
	
	/*
	 * 関数名：main
	 * 概要:生年月日を入力させ、その曜日も含めて表示する
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/10
	*/
	public static void main(String[] args) {
		
		//Scannerクラスの変数の定義
		 Scanner standardInput = new Scanner(System.in);
		 
		//一週間の曜日の名称を格納する変数を宣言
		 String[] weekDays = {"日", "月", "火", "水", "木", "金", "土",};
		 
		 //誕生日を西暦で入力するように促す
		 System.out.println("誕生日を西暦で入力せよ。");
		 //年の入力を促す
		 System.out.print("年:");
		 //入力された年を読み込む
		 int yearData = standardInput.nextInt();
		 //月の入力を促す
		 System.out.print("月:");
		 //入力された月を読み込む
		 int monthData = standardInput.nextInt();
		 //日の入力を促す
		 System.out.print("日:");
		 //入力された日を読み込む
		 int dateData = standardInput.nextInt();
		 
		 //入力者の誕生日に関するインスタンスを生成
		 Day myBirthDay = new Day(yearData, monthData, dateData);
		 
		 //誕生日の表示を始める
		 System.out.println("あなたの誕生日は\n"
				 			//誕生年を表示する
				 			+ myBirthDay.getYear() + "年"
				 			//誕生月を表示する
				 			+ myBirthDay.getMonth() + "月"
				 			//誕生日を表示する
				 			+ myBirthDay.getDate() + "日"
				 			//誕生した曜日を表示する
				 			+ weekDays[(myBirthDay.deriveDayOfWeek())] + "曜日です。");
		 
		 //入力者の誕生日に関するインスタンスを参照するインスタンスを生成
		 Day paticularDate = myBirthDay;
		 
		 //誕生日を西暦で入力するように促す
		 System.out.println("誕生日を西暦で入力せよ。");
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
		 
		 //入力された値をフィールドの値に設定
		 paticularDate.setData(secondYearData, secondMonthData, secondDateData);
		 
		//誕生日の表示を始める
		 System.out.println("myBirthDay = "
				 			//誕生年を表示する
				 			+ myBirthDay.getYear() + "年"
				 			//誕生月を表示する
				 			+ myBirthDay.getMonth() + "月"
				 			//誕生日を表示する
				 			+ myBirthDay.getDate() + "日("
				 			//誕生した曜日を表示する
				 			+ weekDays[(myBirthDay.deriveDayOfWeek())] + ")");
		 
		//とある日の表示を始める
		 System.out.println("paticularDay = "
				 			//誕生年を表示する
				 			+ paticularDate.getYear() + "年"
				 			//誕生月を表示する
				 			+ paticularDate.getMonth() + "月"
				 			//誕生日を表示する
				 			+ paticularDate.getDate() + "日("
				 			//誕生した曜日を表示する
				 			+ weekDays[(paticularDate.deriveDayOfWeek())] + ")");
	}

}
