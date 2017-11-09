import java.sql.Time;
import java.time.LocalTime;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        ConnectionSingleton connectionSingleton = ConnectionSingleton.getInstance();

        LocalTime now = LocalTime.now();
        Time horaAtual = Time.valueOf(now);

        System.out.println("Sem Singleton");
        System.out.println("Hora anterior: "+horaAtual);
        ConnectionSingleton connectionNormal1 = new ConnectionSingleton();
        ConnectionSingleton connectionNormal2 = new ConnectionSingleton();
        ConnectionSingleton connectionNormal3 = new ConnectionSingleton();
        ConnectionSingleton connectionNormal4 = new ConnectionSingleton();
        now = LocalTime.now();
        Time horaFinal = Time.valueOf(now);
        System.out.println("Hora após instanciar 10 Connections: "+horaFinal);


        System.out.println("\n\nCom singleton");
        now = LocalTime.now();
        horaAtual = Time.valueOf(now);
        System.out.println("Hora anterior: "+horaAtual);
        ConnectionSingleton connectionSingleton1 = ConnectionSingleton.getInstance();
        ConnectionSingleton connectionSingleton2 = ConnectionSingleton.getInstance();
        ConnectionSingleton connectionSingleton3 = ConnectionSingleton.getInstance();
        ConnectionSingleton connectionSingleton4 = ConnectionSingleton.getInstance();
        ConnectionSingleton connectionSingleton5 = ConnectionSingleton.getInstance();
        now = LocalTime.now();
        horaFinal = Time.valueOf(now);
        System.out.println("Hora após instanciar 10 Connections com singleton: "+horaFinal);

        System.out.println("\n\nVerificando instancias do Singleton");
        System.out.println(connectionSingleton1);
        System.out.println(connectionSingleton2);
        System.out.println(connectionSingleton3);

    }

}
