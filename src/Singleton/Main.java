package Singleton;

public class Main {

    public static void main(String[] args) {
        DatabaseConnection.getConnection();

        DatabaseConnection.getConnection();
        DatabaseConnection.getConnection();
        DatabaseConnection.getConnection();
        DatabaseConnection.getConnection();
        DatabaseConnection.getConnection();
        DatabaseConnection.getConnection();
    }

}
