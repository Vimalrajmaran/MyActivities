package week3.day2;

public class MySQLDatabase implements DatabaseConnection {

	public void connect() {
		// TODO Auto-generated method stub
		System.out.println("Connected to MySQL Database");
	}

	public void disconnect() {
		// TODO Auto-generated method stub
		System.out.println("Disconnected to MySQL Database");
	}

	public void executeUpdate(String query) {
		// TODO Auto-generated method stub
		System.out.println("Executing query:" +query);
	}

}
