import java.sql.*; 

public class DBConnector
{
  private static DBConnector instance = null;
  private String path = "jdbc:mysql://localhost:3306/symbols";
  private String pass = "admin";
  private String userName = "root";
  private int id = 0;
  
  private DBConnector()
  {
  }
  
  public static DBConnector getInstance()
  {
	if (instance == null)
	  instance = new DBConnector();
	
	return instance;
  }
  
  public void insert(String name, String type, String scope)
  {
	String toBeInserted = new String();
	
	try
	{
	  Connection conn = DriverManager.getConnection(path, userName, pass);
	  Statement stat = conn.createStatement();
	  
	  toBeInserted = "insert into symbol_table values (" + "'" + name + "'" + "," + "'" + type + "'" + "," + "'none', " + "'" + scope + "'" + ")";
	  stat.executeUpdate(toBeInserted);
	  System.out.println("Database updated.");
	}
	
	catch (SQLException e)
	{
	  e.printStackTrace();
	}
  }

  public void insert(String name, String type1, String type2, String scope)
  {
    String toBeInserted = new String();
	
	try
	{
	  Connection conn = DriverManager.getConnection(path, userName, pass);
	  Statement stat = conn.createStatement();
	  
	  toBeInserted = "insert into symbol_table values (" + "'" + name + "'" + "," + "'" + type1 + "'" + "," + "'" + type2 + "'" + "," + "'" + scope + "'" + ")";
	  stat.executeUpdate(toBeInserted);
	  System.out.println("Database updated.");
	}
	
	catch (SQLException e)
	{
	  e.printStackTrace();
	}
  }
  
  public Symbol getInfo(String name)
  {
	Symbol sym = null;
	boolean found = false;
	try
	{
	  Connection conn = DriverManager.getConnection(path, userName, pass);
      Statement stat = conn.createStatement();
      
      String selectStat = "select name, type1, type2, scope from symbol_table";
      ResultSet result = stat.executeQuery(selectStat);
      
      while (result.next())
      {
    	if (name.equals(result.getString("name")))
    	{ 	 
    	  found = true;
    	  String expName = result.getString("name");
    	  String expType = result.getString("type1");
    	  String expType2 = result.getString("type2");
    	  String expScope = result.getString("scope");
    	  
    	  sym = new Symbol(expName, expType, expType2, expScope, "null");
    	}
      }
	}
	
	catch (SQLException e)
	{
	  e.printStackTrace();
	}
	
	if (found)
	{
	  return sym;
	}
	
	else
	{
	  System.out.println(name + "does not exists.");
	  return null;
	}
  }
  
  public boolean checkIfExist(String name)
  {
	boolean toCheck = false;
	try
	{
	  Connection conn = DriverManager.getConnection(path, userName, pass);
      Statement stat = conn.createStatement();
      
      String selectStat = "select name, type1, type2, scope from symbol_table";
      ResultSet result = stat.executeQuery(selectStat);
      
      while (result.next())
      {
    	if (name.equals(result.getString("name")))
    	{
    	  toCheck = true;
    	}
      }
	}
	
	catch (SQLException e)
	{
	  e.printStackTrace();
	}
	
	return toCheck;
  }
  
  public void deleteAll()
  {
	
  }
}