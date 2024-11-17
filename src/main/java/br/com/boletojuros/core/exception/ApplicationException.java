package br.com.boletojuros.core.exception;

import br.com.boletojuros.core.domain.enums.TipoExecao;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ApplicationException extends RuntimeException {
    private TipoExecao tipoExecao;
}