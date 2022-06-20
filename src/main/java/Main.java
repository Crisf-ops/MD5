import model.DateToken;

public class Main {

    public static void main(String[] args){

        String APPLICATION_CODE = "";
        String APPLICATION_KEY = "";
        String TRANSCTION_ID = "PSE-30380";
        String USER_ID = "12345678";

        DateToken date = new DateToken(APPLICATION_CODE,APPLICATION_KEY,TRANSCTION_ID,USER_ID);
        Token token = new Token();
        System.out.println("Token generado: " + token.buildToken(date));
    }
}
