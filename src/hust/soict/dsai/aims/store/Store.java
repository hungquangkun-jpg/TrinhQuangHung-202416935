package hust.soict.dsai.aims.store;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Store {
    // Mảng chứa các đĩa có trong cửa hàng (giả sử tối đa 100 đĩa)
    private DigitalVideoDisc itemsInStore[] = new DigitalVideoDisc[100];
    private int qtyInStore = 0;

    // Phương thức thêm DVD vào kho của cửa hàng
    public void addDVD(DigitalVideoDisc dvd) {
        if (qtyInStore < itemsInStore.length) {
            itemsInStore[qtyInStore] = dvd;
            qtyInStore++;
            System.out.println("DVD " + dvd.getTitle() + " đã được thêm vào cửa hàng.");
        } else {
            System.out.println("Kho hàng đã đầy!");
        }
    }

    // Phương thức xóa DVD khỏi kho
    public void removeDVD(DigitalVideoDisc dvd) {
        for (int i = 0; i < qtyInStore; i++) {
            if (itemsInStore[i] == dvd) {
                for (int j = i; j < qtyInStore - 1; j++) {
                    itemsInStore[j] = itemsInStore[j + 1];
                }
                itemsInStore[qtyInStore - 1] = null;
                qtyInStore--;
                System.out.println("DVD " + dvd.getTitle() + " đã được xóa khỏi cửa hàng.");
                return;
            }
        }
        System.out.println("Không tìm thấy DVD này trong cửa hàng!");
    }
}