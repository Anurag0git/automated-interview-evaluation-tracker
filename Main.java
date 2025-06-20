import util.DBConnection;
import java.sql.Connection;
import java.sql.SQLException;



public class Main {
    public static void main(String[] args) {
        try(Connection conn = DBConnection.getConnection()){
            System.out.println("DB connection successful!");
        }catch (SQLException e){
            System.out.println("DB connection failed!" + e.getMessage());
        }
    }
}
