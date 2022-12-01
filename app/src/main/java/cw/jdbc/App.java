package cw.jdbc;

import cw.jdbc.feature.human.HumanService;
import cw.jdbc.feature.storage.DatabaseInitService;
import cw.jdbc.feature.storage.Storage;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;

public class App {
    public static void main(String[] args) throws SQLException {
        Storage storage = Storage.getInstance();
        new DatabaseInitService().initDb(storage);
        HumanService humanService = new HumanService(storage);
        humanService.printHumanInfo(3);
//        humanService.createNewHuman("Valerii", LocalDate.now());
//        humanService.printHumanIds();



//        String insertSQL = String.format(
//                "INSERT INTO human (name, birthday) VALUES ('%s', '%s')",
//                "Musk", LocalDate.now()
//        );
//        storage.executeUpdate(insertSQL);
//
//        String selectSQL = "SELECT id, name, birthday FROM human WHERE id = 1";
//        Statement st = storage.getConnection().createStatement();
//        ResultSet rs = st.executeQuery(selectSQL);
//        if(rs.next()){
//            long id = rs.getLong("id");
//            String name = rs.getString("name");
//            LocalDate birthday = LocalDate.parse(rs.getString("birthday"));
//            System.out.println("id = " + id);
//            System.out.println("name = " + name);
//            System.out.println("birthday = " + birthday);
//        }else{
//            System.out.println("Human id not found");
//        }
//        rs.close();
//        st.close();
    }
}
