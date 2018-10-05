/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.DParticipa;
import Modelo.DParticipantes;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author PC1
 */
public class LParticipa {
      Conexion cc=new Conexion();
      Connection cn=cc.conectar();
    
    //metodo para poder buscar y mostrar usuarios
    public DefaultTableModel mostrarParticipacion(DParticipa misParticipaciones){
        DefaultTableModel miModelo = null;
        //Lo haremos con procedimientos almacenados
        try{
            String titulos[]={"CI","Nombre","ID_Congreso","Congreso","Asistencia"};
            String dts[]=new String[5];
            miModelo=new DefaultTableModel(null,titulos);
            CallableStatement cst = cn.prepareCall("{ call sp_mostrarbuscar_participacion(?)}");
            cst.setInt(1,misParticipaciones.getCi_participante());
            ResultSet rs = cst.executeQuery();
            while(rs.next()){
                dts[0]=rs.getString("ci_participante");
                dts[1]=rs.getString("nombre_participante");
                dts[2]=rs.getString("id_congreso");
                dts[3]=rs.getString("nombre_congreso");
                dts[4]=rs.getString("asistencia");
                
                miModelo.addRow(dts);
            }
        }catch(Exception ex){
            
        }
        return miModelo;
        
    }
    
    /*public String insertarUsuarios(DUsuarios misUsuarios){
        String msg = null;
        try {
            CallableStatement cst = cn.prepareCall("{ call sp_insertar_usuarios(?,?,?,?) }");
            cst.setString(1,misUsuarios.getNombre());
            cst.setString(2,misUsuarios.getUsuario());
            cst.setString(3,misUsuarios.getClave());
            cst.setString(4,misUsuarios.getPerfil());
            cst.executeUpdate();
            msg = "si";
            
        } catch (Exception ex) {
            ex.printStackTrace();
             msg = "no";
        }
        return msg;  
    }*/
    /*public String editarParticipantes(DParticipantes misParticipantes){
        String msg = null;
        try {
            CallableStatement cst = cn.prepareCall("{ call sp_editar_participantes(?,?,?,?,?) }");
            cst.setInt(1,misParticipantes.getCi_participante());
            cst.setString(2,misParticipantes.getNombre_participante());
            cst.setInt(3,misParticipantes.getEdad_participante());
            cst.setString(4,misParticipantes.getTitulo_participante());
            cst.setInt(5,misParticipantes.getCi_participante());
            cst.executeUpdate();
            msg = "si";
            
        } catch (Exception ex) {
            ex.printStackTrace();
             msg = "no";
        }
        return msg;  
    }*/
    public String eliminarParticipacion(DParticipa misParticipaciones){
        String msg = null;
        try {
            CallableStatement cst = cn.prepareCall("{ call sp_eliminar_participacion(?) }");
            cst.setInt(1,misParticipaciones.getCi_participante());
            cst.executeUpdate();
            msg = "si";
            
        } catch (Exception ex) {
            ex.printStackTrace();
            msg = "no";
        }
        return msg;  
    } 
      public String eliminarParticipacion2(DParticipa misParticipaciones){
        String msg = null;
        try {
            CallableStatement cst = cn.prepareCall("{ call sp_eliminar_participacion2(?,?) }");
            cst.setInt(1,misParticipaciones.getCi_participante());
            cst.setString(2,misParticipaciones.getId_congreso());
            cst.executeUpdate();
            msg = "si";
            
        } catch (Exception ex) {
            ex.printStackTrace();
            msg = "no";
        }
        return msg;  
    } 
     
     
     
     
}
