package arrayList;

public class Funcionario {
    private String nome;
    private String cpf;
    private String rg;
    private String telefone;
    private Empresa empresa;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    @Override
    public String toString() {
        return "\nFuncionario [ nome=" + nome + ", cpf=" + cpf + ", rg=" + rg + ", telefone=" + telefone + ", empresa="
                + empresa.getNome() + "]\n";
    }

}
