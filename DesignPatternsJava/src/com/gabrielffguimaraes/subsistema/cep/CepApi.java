package com.gabrielffguimaraes.subsistema.cep;
/*Padrao singleton
*
* */
public class CepApi {

    class CepApiHolder {
        private static CepApi cepApi = new CepApi();
    }
    private CepApi() {
        super();
    }

    public static CepApi getIntance() {
        return CepApiHolder.cepApi;
    }

    public String recuperarCidade(String cep) {
        return "Araraquara";
    }

    public String recuperarEstado(String cep) {
        return "SP";
    }
}
