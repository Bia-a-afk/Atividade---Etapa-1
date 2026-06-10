public class PagamentoBoleto  {
    
    double total=0;
    private double valor;
    
	public void PagamentoBoleto(double valor) {
	    this.valor = valor;
        
    }

    public void setPagamentoBoleto(double valor) {
        this.valor = valor;
        
        total= valor+5;
        System.out.println("Processando pagamento via boleto no valor de: " + total);
    }
}