package main;

import java.util.ArrayList;
import java.util.List;
import modelo.*;

public class ControlIcebergs {
    
    private static final List<Iceberg> LISTA_ICE = new ArrayList<>();

    public static void main(String[] args) {
        
        ControlIcebergs ctlIces = new ControlIcebergs();
        
        Iceberg auxIce = new Iceberg("Ice_1", "10-10-2016", "[Long: 23.35 : Lat: 5.12]");
        
        auxIce.addIceHistorico("12-10-2016", 2000, "[Long: 25.35 : Lat: 7.12]");
        auxIce.addIceHistorico("14-10-2016", 1000, "[Long: 24.35 : Lat: 8.12]");
        
        LISTA_ICE.add(auxIce);
        
        auxIce = new Iceberg("Ice_2", "20-2-2017", "[Long: 60.35 : Lat: 4.15]");
        
        auxIce.addIceHistorico("22-2-2017", 2000, "[Long: 61.35 : Lat: 6.12]");
        auxIce.addIceHistorico("24-2-2017", 1000, "[Long: 59.35 : Lat: 8.15]");
        
        LISTA_ICE.add(auxIce);
        
        System.out.println(ctlIces.toString());
    }
    
    @Override
    public String toString() {
        String auxRetorno = "";
        for (Iceberg listaIceberg : LISTA_ICE) {
            auxRetorno += listaIceberg.toString();
        }
        return auxRetorno;
    }
}
