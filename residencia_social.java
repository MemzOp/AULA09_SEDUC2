import static java.lang.IO.*;
void main() {
    IO.print("Fale o consumo d água: ");
    float consumo = Float.parseFloat(readln());

    if (consumo <=10) {
        IO.print("R$ valor = 7,59");
    }else if (consumo <= 20) {
        IO.print("R$ valor = 1,31" + 1.31*consumo);
    }else if (consumo <= 30) {
        IO.print("R$ valor = 4,64 total" + 4.64*consumo);
    }else if (consumo <=50) {
        IO.print("R$ valor = 6,62 total" + 6.62 * consumo);
    }else {
        IO.print("R$ valor = 7,31 total " + 7.31 * consumo);
    }


}