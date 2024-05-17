package Chap10.Exercises.Ex10_02;

//Scannerのインポート
import java.util.Scanner;

/*
* クラス名:ExIdentification
* 概要:連番の情報を管理する
* 作成者:S.Hiruta
* 作成日:2024/05/17
*/
class ExIdentification {

	//Scannerクラスの変数の定義
	static Scanner standardInput = new Scanner(System.in);

	//識別番号を格納するクラス変数を定義
	static int countNumber = 0;
	//識別子を格納するインスタンス変数を宣言
	private int accountIdentification = 0;

	//指定されていない場合の「識別番号の間隔」の1を定数化
	final static int DEFAULT_INTERVAL = 1;
	//識別番号の間隔を表わすクラス変数を宣言
	static int intervalNumber = DEFAULT_INTERVAL;

	/*
	 * コンストラクタ名：ExIdentification
	 * 概要：指定された間隔の分だけ増加した値を初期値として識別子のインスタンス変数を初期化
	 * 引数：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/17
	*/
	public ExIdentification() {
		//クラス変数によって指定された間隔で識別番号を増加させる
		countNumber += intervalNumber;
		//増加させた値を初期値として識別子のクラス変数を初期化
		accountIdentification = countNumber;
	}

	/*
	 * メソッド名：getIdentification
	 * 概要:識別番号を取得する
	 * 引数：なし
	 * 戻り値：識別番号(int型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/17
	*/
	public int getIdentification() {
		//識別番号を返却
		return accountIdentification;
	}

	/*
	 * メソッド名：getMaximumIdentification
	 * 概要:最後に与えた識別番号を取得する
	 * 引数：なし
	 * 戻り値：最後に与えた識別番号(int型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/17
	*/
	static int getMaximumIdentification() {
		//最後に与えた識別番号を返却
		return countNumber;
	}
	
	/*
	 * 関数名：inputPlusInteger
	 * 概要:1以上の整数を入力させる
	 * 引数：なし
	 * 戻り値：1以上の整数(int型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/15
	*/
	static int inputPlusInteger() {
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
	 * メソッド名：setIntervalNumber
	 * 概要:識別番号の間隔を変更する
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/17
	*/
	public void setIntervalNumber() {
		//識別番号の間隔の入力を促す
		System.out.print("間隔：");
		//識別番号の間隔の変更を反映
		intervalNumber = inputPlusInteger();
	}

	/*
	 * メソッド名：toString
	 * 概要：最後に与えた識別番号の表記を返却
	 * 引数：なし
	 * 戻り値：最後に与えた識別番号の表記(String型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/17
	*/
	public String toString() {
		//最後に与えた識別番号の表記を返却
		return String.format("最後に付与された識別番号は" + getMaximumIdentification() + "です。");
	}
}
