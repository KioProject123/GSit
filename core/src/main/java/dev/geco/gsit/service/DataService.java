package dev.geco.gsit.service;

import dev.geco.gsit.GSitMain;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DataService {

    public DataService(GSitMain gSitMain) {
    }

    public boolean connect() {
        return true;
    }

    public boolean isConnected() {
        return true;
    }

    private boolean reconnect() {
        return true;
    }

    private Connection getConnection(boolean withDatabase) throws SQLException {
        throw new UnsupportedOperationException("");
    }

    public void execute(String query, Object... parameters) throws SQLException {
    }

    public ResultSet executeAndGet(String query, Object... parameters) throws SQLException {
        throw new UnsupportedOperationException("");
    }

    private void ensureConnection() throws SQLException {
    }

    public void close() {
    }

}
