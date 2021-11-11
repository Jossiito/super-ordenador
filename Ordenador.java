public class Ordenador{
    // Marca del ordenador
    private String marca;
    // Numero de horas que esta encendido el pc
    private int horasEncendido;
    // Estado del ordenador
    private boolean encendidoPC;
    // Referencia a la clase ventilador
    private Ventilador ventilador;
    
    public Ordenador(int horasDeUso, Ventilador nuevoVentilador){
        marca = "Volkswagen";
        horasEncendido = horasDeUso;
        encendidoPC = true;  
        ventilador = nuevoVentilador;
    }
}