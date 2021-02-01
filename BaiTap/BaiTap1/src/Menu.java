
import java.util.Scanner;

public class Menu {
    static Scanner sc = new Scanner(System.in);
    static int soPhong = 3;
    public static void main(String[] args) {
        Method m = new Method();
        int choice = 0;
        do {
            try {
                System.out.println("\n1 - Thêm khách\n2 - Trả phòng\n3 - Hiển thị thông tin khách trọ\n4 - Thoát");
                choice = Integer.parseInt(sc.nextLine());
                switch (choice) {
                    case 1:
                        if (soPhong > 0) {
                            System.out.println("Bao nhiêu khách thuê phòng?");
                            int sophong = Integer.parseInt(sc.nextLine());
                            System.out.println("Khách thuê trong bao nhiêu ngày?");
                            int days = Integer.parseInt(sc.nextLine());
                            Room room = m.chooseAvailableRoom();
                            room.setStayTime(days);
                            for (int i = 0; i < sophong; i++) {
                                Person c = m.createPerson();
                                m.add(room, c);
                            }
                            room.setAvailable(false);
                            soPhong--;
                        } else {
                            System.out.println("Hết phòng trống");
                        }
                        break;
                    case 2:
                        if (soPhong < 3) {
                            Room room = m.chooseUnavailableRoom();
                            m.delete(room);
                            soPhong++;
                        } else {
                            System.out.println("Chưa có ai đặt phòng");
                        }
                        break;
                    case 3:
                        m.print();
                        break;
                    case 4:
                        break;
                }
            } catch (NullPointerException e) {
                System.out.println("Nhập sai số phòng");
            }
        } while (choice != 4);
    }
}