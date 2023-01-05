package dipendente;

public class Dipendente {
    String matricola;
    float stipendio, straordinario;

    public Dipendente(String matricola, float stipendio, float straordinario) {
        this.matricola = matricola;
        this.stipendio = stipendio;
        this.straordinario = straordinario;
    }

    float getStipendio() {
        return stipendio;
    }

    float paga(int t) {
        float paga = stipendio + (straordinario * t);
        return paga;
    }

    void stampa() {
        System.out.println("matricola: " + matricola + " stipendio: " + stipendio + " straordinario: " + straordinario);
    }
}
