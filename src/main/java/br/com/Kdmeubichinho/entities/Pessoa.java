package br.com.Kdmeubichinho.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Accessors(chain = true)
@Table(name = "pessoa")

public class Pessoa {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pessoa")
    private Integer idPessoa;
    private String nome;
    private String email;
    private String cep;
    private String rua;
    @Column(name = "numero_residencial")
    private String numeroResidencial;
    private String celular;
    private String senha;
    private boolean admin;
    
    public Pessoa(Integer idPessoa, String nome, String email, String cep, String rua, String numeroResidencial,
			String celular, String senha) {
		this.idPessoa = idPessoa;
		this.nome = nome;
		this.email = email;
		this.cep = cep;
		this.rua = rua;
		this.numeroResidencial = numeroResidencial;
		this.celular = celular;
		this.senha = senha;
	}
}
