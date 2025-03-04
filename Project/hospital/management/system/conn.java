package Project.hospital.management.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class conn {
    Connection connection;
    Statement statement;
    public conn(){
        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3307/hospital_management_system", "root","Ayon@8250");
            statement = connection.createStatement();


        } catch(Exception e){
            e.printStackTrace();
        }
    }
}
