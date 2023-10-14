public class Main {
    public static void main(String[] args) {

        String day = "Monday";

//        switch(day){
//            case "Saturday","Sunday":
//                System.out.println("6.00am");
//                break;
//            case "Monday":
//                System.out.println("8.00am");
//                break;
//            default:
//                System.out.println("7.00am");
//                break;
//        }

//        String result = "";
//        switch(day){
//            case "Saturday","Sunday" -> System.out.println("6.00am");
//            case "Monday" -> System.out.println("8.00am");
//            default -> System.out.println("7.00am");
//        }

//        String result = "";
//        switch(day){
//            case "Saturday","Sunday" -> result = "6.00am";
//            case "Monday" -> result = "8.00am";
//            default -> result = "7.00am";
//        }


        String result = "";
        result = switch(day)
        {
            case "Saturday","Sunday" -> "6.00am";
            case "Monday" -> "8.00am";
            default -> "7.00am";
        };

        System.out.println(result);

    }

}
