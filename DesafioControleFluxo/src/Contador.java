public class Contador {

    public void conta(int primeiroNumero, int segundoNumero) throws ParametrosInvalidosException{
        if (primeiroNumero <= segundoNumero) {
            int quantidadeIteracoes = segundoNumero - primeiroNumero;
            for(int i = 0; i < quantidadeIteracoes ;i++){
                System.out.println("Imprimindo o número " +(i + 1));

            }
        
        } else {
            throw new ParametrosInvalidosException();
        }

    }
    public static void main(String[] args) throws Exception {
        Contador contador = new Contador();
        try {
            contador.conta(15, 10);
        } catch (ParametrosInvalidosException e){
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }
        
    }
}
