package Chap10.Exercises.Ex10_04;

//Scannerのインポート
import java.util.Scanner;

public class DayTester2 {
	
	//Scannerクラスの変数の定義
		static Scanner standardInput = new Scanner(System.in);
		
		/*
		 * 関数名：inputIntegralNumber
		 * 概要:整数(int型)を入力させる
		 * 引数：入力内容の文言(String型)
		 * 戻り値：整数(int型)
		 * 作成者：S.Hiruta
		 * 作成日：2024/05/20
		*/
		static int inputIntegralNumber(String desplayIssue) {

			//選択の文言を表示
			System.out.print(desplayIssue);
			
			//入力された整数を読み込む
			int integralNumber = standardInput.nextInt();

			//入力された整数を返却
			return integralNumber;
		}
		
		/*
		 * 関数名：inputPlusInteger
		 * 概要:1以上の整数を入力させる
		 * 引数：入力条件の文言(String型)
		 * 戻り値：1以上の整数(int型)
		 * 作成者：S.Hiruta
		 * 作成日：2024/05/15
		*/
		static int inputPlusInteger(String desplayIssue) {

			//選択の文言を表示
			System.out.print(desplayIssue);

			//入力される整数を格納する変数を宣言
			int integralNumber = 0;
			//入力された整数を読み込む
			integralNumber = standardInput.nextInt();
			//入力された整数が0以下である場合
			while (integralNumber <= 0) {
				//1以上の整数での入力を促す
				System.out.print("1以上の整数で入力してください;");
				//入力された整数を読み込む
				integralNumber = standardInput.nextInt();
			}
			//1以上の整数を返却
			return integralNumber;
		}
		
		/*
		 * 関数名：isTrueFalse
		 * 概要:0か1での入力をさせる。0ならfalse、1ならtrueを返却
		 * 引数：選択の文言(String型)
		 * 戻り値：true,false(booolean型)
		 * 作成者：S.Hiruta
		 * 作成日：2024/05/17
		*/
		static boolean isTrueFalse(String desplayIssue) {

			//選択の文言を表示
			System.out.print(desplayIssue + "[0…No/1…Yes]：");

			//選択結果を格納する変数を定義
			boolean judgeBoolean = true;

			//trueを返却する選択を表す定数を定義
			final int RETURN_TRUE = 1;
			//trueを返却する選択を表す定数を定義
			final int RETURN_FALSE = 0;

			//入力された選択を読み込む
			int judgementValue = standardInput.nextInt();
			//0か1が入力されるまで選択を迫る
			while (judgementValue != RETURN_TRUE && judgementValue != RETURN_FALSE) {
				//0か1での入力を促す
				System.out.print("0か1で入力してください：");
				//入力された選択を読み込む
				judgementValue = standardInput.nextInt();
			}
			//0が入力された場合、falseを返却値に格納
			if (judgementValue == RETURN_FALSE) {
				//falseを返却値に格納
				judgeBoolean = false;
			}

			//0か1(falseかtrue)の選択結果を返却する
			return judgeBoolean;
		}
		
		/*
		 * 関数名：inputDate
		 * 概要:年・月・日の数値を入力させ、それをまとめた配列を返却する
		 * 引数：なし
		 * 戻り値：年・月・日の情報をまとめた配列(int型)
		 * 作成者：S.Hiruta
		 * 作成日：2024/05/20
		*/
		static int[] inputDate() {
			
			//年・月・日の数値を入力を促す
			System.out.println("年・月・日の数値を入力してください");
			//日付の要素である「年・月・日」の個数を表す3を定数化
			final int DATE_FACOR_COUNT = 3;
			//日付の情報を格納する配列を宣言
			int[] dateFactor = new int[DATE_FACOR_COUNT];
			
			//年数を入力させる
			dateFactor[0] = inputIntegralNumber("年数：");
			//月数を入力させる
			dateFactor[1] = inputIntegralNumber("月数：");
			//日数を入力させる
			dateFactor[2] = inputIntegralNumber("日数：");
			
			//日付の情報を格納した配列を返却
			return dateFactor;
		}
		
		public static void main(String[] args) {
			//繰り返し可能の処理
			do {
			//処理の説明
			System.out.println("数日前の日付を表示します。\n");

			//年数・月数・日数を入力させる
			int[] eleventhDate = inputDate();
			//入力された年数・月数・日数を引数としてインスタンスを生成
			Day fourteenthDay = new Day(eleventhDate[0], eleventhDate[1], eleventhDate[2]);
			//戻る日数を入力させる
			int returnCount = inputPlusInteger("何日戻りますか?：");
			
			//数日前の日付を変数に置き換える
			Day assignmentDay = new Day(fourteenthDay.returnReturnedDays(returnCount));

			//指定日数前の日付のインスタンスを表示
			System.out.println("\n返却された日付：" + assignmentDay);
			//入力された日付から指定日数だけ戻った日付を表示
			assignmentDay.printReturnedDay(assignmentDay);

			//見やすくするため改行
			System.out.println();
			
			//処理を繰り返すか選択
			} while (isTrueFalse("もう一度?"));
		}

}
