package Chap10.Exercises.Ex10_01;

/*
* クラス名:Identification
* 概要:連番の情報を管理する
* 作成者:S.Hiruta
* 作成日:2024/05/16
*/
class Identification {

	//何番までの識別番号を与えたか、をカウントするクラス変数を定義
	static int countNumber = 0;

	//識別子として付与する番号を格納するインスタンス変数を宣言
	private int accountIdentification = 0;

	/*
	 * コンストラクタ名：Identification
	 * 概要：1加算した識別番号を初期値として識別子のクラス変数を初期化
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/16
	*/
	public Identification() {
		//1加算した識別番号を初期値として識別子のクラス変数を初期化
		accountIdentification = ++countNumber;
	}

	/*
	 * メソッド名：getIdentification
	 * 概要:識別番号を取得する
	 * 引数：なし
	 * 戻り値：識別番号(int型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/16
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
	 * 作成日：2024/05/16
	*/
	static int getMaximumIdentification() {
		//最後に与えた識別番号を返却
		return countNumber;
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
