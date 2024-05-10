package Chap08.Exercises.Exsercise08_01;

/*
* クラス名:Human
* 概要:個人に関する情報を管理する
* 作成者:S.Hiruta
* 作成日:2024/05/09
*/
class Human {
	//必要な情報のフィールドを非公開で宣言
	///名前の情報を持つフィールドを宣言
	private String humanName;
	///身長の情報を持つフィールドを宣言
	private double humanHeight;
	///体重の情報を持つフィールドを宣言
	private double humanWeight;
	//bmi(BodyMassIndex)の情報を持つフィールドを宣言
	private double humanBmi;
	
	//cm単位で入力される身長をm単位に変換する為の定数100を宣言
	final int METER_CONVERSION = 100;
	
	/*
	 * コンストラクタ名：Human
	 * 概要:名前・身長・体重・bmiのコンストラクタを初期化する
	 * 引数：名前(String型),身長(double型),体重(double型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/09
	*/
	Human(String humanName, double humanHeight, double weightField) {
		//名前の情報のインスタンスを初期化
		this.humanName = humanName;
		//身長の情報のインスタンスを初期化
		this.humanHeight = humanHeight;
		//体重の情報のインスタンスを初期化
		this.humanWeight = weightField;
		//BMIの値を、身長/(体重)^2で算出
		//BMIの情報のインスタンスを算出した値で初期化
		this.humanBmi = weightField / ((humanHeight / METER_CONVERSION) * (humanHeight / METER_CONVERSION));
	}
	
	/*
	 * 関数名：putSpec
	 * 概要:入力された、名前・身長・体重と、算出されるbmiの情報を表示する
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/09
	*/
	void putSpec() {
		//1行改行する
		System.out.println();
		//名前を表示する
		System.out.println("名前は" + humanName + "です。");
		//身長を表示する
		System.out.println("身長は" + humanHeight + "cmです。");
		//体重を表示する
		System.out.println("体重は" + humanWeight + "kgです。");
		//BMIの表示を行う
		System.out.print("BMIは");
		//BMIの表示を行う
		System.out.printf("%2.2f" , humanBmi );
		//文言を締めくくる
		System.out.println("です。");
	}
}
