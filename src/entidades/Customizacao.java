package entidades;

public class Customizacao {
    private char ar;
    private char cambioAuto;
    private char alarme;
    private char pinturaEspecial;
    private char tetoSolar;
    private char kitMultimidia;

    public Customizacao(char ar, char cambioAuto, char alarme, char pinturaEspecial, char tetoSolar, char kitMultimidia) {
        this.ar = ar;
        this.cambioAuto = cambioAuto;
        this.alarme = alarme;
        this.pinturaEspecial = pinturaEspecial;
        this.tetoSolar = tetoSolar;
        this.kitMultimidia = kitMultimidia;
    }

    public char getAr() {
        return ar;
    }

    public void setAr(char ar) {
        this.ar = ar;
    }

    public char getCambioAuto() {
        return cambioAuto;
    }

    public void setCambioAuto(char cambioAuto) {
        this.cambioAuto = cambioAuto;
    }

    public char getAlarme() {
        return alarme;
    }

    public void setAlarme(char alarme) {
        this.alarme = alarme;
    }

    public char getPinturaEspecial() {
        return pinturaEspecial;
    }

    public void setPinturaEspecial(char pinturaEspecial) {
        this.pinturaEspecial = pinturaEspecial;
    }

    public char getTetoSolar() {
        return tetoSolar;
    }

    public void setTetoSolar(char tetoSolar) {
        this.tetoSolar = tetoSolar;
    }

    public char getKitMultimidia() {
        return kitMultimidia;
    }

    public void setKitMultimidia(char kitMultimidia) {
        this.kitMultimidia = kitMultimidia;
    }
}
