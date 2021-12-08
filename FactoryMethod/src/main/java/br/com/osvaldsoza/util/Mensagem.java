package br.com.osvaldsoza.util;

import br.com.osvaldsoza.maladireta.MalaDireta;

import javax.swing.*;

public class Mensagem {

    public static void show(MalaDireta malaDireta) {
        String mensagem = JOptionPane.showInputDialog(null, "Informe a mensagem para o e-mail");

        boolean status = malaDireta.enviarEmail(mensagem);
        System.out.println(status);
    }
}
