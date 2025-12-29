package curriculum.j;

//⑥インターフェイスと抽象クラス 
public abstract class Employee implements Billable {
	private String employeeId;
	private String name;

	//コンストラクタ
	public Employee(String id, String name) {
		this.employeeId = id;
		this.name = name;
	}
	
	public String getName() {
        return name;
    }
	
	public String getId() {
        return employeeId;
    }
}
