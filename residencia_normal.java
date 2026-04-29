import static java.lang.IO.*;


void main() {

//entrada

    IO.print("Digite o valor do consumo por m3: ");

    float consumo=Float.parseFloat(readln());
    if (consumo <= 10) {


        IO.print("RS valor 22,38");


    } else if (consumo <= 20) {
        IO.print("R$ valor = 3,50m³" + 3.50 * consumo);

    } else if (consumo <= 50) {

        IO.print("R$ valor total 3,75m³" + 8.75 * consumo);

    } else {
        IO.print("R$ valor = 9,64m³ total" + 9.64 * consumo);

    }
}