import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner input = new Scanner(System.in);
        System.out.println("On one fateful day, your friend Edwinjames invites you over to his house.");
        System.out.println("Press Enter to Continue...");
        String nextDialogue = input.nextLine();
        System.out.println("You arrive there and the both of you spend the day playing video games.");
        System.out.println("Press Enter to Continue...");
        String nextDialogue2 = input.nextLine();
        System.out.println("Eventually, the both of you grow tired as the time comes closer to midnight.");
        System.out.println("Press Enter to Continue...");
        String nextDialogue3 = input.nextLine();
        System.out.println("You both eventually pass out.");
        System.out.println("Press Enter to Continue...");
        String nextDialogue4 = input.nextLine();
        System.out.println("When midnight is struck, however; you're mysteriously awoken to find Edwinjames missing.");
        System.out.println("Press Enter to Continue...");
        String nextDialogue5 = input.nextLine();
        System.out.println("You get up and search for him, and there you find what once was your friend turned into a deadly animatronic.");
        System.out.println("Press Enter to Continue...");
        String nextDialogue6 = input.nextLine();
        System.out.println("You will now have to survive against Edwinjames, using whatever is provided to you. Good luck.");
        System.out.println("Press Enter to Begin...");
        String nextDialogue7 = input.nextLine();
        Edwinjames edwinjames = new Edwinjames();
//        NightTimer nightTimerClass = new NightTimer();
//        Thread night = new Thread(nightTimerClass);
        while (true) {
            System.out.println("╔══════════════════════════╗\n" +
                    "║INPUT 1: OPEN CAMERAS     ║\n" +
                    "║INPUT 2: CHECK THE BEDROOM║\n" +
                    "╚══════════════════════════╝");
            int panelInput = input.nextInt();
            if (panelInput == 1) {
                System.out.println("╔══════════════════════════════════════════════════════════════════════════════╗\n" +
                        "║                                                                              ║\n" +
                        "║                   ╔══════════════════════════════════════╗                   ║\n" +
                        "║                   ║EDWINJAMES' CAMERA SURVEILLANCE SYSTEM║                   ║\n" +
                        "║                   ╚══════════════════════════════════════╝                   ║\n" +
                        "║         (ENTER A NUMBER IS THAT IS LABELED TO A CAMERA TO ACCESS IT)         ║\n" +
                        "║                                                                              ║\n" +
                        "║                                                                              ║\n" +
                        "║                                                                              ║\n" +
                        "║                                                                              ║\n" +
                        "║                   ╔════════╗                    ╔════════╗                   ║\n" +
                        "║                   ║CAMERA 1║                    ║CAMERA 3║                   ║\n" +
                        "║                   ╚════════╝                    ╚════════╝                   ║\n" +
                        "║                                                                              ║\n" +
                        "║                                                                              ║\n" +
                        "║                   ╔════════╗                    ╔════════╗                   ║\n" +
                        "║                   ║CAMERA 2║                    ║CAMERA 4║                   ║\n" +
                        "║                   ╚════════╝                    ╚════════╝                   ║\n" +
                        "║                                                                              ║\n" +
                        "║                                                                              ║\n" +
                        "║                                                                              ║\n" +
                        "║                                                                              ║\n" +
                        "║                                                                              ║\n" +
                        "║                                                                              ║\n" +
                        "╚══════════════════════════════════════════════════════════════════════════════╝");
                int cameraInput = input.nextInt();
                if (cameraInput == 1) {
                    System.out.println("You're in the living room.");
                } else if (cameraInput == 2) {
                    System.out.println("You're in the dining room.");
                } else if (cameraInput == 3) {
                    System.out.println("You're in the kitchen.");
                } else if (cameraInput == 4) {
                    System.out.println("You're in the basement.");
                }
            } else if (panelInput == 2) {
                System.out.println("You set the panel down and check the bedroom.");
            } else {
                System.out.println("╔═════════════╗\n" +
                        "║INVALID INPUT║\n" +
                        "╚═════════════╝");
            }
        }
    }
}