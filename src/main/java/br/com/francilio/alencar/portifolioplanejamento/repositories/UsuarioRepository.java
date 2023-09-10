package br.com.francilio.alencar.portifolioplanejamento.repositories;

import br.com.francilio.alencar.portifolioplanejamento.model.usuario.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
public interface UsuarioRepository extends JpaRepository<Usuario, String> {



    @Query(" select u from Usuario u where u.ds_login = :dsNomeUsuario ")
    Usuario  findBydsNomeUsuario(@Param("dsNomeUsuario") String dsNomeUsuario);

}