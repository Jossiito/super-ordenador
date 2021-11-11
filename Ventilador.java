public class Ventilador{
    // Velocidad del ventilador
    private int velocidad;
    // Estado del ventilador
    private boolean encendido;
    
    public Ventilador(int velocidadGiro, boolean estado) {
        velocidad = velocidadGiro;
        encendido = estado;
    }
}
