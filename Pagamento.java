public class Pagamento {
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
    public void processarPagamento(double valor) {
        // Lógica para processar o pagamento
    }
    //PIX
    System.out.println("Pagamento via Pix selecionado.");
    System.out.print("Valor a ser pago: R$ ");
    double valorPix = entrada.nextDouble();
    
    System.out.println("Processando pagamento via Pix no valor de: " + valorPix );
    // Lógica para processar o pagamento via Pix

    //Boleto
    System.out.println("Pagamento via boleto selecionado.");

    System.out.print("Valor a ser pago: R$ ");
    double valorBoleto = entrada.nextDouble();

    System.out.println("Processando pagamento via boleto no valor de: "+ valorBoleto);
    // Lógica para processar o pagamento via boleto
}