package Database;

import java.sql.Connection;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class MyDatabase {
	private static ComboPooledDataSource cpds = null;
	static {
		cpds = new ComboPooledDataSource();
	}
	
	public static Connection getConnection() {
            try {
                return cpds.getConnection();
            } catch (Exception e) {
                return null;
            }
	}
        
        public static ComboPooledDataSource getDataSource(){
            return cpds;
        }
}
