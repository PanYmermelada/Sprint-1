package controlador;
import java.sql.*;


public class Conexion {
    Connection conectar = null;
    public Connection conectar(){
        try{
            conectar=DriverManager.getConnection("jdbc:mysql://localhost:3306/softconferencias","root","");
            System.out.println("Conectado...");
            
        }catch(SQLException ex){
            System.out.println("Error al conectar:");
        } 
        return conectar;
        
    }
    
    
    
}
