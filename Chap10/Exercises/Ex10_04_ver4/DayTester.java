package Chap10.Exercises.Ex10_04_ver4;

//Scannerのインポート
import java.util.Scanner;

/*
* クラス名:DayTester
* 概要:Dayクラスをテストする
* 作成者:S.Hiruta
* 作成日:2024/05/20
*/
public class DayTester {

	//Scannerクラスの変数の定義
	static Scanner standardInput = new Scanner(System.in);
	
	//日付の情報を格納する配列に関する定数
	//年数を格納する要素のインデックス数を定数化
	static final int YEAR_INDEX = 0;
	//月数を格納する要素のインデックス数を定数化
	static final int MONTH_INDEX = 1;
	//日数を格納する要素のインデックス数を定数化
	static final int DATE_INDEX = 2;

	/*
	 * 関数名：inputIntegralNumber
	 * 概要:整数(int型)を入力させる
	 * 引数：入力内容の文言(String型)
	 * 戻り値：整数(int型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/20
	*/
	static int inputIntegralNumber(String desplayIssue) {

		//入力内容の文言を表示
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

		//入力条件の文言を表示
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
		//日付の要素である「年・月・日」の個数を定数化
		final int DATE_FACOR_COUNT = 3;
		//日付の情報を格納する配列を宣言
		int[] dateFactor = new int[DATE_FACOR_COUNT];

		//年数を入力させる
		dateFactor[YEAR_INDEX] = inputIntegralNumber("年数：");
		//月数を入力させる
		dateFactor[MONTH_INDEX] = inputIntegralNumber("月数：");
		//日数を入力させる
		dateFactor[DATE_INDEX] = inputIntegralNumber("日数：");

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

		//実行日が初期値となっていることを示す、と説明
		System.out.println("静的初期化子が働き、実行日が初期値となります。\n");
		//引数なしで実行日が初期値となるインスタンスを生成
		Day defaultDay = new Day();
		//初期値として実行日が表示される
		System.out.println(defaultDay);

		//見やすくするため改行
		System.out.println();

		//年・月・日を順に初期化して宣言していく
		//繰り返し可能の処理
		do {
			//年・月・日を順に初期化して宣言していく、処理の説明
			System.out.println("年・月・日を順に初期化して宣言していきます。\n");

			/*各フィールドを個別に初期化しても、他の初期値が実行日の情報となっているか確かめるための
			 * インスタンスに用いる年数・月数・日数を入力させる*/
			int[] initializeDay = inputDate();

			//年数を引数としてインスタンスを生成
			Day yearInitializeDay = new Day(initializeDay[YEAR_INDEX]);
			//生成したインスタンスを表示
			System.out.println("\n" + yearInitializeDay);

			//見やすくするため改行
			System.out.println();

			//年数を引数としてインスタンスを生成
			Day yearMonthInitializeDay = new Day(initializeDay[YEAR_INDEX], initializeDay[MONTH_INDEX]);
			//生成したインスタンスを表示
			System.out.println(yearMonthInitializeDay);

			//見やすくするため改行
			System.out.println();

			//年数・月数・日数を引数としてインスタンスを生成
			Day allInitializeDay = new Day(initializeDay[YEAR_INDEX], initializeDay[MONTH_INDEX], initializeDay[DATE_INDEX]);
			//生成したインスタンスを表示
			System.out.println(allInitializeDay);

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
			System.out.println("日付の年間における経過日数を表示します。\n当日は含みません。\n");

			//年間における経過日数を求めるためのインスタンスに用いる年数・月数・日数を入力させる
			int[] dayData = inputDate();
			//入力された年数・月数・日数を引数としてインスタンスを生成
			Day standardDay = new Day(dayData[YEAR_INDEX], dayData[MONTH_INDEX], dayData[DATE_INDEX]);

			//その日付の年間における経過日数を表示
			System.out.println("経過日数：" + standardDay.calculateElapsedDays());

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
			System.out.println("日付の年間における残り日数を表示していきます。\n当日は含みません。\n");

			//年間における残り日数を求めるためのインスタンスに用いる年数・月数・日数を入力させる
			int[] dayData = inputDate();
			//入力された年数・月数・日数を引数としてインスタンスを生成
			Day standardDay = new Day(dayData[YEAR_INDEX], dayData[MONTH_INDEX], dayData[DATE_INDEX]);

			//日付の年間における残り日数を表示
			System.out.println("残り日数" + standardDay.caluculateRemainingDays());

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

			//比較元となる日付のインスタンスに用いる年数・月数・日数を入力させる
			int[] firstDayData = inputDate();
			//入力された年数・月数・日数を引数としてインスタンスを生成
			Day standardDay = new Day(firstDayData[YEAR_INDEX], firstDayData[MONTH_INDEX], firstDayData[DATE_INDEX]);

			//比較対象となる日付のインスタンスに用いる年数・月数・日数を入力させる
			int[] secondDayData = inputDate();
			//入力された年数・月数・日数を引数としてインスタンスを生成
			Day compareDay = new Day(secondDayData[YEAR_INDEX], secondDayData[MONTH_INDEX], secondDayData[DATE_INDEX]);

			//入力された2つの日数の比較し、結果を表示。
			System.out.println(compareDay.compareOtherDay(standardDay));

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

			//比較に用いる1つめの日付のインスタンスに用いる年数・月数・日数を入力させる
			int[] firstDayData = inputDate();
			//入力された年数・月数・日数を引数としてインスタンスを生成
			Day firstCompareDay = new Day(firstDayData[YEAR_INDEX], firstDayData[MONTH_INDEX], firstDayData[DATE_INDEX]);

			//比較に用いる2つめの日付のインスタンスに用いる年数・月数・日数を入力させる
			int[] secondDayData = inputDate();
			//入力された年数・月数・日数を引数としてインスタンスを生成
			Day secondCompareDay = new Day(secondDayData[YEAR_INDEX], secondDayData[MONTH_INDEX], secondDayData[DATE_INDEX]);

			//クラスメソッドを利用するため、引数なしで元となるインスタンスを生成
			Day criteriaDay = new Day();
			//引数なしで生成したインスタンスのクラスメソッドを利用して入力された2つの日付を比較
			System.out.println(criteriaDay.compareOtherDay(firstCompareDay, secondCompareDay));

			//見やすくするため改行
			System.out.println();

			//処理を繰り返すか選択
		} while (isTrueFalse("もう一度?"));

		//見やすくするため改行
		System.out.println();

		//1日後の日付を表示(日付を進行させるメソッド)
		//繰り返し可能の処理
		do {
			//処理の説明
			System.out.println("1日後の日付を表示します(日付を進行させるメソッド)。\n");

			//1日進行させるための、元となるの日付のインスタンスに用いる年数・月数・日数を入力させる
			int[] dayData = inputDate();
			//入力された年数・月数・日数を引数としてインスタンスを生成
			Day criteriaDay = new Day(dayData[YEAR_INDEX], dayData[MONTH_INDEX], dayData[DATE_INDEX]);

			//日付を1日進行させる
			criteriaDay.advanceDay();
			//入力された日付の1日後の日付を表示
			System.out.println(criteriaDay);

			//見やすくするため改行
			System.out.println();

			//処理を繰り返すか選択
		} while (isTrueFalse("もう一度?"));

		//見やすくするため改行
		System.out.println();

		//1日後の日付を表示(進行させた日付を返却するメソッド)
		//繰り返し可能の処理
		do {
			//処理の説明
			System.out.println("1日後の日付を表示します(進行させた日付を返却するメソッド)。\n");

			//1日進行させるための、元となるの日付のインスタンスに用いる年数・月数・日数を入力させる
			int[] dayData = inputDate();
			//入力された年数・月数・日数を引数としてインスタンスを生成
			Day criteriaDay = new Day(dayData[YEAR_INDEX], dayData[MONTH_INDEX], dayData[DATE_INDEX]);

			//入力された日付の1日後の日付を表示
			System.out.println(criteriaDay.returnAdvanceDay());

			//見やすくするため改行
			System.out.println();

			//処理を繰り返すか選択
		} while (isTrueFalse("もう一度?"));

		//見やすくするため改行
		System.out.println();

		//1日前の日付を表示(1日前の日付を戻すメソッド)
		//繰り返し可能の処理
		do {
			//処理およびの範囲最小日(1年1月1日)に関する説明
			System.out.println("1日前の日付を表示します(1日前に日付を戻すメソッド)。\n1年1月1日より前には遡らず、1年1月1日に設定されます。\n");

			//1日戻すための、元となるの日付のインスタンスに用いる年数・月数・日数を入力させる
			int[] dayData = inputDate();
			//入力された年数・月数・日数を引数としてインスタンスを生成
			Day criteriaDay = new Day(dayData[YEAR_INDEX], dayData[MONTH_INDEX], dayData[DATE_INDEX]);

			//入力された日付の1日前の日付を表示
			System.out.println(criteriaDay.returnReturnedDay());

			//見やすくするため改行
			System.out.println();

			//処理を繰り返すか選択
		} while (isTrueFalse("もう一度?"));

		//見やすくするため改行
		System.out.println();

		//1日前の日付を表示(戻した日付を返却するメソッド)
		//繰り返し可能の処理
		do {
			//処理およびの範囲最小日(1年1月1日)に関する説明
			System.out.println("1日前の日付を表示します(戻した日付を返却するメソッド)。\n1年1月1日より前には遡らず、1年1月1日に設定されます。\n");

			//1日戻すための、元となるの日付のインスタンスに用いる年数・月数・日数を入力させる
			int[] dayData = inputDate();
			//入力された年数・月数・日数を引数としてインスタンスを生成
			Day criteriaDay = new Day(dayData[YEAR_INDEX], dayData[MONTH_INDEX], dayData[DATE_INDEX]);

			//日付を一日戻す
			criteriaDay.returnDay();

			//入力された日付の1日前の日付を表示
			System.out.println(criteriaDay);

			//見やすくするため改行
			System.out.println();

			//処理を繰り返すか選択
		} while (isTrueFalse("もう一度?"));

		//見やすくするため改行
		System.out.println();

		//数日後の日付を表示(指定日数分、日付を進行させるメソッド)
		//繰り返し可能の処理
		do {
			//処理の説明
			System.out.println("数日後の日付を表示します(指定日数分、日付を進行させるメソッド)。\n");

			//数日進行するための、元となるの日付のインスタンスに用いる年数・月数・日数を入力させる
			int[] dayData = inputDate();
			//入力された年数・月数・日数を引数としてインスタンスを生成
			Day criteriaDay = new Day(dayData[YEAR_INDEX], dayData[MONTH_INDEX], dayData[DATE_INDEX]);
			//進める日数を入力させる
			int advanceCount = inputPlusInteger("何日進めますか?：");

			//入力された日付から指定日数分だけ進んだ日付を表示
			System.out.println(criteriaDay.returnAdvancedDays(advanceCount));

			//見やすくするため改行
			System.out.println();

			//処理を繰り返すか選択
		} while (isTrueFalse("もう一度?"));

		//見やすくするため改行
		System.out.println();

		//数日後の日付を表示(指定日数分進行させた日付を返却するメソッド)
		//繰り返し可能の処理
		do {
			//処理の説明
			System.out.println("数日後の日付を表示します(指定日数分進行させた日付を返却するメソッド)。\n");

			//数日進行するための、元となるの日付のインスタンスに用いる年数・月数・日数を入力させる
			int[] dayData = inputDate();
			//入力された年数・月数・日数を引数としてインスタンスを生成
			Day criteriaDay = new Day(dayData[YEAR_INDEX], dayData[MONTH_INDEX], dayData[DATE_INDEX]);
			//進める日数を入力させる
			int advanceCount = inputPlusInteger("何日進めますか?：");

			//指定日数だけ日付を進行させる
			criteriaDay.advanceDays(advanceCount);

			//入力された日付から指定日数分だけ進んだ日付を表示
			System.out.println(criteriaDay);

			//見やすくするため改行
			System.out.println();

			//処理を繰り返すか選択
		} while (isTrueFalse("もう一度?"));

		//見やすくするため改行
		System.out.println();

		//数日前の日付を表示(指定日数分、日付を戻すメソッド)
		//繰り返し可能の処理
		do {
			//処理およびの範囲最小日(1年1月1日)に関する説明
			System.out.println("数日前の日付を表示します(指定日数分、日付を戻すメソッド)。\n1年1月1日より前には遡らず、1年1月1日に設定されます\n");

			//数日戻るための、元となるの日付のインスタンスに用いる年数・月数・日数を入力させる
			int[] dayData = inputDate();
			//入力された年数・月数・日数を引数としてインスタンスを生成
			Day criteriaDay = new Day(dayData[YEAR_INDEX], dayData[MONTH_INDEX], dayData[DATE_INDEX]);
			//戻る日数を入力させる
			int returnCount = inputPlusInteger("何日戻りますか?：");

			//入力された日付から指定日数分だけ戻った日付を表示
			System.out.println(criteriaDay.returnReturnedDays(returnCount));

			//見やすくするため改行
			System.out.println();

			//処理を繰り返すか選択
		} while (isTrueFalse("もう一度?"));

		//数日前の日付を表示(指定日数分戻した日付を返却するメソッド)
		//繰り返し可能の処理
		do {
			//処理およびの範囲最小日(1年1月1日)に関する説明
			System.out.println("数日前の日付を表示します(指定日数分戻した日付を返却するメソッド)。\n1年1月1日より前には遡らず、1年1月1日に設定されます\n");

			//数日戻るための、元となるの日付のインスタンスに用いる年数・月数・日数を入力させる
			int[] dayData = inputDate();
			//入力された年数・月数・日数を引数としてインスタンスを生成
			Day criteriaDay = new Day(dayData[YEAR_INDEX], dayData[MONTH_INDEX], dayData[DATE_INDEX]);
			//戻る日数を入力させる
			int returnCount = inputPlusInteger("何日戻りますか?：");
			
			//指定日数分だけ日付を戻す
			criteriaDay.returnDays(returnCount);

			//入力された日付から指定日数分だけ戻った日付を表示
			System.out.println(criteriaDay);

			//見やすくするため改行
			System.out.println();

			//処理を繰り返すか選択
		} while (isTrueFalse("もう一度?"));

	}
}
