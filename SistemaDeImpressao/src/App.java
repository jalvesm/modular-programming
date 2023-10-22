public class App {
    public static void main(String[] args) throws Exception {
        Pagina paginasDoc1 = new Pagina(10);
        Pagina paginasDoc2 = new Pagina(5);

        Documento doc1 = new Documento("Grafos.txt");
        Documento doc2 = new Documento("ProgModular.txt");

        doc1.adicionaPagina(paginasDoc1);
        doc1.adicionaPagina(paginasDoc1);
        doc1.adicionaPagina(paginasDoc1);
        doc1.adicionaPagina(paginasDoc1);
        doc1.adicionaPagina(paginasDoc1);
        doc1.adicionaPagina(paginasDoc2);
        doc2.adicionaPagina(paginasDoc2);
        
        IModoImpressao modo = new ModoColorido();

        Impressao impr = new Impressao(modo);

        System.out.println("Valor da impressão: R$" + impr.imprimir(doc1) + " do documento de nome '" + doc1.getNome()+"'.");
        Tanque.imprimirEstimativaDeTintaRestante();
    }
}