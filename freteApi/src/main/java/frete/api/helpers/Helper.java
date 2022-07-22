package frete.api.helpers;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.stream.StreamSource;
import java.io.StringReader;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Helper {
    public static String plusDay(int days) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        calendar.add(Calendar.DAY_OF_MONTH,days);
        return Helper.formatBr(calendar.getTime());
    }
    public static String formatBr(Date date) {
        SimpleDateFormat dFormat = new SimpleDateFormat("dd/MM/yyyy");
        return dFormat.format(date);
    }

    public static <T> Object xmlToJson(String xml, Class<T> c) throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(c);
        Unmarshaller unmarshaller = context.createUnmarshaller();
        JAXBElement<T> xmlResponse = unmarshaller.unmarshal(new StreamSource(new StringReader(xml)), c);

        return xmlResponse.getValue();
    }
}
