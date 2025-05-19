package week3.day2;

public abstract class OracleDatabase implements DatabaseConnection {

		public void Connect()
		{
			System.out.println("Connected to Oracle Database");
		}
		public void diconnect()
		{
			System.out.println("Disconnect from Oracle Database");
		}
		public void executeUpdate(String query)
		{
			System.out.println("Executing SQL Update:" +query);
		}
}
