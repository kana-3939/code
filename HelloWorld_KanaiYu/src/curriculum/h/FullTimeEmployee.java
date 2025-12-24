package curriculum.h;

//④継承
public class FullTimeEmployee extends Employee {
	// 定数「時給は1200円で固定」
	private static final int HOURLY_RATE = 1200;

	// コンストラクタ
	//super(id, name): 子クラスのコンストラクタから、親クラス（Employee）のコンストラクタの呼び出し
	public FullTimeEmployee(String id, String name) {
		super(id, name);
	}

	//@Overrideは宣言「親クラスにあるメソッドを、子クラスで上書きして作り直している」
	//hoursWorked：働いた時間が8時間までの時
	@Override
	public int calculateDailyWage(int hoursWorked) {
		if (hoursWorked <= 8) {
			return hoursWorked * HOURLY_RATE;
		}
		//8時間超過時
		else {
			// 8時間分 
			int regularWage = 8 * HOURLY_RATE;
			// 残業時間（＝総労働時間-8時間）
			int overtimeHours = hoursWorked - 8;
			// 残業時間分（1.25倍）
			int overtimeWage = (int) (overtimeHours * HOURLY_RATE * 1.25);
			return regularWage + overtimeWage;
		}
	}
	
	//確認
	public static void main(String[] args) {
		FullTimeEmployee test = new FullTimeEmployee("F-TEST", "FullTime Tester");
		int hoursWorked = 9;
		int result = test.calculateDailyWage(hoursWorked);
		System.out.println("確認: " + result + "円");
	}
}
