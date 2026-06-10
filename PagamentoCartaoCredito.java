public class PagamentoCartaoCredito  {
   
    public void processarPagamento(double valor) {
        // Lógica para processar o pagamento com cartão de crédito
        System.out.println("Processando pagamento de R$ " + (valor + (3.0/100.0)*valor) +" com cartão de crédito.");
        // Aqui você pode adicionar a lógica para validar o cartão, verificar saldo, etc.
    }
}