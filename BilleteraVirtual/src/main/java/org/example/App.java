package org.example;

import org.example.model.Cuenta;
import org.example.model.Usuario;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        List<Usuario>usuarios = new ArrayList<>();
        Scanner entrada = new Scanner(System.in);
        int opcion;

        do {

        System.out.println("\n--- Billetera virtual: ---");
        System.out.println("1. Iniciar sesion");
        System.out.println("2. Registrarse");
        System.out.println("0. Salir");
        opcion = entrada.nextInt();
        entrada.nextLine();

        if (opcion==1){
            System.out.println("Ingrese el email");

        }
        if (opcion == 2){
            Usuario nuevoUsuario = new Usuario();
            System.out.println("Ingrese nombre:");
            nuevoUsuario.setNombre(entrada.nextLine());
            System.out.println("Ingrese el email");
            nuevoUsuario.setEmail(entrada.nextLine());
            System.out.println("Ingrese un password");
            nuevoUsuario.setPassword(entrada.nextLine());
            usuarios.add(nuevoUsuario);
            System.out.println("El usuario " + nuevoUsuario.getNombre() + " ha sido creado exitosamente.");
            System.out.println("en este momento hay " + usuarios.size()+" usuarios creados");
        }
    }while (opcion!=0);
        entrada.close();


       /* do{
            System.out.println("\n--- Billetera Virtual ---");
            System.out.println("1. Depositar");
            System.out.println("2. Retirar");
            System.out.println("3. Mostrar historial");
            System.out.println("4. Mostrar saldo");
            System.out.println("0. Salir");
            opcion = entrada.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("Ingrese el monto a depositar: ");
                    double montoDep = entrada.nextDouble();
                    cuenta.depositar(montoDep);
                    break;
                case 2:
                    System.out.println("Ingrese el monto a retirar: ");
                    double montoRet = entrada.nextDouble();
                    cuenta.retirar(montoRet);
                    break;
                case 3:
                    cuenta.mostrarHistorial();
                    break;
                case 4:
                    System.out.println("Saldo actual: " + cuenta.getSaldo());
                    break;
                case 0:
                    System.out.println("Saliendo.... guardando cambios");
                    System.out.println("Sesion cerrada");
                    break;
                default:
                    System.out.println("Opcion invalida");
            }
        } while (opcion!=0);*/

       // entrada.close();
    }
}
