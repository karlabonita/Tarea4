import java.awt.Graphics;
import javax.swing.JComponent;

public class Escenario extends JComponent implements Constantes {
    
    public Celda[][] celdas;
    public Jugador jugador;
    public Lienzo dondeSeDibuja;
    public Adversario adversario;
    
    public Escenario(Lienzo lienzo){
        dondeSeDibuja = lienzo;
        celdas = new Celda[NUMERO_CELDAS_ANCHO][NUMERO_CELDAS_LARGO];
        
        //inicializamos el array de celdas
        for(int i =0; i< NUMERO_CELDAS_ANCHO;i++)
         for(int j=0; j< NUMERO_CELDAS_LARGO; j++)
             celdas[i][j]= new Celda(i+(i*PIXEL_CELDA), j+(j*PIXEL_CELDA),'V');
        
    
        celdas[5][5].esPared();
        celdas[4][4].esPared();
        celdas[3][3].esPared();
        celdas[2][6].esPared();
        celdas[7][7].esPared();
        
        jugador = new Jugador(this);
        
        adversario= new Adversario(this);
    
    }
    
    @Override
    public void paintComponent(Graphics g){
        for(int i=0; i< NUMERO_CELDAS_ANCHO; i++)
            for(int j=0; j< NUMERO_CELDAS_LARGO; j++)
                celdas[i][j].paintComponent(g);
    
        
    }
     
}
