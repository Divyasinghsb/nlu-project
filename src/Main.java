import com.ibm.watson.discovery.v1.model.Credentials;
import com.ibm.watson.language_translator.v3.LanguageTranslator;
import com.ibm.watson.language_translator.v3.model.Languages;
import com.ibm.cloud.sdk.core.security.IamAuthenticator;


public class Main {
    public static void main(String[] args) {
        System.out.println("hello world");
        IamAuthenticator authenticator = new IamAuthenticator("q23DXMiCismQjKKAlf596tPl6IPCtm-7uI8z_Iiw1jLP");
        LanguageTranslator languageTranslator = new LanguageTranslator("2018-05-01", authenticator);
        languageTranslator.setServiceUrl("https://api.us-south.language-translator.watson.cloud.ibm.com/instances/c3ca2c3f-2608-4cf8-8f5b-c0bf1b1c3aaa");

//        Languages languages = languageTranslator.listLanguages()
//                .execute().getResult();

        Integer resCode= languageTranslator.listLanguages().execute().getStatusCode();
        System.out.println(resCode+"");
//        System.out.println(languages);
    }
}