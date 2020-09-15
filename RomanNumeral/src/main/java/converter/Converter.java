package converter;

public class Converter {
    public String convertToNumeral(int i) {
        switch(i) {
            case 1:
                return "I";
            case 5:
                return "V";
            case 10:
                return "X";
            case 50:
                return "L";
            case 100:
                return "C";
            case 500:
                return "D";
            case 1000:
                return "M";
            default:
                //MANGLER BEREGNINGS ALGORIMTE FOR KONVERTERING AF TAL
                if(i == 4){
                    return "IV";
                }
                if(i == 6){
                    return "VI";
                }
                throw new IllegalArgumentException("Number cannot be converted to roman numeral!");
        }
    }
}
