import static java.lang.IO.*;
void main() {
    IO.print("Digite seu peso: ");
    float peso = Float.parseFloat(readln());

    IO.print("Digite sua altura: ");
    float altura = Float.parseFloat(readln());

    float imc = peso / altura * 2f;
    IO.println("Resultado: " + imc);

    if (imc < 16) {
        IO.print("Magreza grave");
    } else if (imc < 17) {
        IO.print("Magreza moderada");
    } else if (imc < 18.5){
        IO.print("Magreza leve");
    } else if (imc < 25) {
        IO.print("Saudável");
    } else if (imc < 30) {
        IO.print("Sobrepeso");
    } else if (imc < 35) {
        IO.print("Obesidade Grau I");
    } else if (imc < 40) {
        IO.print("Obesidade Grau II (severa)");
    } else {
        IO.print("Obesidade Grau III (mórbida)");
    }
}