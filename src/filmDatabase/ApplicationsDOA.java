package filmDatabase;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ApplicationsDOA {

	public Connection getConnection(){
		String connectionUrl = "jdbc:mysql://localhost:3306/film";
		Connection connection = null;
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			connection = DriverManager.getConnection(connectionUrl, "root", null);
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return connection;
	}

	public void closeConnection(Connection connection){
		try{
			connection.close();
		}catch (SQLException e){
			e.printStackTrace();
		}
	}
	public void create(Application application){
		String sql = "insert into filmApplication (id, year, title, popularity, length, subject) values (?,?,?,?,?,?)";
		Connection connection = getConnection();
		
		try {
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, application.getSubject());
			statement.setDouble(2, application.getPopularity());
			statement.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
		
		closeConnection(connection);
		}
	}
	public List<Application> selectAll(){
		List<Application> applications = new ArrayList<Application>();
	
		
		String sql = "select * from applications";
		
		Connection connection = getConnection();
		
		try {
			PreparedStatement statement = connection.prepareStatement(sql);
			ResultSet results = statement.executeQuery();
			while(results.next()){
				int id = results.getInt("id");
				int year = results.getInt("year");
				String title = results.getString("title");
				String subject = results.getString("subject");
				int popularity = results.getInt("popularity");
				int length = results.getInt("length");
				Application application = new Application(id, year, title, popularity, length, subject);
				applications.add(application);
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			closeConnection(connection);
		}
		
		return applications;
	}


}
