package kata4.main;

import java.util.List;
import kata4.model.Histogram;
import kata4.view.HistogramDisplay;
import kata4.model.Mail;
import kata4.view.MailHistogramBuilder;
import kata4.view.MailHistogramReader;

public class Kata4 {
    private static List<Mail> mailList;
    private static Histogram<String> histogram;
  
    public static void main(String[] args) {
        input();
        process();
        output();
    }
    
     public static void input(){
        String fileName  = "..\\Kata4\\src\\kata4\\view\\email.txt";
        mailList = MailHistogramReader.read(fileName);
    }
    public static void process(){
        histogram = MailHistogramBuilder.built(mailList);
    }
    public static void output(){
        HistogramDisplay HistogramDisplay = new HistogramDisplay(histogram);
        HistogramDisplay.execute();
    }
}
    

