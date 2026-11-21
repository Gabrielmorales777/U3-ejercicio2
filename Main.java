public class Main {

    public static void main(String[] args) {


        Empleado empleado = new Empleado("Carlos Pérez", "30123456", 500000);

        System.out.println("=== Estado inicial ===");
        System.out.println(empleado.obtenerInformacion());

        System.out.println("\n=== Actualizaciones correctas ===");
        empleado.actualizarSalario(10);
        System.out.println("Salario actual: $" + empleado.getSalario());
        empleado.actualizarSalario(5.5);
        System.out.println("Salario actual: $" + empleado.getSalario());

        System.out.println("\n=== Actualizaciones incorrectas ===");
        empleado.actualizarSalario(-15); // porcentaje negativo
        empleado.actualizarSalario(0);   // porcentaje cero
        empleado.actualizarSalario(80);  // supera el tope permitido
        System.out.println("Salario sin cambios: $" + empleado.getSalario());

        System.out.println("\n=== Resultado final ===");
        System.out.println(empleado.obtenerInformacion());


    }
}