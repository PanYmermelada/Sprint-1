/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.DCongresos;
import Modelo.DParticipantes;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author PC1
 */
public class LCongresos {
     Conexion cc=new Conexion();
      Connection cn=cc.conectar();
    
    //metodo para poder buscar y mostrar usuarios
    public DefaultTableModel mostrarCongresos(DCongresos misCongresos){
        DefaultTableModel miModelo = null;
        //Lo haremos con procedimientos almacenados
        try{
            String titulos[]={"CI","Nombre","Edad","Titulo"};
            String dts[]=new String[4];
            miModelo=new DefaultTableModel(null,titulos);
            CallableStatement cst = cn.prepareCall("{ call sp_mostrarbuscar_participantes(?)}");
            cst.setString(1,misCongresos.getNombre_congreso());
            ResultSet rs = cst.executeQuery();
            while(rs.next()){
                dts[0]=rs.getString("ci_participante");
                dts[1]=rs.getString("nombre_participante");
                dts[2]=rs.getString("edad_participante");
                dts[3]=rs.getString("titulo_participante");
                
                miModelo.addRow(dts);
            }
        }catch(Exception ex){
            
        }
        return miModelo;   
    }
    public String[] devuelveCongreso(DCongresos miCongreso) {
        String resultado[]=new String[8];
        try{
        CallableStatement cst=cn.prepareCall("{ call sp_devolver_congreso(?)}");
        cst.setString(1,miCongreso.getNombre_congreso());
        ResultSet rs=cst.executeQuery();
        while(rs.next()){
            resultado[0]=rs.getString("id_congreso");
            resultado[1]=rs.getString("ci_congresista");
            resultado[2]=rs.getString("nombre_congreso");
            resultado[3]=rs.getString("aula_congreso");
            resultado[4]=rs.getString("fecha_congreso");
            resultado[5]=rs.getString("hora_inicio_congreso");
            resultado[6]=rs.getString("tema_congreso");
            resultado[7]=rs.getString("costo_congreso");
            
        }
        }catch(Exception ex){
            
        }
        
        return resultado;
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
    public String editarParticipantes(DParticipantes misParticipantes){
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
    }
    public String eliminarParticipantes(DParticipantes misParticipantes){
        String msg = null;
        try {
            CallableStatement cst = cn.prepareCall("{ call sp_eliminar_participantes(?) }");
            cst.setInt(1,misParticipantes.getCi_participante());
            cst.executeUpdate();
            msg = "si";
            
        } catch (Exception ex) {
            ex.printStackTrace();
            msg = "no";
        }
        return msg;  
    } 
}
