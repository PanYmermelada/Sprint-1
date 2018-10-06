package Vista;
import Controlador.imagen;
import Controlador.repeticiones;

public class MDI_Principal extends javax.swing.JFrame {
    repeticiones repet;
    private static FormRegistroPart FormularioParticipante = new FormRegistroPart();
    private static registroCogresista FormularioCongresista = new registroCogresista();
    private static registroCongreso FormularioCongreso = new registroCongreso();

    public MDI_Principal() {
        initComponents();
       
        //intanciamos la clase imagen
        //para insertar la imagen que contiene dicha clase en el panel de escritorio de 
        //nuestro JFRAME principal que es el MDI_principal
        //contenedorDeVentanas.setBorder(new imagen());
        this.setExtendedState(MAXIMIZED_BOTH);
        this.repet=new repeticiones(contenedorDeVentanas);
        
    }
    
    public void cargarDisGui(){}
        
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenedorDeVentanas = new javax.swing.JDesktopPane();
        btnInscribirParticipante = new javax.swing.JButton();
        btnRegistrarCongreso = new javax.swing.JButton();
        btnRegistrarCongresista = new javax.swing.JButton();
        menuBar = new javax.swing.JMenuBar();
        menuRegistro = new javax.swing.JMenu();
        btnRegistroParticipante = new javax.swing.JMenuItem();
        btnRegistroCongresista = new javax.swing.JMenuItem();
        btnRegistroCongreso = new javax.swing.JMenuItem();
        menuEdicion = new javax.swing.JMenu();
        btnEditarPatricipante = new javax.swing.JMenuItem();
        btnEditarCongreso = new javax.swing.JMenuItem();
        btnEditarCongresista = new javax.swing.JMenuItem();
        menuInformacion = new javax.swing.JMenu();
        btnInformacionParticipantes = new javax.swing.JMenuItem();
        btnInformacionParticipante = new javax.swing.JMenuItem();
        btnInformacionCongresista = new javax.swing.JMenuItem();
        btnInformacionCongresos = new javax.swing.JCheckBoxMenuItem();
        btnInformacionCongreso = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout contenedorDeVentanasLayout = new javax.swing.GroupLayout(contenedorDeVentanas);
        contenedorDeVentanas.setLayout(contenedorDeVentanasLayout);
        contenedorDeVentanasLayout.setHorizontalGroup(
            contenedorDeVentanasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 772, Short.MAX_VALUE)
        );
        contenedorDeVentanasLayout.setVerticalGroup(
            contenedorDeVentanasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        btnInscribirParticipante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInscribirParticipanteActionPerformed(evt);
            }
        });

        btnRegistrarCongreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarCongresoActionPerformed(evt);
            }
        });

        btnRegistrarCongresista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarCongresistaActionPerformed(evt);
            }
        });

        menuRegistro.setMnemonic('f');
        menuRegistro.setText("REGISTRAR");

        btnRegistroParticipante.setMnemonic('o');
        btnRegistroParticipante.setText("PARTICIPANTE");
        btnRegistroParticipante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroParticipanteActionPerformed(evt);
            }
        });
        menuRegistro.add(btnRegistroParticipante);

        btnRegistroCongresista.setMnemonic('s');
        btnRegistroCongresista.setText("CONGRESISTA");
        btnRegistroCongresista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroCongresistaActionPerformed(evt);
            }
        });
        menuRegistro.add(btnRegistroCongresista);

        btnRegistroCongreso.setMnemonic('a');
        btnRegistroCongreso.setText("CONGRESO");
        btnRegistroCongreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroCongresoActionPerformed(evt);
            }
        });
        menuRegistro.add(btnRegistroCongreso);

        menuBar.add(menuRegistro);

        menuEdicion.setMnemonic('e');
        menuEdicion.setText("EDITAR");

        btnEditarPatricipante.setMnemonic('t');
        btnEditarPatricipante.setText("PARTICIPANTE");
        menuEdicion.add(btnEditarPatricipante);

        btnEditarCongreso.setMnemonic('y');
        btnEditarCongreso.setText("CONGRESO");
        btnEditarCongreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarCongresoActionPerformed(evt);
            }
        });
        menuEdicion.add(btnEditarCongreso);

        btnEditarCongresista.setText("CONGRESISTA");
        menuEdicion.add(btnEditarCongresista);

        menuBar.add(menuEdicion);

        menuInformacion.setMnemonic('h');
        menuInformacion.setText("INFORMACION");

        btnInformacionParticipantes.setMnemonic('c');
        btnInformacionParticipantes.setText("PARTICIPANTES");
        menuInformacion.add(btnInformacionParticipantes);

        btnInformacionParticipante.setMnemonic('a');
        btnInformacionParticipante.setText("PARTICIPANTE");
        menuInformacion.add(btnInformacionParticipante);

        btnInformacionCongresista.setText("CONGRESISTA");
        menuInformacion.add(btnInformacionCongresista);

        btnInformacionCongresos.setSelected(true);
        btnInformacionCongresos.setText("CONGRESOS");
        menuInformacion.add(btnInformacionCongresos);

        btnInformacionCongreso.setText("CONGRESO");
        menuInformacion.add(btnInformacionCongreso);

        menuBar.add(menuInformacion);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnInscribirParticipante, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegistrarCongresista, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegistrarCongreso, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contenedorDeVentanas))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnInscribirParticipante, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRegistrarCongresista, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRegistrarCongreso, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(164, Short.MAX_VALUE))
            .addComponent(contenedorDeVentanas)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistroParticipanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroParticipanteActionPerformed
     
    }//GEN-LAST:event_btnRegistroParticipanteActionPerformed

    private void btnRegistroCongresistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroCongresistaActionPerformed
     
    }//GEN-LAST:event_btnRegistroCongresistaActionPerformed

    private void btnRegistroCongresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroCongresoActionPerformed
     
    }//GEN-LAST:event_btnRegistroCongresoActionPerformed

    private void btnEditarCongresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarCongresoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditarCongresoActionPerformed

    private void btnRegistrarCongresistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarCongresistaActionPerformed
        MostrarParticipantes mosPart=new MostrarParticipantes();
        contenedorDeVentanas.add(mosPart);
        mosPart.show();
    }//GEN-LAST:event_btnRegistrarCongresistaActionPerformed

    private void btnInscribirParticipanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInscribirParticipanteActionPerformed
        contenedorDeVentanas.add(FormularioParticipante);
        FormularioParticipante.show();
    }//GEN-LAST:event_btnInscribirParticipanteActionPerformed

    private void btnRegistrarCongresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarCongresoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegistrarCongresoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MDI_Principal().setVisible(true);
            }
        });
    }
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem btnEditarCongresista;
    private javax.swing.JMenuItem btnEditarCongreso;
    private javax.swing.JMenuItem btnEditarPatricipante;
    private javax.swing.JMenuItem btnInformacionCongresista;
    private javax.swing.JMenuItem btnInformacionCongreso;
    private javax.swing.JCheckBoxMenuItem btnInformacionCongresos;
    private javax.swing.JMenuItem btnInformacionParticipante;
    private javax.swing.JMenuItem btnInformacionParticipantes;
    private javax.swing.JButton btnInscribirParticipante;
    private javax.swing.JButton btnRegistrarCongresista;
    private javax.swing.JButton btnRegistrarCongreso;
    private javax.swing.JMenuItem btnRegistroCongresista;
    private javax.swing.JMenuItem btnRegistroCongreso;
    private javax.swing.JMenuItem btnRegistroParticipante;
    private javax.swing.JDesktopPane contenedorDeVentanas;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuEdicion;
    private javax.swing.JMenu menuInformacion;
    private javax.swing.JMenu menuRegistro;
    // End of variables declaration//GEN-END:variables

}
