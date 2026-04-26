public class PrecisionOfDecimal{
    public static void main(String[] args) {
        double num=1221.;
        String s=Double.toString(num);
        int count=0;
        int precision=0;
        for(int i=0; i<s.length(); i++){
            count++;
            if(s.charAt(i) == '.'){
                precision=s.length()-count;
                break;
            }
        }
        System.out.println(precision);
    }
}