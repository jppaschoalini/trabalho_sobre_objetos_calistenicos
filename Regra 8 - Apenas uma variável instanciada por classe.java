// 1 variavel p/ instancia
// Calistenic Objects






// Exemplo sem Calisthenic Objects
class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void apresentar() {
        System.out.println("Nome: " + nome + ", Idade: " + idade);
    }
}

// Exemplo com Calisthenic Objects
class NomePessoa {
    private final String valor;

    public NomePessoa(String valor) {
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }
}

class IdadePessoa {
    private final int valor;

    public IdadePessoa(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }
}

class Pessoa {
    private final NomePessoa nome;
    private final IdadePessoa idade;

    public Pessoa(NomePessoa nome, IdadePessoa idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void apresentar() {
        System.out.println("Nome: " + nome.getValor() + ", Idade: " + idade.getValor());
    }
}

// Exemplo de uso
class Main {
    public static void main(String[] args) {
        // Sem Calisthenic Objects
        Pessoa pessoaSemCalisthenics = new Pessoa("João", 30);
        pessoaSemCalisthenics.apresentar();

        // Com Calisthenic Objects
        NomePessoa nome = new NomePessoa("Maria");
        IdadePessoa idade = new IdadePessoa(25);
        Pessoa pessoaComCalisthenics = new Pessoa(nome, idade);
        pessoaComCalisthenics.apresentar();
    }
}
