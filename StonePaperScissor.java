import java.util.*;

public class StonePaperScissor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Enter your name:");
        String player = sc.nextLine();

        String cpu = "CPU"; 
        String[] arr = {"Stone", "Paper", "Scissor"};

        System.out.println("Enter your choice (Stone, Paper, or Scissor):");
        String playerChoice = sc.nextLine().toLowerCase();

        playerChoice = capitalize(playerChoice);

        if (!Arrays.asList(arr).contains(playerChoice)) {
            System.out.println("Invalid choice! Please enter Stone, Paper, or Scissor.");
            sc.close();
            return;
        }

        String cpuChoice = arr[rand.nextInt(arr.length)];

        System.out.println();
        System.out.println(player + " chooses " + playerChoice);
        System.out.println(cpu + " chooses " + cpuChoice);
        System.out.println();

        if (playerChoice.equals(cpuChoice)) {
            System.out.println("It's a Draw!");
        } else if (playerChoice.equals("Stone") && cpuChoice.equals("Paper")) {
            System.out.println(cpu + " wins!");
        } else if (playerChoice.equals("Paper") && cpuChoice.equals("Scissor")) {
            System.out.println(cpu + " wins!");
        } else if (playerChoice.equals("Scissor") && cpuChoice.equals("Stone")) {
            System.out.println(cpu + " wins!");
        } else {
            System.out.println(player + " wins!");
        }

        sc.close();
    }
    public static String capitalize(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        return str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
    }
}
