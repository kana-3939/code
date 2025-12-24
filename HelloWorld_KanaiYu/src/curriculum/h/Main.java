package curriculum.h;

//④継承
public class Main {
	public static void main(String[] args) {
		// オブジェクトの生成
		FullTimeEmployee fullTime = new FullTimeEmployee("F001", "正社員A");
		PartTimeEmployee partTime = new PartTimeEmployee("P001", "パートB");

		// 9時間勤務時の給与を出力
		int hoursWorked = 9;
		System.out.println("正社員の給与: " + fullTime.calculateDailyWage(hoursWorked) + " 円");
		System.out.println("パート社員の給与: " + partTime.calculateDailyWage(hoursWorked) + " 円");
	}
}
