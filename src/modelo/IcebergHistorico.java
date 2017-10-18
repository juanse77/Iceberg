package modelo;

public class IcebergHistorico {
    private final String fechaControl;
    private final double volumen;
    private final String pos;

    public IcebergHistorico(String fechaControl, Double volumen, String pos) {
        this.fechaControl = fechaControl;
        this.volumen = volumen;
        this.pos = pos;
    }

    public String getFechaControl() {
        return fechaControl;
    }

    public Double getVolumen() {
        return volumen;
    }

    public String getPos() {
        return pos;
    }
    
}
