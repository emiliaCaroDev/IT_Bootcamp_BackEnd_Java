public class Vehiculo {
    private String modelo;
    private String marca;
    private Double costo;

    public Vehiculo(){}

    public Vehiculo(String modelo, String marca, Double costo){
        this.modelo=modelo;
        this.marca=marca;
        this.costo=costo;
    }

    //getters y setters

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Double getCosto() {
        return costo;
    }

    public void setCosto(Double costo) {
        this.costo = costo;
    }

    public String toString(){
        return "Vehiculo { Modelo= "+this.modelo+", Marca= "+this.marca+",Costo= $ "+this.costo+" }";
    }
}
