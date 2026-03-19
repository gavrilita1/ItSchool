package sesson33;

public class DatabaseConnection {
    private String connectionString;
    private static DatabaseConnection instance;

    private DatabaseConnection(){
        connectionString = "jdbc:postgresql://192.168.1.170:5432/sample?ssl=true";
    }

    public static synchronized DatabaseConnection getInstance(){
        if(instance == null){
            instance = new DatabaseConnection();
        }
        return instance;
    }

    public void connect(){
        System.out.println("Connected to : " + connectionString);
    }
}

class SingletonDemo{
    public static void main(String[] args) {
        DatabaseConnection db = DatabaseConnection.getInstance();
        db.connect();
        System.out.println(db);
        DatabaseConnection db2 = DatabaseConnection.getInstance();
        System.out.println(db2);
        System.out.println(db.equals(db2));
        System.out.println(db==db2);
    }
}