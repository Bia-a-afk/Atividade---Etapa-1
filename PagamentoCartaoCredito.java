public class PagamentoCartaoCredito implements Pagamento {
    private String numeroCartao;
    private String nomeTitular;
    private String dataValidade;
    private String codigoSeguranca;

    public PagamentoCartaoCredito(String numeroCartao, String nomeTitular, String dataValidade, String codigoSeguranca) {
        this.numeroCartao = numeroCartao;
        this.nomeTitular = nomeTitular;
        this.dataValidade = dataValidade;
        this.codigoSeguranca = codigoSeguranca;
    }

    @Override
    public void processarPagamento(double valor) {
        // Lógica para processar o pagamento com cartão de crédito
        System.out.println("Processando pagamento de R$ " + valor + " com cartão de crédito.");
        // Aqui você pode adicionar a lógica para validar o cartão, verificar saldo, etc.
    }
}