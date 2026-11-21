public class Empleado {


    private static final double PORCENTAJE_MAXIMO = 50.0;


    private final String nombre;
    private final String dni;
    private double salario;

    public Empleado(String nombre, String dni, double salarioInicial) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío.");
        }
        if (dni == null || dni.trim().isEmpty()) {
            throw new IllegalArgumentException("El DNI no puede estar vacío.");
        }
        if (salarioInicial <= 0) {
            throw new IllegalArgumentException("El salario inicial debe ser mayor a 0.");
        }
        this.nombre = nombre;
        this.dni = dni;
        this.salario = salarioInicial;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public double getSalario() {
        return salario;
    }


    public boolean actualizarSalario(double porcentajeAumento) {
        if (porcentajeAumento <= 0) {
            System.out.println("Error: el porcentaje de aumento debe ser positivo.");
            return false;
        }
        if (porcentajeAumento > PORCENTAJE_MAXIMO) {
            System.out.println("Error: el aumento no puede superar el " + PORCENTAJE_MAXIMO + "%.");
            return false;
        }
        salario = calcularNuevoSalario(porcentajeAumento);
        System.out.println("Aumento del " + porcentajeAumento + "% aplicado correctamente.");
        return true;
    }


    private double calcularNuevoSalario(double porcentaje) {
        return salario + (salario * porcentaje / 100);
    }


    public String obtenerInformacion() {
        return "Empleado: " + nombre + " | DNI: " + dni + " | Salario: $" + salario;
    }
}