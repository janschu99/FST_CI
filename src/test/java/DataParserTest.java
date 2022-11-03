import de.unitrier.st.core.CountryDataPoint;
import de.unitrier.st.core.DataParser;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.Map;

public class DataParserTest {
    
    @Test
    public void dataParserTest() {
        Map<String, List<CountryDataPoint>> result = new DataParser().parseJsonData("[{\"Confirmed\": 1234, \"Country\": \"MyCountry\", \"Date\": \"2020-01-22\", \"Deaths\": 2, \"Recovered\": 1232}]");
        Assert.assertEquals(result.keySet().size(), 1);
        Assert.assertEquals(result.get("MyCountry").get(0).Country, "MyCountry");
        Assert.assertEquals(result.get("MyCountry").get(0).Date, "2020-01-22");
        Assert.assertEquals(result.get("MyCountry").get(0).Confirmed, 1234);
        Assert.assertEquals(result.get("MyCountry").get(0).Deaths, 2);
        Assert.assertEquals(result.get("MyCountry").get(0).Recovered, 1232);
    }
}
