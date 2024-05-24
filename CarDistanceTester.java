
//Scannerのインポート
import java.util.Scanner;

//carパッケージのCarDistanceクラスを単一インポート宣言
import car.CarDistance;
//dayパッケージのDayクラスを単一インポート宣言
import day.Day;

/*
* クラス名:CarDistanceTester
* 概要:CarDistanceのテストを行う(演習12_01)
* 作成者:S.Hiruta
* 作成日:2024/05/24
*/
public class CarDistanceTester {

	//Scannerクラスの変数の定義
	static Scanner standardInput = new Scanner(System.in);

	//日付の情報を格納する配列に関する定数
	//年数を格納する要素のインデックス数を定数化
	static final int YEAR_INDEX = 0;
	//月数を格納する要素のインデックス数を定数化
	static final int MONTH_INDEX = 1;
	//日数を格納する要素のインデックス数を定数化
	static final int DATE_INDEX = 2;

	//月数の上限を定数化
	static final int MAXIMUM_MONTH = 12;
	//月数の下限を定数化
	static final int MINIMUM_MONTH = 1;

	/*
	 * 関数名：inputIntegralNumber
	 * 概要:正の整数(int型)を入力させる
	 * 引数：入力内容の文言(String型)
	 * 戻り値：正の整数(int型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/24
	*/
	static int inputIntegralNumber(String desplayIssue) {

		//入力内容の文言を表示
		System.out.print(desplayIssue);

		//入力された整数を読み込む
		int integralNumber = standardInput.nextInt();

		//入力された整数が0以下の場合
		while (integralNumber <= 0) {
			//正の整数での入力を促す
			System.out.print("正の整数で入力：");
			//再度、入力された整数を読み込む
			integralNumber = standardInput.nextInt();
		}

		//入力された整数を返却
		return integralNumber;
	}

	/*
	 * 関数名：inputDoubleNumber
	 * 概要:実数(double型)を入力させる
	 * 引数：入力内容の文言(String型)
	 * 戻り値：入力された実数(double型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/24
	*/
	static double inputDoubleNumber(String desplayIssue) {

		//入力内容の文言を表示
		System.out.print(desplayIssue);

		//入力された実数を読み込む
		double doubleNumber = standardInput.nextDouble();

		//入力された実数を返却
		return doubleNumber;
	}

	/*
	 * 関数名：inputString
	 * 概要:テキスト(String型)を入力させる
	 * 引数：入力内容の文言(String型)
	 * 戻り値：入力された文言(String型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/24
	*/
	static String inputString(String desplayIssue) {

		//入力内容の文言を表示
		System.out.print(desplayIssue);

		//入力された文言を読み込む
		String stringText = standardInput.next();

		//入力された文言を返却
		return stringText;
	}

