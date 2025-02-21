package br.com.fiap.spring_mvc.services;

import br.com.fiap.spring_mvc.dto.LivroRequest;
import br.com.fiap.spring_mvc.model.Livro;
import br.com.fiap.spring_mvc.repository.LivroRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LivroService {

    @Autowired
    private LivroRepository livroRepository;

    public Livro salvarLivro(LivroRequest livroRequest){
        Livro livro = requestToLivro(livroRequest);
        return livroRepository.save(livro);
    }

    public Livro requestToLivro(LivroRequest livroRequest){
        Livro livro = new Livro();
        //BeanUtils.copyProperties(livroRequest, livro);
        livro.setTitulo(livroRequest.getTitulo());
        livro.setAutor(livroRequest.getAutor());
        livro.setCategoria(livroRequest.getCategoria());
        livro.setPreco(livroRequest.getPreco());
        livro.setIsbn(livroRequest.getIsbn());
        return livro;
    }
}
