package curriculum.h;

//④継承
public class PartTimeEmployee extends Employee {
	// 定数
	private static final int HOURLY_RATE = 1000;

	// コンストラクタ
	public PartTimeEmployee(String id, String name) {
		super(id, name);
	}

	@Override
	public int calculateDailyWage(int hoursWorked) {
		// 割増なし
		return hoursWorked * HOURLY_RATE;
	}
	
	//確認
		public static void main(String[] args) {
		PartTimeEmployee test = new PartTimeEmployee("F-TEST", "FullTime Tester");
	    int hoursWorked = 9;
	    int result = test.calculateDailyWage(hoursWorked);	
	    System.out.println("確認: " + result + "円");
		}   
}
