package Controlador;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
/**
 *
 * @author Piter Molina Chacón (pjmolina2012@gmail.com)
 */

public class Verificador{
    
    public void verificarConferencia(String buscar, Conexion conex) throws SQLException{       
        Statement stm=conex.conectar().createStatement();
        ResultSet rs=stm.executeQuery("SELECT * FROM `congresos` WHERE NOMBRE_CONGRESO='"+buscar+"'");
        if(rs.last()){
            JOptionPane.showMessageDialog(null, "Ya se tiene registrada la Conferencia: "+buscar+"'");
                //return true;
        }else{
            //JOptionPane.showMessageDialog(null, "no existe esa conferencia en la DB");
                    //return false;
        }   
    }
    
    public boolean verificarDocente(String buscar, Conexion conex) throws SQLException{
        Statement stm=conex.conectar().createStatement();
        ResultSet rs=stm.executeQuery("SELECT * FROM `congresistas` WHERE NOMBRE_CONGRESISTA='"+buscar+"'");
        if(rs.last()){
            JOptionPane.showMessageDialog(null, "Ya se tiene registrado a: '"+buscar+"'");
                return true;
        }else{
            //JOptionPane.showMessageDialog(null, "no existe: '"+buscar+"' en la DB");
                return false;
        }
    }
    
    public boolean verificarParticipante(int buscar, Conexion conex) throws SQLException{
        Statement stm=conex.conectar().createStatement();
        ResultSet rs=stm.executeQuery("SELECT * FROM `participantes` WHERE CI_PARTICIPANTE='"+buscar+"'");
        if(rs.last()){
            JOptionPane.showMessageDialog(null, "Ya se tiene registrado a este Participante");
                return true;
        }else{
           //JOptionPane.showMessageDialog(null, "no existe: '"+buscar+"' en la DB");
                return false;
        }
    }
    
    public boolean verificarUsuario(int buscar, Conexion conex) throws SQLException{
        Statement stm=conex.conectar().createStatement();
        ResultSet rs=stm.executeQuery("SELECT * FROM `usuarios` WHERE NOMBRE_USUARIO='"+buscar+"'");
        if(rs.last()){
            JOptionPane.showMessageDialog(null, "Ya se tiene registrado a: '"+buscar+"'");
                return true;
        }else{
            //JOptionPane.showMessageDialog(null, "no existe: '"+buscar+"' en la DB");
                return false;
        }
    }
}
