import java.math.BigDecimal;
import java.time.Year;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Car, Info> carInfoMap = new HashMap<>();
        carInfoMap.put(new Car(1,"007"),new Info(Year.of(2002),"Maybach",new BigDecimal(1234567),Colour.BLACK));
        System.out.println(carInfoMap.entrySet());
    }
}