package modelo;

import java.util.Date;

/**
 *
 * @author Facilitador Maker
 */
public class Usuario {
    private double ra;
    private String nome;
    private String turma;
    private Date dataNasc;
    private String nomePai;
    private String emailPai;
    private String nomeMae;
    private String emailMae;
    
    private String endereco;
    private double numero;
    private String complemento;
    private String cep;
    private String bairro;

    public Usuario() {}
    public Usuario(double ra, String nome, String turma, Date dataNasc, String nomePai, String emailPai, String nomeMae, String emailMae, String endereco, double numero, String complemento, String cep, String bairro) {
        super();
        this.ra=ra;
        this.nome=nome;
        this.turma=turma;
        this.dataNasc=dataNasc;
        this.nomePai=nomePai;
        this.emailPai=emailPai;
        this.nomeMae=nomeMae;
        this.emailMae=emailMae;
        
        this.endereco=endereco;
        this.numero=numero;
        this.complemento=complemento;
        this.cep=cep;
        this.bairro=bairro;
    }

    public double getRa() {
        return ra;
    }
    public void setRa(double ra) {
        this.ra = ra;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getTurma() {
        return turma;
    }
    public void setTurma(String turma) {
        this.turma = turma;
    }
    public Date getDataNasc() {
        return dataNasc;
    }
    public void setDataNasc(Date dataNasc) {
        this.dataNasc = dataNasc;
    }
    public String getNomePai() {
        return nomePai;
    }
    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }
    public String getEmailPai() {
        return emailPai;
    }
    public void setEmailPai(String emailPai) {
        this.emailPai = emailPai;
    }
    public String getNomeMae() {
        return nomeMae;
    }
    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }
    public String getEmailMae() {
        return emailMae;
    }
    public void setEmailMae(String emailMae) {
        this.emailMae = emailMae;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public double getNumero() {
        return numero;
    }
    public void setNumero(double numero) {
        this.numero = numero;
    }
    public String getComplemento() {
        return complemento;
    }
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
    public String getCep() {
        return cep;
    }
    public void setCep(String cep) {
        this.cep = cep;
    }
    public String getBairro() {
        return bairro;
    }
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
}
