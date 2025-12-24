package curriculum.g;

//③カプセル化
public class Employee {
	//employeeId(文字列型)フィールド
	private String employeeId;
	//name(文字列型)フィールド
	private String name;

	//// Setter method
	public void setEmployeeId(String id) {
		// thisを使ってフィールドに代入
		this.employeeId = id;
	}

	// Getter method
	public String getEmplyeeId() {
		return employeeId;
	}

	// Setter method
	public void setName(String name) {
		// thisを使ってフィールドに代入
		this.name = name;
	}

	// Getter method
	public String getName() {
		return name;
	}

}
