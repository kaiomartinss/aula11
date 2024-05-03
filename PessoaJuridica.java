public class PessoaJuridica extends Pessoa {
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    private String cnpj;

    @Override
    public String toString() {
        return "Nome: " + getNome() + ", Idade: " + getIdade() + ", Tipo: Pessoa Jurídica: " + cnpj;
    }
}