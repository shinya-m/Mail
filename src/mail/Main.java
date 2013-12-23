package mail;

public class Main {

	public static void main(String[] args) {
        //Gmail送信
        MailSender oMail=new MailSender("smtp.gmail.com",465,"mail@gmail.com","password");

//        oMail.addToAddress("mail@gmail.com","送信先");
        oMail.addToAddress("mail@gmail.com");
//        oMail.addCCAddress("xx3@local.jp");
//        oMail.addBCCAddress("xx4@local.jp","BCC");
        oMail.setFromAddress("noreply","noreply");
        oMail.setSubject("件名テスト");
        oMail.setBody("本文テスト");
//        oMail.addAttachment("filepath");

        try{
            oMail.sendMail();
        }
        catch( Exception e){
            System.out.println(e.toString());
            e.printStackTrace();
        }

        System.exit(0);
	}
}
