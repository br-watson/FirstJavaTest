package Maps;

public class Runner {
    public static void main(String[] args) {
        String text = "-- .. -.-. .-. --- ... --- ..-. - / .--- .- ...- .- / .. ... / -.-. --- --- .-.. / --- -.-";
        MorseTranslator translator = new MorseTranslator();
        System.out.println(translator.translate(text));
    }
}
