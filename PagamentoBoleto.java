public class PagamentoBoleto implements Pagamento {
    @Override
    public void processarPagamento(double valor) {
        System.out.println("Processando pagamento via boleto no valor de: " + valor);
        // Lógica para processar o pagamento via boleto
    }
}