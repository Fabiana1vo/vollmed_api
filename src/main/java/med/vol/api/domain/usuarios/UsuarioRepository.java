package med.vol.api.domain.usuarios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

public interface UsuarioRepository extends JpaRepository <usuario, Long>{

    //Faz a consulta do usuário no banco de dados.
    UserDetails findByLogin(String login);
}
