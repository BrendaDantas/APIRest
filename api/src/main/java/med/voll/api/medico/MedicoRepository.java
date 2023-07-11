package med.voll.api.medico;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

//Para pegar o objeto medico e salvar no banco de dados(persistência) costuma ser usado as classes DAO
//mas aqui irei usar o SpringDataJpa através do repository(interfaces)<tipoDaEntidade, tipoDoAtributoDaChavePrimariaDessaEntidade>
public interface MedicoRepository extends JpaRepository<Medico, Long> {

	//Como segui o padrão de nomenclatura do spring, ele consegue saber o que implementar automaticamente e, por isso, só preciso da assinatura
	Page<Medico> findAllByAtivoTrue(Pageable paginacao);		

}
