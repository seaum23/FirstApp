package com.myProject;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;

public class MyDatabaseHandler {
    
    Connection connect = null;
    Statement statement = null;
    PreparedStatement pStatement = null;
    ResultSet result = null;
    String data=null;
    ArrayList<String> columnName = new ArrayList<String>();
    public Connection conn(){
        return connect;
    }
    public void closeConnection() throws SQLException{
        connect.close();
    }
    public void setConnection(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String databaseName="online_bookstore";
            String url="jdbc:mysql://localhost:3311/online_bookstore";
            
            connect = DriverManager.getConnection
              ("jdbc:mysql://localhost:3311/online_bookstore","root","root");
            
            System.out.println("Successfully connected..");    
        }catch(Exception e){
            System.out.println("Connection Problem..");
            e.printStackTrace();
        }   
    }
    public void delete(String s,String t, String table) throws SQLException
    {
         String query = "delete from "+table+" where shoptitle = '"+s+"' and cusemail = '"+t+"';";
         System.out.println(query);
      PreparedStatement preparedStmt = connect.prepareStatement(query);
     // preparedStmt.setInt(1, 3);

      // execute the preparedstatement
      preparedStmt.execute();
      
   //   connect.close();
    }
    public void delete2(String s, String table) throws SQLException
    {
         String query = "delete from "+table+" where title = '"+s+"';";
         System.out.println(query);
      PreparedStatement preparedStmt = connect.prepareStatement(query);
     // preparedStmt.setInt(1, 3);

      // execute the preparedstatement
      preparedStmt.execute();
      
   //   connect.close();
    }
    
    public ResultSet testQuery(String s){
        //System.out.println(s);
        //columnName=null;
        columnName.clear();
        try{
            String query="SELECT * FROM "+s;
            statement = connect.createStatement();
            result = statement.executeQuery(query);
        }catch(Exception e){
            System.out.println("Error in Query..");
            e.printStackTrace();
        }
        
        return result;
    }

    
    public void insertData(String s,String s2,String s3){
        
        try{
            String query = "insert into "+s3+" values ('"+s+"' , '"+s2+"')";
            pStatement = connect.prepareStatement(query);
            
            
            pStatement.executeUpdate();
            
            
            System.out.println("Successfull");
            
        }catch(SQLException e){
            int errCode = 1062;
            if(e.getErrorCode()== errCode){
                //BookList a = new BookList();
                //a.tmail= s;
            }
           System.err.println(e.getErrorCode());
        }   
    }
    
    public void insertData2(String s,String s2,String s3,String s4,String s5,String s6){
        
        try{
            String query = "insert into books values ('"+s2+"',"+s3+",'"+s4+"','"+s5+"','"+s6+"');";
            pStatement = connect.prepareStatement(query);
            
            
            pStatement.executeUpdate();
            
            
            System.out.println("Successfull");
            
        }catch(SQLException e){
            int errCode = 1062;
            if(e.getErrorCode()== errCode){
                //BookList a = new BookList();
                //a.tmail= s;
            }
           System.err.println(e.getErrorCode()+" insert 2");
        }   
    }
    
}
