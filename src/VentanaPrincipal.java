import java.awt.BorderLayout;
import javax.swing.JFrame;

public class VentanaPrincipal  extends JFrame {
 
    //nuestra clase se compone de un lienzo de dibujo (herada de canvas)
     public Lienzo lienzo;
    
    public VentanaPrincipal(){
    
        lienzo=new Lienzo();
        this.getContentPane().setLayout(new BorderLayout());
        this.getContentPane().add(lienzo);
        this.setSize(lienzo.getWidth()+380,lienzo.getHeight()+380);
       
    
    }
    
    
}
