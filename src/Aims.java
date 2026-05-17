package hust.soict.dsai.aims;

import java.util.Scanner;
import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.store.Store;
import hust.soict.dsai.aims.media.*;

public class Aims {
    private static Store store = new Store();
    private static Cart cart = new Cart();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        while (true) {
            showMenu();
            choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1: viewStore(); break;
                case 2: updateStore(); break;
                case 3: seeCurrentCart(); break;
                case 0: System.out.println("Goodbye!"); System.exit(0);
                default: System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    // --- CÁC HÀM HIỂN THỊ MENU ---

    public static void showMenu() {
        System.out.println("\nAIMS: ");
        System.out.println("--------------------------------");
        System.out.println("1. View store");
        System.out.println("2. Update store");
        System.out.println("3. See current cart");
        System.out.println("0. Exit");
        System.out.println("--------------------------------");
        System.out.print("Please choose a number: 0-1-2-3: ");
    }

    public static void storeMenu() {
        System.out.println("\nOptions: ");
        System.out.println("--------------------------------");
        System.out.println("1. See a media’s details");
        System.out.println("2. Add a media to cart");
        System.out.println("3. Play a media");
        System.out.println("4. See current cart");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.print("Please choose a number: 0-1-2-3-4: ");
    }

    // --- CÁC HÀM XỬ LÝ LOGIC ---

    public static void viewStore() {
        // In danh sách đồ trong Store
        for (Media m : store.getItemsInStore()) {
            System.out.println(m.toString());
        }
        
        storeMenu();
        int choice = scanner.nextInt();
        scanner.nextLine();
        
        if (choice == 1) {
            System.out.print("Enter title: ");
            String title = scanner.nextLine();
            // Logic tìm media và hiện detail...
        } else if (choice == 3) {
            System.out.print("Enter title to play: ");
            String title = scanner.nextLine();
            // Tìm sản phẩm và gọi hàm .play()
        }
    }

    public static void updateStore() {
        System.out.println("1. Add Media / 2. Remove Media");
        // Viết logic thêm/xóa khỏi Store ở đây
    }

    public static void seeCurrentCart() {
        cart.print(); // Giả sử bạn đã viết hàm print trong Cart
        // Hiện thêm Cart Menu (Filter, Sort, Play, Place order)
    }
}