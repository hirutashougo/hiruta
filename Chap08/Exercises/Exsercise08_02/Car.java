package Chap08.Exercises.Exsercise08_02;

//Scannerのインポート
import java.util.Scanner;

/*
* クラス名:Car
* 概要:車に関する情報を管理する
* 作成者:S.Hiruta
* 作成日:2024/05/09
*/
class Car {
	//車の名前を表すフィールドを宣言
	private String carName;
	//車のナンバーを表すフィールドを宣言
	private String carNumber;
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
	//タンク容量を表すフィールドを宣言
	private double tankCapacity;
	//車の燃費を表すフィールドを宣言
	private double fuelConsumption;

	/*
	 * コンストラクタ名：Car
	 * 概要:車に関する情報のコンストラクタを初期化する
	 * 引数：名前(String型),車のナンバー(String型),車幅(int型),車高(int型),車長(int型),残存燃料(double型),燃費(double型),タンク容量(double型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/09
	*/
	Car(String carName, String carNumber, int carWidth, int carHeight, int carLength,double remainingFuel,	double fuelConsumption, double tankCapacity) {
		//車の名前のインスタンスを初期化
		this.carName = carName;
		//車のナンバーのインスタンスを初期化
		this.carNumber = carNumber;
		//車の幅のインスタンスを初期化
		this.carWidth = carWidth;
		//車の高さのインスタンスを初期化
		this.carHeight = carHeight;
		//車の長さのインスタンスを初期化
		this.carLength = carLength;
		//車に残っている燃料のインスタンスを初期化
		this.remainingFuel = remainingFuel;
		//車の燃費のインスタンスを初期化
		this.fuelConsumption = fuelConsumption;
		//車のタンク容量のインスタンスを初期化
		this.tankCapacity = tankCapacity;
		//車のx座標・y座標を初期化
		longitudePosition = latitudePosition = 0.0;
	}

	/*
	 * 関数名：getLongitudePosition
	 * 概要:車の現在位置のx座標を取得
	 * 引数：なし
	 * 戻り値：車の現在位置のx座標
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/09
	*/
	double getLongitudePosition() {
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
	double getLatitudePosition() {
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
	double getRemainingFuel() {
		//車の残存燃料を返却する
		return remainingFuel;
	}

	/*
	 * 関数名：putSpec
	 * 概要:入力された、車に関する情報を表示
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/09
	*/
	void putSpec() {
		//車の名前を表示
		System.out.println("名前：" + carName);
		//車のナンバーを表示
		System.out.println("ナンバー：" + carNumber);
		//車幅を表示
		System.out.println("車幅：" + carWidth + "mm");
		//車高を表示
		System.out.println("車高：" + carHeight + "mm");
		//車長を表示
		System.out.println("車長：" + carLength + "mm");
		//燃費を表示
		System.out.println("燃費：" + fuelConsumption + "m/L");
		//タンク容量を表示
		System.out.println("タンク容量：" + tankCapacity + "L");
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
	boolean isDriveContinued(double latitudeMove, double longitudeMove) {
		//返却する値を格納する変数を定義
		boolean returnValue = true;
		//車の移動距離をX方向の移動距離とY方向の移動距離の平方根から算出
		double moveDistance = Math.sqrt(latitudeMove * latitudeMove + longitudeMove * longitudeMove);
		//移動距離と燃費をかけ合わせ、消費燃料量を算出
		double consumedFuelQuantity = moveDistance / fuelConsumption;

		//使用燃料が残存燃料を上回ったとき
		if (consumedFuelQuantity > remainingFuel) {
			//falseを返却値の変数に格納
			returnValue = false;
			//使用燃料が残存燃料を下回っているとき
		} else {
			//残存燃料から使用燃料を引く
			remainingFuel -= consumedFuelQuantity;
			//移動分、X座標の位置を変更する
			longitudePosition += latitudeMove;
			//移動分、Y座標の位置を変更する
			latitudePosition += longitudeMove;
		}
		//trueまたはfalseを返却する
		return returnValue;
	}
	
	/*
	 * 関数名：supplyFuel
	 * 概要:入力された分の燃料を補給するメソッド
	 * 引数：残存燃料
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/09
	*/
	double supplyFuel() {
		
		//Scannerクラスの変数の定義
		 Scanner standardInput = new Scanner(System.in);
		
		//燃料の補給量を入力させる
		System.out.print("補給する燃料量：");
		//入力された補給量を読み込む
		double supplyQuantity = standardInput.nextInt();
		//補給量として正の値が入力させる
		while (supplyQuantity <= 0) {
			//正の値で入力するように促す
			System.out.println("正の値で入力してください。");
			//改めて、燃料の補給量を入力させる
			System.out.print("補給する燃料量：");
			//入力された補給量を読み込む
			supplyQuantity = standardInput.nextInt();
		}
		
		//入力された補給量を、残存燃料に追加する
		remainingFuel += supplyQuantity;
		//補給後の燃料残量がタンク容量を超えた場合、満タンの補給とする
		if (remainingFuel >= tankCapacity) {
			//タンクがいっぱいであると表示
			System.out.println("タンクはいっぱいです。");
			//残存燃料を満タンとする
			remainingFuel = tankCapacity;
		}
		
		//補給後の燃料残量を返却
		return remainingFuel;
	}
}
