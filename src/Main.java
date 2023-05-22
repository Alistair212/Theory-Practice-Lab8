public class Main {


    static int stateQ1(char in) {
        if (in == '0') {
            return 1;
        } else if (in == '1') {
            return 2;
        } else {
            return -1;
        }

    }

    static int stateQ2(char in) {
        if (in == '1') {
            return 2;
        } else if (in == '0') {
            return 1;
        } else {
            return -1;
        }
    }


    public static void main(String[] args) {
        String input = "01010101010101010101010101010101010101010101010101010101010101010101010101010101010";

        int currentState = 1;
        char currentChar;

        for (int i = 0; i < input.length(); i++) {
            currentChar = input.charAt(i);

            if (currentState == 1) {
                currentState = stateQ1(currentChar);
            } else if (currentState == 2) {
                currentState = stateQ2(currentChar);
            } else {
                System.out.println("Invalid input");
                break;
            }
        }

        if (currentState == 1) {
            System.out.println("Accepted");
        } else {
            System.out.println("Rejected");
        }


    }


}