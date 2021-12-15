package four.branching;

public class ContinueWithLabelDemo {
    public static void main(String[] args) {
        String recenica = "Potrazi mene ti. Mozda me i ponadjes.";
        String rijec = "men";
        boolean sadrzana = false;
        LABELA:
        for (int i = 0; i < recenica.length(); i++) {
            for (int j = 0; j < rijec.length(); j++) {
                //i = 8, 9, 10
                char slovoRecenica = recenica.charAt(i + j);
                //j = 0, 1, 2
                char slovoRijec = rijec.charAt(j);
                //P poredi m -> e i n nećemo ni razmatrati
                if (slovoRijec != slovoRecenica) {
                    continue LABELA;
                }
            }
            sadrzana = true;
            break;
        }
        System.out.println(sadrzana ? "Rijec postoji u recenici" : "Ne postoji");
    }
}
