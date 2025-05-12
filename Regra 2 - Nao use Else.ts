// antes
class UsuarioAntes {
    constructor(public nome: string, public estaAtivo: boolean, public ehAdmin: boolean,public ehBanido: boolean) {}
  }
  
  function mensagemBemVindoEntes(usuario: UsuarioAntes): string {
    if (usuario.estaAtivo) {
      return `Bem vindo, ${usuario.nome}!`;
    } else {
      return 'Usuário não está ativo.';
    }
    
  
    function stautsMensagem(usuario: UsuarioAntes){
      if(usuario.ehBanido){
        return "o usuario está banido"
      }
      else if(usuario.ehAdmin){
        return "o usuario é adminstrador"
      }
      else{
        return "não foi possível verificar o status da mensagem"
      }
    }
  }
  
  
  
  // depois
  class UsuarioDepois {
    constructor(public nome: string, public estaAtivo: boolean,  public ehAdmin: boolean, public ehBanido: boolean) {}
  
     mensagemBemVindoDepois(user: UsuarioDepois): string {
      if (!user.estaAtivo) {
        return  'Usuário não está ativo.';
      }
  
      return `Bem vindo, ${user.nome}!`;
    }

     stautsMensagem(usuario: UsuarioDepois){
  
      if(!usuario.ehAdmin || !usuario.ehBanido){
        return "não foi possível verificar o status da mensagem"
      }
  
      if(usuario.ehBanido){
        return "o usuario está banido"
      }
  
       if(usuario.ehAdmin){
        return "o usuario é adminstrador"
      }
  
    }
  }
