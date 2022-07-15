package com.gabrielffguimaraes.facade;

import com.gabrielffguimaraes.subsistema.cep.CepApi;
import com.gabrielffguimaraes.subsistema.crm.CrmService;

public class Facade {
    public void migrarCliente(String nome , String cep) {
        String cidade = CepApi.getIntance().recuperarCidade(cep);
        String estado = CepApi.getIntance().recuperarEstado(cep);
        CrmService.gravarCliente(nome,cep,cidade,estado);

    }
}
