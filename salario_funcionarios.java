import static java.lang.IO.*;

void main() {
    IO.print("Digite o salário do funcionário: R$ ");
    double salario = Double.parseDouble(readln().replace(",", "."));

    double percentual;

    if (salario <= 1000) {
        percentual = 20;
    }
    else if (salario <= 1700) {
        percentual = 15;
    }
    else if (salario <= 2300) {
        percentual = 10;
    }
    else {
        percentual = 5;
    }

    double aumento    = salario * (percentual / 100);
    double novoSalario = salario + aumento;

    IO.println("Salário atual   : R$ " + String.format("%.2f", salario));
    IO.println("Percentual      : " + (int) percentual + "%");
    IO.println("Valor do aumento: R$ " + String.format("%.2f", aumento));
    IO.println("Novo salário    : R$ " + String.format("%.2f", novoSalario));
}