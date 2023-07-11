package med.voll.api.endereco;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

//Utilizando lombok para gerar getter,setter,etc automaticamente via anotações
//Getter - para gerar os getters
//NoArgsConstructor - para gerar o construtor default, sem argumentos
//AllArgsConstructor - para ter o construtor que recebe todos os campos
@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Endereco {
	
	private String logadouro;
	private String bairro;
	private String cep;
	private String numero;
	private String complemento;
	private String cidade;
	private String uf;
	
	public Endereco() {
	}
	
	//contrutor que trabalha com os DTOs
	public Endereco(DadosEndereco dados) {
		this.logadouro = dados.logadouro();
		this.bairro = dados.bairro();
		this.cep = dados.cep();
		this.numero = dados.numero();
		this.complemento = dados.complemento();
		this.cidade = dados.cidade();
		this.uf = dados.uf();
	}

	public void atualizarInformacoes(DadosEndereco dados) {
		if(dados.logadouro() != null) {
			this.logadouro = dados.logadouro();
		}
		if(dados.bairro() != null) {
			this.bairro = dados.bairro();
		}
		if(dados.cep() != null) {
			this.cep = dados.cep();
		}
		if(dados.numero() != null) {
			this.numero = dados.numero();
		}
		if(dados.complemento() != null) {
			this.complemento = dados.complemento();
		}
		if(dados.cidade() != null) {
			this.cidade = dados.cidade();
		}
		if(dados.uf() != null) {
			this.uf = dados.uf();
		}
	}
	
}
