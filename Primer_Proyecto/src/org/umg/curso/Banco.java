package org.umg.curso;

import org.umg.curso.Cliente;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 * Created by alumno on 26/06/2017.
 */
public class Banco {
    public static void main(String[] args) throws IOException {
        Cliente c = new Cliente();//creando el objeto
        c.setNombre("Diego");
        c.setEdad(25);
        c.setSalario(3870);

        System.out.println("Estimado Cliente:"+ c.getNombre()+", Su salario sera de:"+ c.getSalario());

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Su Nombre:");
        c.setNombre(reader.readLine());
        System.out.println("Su edad");
        c.setEdad(Integer.parseInt(reader.readLine()));
        System.out.println("Su salario");
        c.setSalario(Integer.parseInt(reader.readLine()));

        System.out.println("Estimado"+c.getNombre()+", Su edad es"+c.getEdad()+"Y su salario es de"+c.getSalario());

    }
}
