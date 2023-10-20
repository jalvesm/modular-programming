public class Times {
    
    private String nome;
    private int jogos;
    private int vitorias;
    private int empates;
    private int derrotas;
    private int golsMarcados;
    private int golsSofridos;

    public Times(String nome) {
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public int getJogos() {
        return this.jogos;
    }
    
    public int getVitorias(Partida partida) {
        this.vitorias = partida.incrementaVencedor();
        return vitorias;
    }

    public int getEmpates() {
        return this.empates;
    }

    public int getDerrotas() {
        return this.derrotas;
    }

    public int getGolsMarcados() {
        return this.golsMarcados;
    }

    public int getSofridos() {
        return this.golsSofridos;
    }

}