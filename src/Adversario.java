import java.util.TimerTask;

public class Adversario extends TimerTask implements Constantes{
     public int posicionX;
     public int posicionY;
     public Escenario escenario;
    
    
     public Adversario(Escenario escenario){
         posicionX=0;
         posicionY=0;
         this.escenario=escenario;
     
     }
     
        public boolean puedeMoverse(int posicionX, int posicionY){
       if(posicionX<NUMERO_CELDAS_ANCHO && posicionX>-1 && posicionY<NUMERO_CELDAS_LARGO && posicionY>-1 && escenario.celdas[posicionX][posicionY].tipo!='O' && escenario.celdas[posicionX][posicionY].tipo!='J'){
           return true;
           
       }    
       return false;
    }
    
        public void moverArriba(){
        if(posicionY>-1 && puedeMoverse (posicionX, posicionY-1 )){   
            escenario.celdas[posicionX][posicionY].tipo='V';
            escenario.celdas[posicionX][--posicionY].tipo='A';
        }
    }
    
    public void moverAbajo(){
        if(posicionY<NUMERO_CELDAS_LARGO && puedeMoverse(posicionX,posicionY +1)){  
            escenario.celdas[posicionX][posicionY].tipo='V';
            escenario.celdas[posicionX][++posicionY].tipo='A';
    
        }
    }
    
    public void moverIzquierda(){
        if(posicionX>0 && puedeMoverse(posicionX -1,posicionY)){
            escenario.celdas[posicionX][posicionY].tipo='V';
            escenario.celdas[--posicionX][posicionY].tipo='A';
            
        }
    }
    
    public void moverDerecha(){
        if(posicionX< NUMERO_CELDAS_ANCHO && puedeMoverse(posicionX +1,posicionY)){
            escenario.celdas[posicionX][posicionY].tipo='V';
            escenario.celdas[++posicionX][posicionY].tipo='A';
   
        }
    }

        @Override 
public void run(){
    int movAleatorio= numeroAleatorio(0,3);
    System.out.println("Movimiento generado:" + movAleatorio);
    
    switch(movAleatorio){
    
        case 0:
            moverArriba();
        break;
        
        case 1:
            moverAbajo();
        break;
        
        case 2:
            moverDerecha();
        break;
        
        case 3:
            moverIzquierda();
        break;
    
    }
    escenario.dondeSeDibuja.repaint();


}
        
        
     
}
