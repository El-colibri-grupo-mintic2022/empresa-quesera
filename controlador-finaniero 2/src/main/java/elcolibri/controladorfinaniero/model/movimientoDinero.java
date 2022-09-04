package elcolibri.controladorfinaniero.model;

import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity

public class movimientoDinero {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;
    private int montoMovimiento;
    private int monto;
    private String concepto;
    private String usuario;//ENCARGADO DE HACER EL MOVIMIENTO

    public movimientoDinero() {
    }

    public movimientoDinero(int montoMovimiento, int monto, String concepto, String usuario) {
        this.montoMovimiento = montoMovimiento;
        this.monto = monto;
        this.concepto = concepto;
        this.usuario = usuario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMontoMovimiento() {
        return montoMovimiento;
    }

    public void setMontoMovimiento(int montoMovimiento) {
        this.montoMovimiento = montoMovimiento;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
}

