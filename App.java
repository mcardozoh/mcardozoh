import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLDataException;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import com.mysql.cj.jdbc.CallableStatement;

public class App {
   private static Connection c;
   private static CallableStatement cstm;
   private static ResultSet rs;

    public static void main(String[] args){
    
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido al Sistema");
        System.out.println("Ingres tu usuario");
        String p_password = sc.next();
        sc.close();

        System.out.println("Ingresa tu password");
        String password = sc.nextLine();
        List<BeanUser> listUsers=new ArrayList<>();
        listUsers = getusers (user,password);
        listUsers.forEach(u -> System.out.println(u,getName()));


        public static List<BeanUser> getusers(String); {
            List<BeanUser> listUsers=new ArrayList<>();
          try {
                c = getConnection(p_user, p_password);
                cstm = c.prepareCall("SELECT * FROM user");  
                rs = cstm.executeQuery();  
                
                while(rs.next()){
                  BeanUser beanUser = new BeanUser();
                  beanUser.setId(rs.getInt("id"));
                  beanUser.setName(rs.getString("name"));

                  listUsers.add(beanUser);

                }
              
              } catch (SQLException e) {
                          System.out.println("Error:" +e getMessage();
                    } finally{
                      try {
                        rs.close();
                        cstm.close();
                        c.close();
                      } catch (Exception e) {
                        // TODO: handle exception
                      }

                    }
                  }
        }

        public static Connection getConnection(String p_user, String p_password) throws SQLDataException{

        
        String host = "localhost";
        String user = p_user;
        String password = p_password;
        int port = 3306;
        String database = "prueba";
      
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");

    }catch(Exception e){
        System.out.println("Librería no encontrada:") +e.getMessage();
    }
    String url = String.format("jdbc:mysql://%s//%s=?user%s&password%s, host, database");
    return DriverManager.getConnection("jdbc:mysql://","user","password");
}
}