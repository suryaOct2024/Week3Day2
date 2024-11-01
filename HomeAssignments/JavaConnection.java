package week3.day2.HomeAssignments;

public class JavaConnection extends MySqlConnection {
	
	public void executeQuery()
	{
		System.out.println("Execute Query");
	}

	public static void main(String[] args) {
		
		JavaConnection connectObj = new JavaConnection();
		connectObj.connect();
		connectObj.disconnect();
		connectObj.executeUpdate();
		

	}

}
