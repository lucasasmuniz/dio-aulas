public class Celular implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    public void exibirPagina() {
       System.out.println("Exibindo página");
    }

    public void adicionarNovaAba() {
        System.out.println("Adicionando nova página");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando página");
    }

    public void ligar() {
        System.out.println("Ligando...");
    }

    public void atender() {
        System.out.println("Atendendo");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando Correio de Voz");
    }

    public void tocar() {
        System.out.println("Tocando");
    }

    public void pausar() {
        System.out.println("Pausando");
    }

    public void selecionarMusica() {
        System.out.println("Selecionando Música");
    }
}
