package Chap12;

//Scannerをインポート
import java.util.Scanner;

/*
* クラス名:CompBalanceTester
* 概要:定期預金付き銀行口座のクラス(TimeAccount)をテストする
* 作成者:S.Hiruta
* 作成日:2024/05/24
*/
public class CompBalanceTester {

	//Scannerクラスの変数を設定
	static Scanner standardInput = new Scanner(System.in);

	//二つの口座の総残高が等しいことを表す定数を定義
	static final int equalResult = 0;
	//最初の口座の総残高が等しいことを表す定数を定義
	static final int formarLargerResule = 1;
	//2番目の口座の総残高が等しいことを表す定数を定義
	static final int latterLargerResule = -1;

	/*
	 * 関数名：printText
	 * 概要:入力された文言を表示
	 * 引数：表示したい文言(String型)
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/24
	*/
	static void printText(String displayText) {
		//入力された文言を表示して改行
		System.out.print(displayText);
	}

	/*
	 * 関数名：inputLongNumber
	 * 概要:0以上の整数(long型)を入力させる
	 * 引数：入力内容の文言(String型)
	 * 戻り値：0以上の整数(long型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/24
	*/
	static int inputLongNumber(String desplayIssue) {

		//入力内容の文言を表示
		System.out.print(desplayIssue);

		//入力された整数を読み込む
		int integralNumber = standardInput.nextInt();

		//入力された整数が0未満の場合
		while (integralNumber < 0) {
			//0以上の値で入力するように促す
			printText("0以上の値で入力してください。\n" + desplayIssue);
			//入力された値を読み込む
			integralNumber = standardInput.nextInt();
		}

		//入力された整数を返却
		return integralNumber;
	}

	/*
	 * 関数名：inputString
	 * 概要:文字列(String型)を入力させる
	 * 引数：入力内容の文言(String型)
	 * 戻り値：文字列(String型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/25
	*/
	static String inputString(String desplayIssue) {

		//入力内容の文言を表示
		System.out.print(desplayIssue);

		//入力された文字列を読み込む
		String stringText = standardInput.next();

		//入力された文字列を返却
		return stringText;
	}

	/*
	 * 関数名：setAccount
	 * 概要:銀行口座を開設する
	 * 引数：なし
	 * 戻り値：銀行口座(Account型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/25
	*/
	static Account setAccount() {
		
		//銀行口座の開設を宣言
		printText("銀行口座を開設します。\n");
		
		//口座名義の入力を促す
		String accountName = inputString("口座名義：");
		//口座番号の入力を促す
		String accountNumber = inputString("口座番号：");
		//預金残高の入力を促す
		long depositBalance = inputLongNumber("預金残高：");
		//銀行口座のインスタンスを宣言
		Account baukAccount = new Account(accountName, accountNumber, depositBalance);

		//開設された銀行口座を返却
		return baukAccount;
	}

	/*
	 * 関数名：setDefaultAccount
	 * 概要:適当な初期設定で銀行口座を開設する
	 * 引数：なし
	 * 戻り値：銀行口座(Account型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/25
	*/
	static Account setDefaultAccount() {
		
		//口座名義の入力を促す
		String accountName = "No Name";
		//口座番号の入力を促す
		String accountNumber = "No Number";
		//預金残高の入力を促す
		long depositBalance = 0;
		//銀行口座のインスタンスを宣言
		Account baukAccount = new Account(accountName, accountNumber, depositBalance);

		//開設された銀行口座を返却
		return baukAccount;
	}

	/*
	 * 関数名：setTimeAccount
	 * 概要:定期預金付き銀行口座を開設する
	 * 引数：なし
	 * 戻り値：定期預金付き銀行口座(TimeAccount型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/25
	*/
	static TimeAccount setTimeAccount() {
		
		//定期預金付き銀行口座を開設を宣言
		printText("定期預金付き銀行口座を開設します。\n");
		
		//口座名義の入力を促す
		String accountName = inputString("口座名義：");
		//口座番号の入力を促す
		String accountNumber = inputString("口座番号：");
		//預金残高の入力を促す
		long depositBalance = inputLongNumber("預金残高：");
		//定期預金残高の入力を促す
		long timeDeposit = inputLongNumber("定期預金残高：");
		//定期預金付き銀行口座のインスタンスを生成
		TimeAccount baukTimeAccount = new TimeAccount(accountName, accountNumber, depositBalance, timeDeposit);

		//開設された定期預金付き銀行口座を返却
		return baukTimeAccount;
	}

