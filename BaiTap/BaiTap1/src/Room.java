import java.util.ArrayList;

public class Room {
    private int roomNumber;
    private String kindofRoom;
    private int price;
    private int stayTime;
    private boolean isAvailable = true;
    private ArrayList<Person> persons = new ArrayList<>();

    public Room() {
    }

    public Room(int roomNumber, String kindofRoom, int price) {
        this.roomNumber = roomNumber;
        this.kindofRoom = kindofRoom;
        this.price = price;
    }
    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        this.isAvailable = available;
    }
    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getKindofRoom() {
        return kindofRoom;
    }

    public void setRoomType(String roomType) {
        this.kindofRoom = roomType;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public ArrayList<Person> getPersons() {
        return persons;
    }

    public int getStayTime() {
        return stayTime;
    }

    public void setStayTime(int stayTime) {
        this.stayTime = stayTime;
    }

    public int Prices() {
        return price*stayTime;
    }

    @Override
    public String toString() {
        return "Phòng - " +
                " số phòng: " + roomNumber +
                ", loại phòng: " + kindofRoom +
                ", giá phòng: " + price
                ;
    }
}