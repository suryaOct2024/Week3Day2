package week3.day2.HomeAssignments;

public class Concrete implements DatabaseConnection {
	
	@Override
	public void connect() {
		
		System.out.println("Connect");
		
	}

	@Override
	public void disconnect() {
		
		System.out.println("Disconnect");
		
	}

	@Override
	public void executeUpdate() {
		
		System.out.println("Execute Update");
		
	}

	public static void main(String[] args) {
		
		Concrete concreteObj = new Concrete();
		concreteObj.connect();
		concreteObj.disconnect();
		concreteObj.executeUpdate();
	}
	
}
