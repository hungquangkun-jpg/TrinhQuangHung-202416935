package hust.soict.dsai.aims.store;
import java.util.ArrayList;
import hust.soict.dsai.aims.media.Media;

public class Store {
    private ArrayList<Media> itemsInStore = new ArrayList<Media>();

    public void addMedia(Media media) {
        if (!itemsInStore.contains(media)) {
            itemsInStore.add(media);
            System.out.println("Sản phẩm " + media.getTitle() + " đã được thêm vào cửa hàng.");
        }
    }

    public void removeMedia(Media media) {
        if (itemsInStore.remove(media)) {
            System.out.println("Đã xóa sản phẩm " + media.getTitle() + " khỏi cửa hàng.");
        } else {
            System.out.println("Không tìm thấy sản phẩm.");
        }
    }

    public ArrayList<Media> getItemsInStore() {
        return itemsInStore;
    }
}