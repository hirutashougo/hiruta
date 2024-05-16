package Chap10.Lists;

/*
* クラス名:AccountTester
* 概要:足立・仲田の銀行口座に関する情報を表示
* 作成者:S.Hiruta
* 作成日:2024/05/16
*/
public class AccountTester {

	/*
	* クラス名:main
	* 概要:足立・仲田の銀行口座に関する情報を表示
	* 作成者:S.Hiruta
	* 作成日:2024/05/16
	*/
	public static void main(String[] args) {
		//足立君の口座のインスタンスを生成
		Account adachiAccount = new Account("アダチ", "123456", 1000);

		//仲田君の口座のインスタンスを生成
		Account nakataAccount = new Account("ナカタ", "123456", 1000);

		//足立君の口座に関する情報の表示を示唆
		System.out.println("足立君の口座");
		//足立君の口座名義を表示
		System.out.println("口座名義：" + adachiAccount.getAccountName());
		//足立君の口座番号を表示
		System.out.println("口座番号：" + adachiAccount.getAccountNumber());
		//足立君の預金残高を表示
		System.out.println("預金残高：" + adachiAccount.getDepositBalance());
		//足立君の識別番号を表示
		System.out.println("識別番号：" + adachiAccount.getAccountIdentification());
		
		//改行する
		System.out.println();

		//仲田君の口座に関する情報の表示を示唆
		System.out.println("仲田君の口座");
		//仲田君の口座名義を表示
		System.out.println("口座名義：" + nakataAccount.getAccountName());
		//仲田君の口座番号を表示
		System.out.println("口座番号：" + nakataAccount.getAccountNumber());
		//仲田君の預金残高を表示
		System.out.println("預金残高：" + nakataAccount.getDepositBalance());
		//仲田君の識別番号を表示
		System.out.println("識別番号：" + nakataAccount.getAccountIdentification());
	}

}
