import java.util.Scanner;
public class HotelBooking {
    static int totalRooms = 10;
    static boolean[] rooms = new boolean [totalRooms];
    public static void showRooms() {
        System.out.println("\nRoom Status:");
        for (int i=0;i < totalRooms;i++){
            if(rooms[i]){
                System.out.println("Room" + (i+1)+ ": Booked");
            }else{
                System.out.println("Room"+(i+1)+":Available");
            }
        }
    }
    public static void bookRoom(int roomNo){
        if(roomNo<1||roomNo>totalRooms){
            System.out.println("Invalid Room Number!");
        } else if(rooms[roomNo-1]){
            System.out.println("Room is already booked.");
        }else{
            rooms[roomNo-1]=true;
            System.out.println("Room "+ roomNo + " booked Successfully.");
        }
    }
    public static void cancelBooking(int roomNo){
        if(roomNo<1||roomNo>totalRooms){
            System.out.println("Invalid Room Number!");
        } else if(!rooms[roomNo-1]){
            System.out.println("Room is already booked.");
        }else{
            rooms[roomNo-1]=false;
            System.out.println("Booking canceeled for Room"+ roomNo);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int choice;
        do { 
            System.out.println("\n====HOTEL ROOM BOOKING SYSTEM====");
            System.out.println("1.Show Rooms");
            System.out.println("2.Book Room");
            System.out.println("3.Cancel Booking");
            System.out.println("4.Exit");
            System.out.println("Enter your choice:");
            choice = sc.nextInt();
            switch(choice){
                case 1:
                    showRooms();
                    break;
                    case 2:
                        System.out.println("Enter Room Number to Book: ");
                        int book = sc.nextInt();
                        bookRoom(book);
                        break;
                        case 3:
                            System.out.print("Enter Room Number to Cancel:");
                            int cancel= sc.nextInt();
                            cancelBooking(cancel);
                            break;
                            case 4:
                            System.out.println("Thank you for using Hotel Booking System.");
                            break;
                            default:
                                System.out.println("Invalid Choice!");
            }
        } while (choice != 4);
        sc.close();
    }
}
