package co.bibleit.dependencyinversion;

public class Main {

    public static void main(String[] args) {

    }
}

// Password reminder is a high level class.
// MySqlConnection is a low level class.
// If you change MySqlConnection you have to change the PasswordConnection

class PasswordReminder {

    private int dbConnection;

    public PasswordReminder(MySqlConnection dbconnection){
        this.dbConnection = dbconnection;
    }
}
