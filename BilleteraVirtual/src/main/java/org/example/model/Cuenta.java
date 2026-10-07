package org.example.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Cuenta {
    int id;
    Usuario usuario;
    double saldo;
    List<Transaccion> historial = new ArrayList<>();
    private int contadorTransacciones = 1;

    public Cuenta() {
    }

    public Cuenta(int id, Usuario usuario, double saldo, List<Transaccion> historial, int contadorTransacciones) {
        this.id = id;
        this.usuario = usuario;
        this.saldo = saldo;
        this.historial = historial;
        this.contadorTransacciones = contadorTransacciones;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public List<Transaccion> getHistorial() {
        return historial;
    }

    public void setHistorial(List<Transaccion> historial) {
        this.historial = historial;
    }

    public int getContadorTransacciones() {
        return contadorTransacciones;
    }

    public void setContadorTransacciones(int contadorTransacciones) {
        this.contadorTransacciones = contadorTransacciones;
    }

    public void depositar(double monto){
        if (monto<0){
            System.out.println("El monto ingresado es erroneo!!!");
            System.out.println("Por favor ingrese un monto positivo");
        }else {
            saldo = saldo + monto;
            Transaccion t = new Transaccion(contadorTransacciones,"Deposito",monto, LocalDateTime.now(),this,null);
            historial.add(t);
            contadorTransacciones++;
        }
    }

    public void retirar(double monto){
        if (monto<0){
            System.out.println("Debe ingresar un monto superior a 0 para retirar");
        } else {
            if (saldo<monto){
                System.out.println("No posee suficiente saldo para hacer la transaccion");
            }else{
                saldo = saldo - monto;
                Transaccion t1 = new Transaccion(contadorTransacciones,"Retiro",monto,LocalDateTime.now(),this,null);
                historial.add(t1);
                contadorTransacciones++;
            }
        }
    }

    public void mostrarHistorial(){
        if (historial.isEmpty()){
            System.out.println("No hay transacciones registradas.");
        } else {
            for (Transaccion t : historial){
                System.out.println("Id " + t.getId() + ": " + t.getTipo()+" de " + t.getMonto() + " en " + t.getFecha());
            }
        }
    }
}
