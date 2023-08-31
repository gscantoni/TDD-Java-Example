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
     public void marcaIntervalo(int inicioHora, int inicioMinuto, int inicioSegundo, int fimHora, int fimMinuto, int fimSegundo) {
        this.intervaloInicio = String.format("%d:%02d:%02d", inicioHora, inicioMinuto, inicioSegundo);
        this.intervaloFim = String.format("%d:%02d:%02d", fimHora, fimMinuto, fimSegundo);
    }

    public String getIntervaloInicio() {
        return intervaloInicio;
    }

    public String getIntervaloFim() {
        return intervaloFim;
    }

    public String getTempoDecorrido() {
    	int inicioSegundosTotal = calcularSegundosTotal(intervaloInicio);
        int fimSegundosTotal = calcularSegundosTotal(intervaloFim);
        
        int segundosDecorridos = fimSegundosTotal - inicioSegundosTotal;
        
        int horas = segundosDecorridos / 3600;
        int minutos = (segundosDecorridos % 3600) / 60;
        int segundos = segundosDecorridos % 60;
        
        return String.format("%02d:%02d:%02d", horas, minutos, segundos);
    }
    
    private int calcularSegundosTotal(String tempo) {
        String[] partes = tempo.split(":");
        int horas = Integer.parseInt(partes[0]);
        int minutos = Integer.parseInt(partes[1]);
        int segundos = Integer.parseInt(partes[2]);
        
        return horas * 3600 + minutos * 60 + segundos;
    }

    public String getHoraFormato24h() {
        return String.format("%02d:%02d:%02d", hora, minuto, segundo);
    }
	
    public String getHoraFormatoAMPM() {
        String ampm = hora < 12 ? "AM" : "PM";
        int horaFormato12h = hora > 12 ? hora - 12 : hora;
        return String.format("%d:%02d:%02d %s", horaFormato12h, minuto, segundo, ampm);
    }
}
