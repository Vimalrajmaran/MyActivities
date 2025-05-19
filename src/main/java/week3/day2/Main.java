package week3.day2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*DatabaseConnection db = new MySQLDatabase();
		db.connect();
		db.executeUpdate("UPDATE users SET name='Vimal' WHERE id=1");
		db.disconnect();*/
		DatabaseConnection db1 = new OracleDatabase();
		db1.connect();
		db1.executeUpdate("UPDATE users SET name='Vimal' WHERE id=101");
		db1.disconnect();
		
		
	}

}
