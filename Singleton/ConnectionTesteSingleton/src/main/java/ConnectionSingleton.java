import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionSingleton {

    private Connection connection;
    private volatile static Reference<ConnectionSingleton> reference;

    public ConnectionSingleton() throws InterruptedException {
        Thread.sleep(1100);
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost/projeto_financeiro?useTimezone=true&serverTimezone=UTC&useSSL=false","root", "root");
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }

    public static ConnectionSingleton getInstance() throws InterruptedException {
        if(reference==null||reference.get()==null){
            synchronized (ConnectionSingleton.class){
                ConnectionSingleton connectionSingleton = new ConnectionSingleton();
                reference = new WeakReference<ConnectionSingleton>(connectionSingleton);
            }
        }
        return reference.get();
    }

    public static void clear(){
        reference.clear();
    }

    public Connection getConnection() {
        return connection;
    }
}
