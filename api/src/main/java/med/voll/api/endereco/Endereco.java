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
	
}
