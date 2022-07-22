package frete.api.controller;

import feign.Feign;
import frete.api.model.Servicos;
import frete.api.service.ViacepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.stream.StreamSource;
import java.io.StringReader;

@RestController
@RequestMapping("api/v1/frete")
public class FreteController {
    @Autowired
    ViacepService viacepService;

    @GetMapping
    public Object getFrete(@RequestParam Double peso,
                             @RequestParam String cepOrigem,
                             @RequestParam String cepDestino,
                             @RequestParam String nomeDestinatario) throws JAXBException {



        return viacepService.getCep("2121","dsasa");

        /*
        String xml = viacepService.getCep(cepOrigem,cepDestino);

        JAXBContext context = JAXBContext.newInstance(Servicos.class);
        Unmarshaller unmarshaller = context.createUnmarshaller();
        JAXBElement<Servicos> xmlResponse = unmarshaller.unmarshal(new StreamSource(new StringReader(xml)), Servicos.class);

        return xmlResponse.getValue();*/

    }
    /*@GetMapping
    public FreteDto getFrete(@RequestParam Double peso,
                         @RequestParam String cepOrigem,
                         @RequestParam String cepDestino,
                         @RequestParam String nomeDestinatario)  {
        FreteDto freteDto = this.freteService.calculaFrete(cepDestino,cepOrigem,peso);
        Frete frete = new Frete();
        frete.setVlTotalFrete(freteDto.getVlTotalFrete());
        frete.setCepDestino(cepDestino);
        frete.setCepOrigem(cepOrigem);
        frete.setDataPrevistaEntrega(freteDto.getDataPrevistaEntrega());
        frete.setPeso(peso);
        frete.setDataConsulta(CalendarHelper.formatBr(new Date()));
        frete.setDataPrevistaEntrega(freteDto.getDataPrevistaEntrega());
        frete.setNomeDestinatario(nomeDestinatario);
        this.freteService.salvarFrete(frete);
        return freteDto;
    }*/
}
