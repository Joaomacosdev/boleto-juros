package br.com.boletojuros.adapter.datasource.mapper;

import br.com.boletojuros.adapter.http.dto.CalculoBoletoResponse;
import br.com.boletojuros.core.domain.BoletoCalculado;
import org.mapstruct.Mapper;

@Mapper(componentModel =  "spring")
public interface CalculoBoletoMapper {

   CalculoBoletoResponse toDto(BoletoCalculado boletoCalculado);
}
