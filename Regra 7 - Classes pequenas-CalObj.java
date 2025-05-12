// Classes pequenas
// Calistenic Objects





// Sem Calistenic Objects

// Classe de Usuário tradicional
class User {
    private String name;
    private String email;
    
    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }
    
    public String getName() {
        return name;
    }
    
    public String getEmail() {
        return email;
    }
}

// Serviço de registro de usuário
class UserService {
    public void registerUser(User user) {
        // Lógica de registro de usuário
        System.out.println("Registrando usuário: " + user.getName());
    }
}

// Classe principal para demonstração
public class TraditionalApproach {
    public static void main(String[] args) {
        User user = new User("João Silva", "joao@email.com");
        UserService userService = new UserService();
        userService.registerUser(user);
    }
}

// Com Calistenic Objects (Object Calisthenics)

// Value Object para nome
class Name {
    private final String value;
    
    public Name(String value) {
        if (value == null || value.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome inválido");
        }
        this.value = value;
    }
    
    public String getValue() {
        return value;
    }
}

// Value Object para email
class Email {
    private final String value;
    
    public Email(String value) {
        if (value == null || !value.contains("@")) {
            throw new IllegalArgumentException("Email inválido");
        }
        this.value = value;
    }
    
    public String getValue() {
        return value;
    }
}

// Usuário com regras mais rígidas
class CalisthenicUser {
    private final Name name;
    private final Email email;
    
    public CalisthenicUser(Name name, Email email) {
        this.name = name;
        this.email = email;
    }
    
    public Name getName() {
        return name;
    }
    
    public Email getEmail() {
        return email;
    }
}

// Serviço de registro com responsabilidades mais específicas
class CalisthenicUserService {
    public void registerUser(CalisthenicUser user) {
        // Lógica de registro de usuário com validações mais robustas
        System.out.println("Registrando usuário: " + user.getName().getValue());
        // Validações adicionais podem ser implementadas aqui
    }
}

// Classe principal para demonstração
public class CalisthenicApproach {
    public static void main(String[] args) {
        try {
            Name name = new Name("João Silva");
            Email email = new Email("joao@email.com");
            
            CalisthenicUser user = new CalisthenicUser(name, email);
            CalisthenicUserService userService = new CalisthenicUserService();
            userService.registerUser(user);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
