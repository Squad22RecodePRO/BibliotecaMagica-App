package br.com.bibliotemagica.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.bibliotecamagica.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

}
