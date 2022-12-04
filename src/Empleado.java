import java.time.LocalDate;
import java.util.Date;

class Empleado {
    private final String nombre;
    private int edad;
    private final Date fechaContratacion;
    private final LocalDate fechaContratacion;

    private Empleado(String nombre, int edad, Date fechaContratacion) {
    private Empleado(String nombre, int edad, LocalDate fechaContratacion) {
            this.nombre = nombre;
            this.edad = edad;
            this.fechaContratacion = fechaContratacion;

                return edad;
            }

            public Date getFechaContratacion() {
                public LocalDate getFechaContratacion() {
                    return fechaContratacion;
                }


     * Método factoría que permite comprobar si la edad es válida antes de llamar al constructor.
                            * El constructor es ahora privado, impidiendo llamarlo directamente desde otra clase.
                            */
                    public static Empleado crearEmpleado(String nombre, int edad, Date fechaContratacion) {
                        public static Empleado crearEmpleado(String nombre, int edad, LocalDate fechaContratacion) {
                            if (edad < 0) throw new RuntimeException("Un empleado no puede tener edad negativa");
                            else return new Empleado(nombre, edad, fechaContratacion);
                        }