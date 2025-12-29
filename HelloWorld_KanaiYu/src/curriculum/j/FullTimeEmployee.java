package curriculum.j;

//⑥インターフェイスと抽象クラス
public class FullTimeEmployee extends Employee {
	public FullTimeEmployee(String id, String name) {
		//一世代上の親クラスのコンストラクタ
		super(id, name);
	}

	//給与計算メソッド　
	@Override
	public int costForDay(int hoursWorked) {
		//時給1250
		int hourlyRate = 1250;
		//残業時間
		int overtime = Math.max(0, hoursWorked - 8);
		//８時間
		int regularHours = hoursWorked - overtime;
		//日当を返す（8時間超過は1.25倍）
		return (regularHours * hourlyRate) + (int) (overtime * hourlyRate * 1.25);
	}
}
