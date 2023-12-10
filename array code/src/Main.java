
public class Main {
    public static void main(String[] args) {

        int [] phone_numbar = new int[123];

        phone_numbar [0]=0163727573;
        phone_numbar [1]= 96150;
        phone_numbar [2]=2343242;
        phone_numbar [3]=273726;
        int Numbar =1;

        boolean result0 =(phone_numbar[0]>Numbar);
         boolean result1 =(phone_numbar[1]>Numbar);
          boolean result2 =(phone_numbar[2]<Numbar);
           boolean result3 =(phone_numbar[3]>Numbar);


        System.out.println("1.Your number is = "+result0);
        System.out.println("2.Your number is = "+result1);
        System.out.println("3.your numabr is = "+result2);
        System.out.println("4.your numbar is = "+result3);
        System.out.println(phone_numbar.length);



    }
}