package Chap13.Exercises.Ex09_04.copy;

/**
* クラスHumanは人間の情報を管理するクラスです。
* 作成日：2024/05/15
* 名前・身長・体重・bmi・誕生日の情報を取り扱っています。
* @auther S.Hiruta
*/
public class Human {

	/**
	 * 名前の情報を持つフィールド
	*/
	private String humanName;
	/**
	 * 身長の情報を持つフィールド
	*/
	private double humanHeight;
	/**
	 * 体重の情報を持つフィールド
	*/
	private double humanWeight;
	/**
	 * bmi(BodyMassIndex)の情報を持つフィールド
	*/
	private double humanBmi;
	/**
	 * 誕生日を表すフィールド
	*/
	private Day birthDay;

	//cm単位で入力される身長をm単位に変換する為の定数100を宣言
	final int METER_CONVERSION = 100;

	/**
	 * コンストラクタHumanは人間に関する情報のインスタンスを、各クラス型変数を初期値で宣言するコンストラクタです。
	 * 作成日： 2024/05/15
	 * @param 名前(String型),身長(double型),体重(double型),誕生日(Day型)
	 * @auther S.Hiruta
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

	/**
	 * メソッドgetBirthDayは、誕生日を取得するメソッドです。
	 * 作成日： 2024/05/15
	 * @return 誕生日(Day型)
	 * @auther S.Hiruta
	*/
	public Day getBirthDay() {
		//誕生日を返却
		return new Day(birthDay);
	}

	/**
	 * メソッドputSpecは入力された、名前・身長・体重と、算出されるbmiの情報を表示するメソッドです。
	 * 作成日： 2024/05/15
	 * @auther S.Hiruta
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
		System.out.printf("%2.2f", humanBmi);
		//文言を締めくくる
		System.out.println("です。");
	}

	/**
	 * メソッドtoStringは、対象の人間に関する情報を表示するメソッドです。
	 * 作成日： 2024/05/15
	 * @return 対象の人間に関する情報の表記(String型)
	 * @auther S.Hiruta
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
