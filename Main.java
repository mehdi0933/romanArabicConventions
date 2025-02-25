import java.util.LinkedHashMap;
import java.util.Map;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> toTranslateArabeRoman = new LinkedHashMap<>();
        toTranslateArabeRoman.put(1000,"M");
        toTranslateArabeRoman.put(900, "CM");
        toTranslateArabeRoman.put(100, "C");
        toTranslateArabeRoman.put(90,  "XC");
        toTranslateArabeRoman.put(50,  "D");
        toTranslateArabeRoman.put(10,  "X");
        toTranslateArabeRoman.put(9,   "IX");
        toTranslateArabeRoman.put(5,   "V");
        toTranslateArabeRoman.put(4,   "IV");
        toTranslateArabeRoman.put(1,   "I");

        romanArabicConventions(3999, toTranslateArabeRoman);


    }
    public static void romanArabicConventions( int nomberArabe,Map <Integer, String> toTranslateArabeRoman ){
        for (Map.Entry<Integer, String> Entry  :toTranslateArabeRoman.entrySet()){
            while (nomberArabe >= Entry.getKey() ) {
                System.out.print(Entry.getValue());
                nomberArabe = nomberArabe-Entry.getKey();

            }
        }
    }



}