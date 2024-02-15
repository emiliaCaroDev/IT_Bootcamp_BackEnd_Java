
public class Categoria{
        private Integer id;
        private String nombre;
        private String descripcion;

        public Categoria(){}

        public Categoria(Integer id, String nombre, String descripcion ){
            this.id=id;
            this.nombre= nombre;
            this.descripcion = descripcion ;
        }

        //getters y setters
        public Integer getId(){
            return id;
        }

        public void setId(Integer  id){
            this.id=id;
        }

        public String getNombre(){
            return nombre;
        }

        public void setNombre(String nombre){
            this.nombre=nombre;
        }

        public String getDescripcion(){
            return descripcion;
        }

        public void setDescripcion(String descripcion ){
            this.descripcion = descripcion;
        }

        public String toString(){
            return "Categoria{ Id= "+this.id+", Nombre="+this.nombre +", Descripcion="+ this.descripcion +"}";
        }
    }

