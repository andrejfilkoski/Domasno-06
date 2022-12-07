public class Fakultet {
    String imeNaFakultet;
    int brojNaSmerovi;
    int vkBrNaStudenti;

    public Fakultet(String imeNaFakultet, int brojNaSmerovi, int vkBrNaStudenti) {
        this.imeNaFakultet = imeNaFakultet;
        this.brojNaSmerovi = brojNaSmerovi;
        this.vkBrNaStudenti = vkBrNaStudenti;
    }

    void PecatiObj(){
        System.out.println("Ime " + imeNaFakultet + ", smerovi " + brojNaSmerovi + ", broj na studenti " + vkBrNaStudenti);
    }
}
