import java.util.List;

public class DadosDAO{
    this.projetos = new Arraylist<>();
    this.funcionarios = new Arraylist<>();

    public void criarProjeto(Projeto projeto){
        projetos.add(projeto);
    }

    public void criarFuncionario(Funcionario funcionario){
        funcionarios.add(funcionario);
    }

    public List<Projeto> lerProjetos(){
        return projetos;
    }
    public List<Funcionario> lerFuncionarios();
        return funcionarios;
    }

    public void atualizarProjeto(Projeto projeto){
        for (Projeto p : projetos){
            if (p.getNome().equals(projeto.getNome())){
                p.setDataCriacao(projeto.dataCriacao());
                break;
            }
        }
    }
    public void atualizarFuncionario(Funcionario funcionario){
        for (Funcionario f : funcionarios){
            if (f.getCpf().equals(funcionario.getCpf())){
                f.setNome(funcionario.getNome());
                f.setEmail(funcionario.getEmail());
                f.setSalario(funcionario.getSalario());
                break;
            }
        }
    }
    public void deletarProjeto(String nomeProjeto){
        projetos.removeIf(projeto -> projeto.getNome().equals(nomeProjeto));

    }
    public void deletarFuncionario(String cpfFuncionario){
        funcionarios.removeIf(funcionario -> funcionario.getCpf().equals(cpfFuncionario));

    }