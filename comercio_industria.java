import static java.lang.IO.*;
void main() {
    IO.print("Digite o consumo da água gasta: ");

    float consumo = Float.parseFloat(readln());

    if (consumo <=10) {
        IO.print("R$ valor = 44,95");
    }else if (consumo <= 20) {
        IO.print("R$ valor = 8,75" + 8.75*consumo);
    }else if (consumo <=50) {
        IO.print("R$ valor = 16,76 total" + 16.76 * consumo);
    }else {
        IO.print("R$ valor = 17,46 total " + 17.46 * consumo);
    }

}