import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("List of the supported languages:");
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------");

        System.out.println("Abkhaz\t'ab'   ," + "Acehnese\t'ace'   ," + "Acholi\t'ach'   ," + "Afrikaans\t'af'   ," + "Albanian\t'sq'   ," + "Alur\t'alz'\n" +
                "Amharic\t'am'   ," + "Arabic\t'ar'   ," + "Armenian\t'hy'   ," + "Assamese\t'as'   ," + "Awadhi\t'awa'   ," + "Aymara\t'ay'\n" +
                "Azerbaijani\t'az'\n\n");
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Balinese\t'ban'   ," + "Bambara\t'bm'   ," + "Bashkir\t'ba'   ," + "Basque\t'eu'   ," + "Batak Karo\t'btx'\n" +
                "Batak Simalungun\t'bts'   ," + "Batak Toba\t'bbc'   ," + "Belarusian\t'be'   ," + "Bemba\t'bem'   ," + "Bengali\t'bn'   ," + "Betawi\t'bew'\n" +
                "Bhojpuri\t'bho'   ," + "Bikol\t'bik'   ," + "Bosnian\t'bs'   ," + "Breton\t'br'   ," + "Bulgarian\t'bg'   ," + "Buryat\t'bua'\n\n");

        System.out.println("-------------------------------------------------------------------------------------------------------------------------------");

        System.out.println("Cantonese\t'yue'   ," + "Catalan\t'ca'   ," + "Cebuano\t'ceb'   ," + "Chichewa (Nyanja)\t'ny'   ," + "Chinese (Simplified)\t'zh-CN or zh'\n" +
                "Chinese (Traditional)\t'zh-TW'   ," + "Chuvash\t'cv'   ," + "Corsican\t'co'   ," + "Crimean Tatar\t'crh'   ," + "Croatian\t'hr'\n" +
                "Czech\t'cs'\n\n");

        System.out.println("-------------------------------------------------------------------------------------------------------------------------------");

        System.out.println("Danish\t'da'   ," + "Dinka\t'din'   ," + "Divehi\t'dv'   ," + "Dogri\t'doi'   ," + "Dombe\t'dov'   ," + "Dutch\t'nl'   ," + "Dzongkha\t'dz'\n\n");

        System.out.println("-------------------------------------------------------------------------------------------------------------------------------");

        System.out.println("English\t'en'   ," + "Esperanto\t'eo'   ," + "Estonian\t'et'   ," + "Ewe\t'ee'\n\n");

        System.out.println("-------------------------------------------------------------------------------------------------------------------------------");

        System.out.println("Fijian\t'fj'   ," + "Filipino (Tagalog)\t'fil or tl'\n" + "Finnish\t'fi'   ," + "French\t'fr'   ," + "French (France)\t'fr-FR'\n" +
                "French (Canadian)\t'fr-CA'   ," + "Frisian\t'fy'   ," + "Fulfulde\t'ff'\n\n");

        System.out.println("-------------------------------------------------------------------------------------------------------------------------------");

        System.out.println("Ga\t'gaa'   ," + "Galician\t'gl'   ," + "Ganda (Luganda)\t'lg'   ," + "Georgian\t'ka'   ," + "German\t'de'\n" +
                "Greek\t'el'   ," + "Guarani\t'gn'   ," + "Gujarati\t'gu'\n\n");

        System.out.println("-------------------------------------------------------------------------------------------------------------------------------");

        System.out.println("Haitian Creole\t'ht'   ," + "Hakha Chin\t'cnh'   ," + "Hausa\t'ha'\n" + "Hawaiian\t'haw'   ," + "Hebrew\t'he or iw'\n" +
                "Hiligaynon\t'hil'   ," + "Hindi\t'hi'   ," + "Hmong\t'hmn'   ," + "Hungarian\t'hu'   ," + "Hunsrik\t'hrx'\n\n");

        System.out.println("-------------------------------------------------------------------------------------------------------------------------------");

        System.out.println("Icelandic\t'is'   ," + "Igbo\t'ig'   ," + "Iloko\t'ilo'   ," + "Indonesian\t'id'   ," + "Irish\t'ga'   ," + "Italian\t'it'\n\n");

        System.out.println("-------------------------------------------------------------------------------------------------------------------------------");

        System.out.println("Japanese\t'ja'   ," + "Javanese\t'jw or jv'\n\n");

        System.out.println("-------------------------------------------------------------------------------------------------------------------------------");

        System.out.println("Kannada\t'kn'   ," + "Kapampangan\t'pam'   ," + "Kazakh\t'kk'\n" +
                "Khmer\t'km'   ," + "Kiga\t'cgg'   ," + "Kinyarwanda\t'rw'   ," + "Kituba\t'ktu'   ," + "Konkani\t'gom'   ," + "Korean\t'ko'\n" +
                "Krio\t'kri'   ," + "Kurdish (Kurmanji)\t'ku'   ," + "Kurdish (Sorani)\t'ckb'   ," + "Kyrgyz\t'ky'\n\n");

        System.out.println("-------------------------------------------------------------------------------------------------------------------------------");

        System.out.println("Lao\t'lo'   ," + "Latgalian\t'ltg'   ," + "Latin\t'la'   ," + "Latvian\t'lv'   ," + "Ligurian\t'lij'   ," + "Limburgan\t'li'   ," + "Lingala\t'ln'\n" +
                "Lithuanian\t'lt'\n" + "Lombard\t'lmo'   ," + "Luo\t'luo'   ," + "Luxembourgish\t'lb'\n\n");

        System.out.println("-------------------------------------------------------------------------------------------------------------------------------");

        System.out.println("Macedonian\t'mk'   ," + "Maithili\t'mai'   ," + "Makassar\t'mak'\n" + "Malagasy\t'mg'   ," + "Malay\t'ms'   ," + "Malay (Jawi)\t'ms-Arab'\n" +
                "Malayalam\t'ml'   ," + "Maltese\t'mt'   ," + "Maori\t'mi'   ," + "Marathi\t'mr'   ," + "Meadow Mari\t'chm'   ," + "Meiteilon (Manipuri)\t'mni-Mtei'\n" +
                "Minang\t'min'   ," + "Mizo\t'lus'   ," + "Mongolian\t'mn'   ," + "Myanmar (Burmese)\t'my'\n\n");

        System.out.println("-------------------------------------------------------------------------------------------------------------------------------");

        System.out.println("Ndebele (South)\t'nr'   ," + "Nepalbhasa (Newari)\t'new'   ," + "Nepali\t'ne'   ," + "Northern Sotho (Sepedi)\t'nso'\n" +
                "Norwegian\t'no'   ," + "Nuer\t'nus'\n\n");

        System.out.println("-------------------------------------------------------------------------------------------------------------------------------");

        System.out.println("Occitan\t'oc'   ," + "Odia (Oriya)\t'or'   ," + "Oromo\t'om'\n\n");

        System.out.println("-------------------------------------------------------------------------------------------------------------------------------");

        System.out.println("Pangasinan\t'pag'   ," + "Papiamento\t'pap'   ," + "Pashto\t'ps'   ," + "Persian\t'fa'   ," + "Polish\t'pl'   ," + "Portuguese\t'pt'\n" +
                "Portuguese (Portugal)\t'pt-PT'   ," + "Portuguese (Brazil)\t'pt-BR'   ," + "Punjabi\t'pa'   ," + "Punjabi (Shahmukhi)\t'pa-Arab'\n\n");

        System.out.println("-------------------------------------------------------------------------------------------------------------------------------");

        System.out.println("Quechua\t'qu'\n\n");

        System.out.println("-------------------------------------------------------------------------------------------------------------------------------");


        System.out.println("Romani\t'rom'   ," + "Romanian\t'ro'   ," + "Rundi\t'rn'   ," + "Russian\t'ru'\n\n");

        System.out.println("-------------------------------------------------------------------------------------------------------------------------------");

        System.out.println("Samoan\t'sm'   ," + "Sango\t'sg'   ," + "Sanskrit\t'sa'   ," + "Scots Gaelic\t'gd'   ," + "Serbian\t'sr'   ," + "Sesotho\t'st'\n" +
                "Seychellois Creole\t'crs'   ," + "Shan\t'shn'   ," + "Shona\t'sn'   ," + "Sicilian\t'scn'   ," + "Silesian\t'szl'   ," + "Sindhi\t'sd'\n" +
                "Sinhala (Sinhalese)\t'si'   ," + "Slovak\t'sk'   ," + "Slovenian\t'sl'   ," + "Somali\t'so'   ," + "Spanish\t'es'   ," + "Sundanese\t'su'\n" +
                "Swahili\t'sw'   ," + "Swati\t'ss'   ," + "Swedish\t'sv'\n\n");

        System.out.println("-------------------------------------------------------------------------------------------------------------------------------");

        System.out.println("Tajik\t'tg'   ," + "Tamil\t'ta'   ," + "Tatar\t'tt'   ," + "Telugu\t'te'   ," + "Tetum\t'tet'   ," + "Thai\t'th'\n" +
                "Tigrinya\t'ti'   ," + "Tsonga\t'ts'   ," + "Tswana\t'tn'   ," + "Turkish\t'tr'   ," + "Turkmen\t'tk'   ," + "Twi (Akan)\t'ak'\n\n");

        System.out.println("-------------------------------------------------------------------------------------------------------------------------------");


        System.out.println("Ukrainian\t'uk'   ," + "Urdu\t'ur'   ," + "Uyghur\t'ug'   ," + "Uzbek\t'uz'\n\n");

        System.out.println("-------------------------------------------------------------------------------------------------------------------------------");


        System.out.println("Vietnamese\t'vi'\n\n");

        System.out.println("-------------------------------------------------------------------------------------------------------------------------------");

        System.out.println("Welsh\t'cy'\n\n");

        System.out.println("-------------------------------------------------------------------------------------------------------------------------------");

        System.out.println("Xhosa\t'xh'\n\n");

        System.out.println("-------------------------------------------------------------------------------------------------------------------------------");

        System.out.println("Yiddish\t'yi'   ," + "Yoruba\t'yo'   ," + "Yucatec Maya\t'yua'\n\n");

        System.out.println("-------------------------------------------------------------------------------------------------------------------------------");

        System.out.println("Zulu\t'zu'");


        Translator translator = new Translator();
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter your text below:");
        String line= sc.nextLine();

        System.out.println("Which language do you want to translate your text to?");

        String target = sc.nextLine();

        String translatedText = translator.translate(line, target); // Translate to Spanish

        System.out.println(translatedText);
    }
}

