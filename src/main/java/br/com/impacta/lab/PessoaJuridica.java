package br.com.impacta.lab;

public class PessoaJuridica implements Pessoa {
  private String documento;
  private String tipo;

  public void setDocumento(String documento) {
    this.documento = documento;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  public String falarDocumento(){
    return documento;
  }

  public String getTipo(){
    return tipo;
  }
}