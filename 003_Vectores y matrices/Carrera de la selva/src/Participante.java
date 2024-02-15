public class Participante{
    private Integer numero;
    private String dni;
    private String nombre;
    private String apellido;
    private Integer edad;
    private String celular;
    private String numEmergencia;
    private String grupoSanguineo;


    public Participante(){ }

    public Participante(Integer numero, String dni, String nombre,String apellido, Integer edad, String celular, String numEmergencia , String grupoSanguineo){
        this.numero= numero;
        this.dni=dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad= edad;
        this.celular = celular;
        this.numEmergencia = numEmergencia;
        this.grupoSanguineo = grupoSanguineo;
    }

    //getters y setters
    public Integer getNumero(){
        return numero;
    }

    public void setNumero(Integer numero){
        this.numero= numero;
    }

    public String  getDni(){
        return dni;
    }

    public void setDni(String  dni){
        this.dni= dni;
    }


    public String getNombre(){
        return nombre;
    }

    public void setNombre (String nombre){
        this.nombre= nombre;
    }



    public String getApellido(){
        return apellido;
    }

    public void setApellido(String  apellido ){
        this.apellido =apellido;
    }


    public Integer  getEdad(){
        return edad;
    }

    public void setEdad(Integer edad ){
        this.edad=edad;
    }

    public String getCelular(){
        return celular;
    }

    public void setCelular(String celular){
        this.celular= celular;
    }

    public String getNumEmergencia(){
        return numEmergencia ;
    }

    public void setNumEmergencia(String  numEmergencia ){
        this.numEmergencia  =numEmergencia;
    }


    public String getGrupoSanguineo(){
        return grupoSanguineo;
    }

    public void setGrupoSanguineo(String  grupoSanguineoi){
        this.grupoSanguineo = grupoSanguineo ;
    }

    public String toString(){
        return "Participante { N°="+this.numero+", DNI= "+this.dni+",Nombre= "+this.nombre +", Apellido ="+this.apellido+",Edad=" +this.edad+",Celular"+this.celular+",Numero emergencia="+this.numEmergencia +", Grupo sanguineo=" +this.grupoSanguineo+"}";
    }

}