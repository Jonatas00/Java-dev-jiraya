package jiraya.dev.introducao;

/*
    Prática

    Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

    Eu <nome>, morando no endereço <endereço>,
    confirmo que recebi o salário de <salário>, na data <data>
* */

public class PrimitiveTypesExercises {
    public static void main(String[] args) {
        String name = "Jonatas";
        String adress = "Rua X";
        double salary = 1500.00;
        String date = "30/05/2023";

        System.out.printf("Eu %s, morando no endereço %s \n", name, adress);
        System.out.printf("confirmo que recebi o salário de %.2f na data %s", salary, date);
    }
}
