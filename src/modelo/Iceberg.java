package modelo;

import java.util.ArrayList;
import java.util.List;

public class Iceberg {

    private final String tag;
    private final String fechaAparicion;
    private final String coordenadasOrigen;
    private final List<IcebergHistorico> iceHistorico;

    public Iceberg(String tag, String fechaAparicion, String coordenadasOrigen) {
        this.tag = tag;
        this.fechaAparicion = fechaAparicion;
        this.coordenadasOrigen = coordenadasOrigen;
        iceHistorico = new ArrayList<>();
    }

    public String getTag() {
        return tag;
    }

    public String getFechaAparicion() {
        return fechaAparicion;
    }

    public String getCoordenadasOrigen() {
        return coordenadasOrigen;
    }
    
    public List<IcebergHistorico> getIceHistorico() {
        return iceHistorico;
    }
    
    public void addIceHistorico(String fechaControl, double volumen, String pos){
        iceHistorico.add(new IcebergHistorico(fechaControl, volumen, pos));
    }
    
    @Override
    public String toString() {
        String cadenaSalida = "El iceberg " + tag + ":\n";
        for (IcebergHistorico icebergHistorico : iceHistorico) {
            cadenaSalida += "En la fecha " + icebergHistorico.getFechaControl() + " su volumen es " 
                    + icebergHistorico.getVolumen() + " y su posición " + icebergHistorico.getPos() + "\n";
        }
        
        return cadenaSalida;
    }
    
}
