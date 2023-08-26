package ProxyDesignPattern;

public class EmployeeDaoProxy implements EmployeeDao{

	EmployeeDao employeeDaoobj;
	
	public EmployeeDaoProxy() {
		employeeDaoobj =  new EmployeeDaoImpl();
	}
	
	@Override
	public void create(String client, EmployeeDo obj) throws Exception {
		if(client.equals("ADMIN")) {
			employeeDaoobj.create(client, obj);
			return;
		}
		throw new Exception("Acess Denied");
	}

	@Override
	public void delete(String client, int employeeId) throws Exception {
		if(client.equals("ADMIN")) {
			employeeDaoobj.delete(client, employeeId);
			return;
		}
		throw new Exception("Access Denined");
	}

	@Override
	public EmployeeDo get(String client, int employeeId) throws Exception {
		if(client.equals("ADMIN") || client.equals("USER")) {
			return employeeDaoobj.get(client, employeeId);
		}
		throw new Exception("Access Denined");
	}
	

}
