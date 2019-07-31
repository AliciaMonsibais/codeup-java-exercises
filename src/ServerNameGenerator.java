public class ServerNameGenerator {
    private static String[] adjectives = {"Sophisticated", "Insightful", "Meticulous", "Strategic", "Constructive", "Savvy", "Energetic", "Devoted", "Earnest", "Sagacious"};

    private static String[] nouns = {"Aardvark", "Chinchilla", "Parakeet", "Boar", "Porpoise", "Marten", "Wombat", "Platypus", "Chamois", "Fox"};

    private static String randomElement(String[] strings) {
        int randoNum = (int) (Math.random() * strings.length);
        return strings[randoNum];
    }

    public static String generator(String[] strings1, String[] strings2) {
        String adj = randomElement(strings1);
        String noun = randomElement(strings2);
        String generatedName = adj + "-" + noun;
        return generatedName;
    }
    public static void main(String[] args) {
        System.out.println("Here is your server name: ");
        System.out.println(generator(adjectives, nouns));
    }
}
