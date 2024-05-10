package Chap08.Exercises.Exsercise08_02;

//Scannerのインポート
import java.util.Scanner;

/*
* クラス名:CarTester
* 概要:入力された車に関する情報の表示
		車を移動させ、燃料切れの場合、移動を終了
* 作成者:S.Hiruta
* 作成日:2024/05/10
*/
public class CarTester {

	//Scannerクラスの変数の定義
	static Scanner standardInput = new Scanner(System.in);

	/*
	 * 関数名：isContinued
	 * 概要:繰り返し処理の選択を行わせる
	 * 引数：なし
	 * 戻り値：true,false
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/10
	*/
	static boolean isContinued() {
		//選択結果を格納する変数を定義
		boolean judgeContinuation = true;

		//処理の継続を表す定数を定義
		final int PROCESS_CONTINUE = 1;
		//処理の終了を表す定数を定義
		final int PROSESS_END = 0;
		
		//入力された選択を読み込む
		int judgementValue = standardInput.nextInt();
		//0か1が入力されるまで選択を迫る
		while (judgementValue != PROCESS_CONTINUE && judgementValue != PROSESS_END) {
			//0か1での入力を促す
			System.out.print("0か1で入力してください。");
			//入力された選択を読み込む
			judgementValue = standardInput.nextInt();
		}
		//0が入力された場合、falseを返却値に格納
		if (judgementValue == PROSESS_END) {
			//falseを返却値に格納
			judgeContinuation = false;
		}

		//処理継続の選択結果を返却する
		return judgeContinuation;
	}

	/*
	 * 関数名：main
	 * 概要:入力された車に関する情報の表示
			車を移動させ、燃料切れの場合、移動を終了
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/10
	*/
	public static void main(String[] args) {

		//名前の入力を促す
		System.out.print("車の名前は：");
		//入力された名前を読み込む
		String carName = standardInput.next();

		//車のナンバーの入力を促す
		System.out.print("車のナンバーは：");
		//入力された車のナンバーを読み込む
		String carNumber = standardInput.next();

		//車の幅の入力を促す
		System.out.print("車の幅(mm)は：");
		//入力された車の幅を読み込む
		int carWidth = standardInput.nextInt();
		//車幅が正の値で入力されるまで繰り返す
		while (carWidth <= 0) {
			//正の値で入力するように促す
			System.out.println("正の値で入力してください。");
			//改めて車の幅の入力を促す
			System.out.print("車の幅は：");
			//入力された車の幅を読み込む
			carWidth = standardInput.nextInt();
		}

		//車高の入力を促す
		System.out.print("車高(mm)は：");
		//入力された車高を読み込む
		int carHeight = standardInput.nextInt();
		//車高が正の値で入力されるまで繰り返す
		while (carHeight <= 0) {
			//正の値で入力するように促す
			System.out.println("正の値で入力してください。");
			//改めて車高の入力を促す
			System.out.print("車高(mm)は：");
			//入力された車高を読み込む
			carHeight = standardInput.nextInt();
		}

		//車の全長の入力を促す
		System.out.print("車の全長(mm)は：");
		//入力された車の全長を読み込む
		int carLength = standardInput.nextInt();
		//車の全長が正の値で入力されるまで繰り返す
		while (carLength <= 0) {
			//正の値で入力するように促す
			System.out.println("正の値で入力してください。");
			//改めて車の全長の入力を促す
			System.out.print("車の全長(mm)は：");
			//入力された車の全長を読み込む
			carLength = standardInput.nextInt();
		}

		//タンク容量の入力を促す
		System.out.print("タンク容量(L)は：");
		//入力されたタンク容量を読み込む
		double tankCapacity = standardInput.nextDouble();
		//タンク容量が正の値で入力されるまで繰り返す
		while (tankCapacity <= 0) {
			//正の値で入力するように促す
			System.out.println("正の値で入力してください。");
			//改めてタンク容量の入力を促す
			System.out.print("タンク容量(L)は：");
			//入力されたタンク容量を読み込む
			tankCapacity = standardInput.nextDouble();
		}

		//車に残っている燃料の入力を促す
		System.out.print("車に残っている燃料(L)は：");
		//入力された、車に残っている燃料を読み込む
		double remainingFuel = standardInput.nextDouble();
		//車に残っている燃料が0以上かつタンクの容量内の値で入力されるまで繰り返す
		while (remainingFuel < 0 || remainingFuel > tankCapacity) {
			//0以上かつタンクの容量内の値で入力するように促す
			System.out.println("0以上かつタンクの容量内の値で入力してください。");
			//改めて車に残っている燃料の入力を促す
			System.out.print("車に残っている燃料(L)は：");
			//入力された車に残っている燃料を読み込む
			remainingFuel = standardInput.nextDouble();
		}

		//燃費の入力を促す
		System.out.print("燃費(m/L)は：");
		//入力された燃費を読み込む
		double fuelConsumption = standardInput.nextDouble();
		//燃費が正の値で入力されるまで繰り返す
		while (fuelConsumption <= 0) {
			//正の値で入力するように促す
			System.out.println("正の値で入力してください。");
			//改めて燃費の入力を促す
			System.out.print("燃費(m/L)は：");
			//入力された燃費を読み込む
			fuelConsumption = standardInput.nextDouble();
		}
		
		//車の情報を持ったインスタンスを作成する
		Car myCar = new Car(carName, carNumber, carWidth, carHeight, carLength, remainingFuel, fuelConsumption, tankCapacity);
		
		//改行する
		System.out.println();
		//入力した車に関する情報を表示
		myCar.putSpec();

		//車を移動させ、移動後の位置と残存燃料を表示。燃料の補給も行う
		do {
			//車の移動を開始すると伝える
			System.out.println("\n車の移動を開始します。");
			
			//現在地のX・Y座標、残存燃料を表示する
			System.out.println("現在地(" + myCar.getLongitudePosition() + ", " + myCar.getLatitudePosition() + ") 残り燃料"
					+ myCar.getRemainingFuel() + "(L)");

			//X方向の移動距離を入力させる
			System.out.print("\nX方向の移動距離(m)：");
			//入力された移動距離を読み込む
			double latitudeMove = standardInput.nextDouble();
			//Y方向の移動距離を入力させる
			System.out.print("Y方向の移動距離(m)：");
			//入力された移動距離を読み込む
			double longitudeMove = standardInput.nextDouble();

			//移動によって車が燃料切れを起こした場合
			if (!myCar.isDriveContinued(latitudeMove, longitudeMove)) {
				//燃料がないことを伝える
				System.out.println("燃料が尽き、これ以上移動できません!");
				//処理を終了する
				break;
			//燃料切れではない場合
			} else {
				//移動後の残存燃料を憑依する
				System.out.println("残り燃料" + myCar.getRemainingFuel() + "(L)");;
				//燃料の補給の選択を迫る
				System.out.print("\n燃料を補給しますか？[0…No/1…Yes]：");
				//燃料を補給する場合
				if (isContinued()) {
					//燃料を補給させる
					remainingFuel = myCar.supplyFuel();
				}
			}

			//移動するか選択を迫る
			System.out.print("\n移動しますか[0…No/1…Yes]：");
			//0(処理の終了)が選択された場合、処理を終える
		} while (isContinued());
	}

}