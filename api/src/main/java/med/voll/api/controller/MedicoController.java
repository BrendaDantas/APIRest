package med.voll.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import med.voll.api.medico.DadosCadastroMedico;
import med.voll.api.medico.DadosListagemMedico;
import med.voll.api.medico.Medico;
import med.voll.api.medico.MedicoRepository;

//1.@ - para o spring carregar essa classe durante a inicialização do projeto
//2.@ - o spring vai chamar esse controller quando chegar uma requisição para /medicos

@RestController
@RequestMapping("/medicos")
public class MedicoController {
	
	//Autowired para determinar que é o spring quem irá instaciar e passar o atributo repository
	//dentro da classe controller
	
	@Autowired
	private MedicoRepository repository;

	/*aqui eu digo qual o verbo do protocolo http que esse método vai lidar. Logo, se chegar 
	uma requisição do tipo post para a url "/medicos", o spring vai chamar o método abaixo.
	@RequestBody é para o spring entender que essas informações estão vindo no corpo da requisição
	para receber os dados, utilizei o record
	padrao DTO*/
	
	@PostMapping
	@Transactional
	public void cadastrar(@RequestBody @Valid DadosCadastroMedico dados) {
		//farei uma conversão - recebo um dto e converto para um objeto do tipo medico
		repository.save(new Medico(dados));
	}
	
	@GetMapping
	public List<DadosListagemMedico> listar() {
		//como o findall me retorn um list de medico(entidade jpa), mas o retorno do método precisa ser list de dadoslistagemmedico
		//então irei converter de medico para DadosListagemMedico
		return repository.findAll().stream().map(DadosListagemMedico::new).toList();
	}
	
}
