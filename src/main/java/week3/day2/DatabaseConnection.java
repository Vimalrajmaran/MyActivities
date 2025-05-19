package week3.day2;

public abstract class DatabaseConnection {

    // Abstract methods
    public abstract void connect();
    public abstract void disconnect();
    public abstract void executeUpdate(String query);
}