/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

public class Usuarios {
    
    private String login;
    private String nome;
    private String idade;
    private String sexo;
    private String tipoLivroFavorito1;
    private String tipoLivroFavorito2;
    private String senha;
    private String ativo;
    
    
    public Usuarios(){}
    
//    public Usuarios(Usuarios valoresRecebidos){
//        
//        this.login = valoresRecebidos.login;
//        this.nome = valoresRecebidos.nome;
//        this.idade = valoresRecebidos.idade;
//        this.sexo = valoresRecebidos.sexo;
//        this.tipoLivroFavorito1 = valoresRecebidos.tipoLivroFavorito1;
//        this.tipoLivroFavorito2 = valoresRecebidos.tipoLivroFavorito2;
//        this.senha = valoresRecebidos.senha;
//        this.ativo = valoresRecebidos.ativo;
//    }

    public Usuarios(String login, String nome, String idade, String sexo, String tipoLivroFavorito1, String tipoLivroFavorito2, String senha ,String ativo) {
        this.login = login;
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.tipoLivroFavorito1 = tipoLivroFavorito1;
        this.tipoLivroFavorito2 = tipoLivroFavorito2;
        this.senha = senha;
        this.ativo = ativo;
    }
    
    public void setLogin(String loginRecebido){
        this.login = loginRecebido;
    }
    
    public String getLogin(){
        return login;
    }
    
    public void setNome(String nome){
        this.login = nome;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setIdade(String idade){
        this.idade = idade;
    }
    
    public String getIdade(){
        return idade;
    }
    
    public void setSexo(String sexo){
        this.sexo = sexo;
    }
    
    public String getSexo(){
        return sexo;
    }
    
    public void setTipoLivroFavorito1(String tipoLivroFavorito1){
        this.tipoLivroFavorito1 = tipoLivroFavorito1;
    }
    
    public String getTipoLivroFavorito1(){
        return tipoLivroFavorito1;
    }
    
    public void setTipoLivroFavorito2(String tipoLivroFavorito2){
        this.tipoLivroFavorito2 = tipoLivroFavorito2;
    }
    
    public String getTipoLivroFavorito2(){
        return tipoLivroFavorito2;
    }
    
    public void setSenha(String senha){
        this.senha = senha;
    }
    
    public String getSenha(){
        return senha;
    }
    
      public void setAtivo(String ativo){
        this.ativo = ativo;
    }
    
    public String getAtivo(){
        return ativo;
    }
}
