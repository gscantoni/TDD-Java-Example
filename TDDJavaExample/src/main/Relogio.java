package main;

public class Relogio {
	
    private int segundo;
    private int minuto;
    private int hora;
    private String intervaloInicio;
    private String intervaloFim;

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getHora() {
        return hora;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }

    public int getSegundo() {
        return segundo;
    }
    public void reiniciarParaMeiaNoite() {
        this.hora = 0;
        this.minuto = 0;
        this.segundo = 0;
    }
