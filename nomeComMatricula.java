public class nomeComMatricula {
    Integer matricula=0;
    String nome= "";
    public nomeComMatricula(Integer matricula, String nome){
        this.matricula=matricula;
        this.nome=nome;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}