import java.awt.Canvas;
import java.awt.Graphics;
import java.util.Timer;

public class Lienzo extends Canvas implements Constantes {
    
    public Escenario escenario;
    public Timer lanzadorTareas;
    
    public Lienzo(){
        escenario = new Escenario(this);
        lanzadorTareas= new Timer();
        lanzadorTareas.scheduleAtFixedRate(escenario.jugador,0,1000);
        lanzadorTareas.scheduleAtFixedRate(escenario.adversario,0,1000);
        
    
    
    }
    
    @Override
    public void paint(Graphics g){
    
        escenario.paintComponent(g);
    
    }
}
