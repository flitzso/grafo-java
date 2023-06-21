public class Main {
        public static void main(String[] args) {
            Grafo<String> grafo = new Grafo<String>();
            grafo.adicionarVertice("Mark");
            grafo.adicionarVertice("Luka");
            grafo.adicionarVertice("Cris");
            grafo.adicionarVertice("Cassius");
            grafo.adicionarVertice("Giovana");

            grafo.adicionarAresta(2.0, "Mark", "Luka");
            grafo.adicionarAresta(3.0, "Luka", "Cassius");
            grafo.adicionarAresta(1.0, "Cassius", "Cris");
            grafo.adicionarAresta(1.0, "Mark", "Cris");
            grafo.adicionarAresta(3.0, "Giovana", "Luka");
            grafo.adicionarAresta(2.0, "Giovana", "Mark");


            grafo.buscaEmLargura();
        }
    }

