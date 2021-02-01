import java.util.ArrayList;

public class Method {
    static ArrayList<Room> rooms = new ArrayList<>();

    static {
        rooms.add(new Room(1, "Đơn", 100000));
        rooms.add(new Room(2, "Đôi", 150000));
        rooms.add(new Room(3, "Vip1", 200000));
        rooms.add(new Room(4, "Vip2", 250000));
        rooms.add(new Room(5, "Vip3", 300000));
    }

    public void print() {
        boolean found = false;
        for (Room room : rooms) {
            if (!room.getPersons().isEmpty()) {
                found = true;
                System.out.println("Phòng " + room.getRoomNumber() + " có " + room.getPersons().size() + " khách.");
                for (int i = 0; i < room.getPersons().size(); i++) {
                    System.out.println(room.getPersons().get(i).toString());
                }
            }
        }
        if (!found) System.out.println("Chưa có khách nào.");
    }

    public  Room chooseAvailableRoom() {
        Room room2 = null;
        System.out.println("Bạn muốn ở phòng mấy");
        for (Room room : rooms) {
            if (room.isAvailable())
                System.out.println(room.toString());
        }
        int choice = Integer.parseInt(Menu.sc.nextLine());
        for (Room room : rooms) {
            if (room.getRoomNumber() == choice)
                room2 = room;
        }
        return room2;
    }

    public Room chooseUnavailableRoom() {
        Room room2 = null;
        System.out.println("Khách trả phòng mấy");
        for (Room room : rooms) {
            if (!room.isAvailable())
                System.out.println(room.toString());
        }
        int choice = Integer.parseInt(Menu.sc.nextLine());
        for (Room room : rooms) {
            if (room.getRoomNumber() == choice)
                room2 = room;
        }
        return room2;
    }

    public Person createPerson() {
        System.out.println("Nhập tên khách hàng");
        String name = Menu.sc.nextLine();
        System.out.println("Nhập ngày sinh");
        String date = Menu.sc.nextLine();
        System.out.println("Nhập id");
        int id = Integer.parseInt(Menu.sc.nextLine());
        return new Person(name, date, id);
    }

    public void add(Room room, Person c) {
        room.getPersons().add(c);
        System.out.println("Thêm khách " + c.toString() + "\nVào phòng " + room.toString() + " trong " + room.getStayTime() + " ngày.");
    }

    public void delete(Room room) {
        System.out.println("Số tiền phải trả là " + room.calculateFee());
        room.getPersons().clear();
        System.out.println("Khách ở phòng " + room.getRoomNumber() + " đã trả phòng.");
        room.setAvailable(true);
    }

    public void doUpdate(Room fromRoom, Room toRoom) {
        for (int i = 0; i < fromRoom.getPersons().size(); i++) {
            toRoom.getPersons().add(fromRoom.getPersons().get(i));
        }
        toRoom.setAvailable(false);
        fromRoom.setAvailable(true);
        fromRoom.getPersons().clear();
        System.out.println("Đã chuyển khách sang phòng mới");
    }
}

