import static java.lang.IO.*;

void main() {
    IO.print("Digite a 1ª nota bimestral: ");
    double nota1 = Double.parseDouble(readln().replace(",", "."));

    IO.print("Digite a 2ª nota bimestral: ");
    double nota2 = Double.parseDouble(readln().replace(",", "."));

    IO.print("Digite a 3ª nota bimestral: ");
    double nota3 = Double.parseDouble(readln().replace(",", "."));

    IO.print("Digite a 4ª nota bimestral: ");
    double nota4 = Double.parseDouble(readln().replace(",", "."));

    double media = (nota1 + nota2 + nota3 + nota4) / 4;

    String conceito;

    if (media >= 9.0) {
        conceito = "A";
    }
    else if (media >= 7.5) {
        conceito = "B";
    }
    else if (media >= 6.0) {
        conceito = "C";
    }
    else if (media >= 4.0) {
        conceito = "D";
    }
    else {
        conceito = "E";
    }

    String situacao;

    if (conceito.equals("A") || conceito.equals("B") || conceito.equals("C")) {
        situacao = "APROVADO";
    }
    else {
        situacao = "REPROVADO";
    }

    IO.println("=== RESULTADO ===");
    IO.println("Nota 1  : " + nota1);
    IO.println("Nota 2  : " + nota2);
    IO.println("Nota 3  : " + nota3);
    IO.println("Nota 4  : " + nota4);
    IO.println("Média   : " + media);
    IO.println("Conceito: " + conceito);
    IO.println("Situação: " + situacao);
}