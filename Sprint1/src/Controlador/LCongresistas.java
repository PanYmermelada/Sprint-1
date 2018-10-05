/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.DCongresistas;
import Modelo.DParticipantes;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author PC1
 */
public class LCongresistas {
    Conexion cc=new Conexion();
      Connection cn=cc.conectar();
    
    //metodo para poder buscar y mostrar usuarios
    public DefaultTableModel mostrarCongresistas(DCongresistas misCongresistas){
        DefaultTableModel miModelo = null;
        //Lo haremos con procedimientos almacenados
        try{
            String titulos[]={"CI","Nombre","Edad","Titulo","Congreso"};
            String dts[]=new String[5];
            miModelo=new DefaultTableModel(null,titulos);
            CallableStatement cst = cn.prepareCall("{ call sp_mostrarbuscar_congresistas(?)}");
            cst.setString(1,misCongresistas.getNombre_congresista());
            ResultSet rs = cst.executeQuery();
            while(rs.next()){
                dts[0]=rs.getString("congresistas.ci_congresista");
                dts[1]=rs.getString("congresistas.nombre_congresista");
                dts[2]=rs.getString("congresistas.edad_congresista");
                dts[3]=rs.getString("congresistas.titulo_congresista");
                dts[4]=rs.getString("congresos.nombre_congreso");
                
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
