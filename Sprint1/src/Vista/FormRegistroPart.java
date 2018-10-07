/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.Conexion;
import Controlador.Insertores;

import Modelo.DParticipante;
import javax.swing.JOptionPane;

import Controlador.Verificador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
        
/**
 *
 * Piter: Reacondicionado de internalFrame de FormParticipantes que hizo Harold
 * que solo tiene la seccion de registro de participante y botones de guardar
 * y cancelar
 */
public class FormRegistroPart extends javax.swing.JInternalFrame {
    private Connection conex=null;
    private Conexion c=new Conexion();
    private String buscar;
    private int id=0;
    /**
     * Creates new form FormRegistroPart
     */
    public FormRegistroPart() {
        initComponents();
        conex=c.conectar();
        this.jComboCongresos.removeAllItems();
        try{
            Statement sent=conex.createStatement();
            ResultSet rs=sent.executeQuery("SELECT * FROM congresos");
            while(rs.next()){
                this.jComboCongresos.addItem(rs.getString("NOMBRE_CONGRESO"));
            
            }
        }catch(Exception e){}
        
        jComboCongresos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buscar=((String)jComboCongresos.getSelectedItem());
                System.out.println(buscar);
                
            Statement s = null; 
                try {
                    s = conex.createStatement();
                } catch (SQLException ex) {
                    Logger.getLogger(FormRegistroPart.class.getName()).log(Level.SEVERE, null, ex);
                }
            ResultSet resultado = null;
                try {
                    resultado = s.executeQuery ("SELECT ID_CONGRESO FROM congresos WHERE NOMBRE_CONGRESO='"+buscar+"'");
                } catch (SQLException ex) {
                    Logger.getLogger(FormRegistroPart.class.getName()).log(Level.SEVERE, null, ex);
                }
                try {
                    while(resultado.next()){
                        
                        try {
                            id = resultado.getInt("ID_CONGRESO");
                        } catch (SQLException ex) {
                            Logger.getLogger(FormRegistroPart.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        System.out.println(id);
                    }   } catch (SQLException ex) {
                    Logger.getLogger(FormRegistroPart.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
        });
        
        
     
    
        
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtCi = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        txtTitulo = new javax.swing.JTextField();
        jPanelCongreso = new javax.swing.JPanel();
        jComboCongresos = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Registro Participante"));

        jLabel1.setText("CI Participante:");

        jLabel2.setText("Nombre Participante:");

        jLabel3.setText("Edad Participante:");

        jLabel4.setText("Titulo Participante:");

        txtCi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCiKeyTyped(evt);
            }
        });

        txtEdad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEdadKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtCi)
                    .addComponent(txtNombre)
                    .addComponent(txtEdad)
                    .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelCongreso.setBorder(javax.swing.BorderFactory.createTitledBorder("Congreso"));

        jComboCongresos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel5.setText("jLabel5");

        jLabel6.setText("Estado......");

        jLabel7.setText("jLabel7");

        jLabel8.setText("Cupo.......");

        jButton1.setText("Ver HORARIO");

        javax.swing.GroupLayout jPanelCongresoLayout = new javax.swing.GroupLayout(jPanelCongreso);
        jPanelCongreso.setLayout(jPanelCongresoLayout);
        jPanelCongresoLayout.setHorizontalGroup(
            jPanelCongresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCongresoLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jComboCongresos, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCongresoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelCongresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addGroup(jPanelCongresoLayout.createSequentialGroup()
                        .addGroup(jPanelCongresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(52, 52, 52)
                        .addGroup(jPanelCongresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5))))
                .addGap(118, 118, 118))
        );
        jPanelCongresoLayout.setVerticalGroup(
            jPanelCongresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCongresoLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jComboCongresos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(jPanelCongresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(41, 41, 41)
                .addGroup(jPanelCongresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGap(58, 58, 58)
                .addComponent(jButton1)
                .addContainerGap(88, Short.MAX_VALUE))
        );

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnGuardar.setText("INSCRIBIR");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanelCongreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(172, 172, 172)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelCongreso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        jPanelCongreso.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCiKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCiKeyTyped
        char c = evt.getKeyChar();
        if(c<'0' || c>'9') evt.consume();
    }//GEN-LAST:event_txtCiKeyTyped

    private void txtEdadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEdadKeyTyped
        char c = evt.getKeyChar();
        if(c<'0' || c>'9') evt.consume();
    }//GEN-LAST:event_txtEdadKeyTyped

    /*Piter: Modificado de evento de boton guardar que ejecutara acciones
    * de registro de atributos del objeto DParticipante hacia la BD
    */
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        //validamos si en realidad se esta ingresando la informacion
        if(txtNombre.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane,"Campo nombre obligatorio","Validación",JOptionPane.WARNING_MESSAGE);
            txtNombre.requestFocusInWindow();
            return;

        }
        if(txtCi.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane,"Campo carnet de identificacion obligatorio","Validación",JOptionPane.WARNING_MESSAGE);
            txtCi.requestFocusInWindow();
            return;

        }
        if(txtEdad.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane,"Campo nombre obligatorio","Validación",JOptionPane.WARNING_MESSAGE);
            txtEdad.requestFocusInWindow();
            return;

        }
        if(txtTitulo.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane,"Campo nombre obligatorio","Validación",JOptionPane.WARNING_MESSAGE);
            txtTitulo.requestFocusInWindow();
            return;

        }

        
        DParticipante dts = new DParticipante();
        Conexion conectar=new Conexion();
        Verificador ver=new Verificador();
        Insertores insertar=new Insertores();
        
        
        dts.setNombre_participante(txtNombre.getText());
        dts.setCi_participante(Integer.parseInt(txtCi.getText()));
        dts.setEdad_participante(Integer.parseInt(txtEdad.getText()));
        dts.setTitulo_participante(txtTitulo.getText());
        
        try {
            //se Realiza la verificacion de si el participante esta ya registrado
            if(ver.verificarParticipante(dts.getCi_participante(), conectar)){
                JOptionPane.showMessageDialog(null, "El Participante ya esta inscrito");
                
            }else{
                System.out.println(dts.getCi_participante()+" , "+id);
                //DIEGO HASTA AQUI YA ESTA RECUPERRAD EL VALOR DEL COMBO BOX que estaria en id
                //trata de insertar a la db con tu metodo
                //insertar.Registrar_Participante(dts,id);
                //insertar.Registrar_participante(1111,2222);
            }
        } catch (SQLException ex) {
            Logger.getLogger(FormRegistroPart.class.getName()).log(Level.SEVERE, null, ex);
        }
        

    

    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboCongresos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelCongreso;
    private javax.swing.JTextField txtCi;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables
}
