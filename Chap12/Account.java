package Chap12;

/*
* クラス名:Account
* 概要:銀行口座クラス。銀行の口座に関する情報を管理する
* 作成者:S.Hiruta
* 作成日:2024/05/24
*/
public class Account {

	//口座名義を格納する変数を定義
	private String accountName;
	//口座番号を格納する変数を定義
	private String accountNumber;
	//預金残高を格納する変数を定義
	private long depositBalance;

	/*
	 * コンストラクタ名：Account
	 * 概要:銀行口座に関する情報をそれぞれ初期化して、インスタンスを生成する
	 * 引数：口座名義(String型),口座番号(String型),預金残高(long型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/24
	*/
	public Account(String accountName, String accountNumber, long depositBalance) {
		//口座名義を受け取った値で初期化
		this.accountName  = accountName;
		//口座番号を受け取った値で初期化
		this.accountNumber = accountNumber;
		//預金残高を受け取った値で初期化
		this.depositBalance = depositBalance;
	}

	/*
	 * 関数名：getName
	 * 概要:口座名義を取得する
	 * 引数：なし
	 * 戻り値：口座名義(String型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/24
	*/
	public String getName() {
		//口座名義を返却
		return accountName;
	}

	/*
	 * 関数名：getNumber
	 * 概要:口座番号を取得
	 * 引数：なし
	 * 戻り値：口座番号(String型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/24
	*/
	public String getNumber() {
		//口座番号を返却
		return accountNumber;
	}

	/*
	 * 関数名：getBalance
	 * 概要:預金残高を取得
	 * 引数：なし
	 * 戻り値：預金残高(long型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/24
	*/
	public long getBalance() {
		//預金残高を返却
		return depositBalance;
	}

	/*
	 * 関数名：receiveMoney
	 * 概要:入金を預金残高に反映させる
	 * 引数：入金額(long型)
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/24
	*/
	public void receiveMoney(long inputMoner) {
		//入金を預金残高に反映させる
		depositBalance += inputMoner;
	}

	/*
	 * 関数名：withdrawMoney
	 * 概要:出金を預金残高に反映させる
	 * 引数：出金額(long型)
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/24
	*/
	public void withdrawMoney(long outputMoney) {
		//出金を預金残高に反映させる
		depositBalance -= outputMoney;
	}
}
