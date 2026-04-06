    public class Calculadora {

    /**
     * Executa uma operação matemática básica.
HEAD
     * @param operacao Tipo da operação: "soma"

     * @param operacao Tipo da operação: "subtracao", "multiplicacao"
oresgate
     * @param a Primeiro número
     * @param b Segundo número
     * @return Resultado da operação
     */
    public double calcular(String operacao, int a, int b) {
        switch (operacao.toLowerCase()) {
HEAD
            case "soma":
                return a + b;
            

            case "subtracao":
                return a - b;
            case "multiplicacao":
                return a * b;
oresgate
        }
    }

    // Comentario do passo 11, (Vai cortinas)
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
HEAD

        System.out.println("Soma: " + calc.calcular("soma", 10, 5));

        System.out.println("Subtração: " + calc.calcular("subtracao", 10, 5));
        System.out.println("Multiplicação: " + calc.calcular("multiplicacao", 10, 5));
oresgate
    }
}

