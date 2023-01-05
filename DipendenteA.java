package dipendente;

public class DipendenteA extends Dipendente {
    int malattia = 0;

    public DipendenteA(String matricola, float stipendio, float straordinario) {
        super(matricola, stipendio, straordinario);
    }

    void prendiMalattia(int g) {
        malattia = malattia + g;
    }

    @Override
    float paga(int t) {
        float p = super.paga(t);
        if (malattia == 0) {
            return p;
        } else {
            p = p - (malattia * (float) 15.0);
            return p;
        }
    }

    void stampaMalattia() {
        System.out.println("giorni di malattia: " + malattia);
    }

}
