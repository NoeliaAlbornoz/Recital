package app;

import java.util.Scanner;

public class App {

    public static Scanner Teclado = new Scanner(System.in); //atributo de la clase App de tipo scanner, creo objeto
    public static void main(String[] args) throws Exception {

        int edad;
        edad = 20;

        Ticket ticket2; //declaro variable pero esta nula
        Ticket ticket1 = new Ticket();

        //accedo al atributo id del objeto1

        ticket1.id = 3222243;
        ticket1.precio = 100;
        ticket1.ubicacion = "A3";

        ticket2 = new Ticket();

        //accedo al atributo id del objeto1

        ticket2.id = 322;
        ticket2.precio = 10;
        ticket2.ubicacion = "S3";

        Banda comanche = new Banda();
        comanche.nombre = "Comanche";
        comanche.cantidadIntegrantes = 6;

        //Referencias de objeto

        Banda otraBanda;
        otraBanda = comanche;
        ticket1.banda = otraBanda;

        Banda otraBanda2 = new Banda();
        comanche.nombre = "Los Palmeras";
        comanche.cantidadIntegrantes = 10;

        otraBanda = otraBanda2;

        //ticket1.banda = comanche;

        Asistente asistente = new Asistente();

        asistente.nombre = "Laura";
        asistente.dni = 23345666;
        asistente.id = 2313;

        //ticket1.espectador = asistente; //vinculo atributo espectador de objeto ticket1 de tipo Ticket a un objeto de tipo Asistente

        //asistente.comprar(ticket1);
        //asistente.comprar(ticket2);

        if(asistente.devolver(ticket2)){

            System.out.println("Puedo devolver el ticket" + ticket2.id);

        } else {
            System.out.println("Voy al abogado");
        }

        Asistente beneficiario = new Asistente();

        beneficiario.nombre = "Tati";
        beneficiario.id = 200;
        beneficiario.dni = 200000000;

        asistente.regalar(ticket1, beneficiario);

        asistente.asistir();
        asistente.ver(comanche);

        CocaCola coke1 = new CocaCola();
        coke1.nombre = "Coca Común";
        coke1.precio = 200;

        CocaCola coke2 = new CocaCola();
        coke2.nombre = "Coca Zero";
        coke2.precio = 210;

        int lala;
        lala = Teclado.nextInt();

        /*ticket1.banda = new Banda();
        ticket1.banda.nombre = "Comanche";
        ticket1.banda.cantidadIntegrantes = 6;

        //ticket1.espectador = new Asistente();

        ticket2.banda = new Banda();
        ticket2.banda.nombre = "Comanche";
        ticket2.banda.cantidadIntegrantes = 6;

        ticket2.espectador = new Asistente();*/

    }
}