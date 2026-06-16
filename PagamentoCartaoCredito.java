public class PagamentoCartaoCredito  {
   
    double total=0;
    
	public PagamentoCartaoCredito(double valor) {
    }

    public void setPagamentoCartaoCredito(double valor) {
        
        total= valor+(3.0/100.0)*valor;
        System.out.println("Processando pagamento via Cartão de Credito no valor de: " + total);
    }
}