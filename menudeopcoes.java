import static java.lang.IO.*;
void main() {
    println("Menu");
    println("__________");
    println("Opção 1");
    println("Opção 2");
    println("Opção 3");
    println("Sair");
    int calc = Integer.parseInt(readln("O que você quer usar? "));
    String menu = switch (calc){
        case 1 -> "Você selecionou a opção 1!";
        case 2 -> "Você selecionou a opção 2!";
        case 3 -> "Você selecionou a opção 3!";
        case 4 -> "Você selecionou sair!";
        default -> "Erro, não encontrado!";
    };
    println(menu);
    println("Fim do Programa!");
}