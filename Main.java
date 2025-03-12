package cuentas;

/**
 * Clase principal que demuestra el uso de la clase CCuenta.
 * Realiza operaciones de ingreso y retiro en una cuenta bancaria.
 */
public class Main {

    /**
     * Método principal que se ejecuta al iniciar el programa.
     *
     * @param args Argumentos de la línea de comandos (no se utilizan en este caso).
     */
    public static void main(String[] args) {
        CCuenta cuenta1 = new CCuenta("Antonio López", "1000-2365-85-1230456789", 2500, 0);
        double saldoActual = cuenta1.estado();

        System.out.println("El saldo actual es " + saldoActual);

        operativa_cuenta(cuenta1, 2300); // Retirar 2300
        operativa_cuenta(cuenta1, 695);  // Ingresar 695
    }

    /**
     * Realiza operaciones de retiro e ingreso en la cuenta.
     *
     * @param cuenta1  El objeto CCuenta sobre el que se realizan las operaciones.
     * @param cantidad La cantidad a retirar o ingresar.
     */
    public static void operativa_cuenta(CCuenta cuenta1, float cantidad) {
        if (cantidad < 0) {
            try {
                cuenta1.retirar(Math.abs(cantidad)); // Retirar cantidad negativa
            } catch (Exception e) {
                System.out.println("Fallo al retirar");
            }
        } else {
            try {
                System.out.println("Ingreso en cuenta");
                cuenta1.ingresar(cantidad); // Ingresar cantidad positiva
            } catch (Exception e) {
                System.out.println("Fallo al ingresar");
            }
        }
    }
}
