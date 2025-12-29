package curriculum.j;

//⑤ポリモーフィズム
public class ContractEmployee extends Employee {
	public ContractEmployee(String id, String name) {
		super(id, name);
	}

	//給与計算(契約社員)
	@Override
	public int costForDay(int hoursWorked) {
		return hoursWorked * 1000;
	}
}
