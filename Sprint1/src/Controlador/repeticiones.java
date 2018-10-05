package Controlador;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
public class repeticiones {
    private static JDesktopPane panelDeEscritorio;
  public repeticiones(JDesktopPane panelDeEscritorio){
    repeticiones.panelDeEscritorio=panelDeEscritorio;
    }
  public void abrirPanelDeEscritorio(JInternalFrame ventanillaInterna){
  if(ventanillaInterna.isVisible()){
     ventanillaInterna.toFront();
     ventanillaInterna.requestFocus();
  }
  else{
  panelDeEscritorio.add(ventanillaInterna);
  ventanillaInterna.setVisible(true);
  }
  }   
}
