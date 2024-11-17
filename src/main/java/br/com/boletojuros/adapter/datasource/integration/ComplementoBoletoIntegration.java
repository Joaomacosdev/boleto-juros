package br.com.boletojuros.adapter.datasource.integration;

import br.com.boletojuros.adapter.datasource.integration.client.ComplementoBoletoClient;
import br.com.boletojuros.adapter.datasource.mapper.BoletoMapper;
import br.com.boletojuros.core.domain.Boleto;
import br.com.boletojuros.core.port.out.ComplementoBoletoPort;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ComplementoBoletoIntegration implements ComplementoBoletoPort {

    private final ComplementoBoletoClient client;
    private final BoletoMapper mapper;

    public ComplementoBoletoIntegration(ComplementoBoletoClient client, BoletoMapper mapper) {
        this.client = client;
        this.mapper = mapper;
    }

    @Override
    public Boleto executar(String codigo) {
        var boletoDto = client.getBoleto(codigo);
        return mapper.toDomain(boletoDto);
    }
}
