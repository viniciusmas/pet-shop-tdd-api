package br.edu.infnet.petshoptddapi.domain;

public class Pet {

    private Integer id;

    private String nome;

    private TipoEspecie tipoEspecie;

    private String raca;

    private Integer idade;

    private Double peso;

    private Cliente tutor;

    @Override
    public String toString() {
        return String.format("Pet {id = %d, Nome = %s, Tipo da Espécie = %s, Raça = %s, Idade = %d, Peso = %.2f, Tutor = %s}",
                id, nome, tipoEspecie != null ? tipoEspecie.name() : "N/A", raca, idade, peso,
                tutor != null ? String.format("%d - %s", tutor.getId(), tutor.getNome()) : "N/A");
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoEspecie getTipoEspecie() {
        return tipoEspecie;
    }

    public void setTipoEspecie(TipoEspecie tipoEspecie) {
        this.tipoEspecie = tipoEspecie;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Cliente getTutor() {
        return tutor;
    }

    public void setTutor(Cliente tutor) {
        this.tutor = tutor;
    }
}
