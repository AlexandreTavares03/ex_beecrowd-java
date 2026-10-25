import java.util.Scanner;

public class Main {

    public static String extenso(double valor) {
        int centavos = (int) (valor * 100);
        int divReais = centavos / 100;
        int restoCentavos = centavos % 100;

        if (restoCentavos == 0) {
            return numeroPorExtenso(divReais) + " Reais ";
        } else if (divReais == 0) {
            return numeroPorExtenso(restoCentavos) + " Centavos ";
        } else {
            return numeroPorExtenso(divReais) + " Reais e " + numeroPorExtenso(restoCentavos) + " centavos ";
        }

    }

    public static String numeroPorExtenso(int numero) {
        int unidade = numero % 10;
        int dezena = numero / 10;
        String nomeDezena = "";

        if (numero >= 11 && numero <= 19) {

            switch (numero) {
                case 11:
                    return "onze";
                case 12:
                    return "doze";
                case 13:
                    return "treze";
                case 14:
                    return "catorze";
                case 15:
                    return "quinze";
                case 16:
                    return "dezesseis";
                case 17:
                    return "dezessete";
                case 18:
                    return "dezoito";
                case 19:
                    return "dezenove";
            }
        }

        if (numero >= 100 && numero <= 999) {
            int centena = numero / 100;
            int resto = numero % 100;
            String nomeCentena = "";

            if (numero == 100) {
                return "cem";
            }

            switch (centena) {
                case 1:
                    nomeCentena = "cento";
                    break;
                case 2:
                    nomeCentena = "duzentos";
                    break;
                case 3:
                    nomeCentena = "trezentos";
                    break;
                case 4:
                    nomeCentena = "quatrocentos";
                    break;
                case 5:
                    nomeCentena = "quinhentos";
                    break;
                case 6:
                    nomeCentena = "seiscentos";
                    break;
                case 7:
                    nomeCentena = "setecentos";
                    break;
                case 8:
                    nomeCentena = "oitocentos";
                    break;
                case 9:
                    nomeCentena = "novecentos";
                    break;
            }
            if (resto == 0) {
                return nomeCentena;
            } else {
                return nomeCentena + " e "
                        + numeroPorExtenso(resto);
            }
        }

        if (numero >= 20) {
            switch (dezena) {
                case 2:
                    nomeDezena = "vinte";
                    break;
                case 3:
                    nomeDezena = "trinta";
                    break;
                case 4:
                    nomeDezena = "quarenta";
                    break;
                case 5:
                    nomeDezena = "cinquenta";
                    break;
                case 6:
                    nomeDezena = "sessenta";
                    break;
                case 7:
                    nomeDezena = "setenta";
                    break;
                case 8:
                    nomeDezena = "oitenta";
                    break;
                case 9:
                    nomeDezena = "noventa";
                    break;
                default:
                    return "Dezena não implementada";
            }

            if (unidade == 0) {
                return nomeDezena;
            } else {
                return nomeDezena + " e " + numeroPorExtenso(unidade);
            }
        } else {
            switch (numero) {
                case 1:
                    return "um";
                case 2:
                    return "dois";
                case 3:
                    return "tres";
                case 4:
                    return "quatro";
                case 5:
                    return "cinco";
                case 6:
                    return "seis";
                case 7:
                    return "sete";
                case 8:
                    return "oito";
                case 9:
                    return "nove";
                case 10:
                    return "dez";
                case 0:
                    return "zero";
                default:
                    return "Número não implementado";
            }
        }
    }

    public static String mesExtenso(String data) {
        String[] partes = data.split("/");

        int dia = Integer.parseInt(partes[0]);
        int mes = Integer.parseInt(partes[1]);
        int ano = Integer.parseInt(partes[2]);

        String nomeMes = "";

        switch (mes) {
            case 1:
                nomeMes = "Janeiro";
                break;
            case 2:
                nomeMes = "Fevereiro";
                break;
            case 3:
                nomeMes = "Março";
                break;
            case 4:
                nomeMes = "Abril";
                break;
            case 5:
                nomeMes = "Maio";
                break;
            case 6:
                nomeMes = "Junho";
                break;
            case 7:
                nomeMes = "Julho";
                break;
            case 8:
                nomeMes = "Agosto";
                break;
            case 9:
                nomeMes = "Setembro";
                break;
            case 10:
                nomeMes = "Outubro";
                break;
            case 11:
                nomeMes = "Novembro";
                break;
            case 12:
                nomeMes = "Dezembro";
                break;

            default:
                return "mês invalido";

        }
        return dia + " de " + nomeMes + " de " + ano;
    }


    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        String nome = input.nextLine();
        String servico = input.nextLine();
        double valor = input.nextDouble();
        input.nextLine();
        String data = input.nextLine();

        System.out.printf("Recebemos o pagamento de R$%.2f (%s) de %s pelo serviço da(o) %s. %n Cruzeiro, %s", valor,extenso(valor), nome, servico, mesExtenso(data));

        input. close();
    }
}