	/*
	 * 関数名：isLeap
	 * 概要:特定の年が閏年であるか判定
	 * 引数：年数(int型)
	 * 戻り値：閏年であればtrue、そうでなければfalse(boolean型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/20
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
	 * 作成日：2024/05/20
	*/
	static int outputMonthDayCount(int yearNumber, int monthNumber) {
		//年間における1～12月の日数を格納する定数配列を宣言(順番に1月～12月の日数を格納)
		//閏年の場合、2月の日数が変化
		final int[] MONTH_DAY_COUNT = { 31, (isLeap(yearNumber) ? 29 : 28), 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		//月数を日う列のインデックスに対応させる。該当の月の日数を返却
		return MONTH_DAY_COUNT[--monthNumber];
	}

	/*
		 * 関数名：inputDate
		 * 概要:年・月・日の数値を入力させ、それをまとめた配列を返却する
		 * 引数：日付の情報(String型)
		 * 戻り値：年・月・日の情報をまとめた配列(int型)
		 * 作成者：S.Hiruta
		 * 作成日：2024/05/24
		*/
	static int[] inputDate(String dateText) {
		//日付に関する説明
		System.out.println(dateText);
		//年・月・日の数値を入力を促す
		System.out.println("年・月・日の数値を入力してください。");
		//日付の要素である「年・月・日」の個数を定数化
		final int DATE_FACOR_COUNT = 3;
		//日付の情報を格納する配列を宣言
		int[] dateFactor = new int[DATE_FACOR_COUNT];

		//年数を入力させる
		dateFactor[YEAR_INDEX] = inputIntegralNumber("年数：");
		//入力年数が0以下の場合
		while (dateFactor[YEAR_INDEX] <= 0) {
			//0超過の年数を入力させる
			dateFactor[YEAR_INDEX] = inputIntegralNumber("0超過の年数：");
		}
		//月数を入力させる
		dateFactor[MONTH_INDEX] = inputIntegralNumber("月数：");
		//入力月数が存在する月数の範囲を外れていた場合
		while (dateFactor[MONTH_INDEX] < MINIMUM_MONTH || dateFactor[MONTH_INDEX] > MAXIMUM_MONTH) {
			//存在する月数を入力するように促す
			System.out.println(MINIMUM_MONTH + "～" + MAXIMUM_MONTH + "以内で入力してください。");
			//存在する月数を入力させる
			dateFactor[MONTH_INDEX] = inputIntegralNumber("存在する月数：");
		}
		//日数を入力させる
		dateFactor[DATE_INDEX] = inputIntegralNumber("日数：");
		//入力されたあ日数が実在しない日数の場合
		while (dateFactor[DATE_INDEX] <= 0
				|| dateFactor[DATE_INDEX] > outputMonthDayCount(dateFactor[YEAR_INDEX], dateFactor[MONTH_INDEX])) {
			//存在する日数を入力するように促す
			System.out.println(
					"1～" + outputMonthDayCount(dateFactor[YEAR_INDEX], dateFactor[MONTH_INDEX]) + "以内で入力してください。");
			//存在する日数を入力させる
			dateFactor[DATE_INDEX] = inputIntegralNumber("存在する日数：");
		}

		//日付の情報を格納した配列を返却
		return dateFactor;
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
	 * 関数名：main
	 * 概要:車の情報と購入日を表示。楠間を走行させ、総走行距離を表示。
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/24
	*/
	public static void main(String[] args) {

		//車クラスの情報を入力させる
		//車の名前を入力させる
		String carName = inputString("車の名前:");
		//車の車幅を入力させる
		int carWidth = inputIntegralNumber("車の車幅(mm):");
		//車の車高を入力させる
		int carHeight = inputIntegralNumber("車の車高(mm):");
		//車の全長を入力させる
		int carLength = inputIntegralNumber("車の全長(mm):");
		//車の残存燃料を入力させる
		double remainingFuel = inputDoubleNumber("車の残存燃料(L):");
		//車の残存燃料として0以下の値が入力された場合
		while (remainingFuel <= 0) {
			//0超過の値の入力を促す
			remainingFuel = inputDoubleNumber("0超過の値(L):");
		}
		//車の購入日を入力させる
		int[] purchaseDayData = inputDate("車の購入日を入力してください。");
		//車の購入日のインスタンスを生成
		Day purchaseDay = new Day(purchaseDayData[YEAR_INDEX], purchaseDayData[MONTH_INDEX], purchaseDayData[DATE_INDEX]);

		//総走行距離もメンバとして含んでいる、入力された車の情報を持ったインスタンスを生成
		CarDistance runningCar = new CarDistance(carName, carWidth, carHeight, carLength, remainingFuel,
				purchaseDay);

		//車に関する情報を提示
		runningCar.putSpec();

		//車の移動を開始すると伝える
		System.out.println("\n車の移動を開始します。");

		//車を移動させ、移動後の位置と残存燃料を表示。総走行距離の表示も行う
		do {
			//現在地のX・Y座標、残存燃料を表示する
			System.out
					.println("現在地(" + runningCar.getLongitudePosition() + ", "
							+ runningCar.getLatitudePosition() + ") 残り燃料"
							+ runningCar.getRemainingFuel() + "(L)");

			//X方向の移動距離を読み込む
			double latitudeMove = inputDoubleNumber("X方向の移動距離(m)：");
			//Y方向の移動距離を読み込む
			double longitudeMove = inputDoubleNumber("Y方向の移動距離(m)：");
			;

			//移動によって車が燃料切れを起こした場合
			if (!runningCar.isDriveContinued(latitudeMove, longitudeMove)) {
				//燃料がないことを伝える
				System.out.println("燃料が尽き、これ以上移動できません!");
				//処理を終了する
				break;
				//燃料切れではない場合
			} else {
				//移動後の残存燃料を表示する
				System.out.println("残り燃料" + runningCar.getRemainingFuel() + "(L)");
			}

			//総走行距離を表示するか選択を迫る
			if (isTrueFalse("総走行距離を表示しますか？")) {
				//総走行距離を表示する
				System.out.println("総走行距離：" + runningCar.calculateMileages(latitudeMove, longitudeMove) + "m");
			}

			//0(処理の終了)が選択された場合、処理を終える
		} while (isTrueFalse("移動を続けますか？"));

	}

}