package Database;

import java.sql.*;

/**
 * Connection to database wordpress for author
 */
public class ConnectionToDatabaseAuthor {
  // JDBC URL, username and password of MySQL server
  private static final String URL = "jdbc:mysql://localhost:8889/wordpress";
  private static final String USER = "root";
  private static final String PASSWORD = "root";

  // JDBC variables for opening and managing connection
  private static Connection CONNECTION;
  private static Statement STATEMENT;
  private static ResultSet RESULT_SET;

  private String SELECT_USERS_TABLE = "SELECT user_login FROM wordpress.wp_users";
  private String SELECT_USER_META_TABLE = "SELECT user_id FROM wordpress.wp_usermeta";
  private String SELECT_POST_TABLE = "SELECT post_author FROM wordpress.wp_posts";
  private String ADDING_AUTHOR = "INSERT INTO wordpress.wp_users (user_login, user_pass, user_nicename, " +
      "user_email, display_name) " +
      "VALUES ('author', MD5('1'), 'author', 'sdfgh@sdfg.sdf', 'author');";
  private String ADDING_ROLE_TO_AUTHOR = "INSERT INTO wordpress.wp_usermeta (user_id, meta_key, meta_value) " +
      "VALUES (LAST_INSERT_ID(), 'wp_capabilities', 'a:1:{s:6:\"author\";b:1;}');";
  private String DELETE_ROLE_AUTHOR = "DELETE FROM wordpress.wp_usermeta " +
      "WHERE user_id = (SELECT ID FROM wp_users WHERE " +
      "user_login = 'author')";
  private String DELETE_AUTHOR = "DELETE FROM wordpress.wp_users " +
      "WHERE user_login = 'author'";
  private String DELETE_DRAFT = "DELETE FROM wordpress.wp_posts " +
      "WHERE post_author = (SELECT ID FROM wp_users WHERE user_login = 'author')";
  private String DELETE_AUTO_DRAFT = "DELETE FROM wordpress.wp_posts " +
      "WHERE post_author = (SELECT ID FROM wp_users WHERE user_login = 'author') AND post_title = 'Auto Draft'";

  /**
   * opening database connection to MySQL server,
   * getting Statement object to execute query,
   * executing SELECT and INSERT queries for adding user to database
   * close connection, statement and result set
   */
  public void addUser() {
    try {
      CONNECTION = DriverManager.getConnection(URL, USER, PASSWORD);
      STATEMENT = CONNECTION.createStatement();
      RESULT_SET = STATEMENT.executeQuery(SELECT_USERS_TABLE);
      RESULT_SET = STATEMENT.executeQuery(SELECT_USER_META_TABLE);
      STATEMENT.executeUpdate(ADDING_AUTHOR);
      STATEMENT.executeUpdate(ADDING_ROLE_TO_AUTHOR);
    } catch (SQLException sqlEx) {
      sqlEx.printStackTrace();
    } finally {
      try {
        CONNECTION.close();
      } catch (SQLException se) { /*can't do anything */ }
      try {
        STATEMENT.close();
      } catch (SQLException se) { /*can't do anything */ }
      try {
        RESULT_SET.close();
      } catch (SQLException se) { /*can't do anything */ }
    }
  }

  /**
   * opening database connection to MySQL server,
   * getting Statement object to execute query,
   * executing SELECT and DELETE queries for deleting user from database
   * close connection ,statement and result set
   */
  public void deleteUser() {
    try {
      CONNECTION = DriverManager.getConnection(URL, USER, PASSWORD);
      STATEMENT = CONNECTION.createStatement();
      RESULT_SET = STATEMENT.executeQuery(SELECT_USERS_TABLE);
      RESULT_SET = STATEMENT.executeQuery(SELECT_USER_META_TABLE);
      STATEMENT.executeUpdate(DELETE_ROLE_AUTHOR);
      STATEMENT.executeUpdate(DELETE_AUTHOR);
    } catch (SQLException sqlEx) {
      sqlEx.printStackTrace();
    } finally {
      try {
        CONNECTION.close();
      } catch (SQLException se) { /*can't do anything */ }
      try {
        STATEMENT.close();
      } catch (SQLException se) { /*can't do anything */ }
      try {
        RESULT_SET.close();
      } catch (SQLException se) { /*can't do anything */ }
    }
  }

  /**
   * opening database connection to MySQL server,
   * getting Statement object to execute query,
   * executing SELECT and DELETE queries for deleting draft from database
   * close connection ,statement and result set
   */
  public void deleteDraft() {
    try {
      CONNECTION = DriverManager.getConnection(URL, USER, PASSWORD);
      STATEMENT = CONNECTION.createStatement();
      RESULT_SET = STATEMENT.executeQuery(SELECT_POST_TABLE);
      STATEMENT.executeUpdate(DELETE_DRAFT);
      STATEMENT.executeUpdate(DELETE_AUTO_DRAFT);
    } catch (SQLException sqlEx) {
      sqlEx.printStackTrace();
    } finally {
      try {
        CONNECTION.close();
      } catch (SQLException se) { /*can't do anything */ }
      try {
        STATEMENT.close();
      } catch (SQLException se) { /*can't do anything */ }
      try {
        STATEMENT.close();
      } catch (SQLException se) { /*can't do anything */ }
    }
  }
}
