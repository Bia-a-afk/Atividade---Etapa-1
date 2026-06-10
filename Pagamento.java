import java.util.Scanner;

public class Pagamento {
    

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		PagamentoBoleto realizar1 = new PagamentoBoleto();
	    double valorBoleto;
    	PagamentoCartaoCredito realizar2 = new PagamentoCartaoCredito();
	    double valorCartaoCredito;
		
   /* private double valor;
    private String metodoPagamento;

    public Pagamento(double valor, String metodoPagamento) {
        this.valor = valor;
        this.metodoPagamento = metodoPagamento;
    }*/

    /* public double getValor() {
        return valor;
    }

    public String getMetodoPagamento() {
       return metodoPagamento;
    }*/
    //public void processarPagamento(double valor) {
        // Lógica para processar o pagamento
   // }
    //PIX
    System.out.println("Pagamento via Pix selecionado.\n");
    System.out.print("Valor a ser pago: R$ ");
    double valorPix = entrada.nextDouble();
    
    System.out.println("Processando pagamento via Pix no valor de: " + valorPix );
    // Lógica para processar o pagamento via Pix

    //Boleto
    System.out.println("Pagamento via boleto selecionado.\n");

    System.out.print("Valor a ser pago: R$ ");
    valorBoleto = entrada.nextDouble();
    
    realizar1.setPagamentoBoleto(valorBoleto);
    // Lógica para processar o pagamento via boleto

    //Cartão de Crédito
    System.out.println("Pagamento via cartão de crédito selecionado.\n");

    System.out.print("Valor a ser pago: R$ ");
    valorCartaoCredito = entrada.nextDouble();

    realizar2.setPagamentoCartaoCredito(valorCartaoCredito);
    // Lógica para processar o pagamento via cartão de crédito
}
}
