package Chap09.Exercises.Ex09_04;

/*
* クラス名:Human
* 概要:個人に関する情報を管理する
* 作成者:S.Hiruta
* 作成日:2024/05/15
*/
public class Human {
	//必要な情報のフィールドを非公開で宣言
	///名前の情報を持つフィールドを宣言
	private String humanName;
	///身長の情報を持つフィールドを宣言
	private double humanHeight;
	///体重の情報を持つフィールドを宣言
	private double humanWeight;
	//bmi(BodyMassIndex)の情報を持つフィールドを宣言
	private double humanBmi;
	//誕生日を表すフィールドを宣言
	private Day birthDay;
	
	//cm単位で入力される身長をm単位に変換する為の定数100を宣言
	final int METER_CONVERSION = 100;
	
	/*
	 * コンストラクタ名：Human
	 * 概要:人間に関する情報のインスタンスを、各クラス型変数を初期値で宣言
	 * 引数：名前(String型),身長(double型),体重(double型),誕生日(Day型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/15
	*/
	public Human(String humanName, double humanHeight, double weightField, Day birthDay) {
		//名前の情報のインスタンスを初期化
		this.humanName = humanName;
		//身長の情報のインスタンスを初期化
		this.humanHeight = humanHeight;
		//体重の情報のインスタンスを初期化
		this.humanWeight = weightField;
		//BMIの値を、身長/(体重)^2で算出
		//BMIの情報のインスタンスを算出した値で初期化
		this.humanBmi = weightField / ((humanHeight / METER_CONVERSION) * (humanHeight / METER_CONVERSION));
		//誕生日のフィールドを初期化
		this.birthDay = new Day(birthDay);
	}
	
	/*
	 * ゲッタ名：getBirthDay
	 * 概要:誕生日を取得する
	 * 引数：なし
	 * 戻り値：	誕生日(Day型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/15
	*/
	public Day getBirthDay() {
		//誕生日を返却
		return new Day(birthDay);
	}
	
	/*
	 * 関数名：putSpec
	 * 概要:入力された、名前・身長・体重と、算出されるbmiの情報を表示する
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/15
	*/
	public void putSpec() {
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
	
	/*
	 * 関数名：toString
	 * 概要：対象の人間に関する情報を表示
	 * 引数：なし
	 * 戻り値：対象の人間に関する情報の表記(String型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/15
	*/
	public String toString() {
		//対象の人間に関する情報の表記を返却
		return String.format("\n-----------生体情報-----------\n" +
				"名前  ：" + humanName + "\n"
				+ "身長  ：" + humanHeight + "cm\n"
				+ "体重  ：" + humanWeight + "kg\n"
				+ "BMI   ：" + humanBmi + "\n"
				+ "誕生日：" + birthDay.toString());
	}
}
