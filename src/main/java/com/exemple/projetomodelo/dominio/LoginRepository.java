package com.exemple.projetomodelo.dominio;

public class LoginRepository {
    public static Login GetLoginByUsuario(){
        return new Login("luan", "123");
    }
}
