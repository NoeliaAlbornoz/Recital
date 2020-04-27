package app;

public class Asistente {
    public int id;
    public String nombre;
    public int dni;

    public void comprar(Ticket ticket) {
        // aqui dentro va toda la logica de la compra del ticket por parte del asistente
        ticket.espectador = this;

        System.out.println("Comprando ticket");

    }

    public void comprar(Bebida bebida) {
        // aca logica de comprar bebida

        System.out.println("Comprando bebida");

    }

    public boolean devolver(Ticket ticket) {
        // aca logica si puedo devolver o no el ticket
        // asumimos que podemos

        return true;

    }

    public void regalar(Ticket ticket, Asistente beneficiado) {

        // logica de regalo

        ticket.espectador = beneficiado;

        System.out.println("Regalando ticket");

    }

    public void asistir() {

        System.out.println("Asistiendo");

    }

    /**
     * Este metodo lo que hace es que el asistente presencie la banda
     * 
     * @param banda: es el objeto banda
     */

    public void ver(Banda banda) {

        System.out.println("Viendo banda");

    }

}