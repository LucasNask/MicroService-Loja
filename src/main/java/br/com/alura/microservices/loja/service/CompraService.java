package br.com.alura.microservices.loja.service;

import br.com.alura.microservices.loja.dto.CompraDTO;
import br.com.alura.microservices.loja.dto.InfoFornecedorDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CompraService {

    @Autowired
    private RestTemplate client;

    public void realizaCompra(CompraDTO compraDTO) {

      /*  RestTemplate client = new RestTemplate();
        ResponseEntity<InfoFornecedorDTO> exchange = client.exchange("http://localhost:8081/info/" + compraDTO.getEndereco().getEstado(),
                HttpMethod.GET, null, InfoFornecedorDTO.class);

        System.out.printf(exchange.getBody().getEndereco()); */

        ResponseEntity<InfoFornecedorDTO> exchange = client.exchange("http://Fornecedor/info/" + compraDTO.getEndereco().getEstado(),
                HttpMethod.GET, null, InfoFornecedorDTO.class);

        System.out.printf(exchange.getBody().getEndereco());

    }
}
