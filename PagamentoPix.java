public class PagamentoPix implements Pagamento {
    @Override
    public void processarPagamento(double valor) {
        System.out.println("Processando pagamento via Pix no valor de: " + valor);
        // Lógica para processar o pagamento via Pix
    }
}