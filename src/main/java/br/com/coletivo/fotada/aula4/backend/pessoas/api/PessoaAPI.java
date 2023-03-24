package br.com.coletivo.fotada.aula4.backend.pessoas.api;

import br.com.coletivo.fotada.aula4.backend.pessoas.model.Pessoa;
import br.com.coletivo.fotada.aula4.backend.pessoas.repository.PessoaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/pessoas")
public class PessoaAPI {

    @Autowired
    PessoaRepository bancoDadosPessoa;

    @GetMapping("/listar")
    public List<Pessoa> listarClientes() {
        return bancoDadosPessoa.listarTodasPessoas();
    }

    @GetMapping("/listar-ordenado-por-idade")
    public List<Pessoa> listarClientesOrdenadoIdade() {
        return bancoDadosPessoa.listarTodasPessoasOrdenadoPorIdade();
    }

    @GetMapping("/listar-por-estado/{estado}")
    public List<Pessoa> listarClientesPorEstado(@PathVariable String estado) {
        return bancoDadosPessoa.listarPessoasPorEstado(estado);
    }

    @GetMapping("/detalhar/{id}")
    public Pessoa recuperarClientePorId(@PathVariable Long id) {
        return bancoDadosPessoa.buscarPessoaPorId(id);
    }

}
