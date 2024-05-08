package Chap08.Lists.List08_01;

/*
* クラス名:List08_01
* 概要:2人分の銀行口座のデータを扱うプログラム
* 作成者:S.Hiruta
* 作成日:2024/05/07
*/
public class List08_01 {

	/*
	 * 関数名：main
	 * 概要:2人分の銀行口座のデータを表示
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/07
	*/
	public static void main(String[] arg) {
		//足立君の口座名義
		String adachiAccountName = "足立幸一";
		//足立君の口座番号
		String adachiAccountNo = "123456";
		//足立君の預金通帳
		long adachiAccountBalance = 1000;

		//仲田君の口座名義
		String nakataAccountName = "仲田真二";
		//仲田君の口座番号
		String nakataAccountNo = "654321";
		//仲田君の預金通帳
		long nakataAccountBalance = 200;
		
		//足立君が200円おろす
		adachiAccountBalance -= 200;
		//仲田君が100円預ける
		nakataAccountBalance += 100;
		
		//足立君の口座
		System.out.println("■足立君の口座");
		//足立君の口座名義の表示
		System.out.println(" 口座名義：" + adachiAccountName);
		//足立君の口座番号の表示
		System.out.println(" 口座番号：" + adachiAccountNo);
		//足立君の預金残高の表示
		System.out.println(" 預金残高：" + adachiAccountBalance);
		
		//仲田君の口座
		System.out.println("■仲田君の口座");
		//仲田君の口座名義の表示
		System.out.println(" 口座名義：" + nakataAccountName);
		//仲田君の口座番号の表示
		System.out.println(" 口座番号：" + nakataAccountNo);
		//仲田君の預金残高の表示
		System.out.println(" 預金残高：" + nakataAccountBalance);
	}
}
