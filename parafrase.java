public class parafrase {
    public static void main(String[] aStrings) {

String[] listaZero = {
        "Olhando a chuva pela janela do trabalho,",
        "Esperando o ônibus que está meia hora atrasado,",
        "Depois de passar a noite inteira em claro,",
        "Apagando os alarmes da manhã de segunda-feira,",
        "Enquanto o computador decide travar no meio do prazo,"
    };

    // Array 1 (O Conceito Moderno): Elementos da nossa rotina e cansaço
    String[] listaUm = { 
        "uma planilha de Excel cheia de erros", 
        "aquela última caneca de café frio", 
        "a bateria do celular em 1%", 
        "uma conversa fiada no elevador da firma",
        "uma notificação de mensagem fora do horário"
    };

    // Array 2 (A Dinâmica da Vida): Como essas coisas operam na realidade
    String[] listaDois = { 
        "cobrando uma resposta que você não tem", 
        "tentando manter as aparências no automático", 
        "rodando em looping na sua cabeça", 
        "esgotando o resto de energia que sobrava",
        "fingindo que tudo está sob controle"
    };

    // Array 3 (O Peso Existencial): O impacto disso na nossa mente
    String[] listaTres = { 
        "em busca de um pingo de motivação", 
        "só para testar o limite da nossa sanidade", 
        "diante de uma rotina que não para", 
        "enquanto o tempo passa rápido demais",
        "só para ver até onde a gente aguenta"
    };

    // Array 4 (A Quebra de Expectativa): O desfecho sincero e mundano
    String[] listaQuatro = {
        "e no final das contas, ninguém sabe o que está fazendo.",
        "mas amanhã a gente acorda e faz tudo de novo.",
        "e o pior é que ninguém te avisa que seria assim.",
        "tudo isso enquanto a vida real acontece lá fora.",
        "e sinceramente, eu só queria ir dormir."
    };

    // Pegando os tamanhos de todos os arrays
    int zeroTamanho = listaZero.length;
    int umTamanho = listaUm.length;
    int doisTamanho = listaDois.length;
    int tresTamanho = listaTres.length;
    int quatroTamanho = listaQuatro.length;

    // Sorteando os índices aleatórios
    int rand0 = (int) (Math.random() * zeroTamanho);
    int rand1 = (int) (Math.random() * umTamanho);
    int rand2 = (int) (Math.random() * doisTamanho);
    int rand3 = (int) (Math.random() * tresTamanho);
    int rand4 = (int) (Math.random() * quatroTamanho);

    // Montando a frase com a ordem perfeita de conectivos e espaços
    String frase = listaZero[rand0] + " a vida é como " + listaUm[rand1] + " " + 
                   listaDois[rand2] + " " + listaTres[rand3] + ", " + listaQuatro[rand4];

    System.out.print(frase);
}
    }


