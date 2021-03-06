package com.minimatash.persistence;

import java.io.IOException;
import java.sql.SQLException;

/**
 * Created by on 20.06.16.
 */
public interface LoginPersistence {
    Boolean getLog(String login, Integer password) throws SQLException;
    Boolean registerLog(String login, Integer password) throws SQLException, IOException;
}
