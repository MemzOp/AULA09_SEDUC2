import static java.lang.IO.*;

void main() {
    IO.print("Digite o turno em que você estuda (M-Matutino, V-Vespertino, N-Noturno): ");
    String turno = readln();

    if (turno.equals("M")) {
        IO.println("Bom Dia!");
    }
    else if (turno.equals("V")) {
        IO.println("Boa Tarde!");
    }
    else if (turno.equals("N")) {
        IO.println("Boa Noite!");
    }
    else {
        IO.println("Valor Inválido!");
    }
}