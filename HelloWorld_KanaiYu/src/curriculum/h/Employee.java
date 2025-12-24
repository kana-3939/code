package curriculum.h;

//④継承
public abstract class Employee {
	private String employeeId;
	private String name;

	//コンストラクタ
	public Employee(String id, String name) {
		this.employeeId = id;
		this.name = name;
	}

	//methods
	public String getEmployeeId() {
		return employeeId;
	}

	public String getName() {
		return name;
	}
	
	// 抽象メソッド：給与計算（子クラスで具体的に実装する）
    public abstract int calculateDailyWage(int hoursWorked);

}
