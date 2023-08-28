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

    public Usuario() {}
    public Usuario(double ra, String nome, String turma, Date dataNasc, String nomePai, String emailPai, String nomeMae, String emailMae) {
        super();
        this.ra=ra;
        this.nome=nome;
        this.turma=turma;
        this.dataNasc=dataNasc;
        this.nomePai=nomePai;
        this.emailPai=emailPai;
        this.nomeMae=nomeMae;
        this.emailMae=emailMae;
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
}