	/*
	 * メソッド名：compBalance
	 * 概要:定期預金と普通預金の合計額を比較し、結果に応じて-1～1の数字を返却
	 * 引数：2つの口座(Account型)
	 * 戻り値：1つめの口座が、2つめの口座よりも合計金額が
	 			多ければ1、同じなら2、少なければ-1を返却(int型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/24
	*/
	static int compBalance(Account firstAccount, Account secondAccount) {

		//口座残高の比較結果を格納する変数を宣言
		int comparisonResult = equalResult;

		//最初の口座の総残高を格納する変数に、預金残高を設定
		long firstBalanceSum = firstAccount.getBalance();
		//2番目の口座の総残高を格納する変数に、預金残高を設定
		long secondBalanceSum = secondAccount.getBalance();

		//最初の口座が定期預金付きだった場合
		if (firstAccount instanceof TimeAccount) {
			//定期預金付き銀行口座の型の変数にキャストする
			TimeAccount firstTimeAccount = (TimeAccount) firstAccount;
			//総残高に定期預金残高を追加
			firstBalanceSum += firstTimeAccount.getTimeBalance();

		}

		//2番目の口座が定期預金付きだった場合
		if (secondAccount instanceof TimeAccount) {
			//定期預金付き銀行口座の型の変数にキャストする
			TimeAccount secondTimeAccount = (TimeAccount) secondAccount;
			//総残高に定期預金残高を追加
			secondBalanceSum += secondTimeAccount.getTimeBalance();
		}

		//最初の口座の総残高が2番目の口座の総残高よりも大きい場合
		if (firstBalanceSum > secondBalanceSum) {
			//比較結果を対応させる
			comparisonResult = formarLargerResule;
			//2番目の口座の総残高が最初の口座の総残高よりも大きい場合
		} else if (firstBalanceSum < secondBalanceSum) {
			//比較結果を対応させる
			comparisonResult = latterLargerResule;
		}

		//口座残高の比較結果を返却
		return comparisonResult;
	}

	/*
	 * 関数名：isTrueFalse
	 * 概要:0か1での入力をさせる。0ならfalse、1ならtrueを返却
	 * 引数：選択の文言(String型)
	 * 戻り値：true,false(booolean型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/17
	*/
	static boolean isTrueFalse(String desplayIssue) {

		//選択の文言を表示
		System.out.print(desplayIssue + "[0…No/1…Yes]：");

		//選択結果を格納する変数を定義
		boolean judgeBoolean = true;

		//trueを返却する選択を表す定数を定義
		final int RETURN_TRUE = 1;
		//trueを返却する選択を表す定数を定義
		final int RETURN_FALSE = 0;

		//入力された選択を読み込む
		int judgementValue = standardInput.nextInt();
		//0か1が入力されるまで選択を迫る
		while (judgementValue != RETURN_TRUE && judgementValue != RETURN_FALSE) {
			//0か1での入力を促す
			System.out.print("0か1で入力してください：");
			//入力された選択を読み込む
			judgementValue = standardInput.nextInt();
		}
		//0が入力された場合、falseを返却値に格納
		if (judgementValue == RETURN_FALSE) {
			//falseを返却値に格納
			judgeBoolean = false;
		}

		//0か1(falseかtrue)の選択結果を返却する
		return judgeBoolean;
	}

	/*
	 * 関数名：main
	 * 概要:メソッドcompBalanceを検証する
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/26
	*/
	public static void main(String[] args) {

		//1つめの口座を格納する変数を定義
		Account firstComparisonAccount = setDefaultAccount();
		//2つめの口座を格納する変数を定義
		Account secondComparisonAccount = setDefaultAccount();

		//銀行口座の解説及び1つめの口座を作成を宣言
		printText("銀行口座を開設します。\n\n1つめの口座を作成します。\n");

		//定期預金を付けるか選択させる
		//定期預金を付ける場合
		if (isTrueFalse("定期預金を付けますか？")) {
			//定期預金付き銀行口座の情報を入力させる
			TimeAccount firstParticularTimeAccount = setTimeAccount();
			//1つめの口座として設定
			firstComparisonAccount = firstParticularTimeAccount;
			//定期預金を付けない場合
		} else {
			//銀行口座の情報を入力させる
			Account firstParticularAccount = setAccount();
			//1つめの口座として設定
			firstComparisonAccount = firstParticularAccount;
		}

		//2つめの口座を作成を宣言
		printText("\n2つめの口座を作成します。\n");

		//定期預金を付けるか選択させる
		//定期預金を付ける場合
		if (isTrueFalse("定期預金を付けますか？")) {
			//定期預金付き銀行口座の情報を入力させる
			TimeAccount secondParticularTimeAccount = setTimeAccount();
			//2つめの口座として設定
			secondComparisonAccount = secondParticularTimeAccount;
			//定期預金を付けない場合
		} else {
			//銀行口座の情報を入力させる
			Account secondParticularAccount = setAccount();
			//2つめの口座として設定
			secondComparisonAccount = secondParticularAccount;
		}

		//2つの口座の総残高を比較する
		int compResult = compBalance(firstComparisonAccount, secondComparisonAccount);
		//関数から返却された値を表示
		printText("\n返却された数字：" + compResult + "\n\n");

		//2つの口座の総残高を比較した結果を表示
		switch (compResult) {
		//1つめの口座の残高の方が大きい場合
		case formarLargerResule:
			//1つめの口座の残高の方が大きいと表示
			printText("1つめの口座の残高の方が大きいです。");
			//処理を終了
			break;
		//2つの口座の残高は等しい場合
		case equalResult:
			//2つの口座の残高は等しいと表示
			printText("2つの口座の残高は等しいです。");
			//処理を終了
			break;
		//2つめの口座の残高の方が大きい場合
		case latterLargerResule:
			//2つめの口座の残高の方が大きいと表示
			printText("2つめの口座の残高の方が大きいです。");
			//処理を終了
			break;
		}
	}
}

