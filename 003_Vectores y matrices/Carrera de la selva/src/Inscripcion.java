public class Inscripcion{
    private Integer numero;
    private Categoria categoria;
    private Participante participante;

    public Inscripcion(){}

    public Inscripcion(Integer numero, Categoria  categoria,Participante  participante ){
        this.numero=numero;
        this.categoria= categoria;
        this.participante= participante;
    }
    //getters y setters
    public Integer getNumero(){
        return numero ;
    }

    public void setNumero(Integer numero){
        this.numero=numero;
    }

    public Categoria getCategoria(){
        return categoria ;
    }

    public void setCategoria(Categoria categoria ){
        this.categoria=categoria;
    }

    public Participante getParticipante(){
        return participante;
    }

    public void setParticipante(Participante  participante ){
        this.participante = participante ;
    }

    public String  toString (){
        return "Inscripcion { Numero="+this.numero +", Categoria ="+this.categoria +", Participante="+this.participante +"}";
    }

    public Double calcularMonto(){
        Double result= 0.0;
        switch (categoria.getNombre()){
            case "chico":
                if(participante.getEdad() <= 18){
                    result = 1300.0;
                }
                else{
                    result=1500.0;
                }
                break;
            case "medio":
                if(participante.getEdad() <= 18){
                    result = 2000.0;
                }
                else{
                    result= 2300.0;
                }
                break;
            case "avanzado":
                if(participante.getEdad() <= 18){
                    System.out.println("No se permiten inscripciones a menores de 18 años ");
                }
                else{
                    result= 2800.0;
                }
                break;
        }
        return result;
    }

}



