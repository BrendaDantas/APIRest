package med.voll.api.endereco;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record DadosEndereco(
		@NotBlank
		String logadouro, 
		
		@NotBlank
		String bairro, 
		
		@NotBlank
		@Pattern(regexp = "\\d{8}")
		String cep, 
		
		String numero, 		
		String complemento,
		
		@NotBlank
		String cidade, 
		
		@NotBlank
		String uf) {

}
