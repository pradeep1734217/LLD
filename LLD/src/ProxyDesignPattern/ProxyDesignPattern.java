package ProxyDesignPattern;

public class ProxyDesignPattern {

	public static void main(String[] args) {

		EmployeeDao employeeDao = new EmployeeDaoProxy();
		try {
			employeeDao.create("ADMIN", new EmployeeDo());
			System.out.println("Operation successful");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
