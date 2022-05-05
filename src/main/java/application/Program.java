package application;

import model.entities.Pessoa;

public class Program {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa(null, "Joao da Pedra", "joaodapedra@gmail.com");
        Pessoa p2 = new Pessoa(null, "Carlo da Pedra", "carlodapedra@gmail.com");
        Pessoa p3 = new Pessoa(null, "Jaime da Pedra", "jaimedapedra@gmail.com");

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

    }
}
