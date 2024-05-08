package Chap08.Lists.List08_03;

/*
* クラス名:List08_0
* 概要:銀行口座クラス【第2版】
* 作成者:S.Hiruta
* 作成日:2024/05/07
*/
class Account {
	//口座名義を格納する変数を定義
	private String name;
	//口座番号を格納する変数を定義
	private String no;
	//預金残高を格納する変数を定義
	private long balance;
	
	Account(String n, String num, long z) {
		//
		name = n;
		//
		no = num;
		//
		balance = z;
	}
	
	String getName() {
		//
		return name;
	}
	
	String getNo() {
		//
		return no;
	}
	
	long getBalance() {
		//
		return balance;
	}
	
	void deposit(long k) {
		//
		balance += k;
	}
	
	void withdraw(long k) {
		//
		balance -= k;
	}
}

/*
* クラス名:List08_0
* 概要:銀行口座クラス【第1版】のテストを行うクラス
* 作成者:S.Hiruta
* 作成日:2024/05/07
*/
class AccountTester {

	/*
	 * 関数名：main
	 * 概要:銀行口座クラス【第1版】のテストを行う
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/07
	*/
	public static void main(String[] arg) {

		//
		Account adachi = new Account("足立幸一", "123456", 1000);
		//
		Account nakata = new Account("仲田真二", "654321", 200);

		//足立君が200円おろす
		adachi.withdraw(200);
		//仲田君が100円預ける
		nakata.deposit(100);

		//足立君の口座
		System.out.println("■足立君の口座");
		//足立君の口座名義の表示
		System.out.println(" 口座名義：" + adachi.getName());
		//足立君の口座番号の表示
		System.out.println(" 口座番号：" + adachi.getNo());
		//足立君の預金残高の表示
		System.out.println(" 預金残高：" + adachi.getBalance());

		//仲田君の口座
		System.out.println("■仲田君の口座");
		//仲田君の口座名義の表示
		System.out.println(" 口座名義：" + nakata.getName());
		//仲田君の口座番号の表示
		System.out.println(" 口座番号：" + nakata.getNo());
		//仲田君の預金残高の表示
		System.out.println(" 預金残高：" + nakata.getBalance());
	}
}
