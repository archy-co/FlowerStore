package db;

import java.util.Random;

public class Connection {
    public static Connection thisConnection;
    private static boolean accessed = false;

    private int id;

    private Connection() {
        Random r = new Random();
        this.id = r.nextInt(100);
    }

    public static Connection getConnection() {
        if (!accessed){
            thisConnection = new Connection();
            accessed = true;
        }
        return thisConnection;
    }

    public int getId(){
        return id;
    }
}
