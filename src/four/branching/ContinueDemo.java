package four.branching;

public class ContinueDemo {
    public static void main(String[] args) {
        //String - niz karakter
        String searchMe = "petar pan je pojeo ljute paprike i pošandrcao..";
        int brojac = 0;
        for(int i = 0; i<searchMe.length(); i++){
            char slovo = searchMe.charAt(i);
            if('p' != slovo){
                continue;
            }
            brojac++;
        }
//        char[] searchMeArray = searchMe.toCharArray();
//        int brojac = 0;
//        for (int i = 0; i < searchMeArray.length; i++) {
//            //zainteresovan samo za 'p'
//            char slovo = searchMeArray[i];
//            if(slovo != 'p'){
//               continue;
//            }
//            brojac++;
//        }
        System.out.println("Slovo 'p' se ponavlja " + brojac+" puta");
    }
}
