//import com.ibm.watson.assistant.v1.model.WorkspaceSystemSettingsOffTopic;
import com.google.gson.Gson;
import com.ibm.cloud.sdk.core.security.IamAuthenticator;
//import com.ibm.watson.discovery.v1.model.Credentials;
import com.ibm.watson.language_translator.v3.LanguageTranslator;
//import com.ibm.watson.language_translator.v3.model.Languages;
//import com.ibm.watson.natural_language_understanding.v1.model
import com.ibm.watson.language_translator.v3.model.TranslateOptions;
import com.ibm.watson.language_translator.v3.model.Translation;
import com.ibm.watson.language_translator.v3.model.TranslationResult;

import java.util.List;
import java.util.Scanner;

public class translate {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        //String a = sc.nextLine();
        System.out.println("Provide the text to be translated:\n");
        String a = sc.nextLine();
        //System.out.println("bonjour");
        IamAuthenticator authenticator = new IamAuthenticator("q23DXMiCismQjKKAlf596tPl6IPCtm-7uI8z_Iiw1jLP");
        LanguageTranslator languageTranslator = new LanguageTranslator("2018-05-01", authenticator);
        languageTranslator.setServiceUrl("https://api.us-south.language-translator.watson.cloud.ibm.com/instances/c3ca2c3f-2608-4cf8-8f5b-c0bf1b1c3aaa\n");

        TranslateOptions translateOptions = new TranslateOptions.Builder()
                .addText(a)
                .modelId("en-zh")
                .build();

        TranslationResult result = languageTranslator.translate(translateOptions)
                .execute().getResult();
//        Integer resCode= languageTranslator.listLanguages().execute().getStatusCode();
        List<Translation> translations = result.getTranslations();
        System.out.println(translations.get(0));

        //System.out.println(result);
       // Scanner sc = new Scanner(System.in);
        //String a = sc.nextLine();
        //System.out.println("enter the word:");

    }
}
