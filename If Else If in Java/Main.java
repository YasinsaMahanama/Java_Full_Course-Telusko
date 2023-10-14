public class Main {
    public static void main(String[] args) {

        int x = 8;
        int y = 7;
        int z = 6;

        if(x > y && x > z)
            System.out.println("Max number is x.");
        else
            if(y > x && y > z )
                System.out.println("Max number is y.");
            else
                System.out.println("Max number is z.");
    }

}
