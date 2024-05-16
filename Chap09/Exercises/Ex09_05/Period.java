package Chap09.Exercises.Ex09_05;

/*
* クラス名:Period
* 概要:期間に関する情報を管理する
* 作成者:S.Hiruta
* 作成日:2024/05/16
*/
public class Period {

	//期間の開始・終了を表わすフィールドの初期値を定数として宣言
	final Day DEFAULT_DATE = new Day();

	//期間の開始を表わすフィールドを宣言
	private Day startDate = DEFAULT_DATE;
	//期間の終了を表わすフィールドを宣言
	private Day endDate = DEFAULT_DATE;

	/*
	 * コンストラクタ名：Period
	 * 概要:期間に関する情報のインスタンスを、代入される値を初期値として宣言
	 * 引数：期間開始日(Day型),期間終了日(Day型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/16
	*/
	public Period(Day startDate, Day endDate) {
		//入力される開始日でフィールドを初期化
		this.startDate = startDate;
		//入力される終了日でフィールドを初期化
		this.endDate = endDate;
	}

	/*
	 * 関数名：toString
	 * 概要：指定期間の開始日・終了日の表記を返却
	 * 引数：なし
	 * 戻り値：指定期間の開始日・終了日の表記(String型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/16
	*/
	public String toString() {
		//指定期間の開始日・終了日の表記を返却
		return String.format("開始日  ：" + startDate.toString()
				+ "\n終了日  ：" + endDate.toString());
	}
}
