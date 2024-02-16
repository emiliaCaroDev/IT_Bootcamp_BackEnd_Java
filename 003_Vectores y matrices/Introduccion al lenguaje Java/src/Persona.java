public class Persona {


    private String nombre;
    private Integer edad;
    private String dni;
    private Double peso;
    private Double altura;

    //getters y setters
    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Persona(){}

    public Persona(String nombre,Integer edad, String dni, Double peso,Double altura){
        this.nombre=nombre;
        this.edad=edad;
        this.dni=dni;
        this.peso=peso;
        this.altura=altura;
    }

    public Persona(String nombre,Integer edad, String dni){
        this.nombre=nombre;
        this.edad=edad;
        this.dni=dni;
    }

    public String toString(){
        return "Persona {Nombre= "+this.nombre+", Edad= "+this.edad+", Dni= "+this.dni+", Peso= "+this.peso+", Altura= "+this.altura+"}";
    }

    public Integer calcularIMC(){
        Double result = this.peso/Math.pow(2,altura);
        if(result < 20.0){
            return -1;
        }
        else if(result >= 20 && result <=25 ){
            return 0;
        }
        else{
            return 1;
        }
    }

    public Boolean esMayorDeEdad(){
        if(this.edad >= 18){
            return true;
        }
        else{
            return false;
        }
    }

    /*
    Índice de masa corporal (IMC) Nivel de peso
Por debajo de 20 Bajo peso
Entre 20 y 25 inclusive Peso saludable
Mayor de 25 Sobrepeso
    * */

    public void mostrarMsj(){
        String resultIMC="";
        String resultEdad="";

        if(calcularIMC() == -1){
            resultIMC="Bajo Peso";
        }
        else if(calcularIMC() == 0){
            resultIMC="Peso saludable";
        }
        else{
            resultIMC="SobrePeso";
        }
        if(esMayorDeEdad()){
            resultEdad="mayor de edad";
        }
        else{
            resultEdad="menor de edad";
        }
        System.out.println(this.nombre+" es "+resultEdad+" y tiene "+resultIMC);
    }
}
