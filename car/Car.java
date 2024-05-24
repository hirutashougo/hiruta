package car;

//Scannerのインポート
import java.util.Scanner;

//dayパッケージのDayクラスを単一インポート宣言
import day.Day;

/*
* クラス名:Car
* 概要:車に関する情報を管理する
* 作成者:S.Hiruta
* 作成日:2024/05/09
*/
public class Car {

	//Scannerクラスの変数の定義
	static Scanner standardInput = new Scanner(System.in);

	//車の名前を表すフィールドを宣言
	private String carName;
	//車の幅を表すフィールドを宣言
	private int carWidth;
	//車の高さを表すフィールドを宣言
	private int carHeight;
	//車の長さを表すフィールドを宣言
	private int carLength;
	//車のx座標を表すフィールドを宣言
	private double longitudePosition;
	//車のy座標を表すフィールドを宣言
	private double latitudePosition;
	//車に残っている燃料を表わすフィールドを宣言
	private double remainingFuel;
	//車の購入日表すフィールドを宣言
	private Day purchaseDay;

	/*
	 * コンストラクタ名：Car
	 * 概要:車に関する情報のコンストラクタを初期化する
	 * 引数：名前(String型),車幅(int型),車高(int型),車長(int型),残存燃料(double型),車の購入日(Day型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/09
	*/
	public Car(String carName, int carWidth, int carHeight, int carLength, double remainingFuel, Day purchaseDay) {
		//車の名前のインスタンスを初期化
		this.carName = carName;
		//車の幅のインスタンスを初期化
		this.carWidth = carWidth;
		//車の高さのインスタンスを初期化
		this.carHeight = carHeight;
		//車の長さのインスタンスを初期化
		this.carLength = carLength;
		//車に残っている燃料のインスタンスを初期化
		this.remainingFuel = remainingFuel;
		//車のx座標・y座標を初期化
		longitudePosition = latitudePosition = 0.0;
		//車の購入日のインスタンスを初期化
		this.purchaseDay = new Day(purchaseDay);
	}

	/*
	 * 関数名：getLongitudePosition
	 * 概要:車の現在位置のx座標を取得
	 * 引数：なし
	 * 戻り値：車の現在位置のx座標
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/09
	*/
	public double getLongitudePosition() {
		//車のx座標を返却する
		return longitudePosition;
	}

	/*
	 * 関数名：getLatitudePosition
	 * 概要:車の現在位置のy座標を取得
	 * 引数：なし
	 * 戻り値：車の現在位置のy座標
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/09
	*/
	public double getLatitudePosition() {
		//車のy座標を返却する
		return latitudePosition;
	}

	/*
	 * 関数名：getRemainingFuel
	 * 概要:車の残存燃料を取得
	 * 引数：なし
	 * 戻り値：車の残存燃料
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/09
	*/
	public double getRemainingFuel() {
		//車の残存燃料を返却する
		return remainingFuel;
	}

	/*
	 * 関数名：getPrchaseDay
	 * 概要:車を購入した日を取得
	 * 引数：なし
	 * 戻り値：車の購入日
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/14
	*/
	public Day getPurchaseDay() {
		//車を購入した日付の情報を取得
		return new Day(purchaseDay);
	}

	/*
	 * 関数名：putSpec
	 * 概要:入力された、車に関する情報を表示
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/09
	*/
	public void putSpec() {
		//車の名前を表示
		System.out.println("名前：" + carName);
		//車のナンバーを表示
		//車幅を表示
		System.out.println("車幅：" + carWidth + "mm");
		//車高を表示
		System.out.println("車高：" + carHeight + "mm");
		//車長を表示
		System.out.println("車長：" + carLength + "mm");
		//残存燃料を表示
		System.out.println("残存燃料：" + remainingFuel + "L");
	}

	/*
	 * 関数名：isDriveContinued
	 * 概要:車の移動する距離を算出し、燃料の量に応じてtrue/falseを返却する
	 * 引数：X座標,Y座標の移動距離
	 * 戻り値：true,false
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/09
	*/
	public boolean isDriveContinued(double latitudeMove, double longitudeMove) {
		//返却する値を格納する変数を定義
		boolean returnValue = true;
		//車の移動距離をX方向の移動距離とY方向の移動距離の平方根から算出
		double moveDistance = Math.sqrt(latitudeMove * latitudeMove + longitudeMove * longitudeMove);

		//燃費は1と仮定されているため、車の移動距離は燃料消費量に等しい
		//使用燃料が残存燃料を上回ったとき
		if (moveDistance > remainingFuel) {
			//falseを返却値の変数に格納
			returnValue = false;
			//使用燃料が残存燃料を下回っているとき
		} else {
			//残存燃料から使用燃料を引く
			remainingFuel -= moveDistance;
			//移動分、X座標の位置を変更する
			longitudePosition += latitudeMove;
			//移動分、Y座標の位置を変更する
			latitudePosition += longitudeMove;
		}
		//trueまたはfalseを返却する
		return returnValue;
	}

}
