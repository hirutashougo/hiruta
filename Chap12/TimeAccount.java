package Chap12;

/*
* クラス名:Account
* 概要:銀行口座クラス。定期預金も含めた銀行利用者の情報を管理する
* 作成者:S.Hiruta
* 作成日:2024/05/24
*/
public class TimeAccount extends Account {

	private long timeBalance;

	/*
	 * コンストラクタ名：Day
	 * 概要:日付に関する情報のインスタンスを、実行日を初期値として宣言
	 * 引数：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/20
	*/
	public TimeAccount(String userName, String accountNumber, long depositBalance, long timeBalance) {
		//
		super(userName, accountNumber, depositBalance);
		//
		this.timeBalance = timeBalance;
	}

	/*
	 * ゲッタ名：getTmeBalance
	 * 概要:定期預金残高を調べる
	 * 引数：なし
	 * 戻り値：定期預金残高(long型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/24
	*/
	public long getTimeBalance() {
		//口座名義を返却
		return timeBalance;
	}

	/*
	 * ゲッタ名：cancelTimeBalance
	 * 概要:定期預金を解約し、全額を普通預金に移す
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/24
	*/
	public void cancelTimeBalance() {
		//定期預金を普通預金に移す
		depositBalance(timeBalance);
		//定期預金の残高を0にする
		timeBalance = 0;
	}
}
