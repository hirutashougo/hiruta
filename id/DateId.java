package id;

//カレンダークラスのインポート
import static java.util.Calendar.*;

//GregorianCalendarクラスのインポート
import java.util.GregorianCalendar;

/*
* クラス名:RandId
* 概要:
* 作成者:S.Hiruta
* 作成日:2024/05/23
*/
public class DateId {
	
	//識別番号に代入される数字を格納するフィールドを宣言
	private static int counter;
	
	//識別番号を格納するフィールドを宣言
	private int id;
	
	//グレゴリオカレンダーの月数出ryくの際に用いる定数1を宣言
		private static final int ADJUSTMENT_NUMBER = 1;
		//識別番号の年数を配置するために乗算する定数
		private static final int YEAR_POSITION = 1000000;
		//識別番号の月数を配置するために乗算する定数
		private static final int MONTH_POSITION = 10000;
		//識別番号の日数を配置するために乗算する定数
		private static final int DATE_POSITION = 100;
	
	//静的初期化子を用いて、年月日の初期値を実行日に設定
		static {
			//グレゴリオカレンダークラスの変数を設定
			GregorianCalendar today = new GregorianCalendar();
			//実行年を取得
			int todaYear = today.get(YEAR);
			//実行月を取得
			int todayMonth = today.get(MONTH) + ADJUSTMENT_NUMBER;
			//実行日を取得
			int todayDate = today.get(DATE);
			
			//実行日の日付を表示
			System.out.printf("今日は%04d年%02d月%02d日です。\n", todaYear, todayMonth, todayDate);
			//識別番号の上8ケタを設定
			counter = todaYear * YEAR_POSITION + todayMonth * MONTH_POSITION + todayDate * DATE_POSITION;
		}
	
	/*
	 * コンストラクタ名：DateId
	 * 概要：
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/20
	*/
	public  DateId() {
		//識別番号を1加算する
		id = ++counter;
	}
	
	/*
	 * メソッド名：getId
	 * 概要:識別番号を取得
	 * 引数：なし
	 * 戻り値：識別番号(int型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/20
	*/
	public int getId() {
		//識別番号を取得
		return id;
	}

}
