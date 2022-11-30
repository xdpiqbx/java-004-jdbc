package cw.jdbc;

import cw.jdbc.feature.storage.DatabaseInitService;
import cw.jdbc.feature.storage.Storage;

import java.sql.SQLException;

public class App {
    public static void main(String[] args) throws SQLException {
        Storage storage = Storage.getInstance();
        new DatabaseInitService().initDb(storage);
    }
}
