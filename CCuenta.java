package cuentas;

/**
 * Clase que representa una cuenta bancaria.
 * Permite realizar operaciones de ingreso y retiro, así como consultar el saldo y obtener información de la cuenta.
 */
public class CCuenta {

    /** Nombre del titular de la cuenta. */
    private String nombre;
    /** Número de cuenta. */
    private String cuenta;
    /** Saldo actual de la cuenta. */
    private double saldo;
    /** Tipo de interés aplicado a la cuenta. */
    private double tipoInterés;

    /**
     * Constructor de la clase CCuenta.
     *
     * @param nombre      Nombre del titular de la cuenta.
     * @param cuenta      Número de cuenta.
     * @param saldo       Saldo inicial de la cuenta.
     * @param tipoInterés Tipo de interés aplicado a la cuenta.
     */
    public CCuenta(String nombre, String cuenta, double saldo, double tipoInterés) {
        this.nombre = nombre;
        this.cuenta = cuenta;
        this.saldo = saldo;
        this.tipoInterés = tipoInterés;
    }

    /**
     * Obtiene el saldo actual de la cuenta.
     *
     * @return El saldo actual de la cuenta.
     */
    public double estado() {
        return saldo;
    }

    /**
     * Ingresa una cantidad en la cuenta.
     *
     * @param cantidad La cantidad a ingresar.
     * @throws Exception Si la cantidad es negativa.
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede ingresar una cantidad negativa");
        }
        saldo = saldo + cantidad;
    }

    /**
     * Retira una cantidad de la cuenta.
     *
     * @param cantidad La cantidad a retirar.
     * @throws Exception Si la cantidad es negativa o si no hay suficiente saldo.
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0) {
            throw new Exception("No se puede retirar una cantidad negativa o nula");
        }
        if (estado() < cantidad) {
            throw new Exception("No hay suficiente saldo");
        }
        saldo = saldo - cantidad;
    }

    /**
     * Obtiene el nombre del titular de la cuenta.
     *
     * @return El nombre del titular de la cuenta.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del titular de la cuenta.
     *
     * @param nombre El nombre del titular de la cuenta.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el número de cuenta.
     *
     * @return El número de cuenta.
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Establece el número de cuenta.
     *
     * @param cuenta El número de cuenta.
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Obtiene el tipo de interés aplicado a la cuenta.
     *
     * @return El tipo de interés aplicado a la cuenta.
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * Establece el tipo de interés aplicado a la cuenta.
     *
     * @param tipoInterés El tipo de interés aplicado a la cuenta.
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
}
