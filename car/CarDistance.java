package car;

//dayパッケージのDayクラスを単一インポート宣言
import day.Day;

/*
* クラス名:CarDistance
* 概要:車に関する情報を管理する。走行距離も調べる。
* 作成者:S.Hiruta
* 作成日:2024/05/24
*/
public class CarDistance extends Car {

	//車の総走行距離を表すフィールドを宣言
	private double carMileages = 0;

	/*
	 * コンストラクタ名：CarDistance
	 * 概要:車に関する情報のコンストラクタを初期化する
	 * 引数：名前(String型),車幅(int型),車高(int型),全長(int型),残存燃料(double型),,車の購入日(Day型))
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/24
	*/
	public CarDistance(String carName, int carWidth, int carHeight, int carLength, double remainingFuel, Day purchaseDay) {
		//Carクラスのスーパーコンストラクタを呼び出す
		super(carName, carWidth, carHeight, carLength, remainingFuel, purchaseDay);
		
		//車の総走行距離を初期値0で宣言(走行していないため)
		carMileages = 0;
	}

	/*
	 * 関数名：calculateMileages
	 * 概要:車の総走行距離を調べる
	 * 引数：X,Y方向の各移動距離(double型)
	 * 戻り値：車の総走行距離(double型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/24
	*/
	public double calculateMileages(double latitudeMove, double longitudeMove) {
		
		//車の移動距離をX方向の移動距離とY方向の移動距離の平方根から算出
		double moveDistance = Math.sqrt(latitudeMove * latitudeMove + longitudeMove * longitudeMove);
		//車の移動距離を総走行距離に加算
		carMileages += moveDistance;
		
		//車の総走行距離を返却
		return carMileages;
	}

}
