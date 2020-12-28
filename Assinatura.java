public final class Assinatura  {
    
    private String pagamento;
    private String formaDePagamento;

    public Assinatura(String pagamento, String formaDePagamento, int valorAssinatura){
          this.pagamento = pagamento;
          this.formaDePagamento = formaDePagamento;
      }
    
      public void pagar(){
        String pagamento = "$29";
        System.out.println("Você realizou a compra do pacote de" + pagamento);
      }
        
      public String getFormaDePagamento() {
        return formaDePagamento;
      }
    
      public void setFormaDePagamento(String formaDePagamento) {
        this.formaDePagamento = formaDePagamento;
      }
    }
