public class PagamentoCartaoCredito  {
   
    double total=0;
    private double valor;
    
	public void PagamentoCartaoCredito(double valor) {
	    this.valor = valor;
        
    }

    public void setPagamentoCartaoCredito(double valor) {
        this.valor = valor;
        
        total= valor+(3/100)*valor;
        System.out.println("Processando pagamento via Cartão de Credito no valor de: " + total);
    }
}