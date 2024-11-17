package br.com.boletojuros.adapter.http.mapper;

import br.com.boletojuros.adapter.datasource.database.entity.BoletoCalculadoEntity;
import br.com.boletojuros.core.domain.BoletoCalculado;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BoletoCalculadoMapper {
   BoletoCalculadoEntity toEntity(BoletoCalculado boletoCalculado);
}
