package Chap10.Lists;

/*
* クラス名:Account
* 概要:銀行口座に関する情報を管理する
* 作成者:S.Hiruta
* 作成日:2024/05/16
*/
public class Account {
	//
	private static int countNumber = 0;
	//
	private String accountName = "";
	//
	private String accountNumber = "";
	//
	private long depositBalance = 0;
	//
	private int accountIdentification = 0;
	
	/*
	 * コンストラクタ名：Account
	 * 概要:銀行口座に関する情報のインスタンスを、代入される値を初期値として宣言
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/16
	*/
	public Account(String accountName, String accountNumber, long depozstBalance) {
		//
		this.accountName = accountName;
		//
		this.accountNumber = accountNumber;
		//
		this.depositBalance = depozstBalance;
		//
		accountIdentification = ++countNumber;
	}
	
	/*
	 * ゲッタ名：getAccountName
	 * 概要:口座名義を取得する
	 * 引数：なし
	 * 戻り値：口座名義(String型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/16
	*/
	public String getAccountName() {
		//年に関する情報を返却
		return accountName;
	}
	
	/*
	 * ゲッタ名：getAccountNumber
	 * 概要:口座番号を取得する
	 * 引数：なし
	 * 戻り値：口座番号(String型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/16
	*/
	public String getAccountNumber() {
		//年に関する情報を返却
		return accountNumber;
	}
	
	
	/*
	 * ゲッタ名：getDepositBalance
	 * 概要:預金残高を取得する
	 * 引数：なし
	 * 戻り値：預金残高(String型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/16
	*/
	public Long getDepositBalance() {
		//年に関する情報を返却
		return depositBalance;
	}
	
	/*
	 * ゲッタ名：getAccountIdentification
	 * 概要：識別子を取得する
	 * 引数：なし
	 * 戻り値：識別子(int型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/16
	*/
	public int getAccountIdentification() {
		//年に関する情報を返却
		return accountIdentification;
	}
	
	/*
	 * 関数名：depositBalance
	 * 概要:入金した分、預金残高を増額させる
	 * 引数：入金額(long型)
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/15
	*/
	public void depositBalance(long depositMoney) {
		//預金口座を入金分増額
		depositBalance += depositMoney;
	}

	/*
	 * 関数名：withdrawBalance
	 * 概要:出金した分、預金残高を減額させる
	 * 引数：出金額(long型)
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/15
	*/
	public void withdrawBalance(long withdrawMoney) {
		//預金口座を出金分減額
		depositBalance -= withdrawMoney;
	}
}
