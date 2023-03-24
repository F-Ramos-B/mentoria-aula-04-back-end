package br.com.coletivo.fotada.aula4.backend.pessoas.model;

import java.time.LocalDateTime;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pessoas", schema = "estudos_mentoria")
public class Pessoa {

    @Id
    private Long id;
    private String nome;
    private int idade;
    private String cidade;
    private String estado;
    private String genero_autoidentificacao;
    private String pronomes;
    private String participacao;
    private String link_perfil_linkedin;
    private String porque_esta_aqui;
    private String bio;
    private LocalDateTime data_apresentacao;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getGenero_autoidentificacao() {
        return genero_autoidentificacao;
    }

    public void setGenero_autoidentificacao(String genero_autoidentificacao) {
        this.genero_autoidentificacao = genero_autoidentificacao;
    }

    public String getPronomes() {
        return pronomes;
    }

    public void setPronomes(String pronomes) {
        this.pronomes = pronomes;
    }

    public String getParticipacao() {
        return participacao;
    }

    public void setParticipacao(String participacao) {
        this.participacao = participacao;
    }

    public String getLink_perfil_linkedin() {
        return link_perfil_linkedin;
    }

    public void setLink_perfil_linkedin(String link_perfil_linkedin) {
        this.link_perfil_linkedin = link_perfil_linkedin;
    }

    public String getPorque_esta_aqui() {
        return porque_esta_aqui;
    }

    public void setPorque_esta_aqui(String porque_esta_aqui) {
        this.porque_esta_aqui = porque_esta_aqui;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public LocalDateTime getData_apresentacao() {
        return data_apresentacao;
    }

    public void setData_apresentacao(LocalDateTime data_apresentacao) {
        this.data_apresentacao = data_apresentacao;
    }

}
