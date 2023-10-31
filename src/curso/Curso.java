package curso;

public class Curso {
	private String id;
	private String nome;
	private String cod;
	private String nomeCor;
    private String quant; 
    
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCod() {
        return cod;
    }
    public void setCod(String cod) {
        this.cod = cod;
    }
    public String getNomeCor() {
        return nomeCor;
    }
    public void setNomeCor(String nomeCor) {
        this.nomeCor = nomeCor;
    }
    public String getQuant() {
        return quant;
    }
    public void setQuant(String quant) {
        this.quant = quant;
    }

    @Override
    public String toString() { 
    	
        return this.id +" - "+this.nome +" - "+this.cod +" - " +this.nomeCor + " - " +this.quant;
    }

}