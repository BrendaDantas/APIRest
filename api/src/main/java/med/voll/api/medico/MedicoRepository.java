package med.voll.api.medico;

import org.springframework.data.jpa.repository.JpaRepository;

//Para pegar o objeto medico e salvar no banco de dados(persistência) costuma ser usado as classes DAO
//mas aqui irei usar o SpringDataJpa através do repository(interfaces)<tipoDaEntidade, tipoDoAtributoDaChavePrimariaDessaEntidade>
public interface MedicoRepository extends JpaRepository<Medico, Long> {
		

}
