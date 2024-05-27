package account;

/*
 * クラス名：TimeAccount
 * 概要:定期預金付き銀行口座の情報を管理する
 * 作成者：S.Hiruta
 * 作成日：2024/05/24
*/
public class TimeAccount extends Account {

	//定期預金のフィールドを宣言
	private long timeBalance;

	/*
	 * コンストラクタ名：TimeAccount
	 * 概要:定期預金付き銀行口座クラス型インスタンスのメンバを初期化
	 * 引数：口座名義(String型),口座番号(String型),預金残高(long型),定期預金残高(long型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/20
	*/
	public TimeAccount(String userName, String accountNumber, long depositBalance, long timeBalance) {
		//スーパーコンストラクタを呼び出し、上位クラスのメンバを初期化
		super(userName, accountNumber, depositBalance);
		//定期預金の情報を初期化
		this.timeBalance = timeBalance;
	}

	/*
	 * ゲッタ名：getTimeBalance
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
