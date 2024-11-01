package week3.day2.HomeAssignments;

public abstract class MySqlConnection implements DatabaseConnection {
	
	public abstract void executeQuery();
	
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
		
		executeQuery();
		System.out.println("Execute Update");
		
	}


}
