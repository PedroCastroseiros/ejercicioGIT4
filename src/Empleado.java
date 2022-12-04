import java.util.Date;

class Empleado {
    final String nombre;
    private final String nombre;
    private int edad;
    final Date fechaContratacion;
    private final Date fechaContratacion;

    private Empleado(String nombre, int edad, Date fechaContratacion) {
        this.nombre = nombre;
        @@ -16,6 +16,18 @@ public void setEdad(int edad) {
        else this.edad = edad;
        }

        public String getNombre() {
            return nombre;
        }

        public int getEdad() {
            return edad;
        }

        public Date getFechaContratacion() {
            return fechaContratacion;
        }

        @Override
        public String toString() {
            return "Se ha registrado a " + nombre + " (" + edad + " años; contratado en 19" + fechaContratacion.getYear() + ")";


    }