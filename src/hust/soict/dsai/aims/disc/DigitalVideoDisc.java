package hust.soict.dsai.aims.disc;

public class DigitalVideoDisc {
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;

    // --- PHẦN THÊM MỚI CHO LAB 03 ---
    // Biến static thuộc về lớp, dùng chung cho mọi đối tượng để đếm số lượng
    private static int nbDigitalVideoDiscs = 0;
    // Biến id riêng của từng đối tượng
    private int id;
    // --------------------------------

    // Constructor đầy đủ tham số
    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
        
        // Tự động tăng ID mỗi khi Constructor này được gọi
        nbDigitalVideoDiscs++;
        this.id = nbDigitalVideoDiscs;
    }

    // Constructor theo tiêu đề (nếu bạn cần dùng)
    public DigitalVideoDisc(String title) {
        this.title = title;
        nbDigitalVideoDiscs++;
        this.id = nbDigitalVideoDiscs;
    }

    // Các Getter
    public String getTitle() { return title; }
    public String getCategory() { return category; }
    public String getDirector() { return director; }
    public int getLength() { return length; }
    public float getCost() { return cost; }
    
    // Đừng quên thêm Getter cho ID
    public int getId() { return id; }
}