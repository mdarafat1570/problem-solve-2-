import java.security.PrivateKey;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("     Assalamu Alaikum sir, \n    Welcome to our hospital \n-----------------------------------\nplease tell me your Name : ");
        String name =scanner.nextLine();

        System.out.println("Sir please tell me your age : ");
        int age = scanner.nextInt();



        System.out.println("Sir please tell me your mobile number :");
        String numbar =scanner.nextLine();


        scanner.nextLine();

        System.out.println("Sir please tell your body condition what problem you are facing :");
        String problem =scanner.nextLine();

        if (problem.equals("Hib")){
            System.out.println("""
                    1.Professor Dr. AKM Fazlul Hoque\s
                    2.Dr. H A M Nazmul Ahsan\s
                    3.Professor Dr. Sheikh Nesaruddin Ahmed""");
        }else {
            System.out.println("Not Available doctors in our hospital");
        }
        if (problem.equals("pneumonia")){
            System.out.println("""
                    1.Professor Dr. Mahbub H Khan
                    2.Prof. Dr. Md. Golam Kibria Khan\s
                    3.Prof. Dr. Md. Faizul Islam Chowdhury MBBS""");
        }else {
            System.out.println("Not Available doctors in our hospital");
        }
        if (problem.equals("malaria")){
            System.out.println("1.Prof. Dr. Shohael Mahmud Arafat \n" +
                               "2.Dr. Mohammad Jahangir Talukde");
        }else {
            System.out.println("Not Available doctors in our hospital");
        }

        System.out.println("Available doctors in our hospital");
       // System.out.println("1.Professor Dr. AKM Fazlul Hoque  MBBS, FCPS (Medicine), FRCP (Glasgow), FACP (USA)");
            // System.out.println("2.Dr. H A M Nazmul Ahsan MBBS, MRCP (UK), FRCP (London)");
              //  System.out.println("3.Professor Dr. Sheikh Nesaruddin Ahmed MBBS, FCPS (Medicine), PhD (USA)");
                  //   System.out.println("4.Professor Dr. Mahbub H Khan MBBS, FCPS (Medicine), MRCP (UK)");
                      //   System.out.println("5.Dr. Mohammad Jahangir Talukde MBBS (Dhaka), FCPS (Medicine), MACP (USA)");
                         //   System.out.println("6.Prof. Dr. Md. Golam Kibria KhanMBBS, FCPS (Medicine), MACP (USA), FACP (USA) , Fellow Rheumatology (USA)");
                               // System.out.println("7.Prof. Dr. Shohael Mahmud Arafat MBBS, FCPS (Medicine), MRCP (UK)");
                                 //   System.out.println("8.Prof. Dr. Md. Faizul Islam Chowdhury MBBS, FCPS (Medicine), PhD (USA)");
        System.out.println("Enter the number of the doctor you want to consult");
        int Drnumbar = scanner.nextInt();

        boolean drAvailable = checkdravailable(Drnumbar);

      //  if (drAvailable){
           // System.out.println("Doctor is available for consultation.");
           // System.out.println("You can proceed to take an appointment with the doctor.");

            displayDrDetails(Drnumbar); //function

            System.out.println("Enter the day when the doctor sits:");
            String drhospital =scanner.next();

            displayDrSchedule(Drnumbar,drhospital);

        }

   // }

    private static boolean checkdravailable(int drnumbar) { //method
        return drnumbar >= 1 && drnumbar <= 8;
    }
    private static void displayDrDetails(int drnumbar) {    //array use kora hoisa !
        String[] Drdetails ={

                "Specialist in MBBS, FCPS (Medicine), FRCP (Glasgow), FACP (USA)",
                "Specialist in MBBS, MRCP (UK), FRCP (London) ",
                "Specialist in MBBS, FCPS (Medicine), PhD (USA)",
                "Specialist in MBBS, FCPS (Medicine), MRCP (UK) ",
                "Specialist in MBBS (Dhaka), FCPS (Medicine), MACP (USA),",
                "Specialist in MBBS, FCPS (Medicine), MRCP (UK)",
                "Specialist in MBBS, FCPS (Medicine), MACP (USA), FACP (USA) , Fellow Rheumatology (USA)",
                "Specialist in MBBS, FCPS (Medicine), PhD (USA)"
        };

        System.out.println(Drdetails[drnumbar-1]);
    }
    private static void displayDrSchedule(int drnumbar, String drhospital) { //Array
        String[][] DrSchedule ={

                {"", "", "8 am - 1 pm", "", ""},
                {"", "", "", "2 pm - 5 pm", ""},
                {"", "", "", "", "5 pm - 8 pm"}
        };

     String schedule =DrSchedule[drnumbar -1][DayIndex (drhospital)];
   if (schedule.isEmpty()){
     System.out.println("Doctor's schedule on "+drhospital + " :"+ Arrays.deepToString(DrSchedule));
     }else{
       System.out.println("Doctor is not available on"+drhospital);
   }
    }

    private static int DayIndex(String sittingDay) {
        switch (sittingDay.toLowerCase()) {
            case "Wednesday":
                return 0;
            case "sunday":
                return 1;
            case "tuesday":
                return 2;
            case "hasjksajh":
                return 3;


            case "thursday":
                return 4;
            case "friday":
                return 5;
            default:
                return -1;
        }
    }
}
