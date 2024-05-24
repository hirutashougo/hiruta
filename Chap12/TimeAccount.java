package Chap12;

/*
* クラス名:TimeAccount
* 概要:定期預金付き銀行口座クラス。銀行の口座に関する情報を管理する
* 作成者:S.Hiruta
* 作成日:2024/05/24
*/
public class TimeAccount extends Account {

	//定期預金のインスタンス変数を定義
	private long timeBalance = 0;
	
	/*
	 * コンストラクタ名：Account
	 * 概要:銀行口座に関する情報をそれぞれ初期化して、インスタンスを生成する
	 * 引数：口座名義(String型),口座番号(String型),預金残高(long型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/24
	*/
	public TimeAccount(String accountName, String accountNumber, long depositBalance, long timeBalance) {
		//Accountクラスｎスーパーコンストラクタを呼び出す
		super(accountName, accountNumber, depositBalance);
		//受け取った値で定期預金のフィールドを初期化
		this.timeBalance = timeBalance;
	}
	
	/*
	 * 関数名：gettimeBalance
	 * 概要:定期預金残高を調べる
	 * 引数：なし
	 * 戻り値：定期預金額(long型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/24
	*/
	public long getTimeBalance() {
		//定期預金額を返却(long型)
		return timeBalance;
	}
	
	/*
	 * 関数名：canceltimeBalance
	 * 概要:定期預金を解約して全額を普通預金へ移す
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/24
	*/
	public void canceltimeBalance() {
		//
		depositBalance += timeBalance;
		//
		timeBalance = 0;
	}
	
	/*
	 * 関数名：canceltimeBalance
	 * 概要:定期預金を解約して全額を普通預金へ移す
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/24
	*/
	static int compBalance(Account a, Account b) {
		//
		
	}
}
