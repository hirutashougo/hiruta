package Chap10.Lists;

/*
* クラス名:Identification
* 概要:連番の情報を管理する
* 作成者:S.Hiruta
* 作成日:2024/05/16
*/
class Identification {

	//
	static int countNumber = 0;

	//
	private int accountIdentification = 0;

	/*
	 * コンストラクタ名：Identification
	 * 概要：識別番号を1加算する
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/16
	*/
	public Identification() {
		//
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
}
