package week9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class databasePath {
    Database(String databasePath) { // constructor
// create table, or make sure it is created.
        try (Connection connection = DriverManager.getConnection(databasePath);
             Statement statement = connection.createStatement()) {
            statement.execute("CREATE TABLE IF NOT EXISTS movies (name text, stars")

        } cateh (SQLException e) {
            System.out.println("Error creating movie DB table because " + e);
        }
        public void addNewMovie(Movie movie) {
            try (Connection connection = DriverManager.getConnection(databasePath))
        } catch (SQLException e) {
            System.out.println("Error adding movie " + movie + " because "+ e;

        }

        }
}
