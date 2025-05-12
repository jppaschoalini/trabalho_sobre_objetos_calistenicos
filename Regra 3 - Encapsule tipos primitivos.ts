class Usuario {
    constructor(
      public nome: string,
      public email: string,
      public ehVerificado: boolean
    ) {}
  
    displayInfo(): string {
      if (this.ehVerificado) {
        return `Usuario ${this.nomeEhValido(this.nome)} <${this.emailEhValido(this.email)}> é verificado.`;
      }
      return `Usuario ${this.nomeEhValido(this.nome)} <${this.emailEhValido(this.email)}> não é verified.`;
    }
  
    nomeEhValido(nome: string){
      if(!nome){
        throw new Error('Nome está vazio');
      }else{
        return nome
      }
    }
  
    emailEhValido(email: string): string{
      if (email.includes('@')) {
        throw new Error('Invalido email');
      }else{
        return email
      }
    }
  }
  
  
  //depois 
  class Nome {
    constructor(private readonly value: string) {
      if(!this.value){
        throw new Error('Nome está vazio');
      }
    }
  
    toString(): string {
      return this.value;
    }
  }
  
  class Email {
    constructor(private readonly value: string) {
      if (!this.value.includes('@')) {
        throw new Error('Invalido email');
      }
    }
  
    toString(): string {
      return this.value;
    }
  }
  
  
  class User {
    constructor(
      private readonly name: Nome,
      private readonly email: Email,
    ) {}
  
    displayInfo(): string {
      return `User ${this.name.toString()} <${this.email.toString()}}.`;
    }
  }  