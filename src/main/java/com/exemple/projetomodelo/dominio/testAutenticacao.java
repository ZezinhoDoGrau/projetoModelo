package com.exemple.projetomodelo.dominio;

public class testAutenticacao {
    private static LoginService loginService;

    public static void main(String[] args){
        testSucessoLogin();
        testSemSucessoSenhaIncorretaLogin();
        testSemSucessoUsuarioIncorretaLogin();
    }

    public static void testSucessoLogin(){
        loginService = new LoginService();
        loginService.autenticarLogin("luan", "123");
    }

    public static void testSemSucessoSenhaIncorretaLogin(){
        loginService = new LoginService();
        loginService.autenticarLogin("luan", "1234");
    }

    public static void testSemSucessoUsuarioIncorretaLogin(){
        loginService = new LoginService();
        loginService.autenticarLogin("luan1", "123");
    }
}
