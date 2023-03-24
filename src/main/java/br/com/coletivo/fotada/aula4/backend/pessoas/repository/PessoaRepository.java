package br.com.coletivo.fotada.aula4.backend.pessoas.repository;

import br.com.coletivo.fotada.aula4.backend.pessoas.model.Pessoa;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

    @Query(value = "SELECT * FROM estudos_mentoria.pessoas", nativeQuery = true)
    List<Pessoa> listarTodasPessoas();

    @Query(value = "SELECT * FROM estudos_mentoria.pessoas ORDER BY idade DESC", nativeQuery = true)
    List<Pessoa> listarTodasPessoasOrdenadoPorIdade();

    @Query(value = "SELECT * FROM estudos_mentoria.pessoas WHERE estado = :estado", nativeQuery = true)
    List<Pessoa> listarPessoasPorEstado(String estado);

    @Query(value = "SELECT * FROM estudos_mentoria.pessoas WHERE id = :id", nativeQuery = true)
    Pessoa buscarPessoaPorId(Long id);

}
