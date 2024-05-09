package week9;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Database {
        private String databasePath;




        Database(String databasePath) {

            Connection connection = DriverManager.getConnection(databasePath);
            Statement statement = connection.createStatement();
        }



        }
