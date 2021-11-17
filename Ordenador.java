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
    
    public String getMarca() {
        return marca;
    }
    
    public void setMarca(String marcaOrdenador){
        marca = marcaOrdenador;
    }
    
    public int getHorasEncendido() {
        return horasEncendido;
    }
    
    public void setHorasEncendido(int horasEncendidoOrdenador){
        horasEncendido = horasEncendidoOrdenador;
    }
    
    public boolean getEstado() {
        return encendidoPC;
    }
    
    public void setEncendidoPC(boolean encenderPC){
        encendidoPC = encenderPC;
    }
    
    public Ventilador getVentilador() {
        return ventilador;
    }
    
    public void setVentilador(Ventilador nuevoVentilador){
        ventilador = nuevoVentilador;
    }
}