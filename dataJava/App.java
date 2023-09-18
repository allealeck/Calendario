import excecao.controllerException;
import nahida.data;
import nahida.dataHora;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        int dia, mes, ano, quantDia, escolha;

        data date = null;
        dataHora horario = null;
        Scanner teclado = new Scanner(System.in);

        try{
            do {
                System.out.println("""
                    Escolha uma opção:
                    1 - Digitar uma Data
                    2 - Exibir uma Data
                    3 - Alterar uma Data
                    4 - Adiar uma Data
                    5 - Digitar uma Data e Hora
                    6 - Alterar uma Data e Hora
                    7 - Exibir uma Data e Hora
                    9 - Sair
                    """);
                escolha = teclado.nextInt();

                switch (escolha) {

                    case 1 -> {
                        System.out.println("""
                            Digite o Dia:
                            """);
                        dia = teclado.nextInt();

                        System.out.println("""
                            Digite o Mes:
                            """);
                        mes = teclado.nextInt();

                        System.out.println("""
                            Digite o Ano:
                            """);
                        ano = teclado.nextInt();

                        date = new data(dia, mes, ano);

                    }

                    case 2 -> {
                        System.out.println(date.dataCompleta());
                    }

                    case 3 -> {
                        System.out.println("""
                            Digite o Dia:
                            """);
                        dia = teclado.nextInt();

                        System.out.println("""
                            Digite o Mes:
                            """);
                        mes = teclado.nextInt();

                        System.out.println("""
                            Digite o Ano:
                            """);
                        ano = teclado.nextInt();

                        date.setData(dia,mes,ano);
                    }

                    case 4 -> {
                        System.out.println("Digite uma quantidade de dias: ");
                        quantDia = teclado.nextInt();

                        date.proxData(quantDia);
                    }

                    case 5 -> {
                        System.out.println("""
                            Digite o Dia:
                            """);
                        dia = teclado.nextInt();

                        System.out.println("""
                            Digite o Mes:
                            """);
                        mes = teclado.nextInt();

                        System.out.println("""
                            Digite o Ano:
                            """);
                        ano = teclado.nextInt();

                        System.out.println("""
                            Digite a Hora:
                            """);
                        int hora = teclado.nextInt();

                        System.out.println("""
                            Digite o Minuto:
                            """);
                        int minuto = teclado.nextInt();

                        System.out.println("""
                            Digite o Segundo:
                            """);
                        int segundo = teclado.nextInt();

                        horario = new dataHora(dia,mes,ano,hora,minuto,segundo);

                    }

                    case 6 -> {
                        System.out.println("""
                            Digite o Dia:
                            """);
                        dia = teclado.nextInt();

                        System.out.println("""
                            Digite o Mes:
                            """);
                        mes = teclado.nextInt();

                        System.out.println("""
                            Digite o Ano:
                            """);
                        ano = teclado.nextInt();

                        System.out.println("""
                            Digite a Hora:
                            """);
                        int hora = teclado.nextInt();

                        System.out.println("""
                            Digite o Minuto:
                            """);
                        int minuto = teclado.nextInt();

                        System.out.println("""
                            Digite o Segundo:
                            """);
                        int segundo = teclado.nextInt();

                        horario.setHora(dia,mes,ano,hora,minuto,segundo);

                    }

                    case 7 -> {
                        System.out.println(horario.HoraCompleta());

                    }

                }

            }while(escolha != 9);

        }catch(controllerException e){
            System.out.println(e);
        }
    }
}