package com.exemple.projetomodelo.dominio;

public class LoginService {
    Login login;

    public void autenticarLogin(String usuario, String senha){
        login = new LoginRepository().GetLoginByUsuario();
        login.autenticarLogin(usuario, senha);
    }
}
