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

	//識別子として付与する番号を格納するインスタンスメソッドを宣言
	private int accountIdentification = 0;

	/*
	 * コンストラクタ名：Identification
	 * 概要：識別番号を1加算する
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/16
	*/
	public Identification() {
		//識別子に番号を付与する
		accountIdentification = ++countNumber;
	}

	/*
	 * ゲッタ名：getIdentification
	 * 概要:識別番号を取得する
	 * 引数：なし
	 * 戻り値：識別番号(int型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/16
	*/
	public int getIdentification() {
		//年に関する情報を返却
		return accountIdentification;
	}
	
	/*
	 * ゲッタ名：getMaximumIdentification
	 * 概要:最大の識別番号を取得する
	 * 引数：なし
	 * 戻り値：最大の識別番号(int型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/16
	*/
	public int getMaximumIdentification() {
		//年に関する情報を返却
		return accountIdentification;
	}
}
