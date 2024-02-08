public class Main {

    String dni = "12345678"; // dni de ejemplo
    double sueldoBase = 21000; // monto de ejemplo
    double sueldoConAumento;

    public void calcularAumento() {

        // Tu codigo aqui
        if (this.sueldoBase <= 20000) {
            sueldoConAumento = (sueldoBase * 0.20) + sueldoBase;
        }
        else {
            if (this.sueldoBase > 20000 && this.sueldoBase <= 45000){
                sueldoConAumento = (sueldoBase  * 0.10) + sueldoBase;
            }
            else {
                sueldoConAumento = (sueldoBase * 0.5) + sueldoBase;
            }
        }

        System.out.println ("El nuevo sueldo del empleado es de: " + sueldoConAumento);
    }

    public static void main(String[] args) {
        new Main().calcularAumento();

    }
}