package com.exemple.projetomodelo.dominio;

public class Login {
    private String usuario;
    private String senha;
    private boolean autenticado;

    public Login(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;
        this.autenticado = autenticado;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean isAutenticado() {
        return autenticado;
    }

    public void setAutenticado(boolean autenticado) {
        this.autenticado = autenticado;
    }

    public void autenticarLogin(String edtUsuario, String edtSenha){
        if(this.usuario.equals(edtUsuario)&&this.senha.equals(edtSenha)){
            autenticado = true;
        }
        if (autenticado){
            System.out.println("Ok");
        }else{
            System.out.println("not Ok");
        }
    }
}
