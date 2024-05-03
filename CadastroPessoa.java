import java.util.ArrayList;
public class CadastroPessoa {
    private ArrayList<Pessoa> pessoas = new ArrayList<>();

    public void  cadastrarPessoa(Pessoa p) {
        pessoas.add(p);
        System.out.println("Pessoa cadastrada com sucesso!");
    }

    public void listar(){
        for (Pessoa p: pessoas){
            System.out.println("Nome:" + p.getNome() + "Idade:" + p.getIdade());
        }
    }

    private ArrayList<PessoaFisica> pessoasFisicas = new ArrayList<>();

    public void cadastrarPessoaFisisca(PessoaFisica pf) {
        pessoasFisicas.add(pf);
        System.out.println("Pessoa cadastrada com sucesso");
    }

    public void listarFisica() {
        for (PessoaFisica pf: pessoasFisicas) {
            System.out.println(pf);
        }
    }

    private ArrayList<PessoaJuridica> pessoasJuridicas = new ArrayList<>();

    public void cadastrarPessoaJuridica(PessoaJuridica pj) {
        pessoasJuridicas.add(pj);
        System.out.println("Pessoa cadastrada com sucesso!");
    }

    public void listarJuridica() {
        for (PessoaJuridica pj: pessoasJuridicas) {
            System.out.println(pj);
        }
    }

    public void listarPolimorficos() {
        ArrayList<Pessoa> pessoaPolimorficas = new ArrayList<>();
        pessoaPolimorficas.addAll(pessoasFisicas);
        pessoaPolimorficas.addAll(pessoasJuridicas);

        for (Pessoa p: pessoaPolimorficas) {
            if(p instanceof PessoaFisica) {
                System.out.println("Nome:" + p.getNome() + ", Idade:" + p.getIdade() + ", CPF:" +
                        ((PessoaFisica) p).getCpf());
            } else if (p instanceof PessoaJuridica) {
                System.out.println("Nome:" + p.getNome() + ", Idade:" + p.getIdade() + ", CNPJ:" +
                        ((PessoaJuridica) p).getCnpj());
            }else {
                System.out.println("pessoa não encontrada!");
            }
        }
    }
}
