package dipendente;

public class CalcolaStipendi {
    public static void main(String[] args) {
        Dipendente a = new Dipendente("00309", (float) 1000.00, (float) 7.50);
        a.paga(10);
        System.out.println("Stipendio: " + a.getStipendio());
        DipendenteA b = new DipendenteA("00201", (float) 1500.0, (float) 8.50);
        b.prendiMalattia(5);
        b.paga(3);
        b.stampaMalattia();
    }

}
