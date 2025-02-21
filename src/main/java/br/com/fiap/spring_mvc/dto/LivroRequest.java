package br.com.fiap.spring_mvc.dto;

import br.com.fiap.spring_mvc.model.Categoria;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class LivroRequest {

        @NotBlank(message = "O título é obrigatório")
        private String titulo;
        @NotBlank(message = "O autor é obrigatório")
        private String autor;
        @NotNull(message = "A categoria é obrigatória")
        private Categoria categoria;
        @NotBlank(message = "O preço é obrigatório")
        private BigDecimal preco;
        @NotBlank(message = "O ISBN é obrigatório")
        @Pattern(regexp = "^970\\d{7}$|^970\\d{10}$", message = "O ISBN deve seguir o padrão internacional.")
        private String isbn;

}
