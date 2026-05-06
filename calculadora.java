
import static java.lang.IO.*;

void main() {
    IO.print("Digite o valor do primeiro número: ");
    int num1 = Integer.parseInt(readln());

    IO.print("Digite o valor do segundo número: ");
    int num2 = Integer.parseInt(readln());

    IO.println("1 - Adição");
    IO.println("2 - Subtração");
    IO.println("3 - Multiplicação");
    IO.println("4 - Divisão");
    IO.println("5 - Potência");
    println("6 - Raiz quadrada");
    println("7 - Número par");
    println("8 - Número ímpar");

    IO.print("Digite a operação aritmética: ");
    int op = Integer.parseInt(readln());

    if (op == 1) {
        IO.print(num1 + " + " + num2 + " = " + (num1 + num2));
    }
    else if (op == 2) {
        IO.print(num1 + " - " + num2 + " = " + (num1 - num2));
    }
    else if (op == 3) {
        IO.print(num1 + " x " + num2 + " = " + (num1 * num2));
    }
    else if (op == 4) {
        IO.print(num1 + " / " + num2 + " = " + (num1 / num2));
    }
    else if (op == 5) {

    }
}