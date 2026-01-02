import java.util.ArrayList;
import java.util.Scanner;

public class MusicPlayer_ArrayList {
    public static void MusicPlayer() {
        Scanner sc = new Scanner(System.in);
        
        //creating ArrayList 
        ArrayList<String> playList = new ArrayList<>();
        int ch;

        // Menue Options
        while (true) {
            System.out.println("---Menu Options---");
            System.out.println("Enter 1 for Adding song to playList ");
            System.out.println("Enter 2 for see list of songs  ");
            System.out.println("Enter 3 for play specific song ");
            System.out.println("Enter 4 for Removing song ");
            System.out.println("Enter 5 for Exit ");

            // Getting choice
            System.out.print("Enter choice : ");
            ch = sc.nextInt();
            sc.nextLine(); // new line 

            switch (ch) {
                case 1:
                // Adding Songs in playlist 
                    System.out.print("Enter song : ");
                    String song = sc.nextLine();
                    playList.add(song);
                    System.out.println("Song Added");
                    System.out.println();
                    break;

                case 2:
                //Checking song present in playlist or not 
                    if (playList.isEmpty()) {
                        System.out.print("PlayList is Empty ");
                    } else {
                        System.out.println("The playlist is : ");
                        for (String songs : playList) {
                            System.out.println("-- " + songs);
                        }
                    }
                    System.out.println();
                    break;

                case 3:
                //Playing Songs from playlist 
                    System.out.print("Enter Song Name: ");
                    String playSong = sc.nextLine();
                    if (playList.contains(playSong)) {
                        System.out.print("Now Playing Song : " + playSong);
                        System.out.println();
                    } else {
                        System.out.println("Song Not Found ");
                    }
                    System.out.println();
                    break;

                case 4:
                //Removing song from playlist 
                    System.out.print("Enter song Name : ");
                    String removeSong = sc.nextLine();
                    if (playList.contains(removeSong)) {
                        playList.remove(removeSong);
                        System.out.println("Song Successfully Removed ");
                        System.out.println();
                    } else {
                        System.out.println("Song not Found ");
                    }
                    System.out.println();
                    break;

                case 5:
                //Exiting from program 
                    sc.close();
                    System.out.println("Exiting Succesfully.... ");
                    System.exit(0);
            }
        }
    }

    public static void main(String[] args) {
        MusicPlayer();
    }
}