
import java.io.*;

/* 
Контролируем массу тела
*/

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
        double weight = Double.parseDouble(bis.readLine());
        double height = Double.parseDouble(bis.readLine());

        Body.calculateMassIndex(weight, height);
    }

    public static class Body {
        public static void calculateMassIndex(double weight, double height) {
            // напишите тут ваш код
            double indeks = weight / (( height / 100.0 ) *( height / 100.0 ) );
           
            if (indeks < 18.5){
                System.out.println ("Недовес: меньше чем 18.5");
            }
            else if (indeks >= 18.5 && indeks <= 24.9){
                System.out.println ("Нормальный: между 18.5 и 24.9");
            }
            else if (indeks > 25 && indeks <= 29.9){
                System.out.println ("Избыточный вес: между 25 и 29.9");
            }
            else if (indeks >= 30.0 ){
                System.out.println ("Ожирение: 30 или больше");
            }
            
        }
    }
}
