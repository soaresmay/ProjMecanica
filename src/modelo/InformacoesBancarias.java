package modelo;

public class InformacoesBancarias {

   String numeroDoBanco;
   String agencia;
   String numeroDaConta;

    public InformacoesBancarias(String numeroDoBanco, String agencia, String numeroDaConta) {
        this.numeroDoBanco = numeroDoBanco;
        this.agencia = agencia;
        this.numeroDaConta = numeroDaConta;
    }

    public String getNumeroDoBanco() {
        return numeroDoBanco;
    }

    public void setNumeroDoBanco(String numeroDoBanco) {
        this.numeroDoBanco = numeroDoBanco;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(String numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }
   
   
   



}