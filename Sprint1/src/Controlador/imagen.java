package Controlador;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.border.Border;
//esta clase nos permite asignar la imagen que se ade usar en el panel de escritorio
public class imagen implements Border{
  public BufferedImage back;    
  public imagen(){
        try{
        URL imagePath = new URL(getClass().getResource("../Modelo/imcongreso.jpg").toString());
        back =ImageIO.read(imagePath);
        } catch (IOException ex){
        }
    }
  @Override
    public void paintBorder(Component c,Graphics g, int x, int y, int width,int height){
    g.drawImage(back,(x+(width - back.getWidth())/2),(y+(height - back.getHeight())/2),null);
    }
  @Override
    public Insets getBorderInsets(Component c){
    return new Insets(0,0,0,0);
    }
  @Override
    public boolean isBorderOpaque(){
    return  false;
    }
  
}
