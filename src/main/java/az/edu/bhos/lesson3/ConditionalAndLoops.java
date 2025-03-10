package az.edu.bhos.lesson3;

public class ConditionalAndLoops {
    public static void main(String[] args) {

        if (false) {
            System.out.println();
        } else if (false) {
            System.out.println();
        } else {
            System.out.println();
        }

        String aydin = "aydin";

        switch (aydin) {
            case "Aydin":
                System.out.println("Aydin");
            case "Baydin":
                System.out.println("Baydin");
            default:
                System.out.println("Not a valid aydin");
        }

        // LOOPS

        // for while (do-while)
        int i = 0;

        for (i = 0; i < 100; i = i + 2) {
            System.out.println(i);
        }

        while (true) {
            System.out.println(i);
            i++;
            if (i == 10) {
                break;
            }
        }

        do {
            System.out.println(i);
            i++;
        } while (i == 10);

        while (i == 10) {
            System.out.println(i);
            i++;
        }

        //TERNARY
        String newName = (aydin.equals("Aydin")) ? "aydin" : "Aydin";

        if (newName.equals("Aydin")) {
            newName = "aydin";

        } else {
            newName = "Aydin";
        }


        // CONTINUE
        for (i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}
