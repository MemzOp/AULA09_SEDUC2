import static java.lang.IO.*;

void main() {
    IO.print("Informe o valor do seu salário: ");
    float salario = Float.parseFloat(readln());

    if (salario <= 2428.80){
        IO.println("R$ " + salario);
        IO.println("IRRF: sem desconto!");
    } else if (salario <= 2826.65){
        IO.println("R$ " + salario);
        IO.println("IRRF: alíquota = 7,5% | parcela = 182,16");
    } else if (salario <= 3751.05){
        IO.println("R$ " + salario);
        IO.println("IRRF: alíquota = 15% | parcela = 394,16");
    } else if (salario <= 4664.68){
        IO.println("R$ " + salario);
        IO.println("IRRF: alíquota = 22,5% | parcela = 675,49");
    } else {
        IO.println("R$ " + salario);
        IO.println("IRRF: alíquota = 27,5% | parcela = 908,73");
    }

    if (salario <= 1621.00){
        IO.print("INSS: alíquota = 7,5%");
    } else if (salario <= 2902.84){
        IO.print("INSS: alíquota = 9%");
    } else if (salario <= 4354.27){
        IO.print("INSS: alíquota = 12%");
    } else {
        IO.print("INSS: alíquota = 14%");
    }
}