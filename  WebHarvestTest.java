import java.io.FileNotFoundException;
import org.webharvest.definition.ScraperConfiguration;
import org.webharvest.runtime.Scraper;
import org.webharvest.runtime.variables.Variable;
 
public class WebHarvestTest 
{
 public static void main(String[] args) 
 {
  try{
   String strPageURL =
   "http://imdb.com"
       ScraperConfiguration config =
         new ScraperConfiguration
          ("D:/jprograms/WebScrapping/src/basic/webHarvestConf.xml");
       Scraper scraper = new Scraper(config, "D:/");
       scraper.addVariableToContext("url",strPageURL);
       scraper.setDebug(true);
       scraper.execute();
       Variable varScrappedContent =
         (Variable)scraper.getContext().getVar("scrappedContent");
 
       // Printing the scraped data here
       System.out.println(varScrappedContent.toString());
       }catch(FileNotFoundException e){
         e.printStackTrace();
       }
  } 
}
