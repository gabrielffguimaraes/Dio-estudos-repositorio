package org.gabrielffguimaraes.interfaces;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

@FeignClient(name="cep",url = "https://viacep.com.br/ws")
public interface InfoResponse
{
    @GetMapping("/{cep}/json/")
    String getInfo(@PathParam(value="cep") String cep);
}
