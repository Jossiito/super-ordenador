public class Ventilador{
    // Velocidad del ventilador
    private int velocidad;
    // Estado del ventilador
    private boolean encendido;
    
    public Ventilador(int velocidadGiro) {
        velocidad = velocidadGiro;
        encendido = true;
    }
    
    public void setVelocidad(int velocidadGiro){
        velocidad = velocidadGiro;        
    }
    
    public int getVelocidadGiro(){
        return velocidad;
    }
    
    public void encenderVentilador(){
        if(encendido == true){
            encendido = false;
            velocidad = 0;
        }
        else{
            encendido = true;
        }
    }
    
    public boolean getEncendido () {
        return encendido;
    }
    
    public void imprimirDetalles() {
        System.out.println(" La velocidad del ventilador es: " + velocidad + " rpm. ");
        System.out.println(" El estado del ventilador es " + encendido);
    }
}
