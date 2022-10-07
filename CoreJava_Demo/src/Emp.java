import java.util.Comparator;

public class Emp implements Comparable<Emp> {
	private int empId;
	private String empName;
	private float empSalary;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public float getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(float empSalary) {
		this.empSalary = empSalary;
	}

	public Emp() {
		super();
	}

	public Emp(int empId, String empName, float empSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
	}

	@Override
	public String toString() {
		return "Emp [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + "]";
	}

	/*
	 * @Override //descending public int compareTo(Emp o) { if (empSalary >
	 * o.empSalary) return -1; else if (empSalary < o.empSalary) return 1; else
	 * return 0; }
	 */

	@Override // ascending
	public int compareTo(Emp o) {
		if (empSalary > o.empSalary)
			return 1;
		else if (empSalary < o.empSalary)
			return -1;
		else
			return 0;
	}

}
