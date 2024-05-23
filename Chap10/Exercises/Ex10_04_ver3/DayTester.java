package Chap10.Exercises.Ex10_04_ver3;

//Scannerのインポート
import java.util.Scanner;

/*
* クラス名:DayTester
* 概要:Dayクラス[第4版]をテストする
* 作成者:S.Hiruta
* 作成日:2024/05/20
*/
public class DayTester {

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
		System.out.println("年・月・日の数値を入力してください。\n");
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

	/*
	 * 関数名：main
	 * 概要:Dayクラス[第4版]をテストする
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/20
	*/
	public static void main(String[] args) {

		//実行日が初期値となっていることを示す
		System.out.println("静的初期化子が働き、実行日が初期値となります。\n");
		//引数なしでインスタンスを生成
		Day defaultDay = new Day();
		//初期値として実行日が表示される
		System.out.println(defaultDay);

		//見やすくするため改行
		System.out.println();

		//年・月・日を順に初期化して宣言していく
		//繰り返し可能の処理
		do {
			//処理の説明
			System.out.println("年・月・日を順に初期化して宣言していきます。\n");

			//引数に用いる年数・月数・日数を入力させる
			int[] firstDate = inputDate();

			//年数を引数としてインスタンスを生成
			Day firstDay = new Day(firstDate[0]);
			//生成したインスタンスを表示
			System.out.println("\n" + firstDay);

			//見やすくするため改行
			System.out.println();

			//年数を引数としてインスタンスを生成
			Day secondDay = new Day(firstDate[0], firstDate[1]);
			//生成したインスタンスを表示
			System.out.println(secondDay);

			//見やすくするため改行
			System.out.println();

			//年数・月数・日数を引数としてインスタンスを生成
			Day thirdDay = new Day(firstDate[0], firstDate[1], firstDate[2]);
			//生成したインスタンスを表示
			System.out.println(thirdDay);

			//見やすくするため改行
			System.out.println();

			//処理を繰り返すか選択
		} while (isTrueFalse("もう一度?"));

		//見やすくするため改行
		System.out.println();

		//日付の年間における経過日数を表示
		//繰り返し可能の処理
		do {
			//処理の説明
			System.out.println("日付の年間における経過日数を表示します。\n");

			//年数・月数・日数を入力させる
			int[] secondDate = inputDate();
			//入力された年数・月数・日数を引数としてインスタンスを生成
			Day forthDay = new Day(secondDate[0], secondDate[1], secondDate[2]);

			//その日付の年間における経過日数を表示
			System.out.println("経過日数：" + forthDay.calculateElapsedDays());

			//見やすくするため改行
			System.out.println();

			//処理を繰り返すか選択
		} while (isTrueFalse("もう一度?"));

		//見やすくするため改行
		System.out.println();

		//日付の年間における残り日数を表示
		//繰り返し可能の処理
		do {
			//処理の説明
			System.out.println("日付の年間における残り日数を表示していきます。\n");

			//年数・月数・日数を入力させる
			int[] thirdDate = inputDate();
			//入力された年数・月数・日数を引数としてインスタンスを生成
			Day fifthDay = new Day(thirdDate[0], thirdDate[1], thirdDate[2]);

			//日付の年間における残り日数を表示
			System.out.println("残り日数" + fifthDay.caluculateRemainingDays());

			//見やすくするため改行
			System.out.println();

			//処理を繰り返すか選択
		} while (isTrueFalse("もう一度?"));

		//見やすくするため改行
		System.out.println();

		//2つの日数の比較(インスタンス変数)
		//繰り返し可能の処理
		do {
			//処理の説明
			System.out.println("2つの日数の比較します(インスタンス変数)。\n");

			//年数・月数・日数を入力させる
			int[] forthDate = inputDate();
			//入力された年数・月数・日数を引数としてインスタンスを生成
			Day sixthDay = new Day(forthDate[0], forthDate[1], forthDate[2]);

			//年数・月数・日数を入力させる
			int[] fifthDate = inputDate();
			//入力された年数・月数・日数を引数としてインスタンスを生成
			Day seventhDay = new Day(fifthDate[0], fifthDate[1], fifthDate[2]);

			//入力された2つの日数の比較し、結果を表示。
			System.out.println(seventhDay.compareOtherDay(sixthDay));

			//見やすくするため改行
			System.out.println();

			//処理を繰り返すか選択
		} while (isTrueFalse("もう一度?"));

		//見やすくするため改行
		System.out.println();

		//2つの日数の比較(クラス変数)
		//繰り返し可能の処理
		do {
			//処理の説明
			System.out.println("2つの日数の比較します(クラス変数)。\n");

			//年数・月数・日数を入力させる
			int[] sixthDate = inputDate();
			//入力された年数・月数・日数を引数としてインスタンスを生成
			Day eigthDay = new Day(sixthDate[0], sixthDate[1], sixthDate[2]);

			//年数・月数・日数を入力させる
			int[] seventhDate = inputDate();
			//入力された年数・月数・日数を引数としてインスタンスを生成
			Day ninthDay = new Day(seventhDate[0], seventhDate[1], seventhDate[2]);

			//クラスメソッドを利用するため、引数なしでインスタンスを生成
			Day tenthDay = new Day();
			//引数なしで生成したインスタンスのクラスメソッドを利用して入力された2つの日付を比較
			System.out.println(tenthDay.compareOtherDay(eigthDay, ninthDay));

			//見やすくするため改行
			System.out.println();

			//処理を繰り返すか選択
		} while (isTrueFalse("もう一度?"));

		//見やすくするため改行
		System.out.println();

		//1日後の日付を表示
		//繰り返し可能の処理
		do {
			//処理の説明
			System.out.println("1日後の日付を表示します(日付を進行させるメソッド)。\n");

			//年数・月数・日数を入力させる
			int[] eigthDate = inputDate();
			//入力された年数・月数・日数を引数としてインスタンスを生成
			Day eleventhDay = new Day(eigthDate[0], eigthDate[1], eigthDate[2]);

			//日付を1日進行させる
			eleventhDay.advanceDay();
			//入力された日付の1日後の日付を表示
			System.out.println(eleventhDay);

			//見やすくするため改行
			System.out.println();

			//処理を繰り返すか選択
		} while (isTrueFalse("もう一度?"));

		//見やすくするため改行
		System.out.println();

		//1日後の日付を表示
		//繰り返し可能の処理
		do {
			//処理の説明
			System.out.println("1日後の日付を表示します(進行させた日付を返却するメソッド)。\n");

			//年数・月数・日数を入力させる
			int[] eigthDate = inputDate();
			//入力された年数・月数・日数を引数としてインスタンスを生成
			Day eleventhDay = new Day(eigthDate[0], eigthDate[1], eigthDate[2]);

			//入力された日付の1日後の日付を表示
			System.out.println(eleventhDay.returnAdvanceDay());

			//見やすくするため改行
			System.out.println();

			//処理を繰り返すか選択
		} while (isTrueFalse("もう一度?"));

		//見やすくするため改行
		System.out.println();

		//1日前の日付を表示
		//繰り返し可能の処理
		do {
			//処理の説明
			System.out.println("1日前の日付を表示します(日付を戻すメソッド)。\n");

			//年数・月数・日数を入力させる
			int[] ninthDate = inputDate();
			//入力された年数・月数・日数を引数としてインスタンスを生成
			Day twelfthDay = new Day(ninthDate[0], ninthDate[1], ninthDate[2]);

			//入力された日付の1日前の日付を表示
			System.out.println(twelfthDay.returnReturnedDay());

			//見やすくするため改行
			System.out.println();

			//処理を繰り返すか選択
		} while (isTrueFalse("もう一度?"));

		//見やすくするため改行
		System.out.println();

		//1日前の日付を表示
		//繰り返し可能の処理
		do {
			//処理の説明
			System.out.println("1日前の日付を表示します(戻した日付を表示するメソッド)。\n");

			//年数・月数・日数を入力させる
			int[] ninthDate = inputDate();
			//入力された年数・月数・日数を引数としてインスタンスを生成
			Day twelfthDay = new Day(ninthDate[0], ninthDate[1], ninthDate[2]);

			//日付を一日戻す
			twelfthDay.returnDay();

			//入力された日付の1日前の日付を表示
			System.out.println(twelfthDay);

			//見やすくするため改行
			System.out.println();

			//処理を繰り返すか選択
		} while (isTrueFalse("もう一度?"));

		//見やすくするため改行
		System.out.println();

		//数日後の日付を表示
		//繰り返し可能の処理
		do {
			//処理の説明
			System.out.println("数日後の日付を表示します(指定日数分、日付を進行させるメソッド)。\n");

			//年数・月数・日数を入力させる
			int[] tenthDate = inputDate();
			//入力された年数・月数・日数を引数としてインスタンスを生成
			Day thirteenthDay = new Day(tenthDate[0], tenthDate[1], tenthDate[2]);
			//進める日数を入力させる
			int advanceCount = inputPlusInteger("何日進めますか?：");

			//入力された日付から指定日数だけ進んだ日付を表示
			System.out.println(thirteenthDay.returnAdvancedDays(advanceCount));

			//見やすくするため改行
			System.out.println();

			//処理を繰り返すか選択
		} while (isTrueFalse("もう一度?"));

		//見やすくするため改行
		System.out.println();

		//数日後の日付を表示
		//繰り返し可能の処理
		do {
			//処理の説明
			System.out.println("数日後の日付を表示します(指定日数分進行させた日付を返却するメソッド)。\n");

			//年数・月数・日数を入力させる
			int[] tenthDate = inputDate();
			//入力された年数・月数・日数を引数としてインスタンスを生成
			Day thirteenthDay = new Day(tenthDate[0], tenthDate[1], tenthDate[2]);
			//進める日数を入力させる
			int advanceCount = inputPlusInteger("何日進めますか?：");

			//指定日数だけ日付を進行させる
			thirteenthDay.advanceDays(advanceCount);

			//入力された日付から指定日数だけ進んだ日付を表示
			System.out.println(thirteenthDay);

			//見やすくするため改行
			System.out.println();

			//処理を繰り返すか選択
		} while (isTrueFalse("もう一度?"));

		//見やすくするため改行
		System.out.println();

		//数日前の日付を表示
		//繰り返し可能の処理
		do {
			//処理の説明
			System.out.println("数日前の日付を表示します(指定日数分、日付を戻すメソッド)。\n");

			//年数・月数・日数を入力させる
			int[] eleventhDate = inputDate();
			//入力された年数・月数・日数を引数としてインスタンスを生成
			Day fourteenthDay = new Day(eleventhDate[0], eleventhDate[1], eleventhDate[2]);
			//戻る日数を入力させる
			int returnCount = inputPlusInteger("何日戻りますか?：");

			//入力された日付から指定日数だけ戻った日付を表示
			System.out.println(fourteenthDay.returnReturnedDays(returnCount));

			//見やすくするため改行
			System.out.println();

			//処理を繰り返すか選択
		} while (isTrueFalse("もう一度?"));

		//数日前の日付を表示
		//繰り返し可能の処理
		do {
			//処理の説明
			System.out.println("数日前の日付を表示します(指定日数分戻した日付を返却するメソッド)。\n");

			//年数・月数・日数を入力させる
			int[] eleventhDate = inputDate();
			//入力された年数・月数・日数を引数としてインスタンスを生成
			Day fourteenthDay = new Day(eleventhDate[0], eleventhDate[1], eleventhDate[2]);
			//戻る日数を入力させる
			int returnCount = inputPlusInteger("何日戻りますか?：");
			
			//指定日数だけ日付を戻す
			fourteenthDay.returnDays(returnCount);

			//入力された日付から指定日数だけ戻った日付を表示
			System.out.println(fourteenthDay);

			//見やすくするため改行
			System.out.println();

			//処理を繰り返すか選択
		} while (isTrueFalse("もう一度?"));

	}
}
