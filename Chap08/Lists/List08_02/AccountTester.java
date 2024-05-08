package Chap08.Lists.List08_02;

/*
* クラス名:List08_0
* 概要:銀行口座クラス【第1版】
* 作成者:S.Hiruta
* 作成日:2024/05/07
*/
class Account {
	//口座名義を格納する変数を定義
	String name = null;
	//口座番号を格納する変数を定義
	String no = null;
	//預金残高を格納する変数を定義
	long balance = 0;
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
		Account adachi = new Account();
		//
		Account nakata = new Account();

		//足立君の口座名義
		adachi.name = "足立幸一";
		//足立君の口座番号
		adachi.no = "123456";
		//足立君の預金通帳
		adachi.balance = 1000;

		//仲田君の口座名義
		nakata.name = "仲田真二";
		//仲田君の口座番号
		nakata.no = "654321";
		//仲田君の預金通帳
		nakata.balance = 200;

		//足立君が200円おろす
		adachi.balance -= 200;
		//仲田君が100円預ける
		nakata.balance += 100;

		//足立君の口座
		System.out.println("■足立君の口座");
		//足立君の口座名義の表示
		System.out.println(" 口座名義：" + adachi.name);
		//足立君の口座番号の表示
		System.out.println(" 口座番号：" + adachi.no);
		//足立君の預金残高の表示
		System.out.println(" 預金残高：" + adachi.balance);

		//仲田君の口座
		System.out.println("■仲田君の口座");
		//仲田君の口座名義の表示
		System.out.println(" 口座名義：" + nakata.name);
		//仲田君の口座番号の表示
		System.out.println(" 口座番号：" + nakata.no);
		//仲田君の預金残高の表示
		System.out.println(" 預金残高：" + nakata.balance);
	}
}
