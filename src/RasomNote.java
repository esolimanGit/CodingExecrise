public class RasomNote {

    public static void main (String[] args) {
        System.out.println(new RasomNote().canConstruct("aa", "ab"));
        System.out.println(new RasomNote().canConstruct("aa", "aab"));
        System.out.println(new RasomNote().canConstruct("a", "b"));
    }

    public boolean canConstruct(String ransomNote, String magazine) {
        char[] rasomBytes = ransomNote.toCharArray();
        char[] magazineBytes = magazine.toCharArray();
        boolean found = false;
        for (int i = 0; i < rasomBytes.length; i++) {
            for(int j = 0; j < magazineBytes.length; j++) {
                if (magazineBytes[j] == rasomBytes[i]) {
                    found = true;
                    magazineBytes[j] = 0;
                    break;
                }
            }
            if (!found) return false;
            else found = false;
        }
        return true;
    }
}
