package Chap09.Exercises.Ex09_03;

/*
* クラス名:Account
* 概要:銀行口座クラス【第2版】。銀行利用者の情報を管理する
* 作成者:S.Hiruta
* 作成日:2024/05/15
*/
public class Account {
	//口座名義を格納する変数を定義
	private String userName;
	//口座番号を格納する変数を定義
	private String accountNumber;
	//預金残高を格納する変数を定義
	private long depositBalance;
	//口座開設日を表すフィールドを宣言
	private Day openingDay;

	/*
	 * コンストラクタ名：Account
	 * 概要:銀行利用者に関する情報のインスタンスを、各クラス型変数を初期値で宣言
	 * 引数：口座名義(String型),口座番号(String型),預金残高(long型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/15
	*/
	public Account(String userName, String accountNumber, long depositBalance) {
		//代入された数値を初期値として、口座名義のフィールドを宣言
		this.userName = userName;
		//代入された数値を初期値として、口座番号のフィールドを宣言
		this.accountNumber = accountNumber;
		//代入された数値を初期値として、預金残高のフィールドを宣言
		this.depositBalance = depositBalance;
	}

	/*
	 * コンストラクタ名：Account
	 * 概要:銀行利用者と口座開設日に関する情報のインスタンスを、各クラス型変数を初期値で宣言
	 * 引数：口座名義(String型),口座番号(String型),預金残高(long型),口座開設日(Day型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/15
	*/
	public Account(String userName, String accountNumber, long depositBalance, Day openingDay) {
		//銀行利用者に関する情報を初期値としてフィールドを宣言
		this(userName, accountNumber, depositBalance);
		//口座開設日のフィールドを初期化
		this.openingDay = new Day(openingDay);
	}

	/*
	 * ゲッタ名：getName
	 * 概要:口座名義を取得する
	 * 引数：なし
	 * 戻り値：口座名義(String型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/15
	*/
	public String getName() {
		//口座名義を返却
		return userName;
	}

	/*
	 * ゲッタ名：getNumber
	 * 概要:口座番号を取得する
	 * 引数：なし
	 * 戻り値：口座番号(String型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/15
	*/
	public String getNumber() {
		//口座番号を返却
		return accountNumber;
	}

	/*
	 * ゲッタ名：getBalance
	 * 概要:預金座高を取得する
	 * 引数：なし
	 * 戻り値：預金残高(long型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/15
	*/
	public long getBalance() {
		//預金残高を返却
		return depositBalance;
	}

	/*
	 * ゲッタ名：getOpeningDay
	 * 概要:口座開設日を取得する
	 * 引数：なし
	 * 戻り値：	口座開設日(Day型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/15
	*/
	public Day getOpeningDay() {
		//口座開設日を返却
		return new Day(openingDay);
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

	/*
	 * 関数名：putAccountSpec
	 * 概要:入力された、口座に関する情報を表示
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/15
	*/
	public void putAccountSpec() {
		//口座名義を表示
		System.out.println("口座名義：" + userName);
		//口座番号を表示
		System.out.println("口座番号：" + accountNumber);
		//預金残高を表示
		System.out.println("預金残高：" + depositBalance + "円");
	}
	
	/*
	 * 関数名：putAllSpec
	 * 概要:入力された、口座とその開設日に関する情報を表示
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/15
	*/
	public void putAllSpec() {
		//口座名義を表示
		System.out.println("口座名義：" + userName);
		//口座番号を表示
		System.out.println("口座番号：" + accountNumber);
		//預金残高を表示
		System.out.println("預金残高：" + depositBalance + "円");
		//口座開設日を表示
		System.out.println("口座開設日：" + openingDay);
	}

	/*
	 * 関数名：toString
	 * 概要:口座とその開設日に関する情報を表示
	 * 引数：なし
	 * 戻り値：口座に関する全ての情報の表記(String型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/15
	*/
	public String toString() {
		//口座に関する全ての情報の表記を返却
		return String.format("-----------口座情報-----------\n" +
				"口座名義  ：" + userName + "\n"
				+ "口座番号  ：" + accountNumber + "\n"
				+ "預金残高  ：" + depositBalance + "円\n"
				+ "口座開設日：" + openingDay.toString());
	}
}
