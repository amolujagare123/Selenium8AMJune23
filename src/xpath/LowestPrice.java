package xpath;

import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LowestPrice {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.makemytrip.com/flight/search?itinerary=PNQ-DEL-11/07/2023&tripType=O&paxType=A-1_C-0_I-0&intl=false&cabinClass=E&ccde=IN&lang=eng");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.findElement(By.xpath("//span[contains(@style,'cross-icon')]")).click();


        List<WebElement> priceValues = driver.findElements(By.xpath("//div[@class='makeFlex spaceBetween']//div[contains(text(),',')]"));

        ArrayList<Integer> priceList = new ArrayList<>();
        for (WebElement priceWB:priceValues) {
           // System.out.println(priceWB.getText());

            String rawPriceStr = priceWB.getText();
            String rawStr2 = rawPriceStr.split(" ")[1];
           // System.out.println(rawStr2);
            String rawStr3 = rawStr2.split("per")[0].trim();


            rawStr3 =  rawStr3.replace(",","");
           // System.out.println(rawStr3);

            int price = Integer.parseInt(rawStr3);
            priceList.add(price);
        }

        System.out.println(priceList);

        int minPrice = Collections.min(priceList);

        System.out.println(minPrice);

        String minPriceStr = addCommas(minPrice);
        System.out.println(minPriceStr);

        String xpathMinPrice = "//div[@class='makeFlex spaceBetween'][div//div[contains(text(),'"+minPriceStr+"')]]//span[text()='View Prices']";
        System.out.println(xpathMinPrice);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.findElement(By.xpath(xpathMinPrice)).click();
    }

    public static String addCommas(int number) {
        String numberStr = String.valueOf(number);
        String result = "";
        int count = 0;

        // Iterate the string from the end
        for (int i = numberStr.length() - 1; i >= 0; i--) {
            result = numberStr.charAt(i) + result;
            count++;

            // Add a comma every three digits
            if (count % 3 == 0 && i != 0) {
                result = "," + result;
            }
        }

        return result;
    }
    }
