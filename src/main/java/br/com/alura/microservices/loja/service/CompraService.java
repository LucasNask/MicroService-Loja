package br.com.alura.microservices.loja.service;

import br.com.alura.microservices.loja.dto.CompraDTO;
import br.com.alura.microservices.loja.dto.InfoFornecedorDTO;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CompraService {

    public void realizaCompra(CompraDTO compraDTO) {

        RestTemplate client = new RestTemplate();
        ResponseEntity<InfoFornecedorDTO> exchange = client.exchange("http://localhost:8081/info/" + compraDTO.getEndereco().getEstado(),
                HttpMethod.GET, null, InfoFornecedorDTO.class);

    }
}
