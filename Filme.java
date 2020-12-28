public class Filme extends Cinema {

    private int anoLancamento;

    public Filme() {

    }

    public Filme(String idiomaAudio, String idiomaLegenda, boolean estaPausado, String nome) {
        super(idiomaAudio, idiomaLegenda, estaPausado, nome);
        setAnoLancamento(anoLancamento);
    }

    public void getAnoLancamento() {
	}
	public void setCargo(Void anoLancamento) {
	}

    public String exibirDetalhes() {
        String detalhes = this.nome + " " + this.anoLancamento + ". Duração: " + this.duracao + "min";
        System.out.println(detalhes);
        return detalhes;
    }
}