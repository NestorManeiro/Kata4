package kata4.main;

import java.util.List;
import kata4.model.Histogram;
import kata4.view.HistogramDisplay;
import kata4.model.Mail;
import kata4.view.MailHistogramBuilder;
import kata4.view.MailHistogramReader;

public class Kata4 {

    public static void main(String[] args) {
        
        String fileName  = "..\\Kata4\\src\\kata4\\view\\email.txt";
        List<Mail> mailList = MailHistogramReader.read(fileName);
        
        Histogram<String> histogram = MailHistogramBuilder.built(mailList);
        
        HistogramDisplay HistogramDisplay = new HistogramDisplay(histogram);
        HistogramDisplay.execute();
    }
    
}
