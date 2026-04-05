import javax.swing.JOptionPane;

public class DoubleNumbersGUI {
    public static void main(String[] args) {

        String strA = JOptionPane.showInputDialog("Nhap so a:");
        String strB = JOptionPane.showInputDialog("Nhap so b:");

        double a = Double.parseDouble(strA);
        double b = Double.parseDouble(strB);

        double tong = a + b;
        double hieu = a - b;
        double tich = a * b;

        String result = "Tong = " + tong +
                        "\nHieu = " + hieu +
                        "\nTich = " + tich;

        if (b != 0) {
            double thuong = a / b;
            result += "\nThuong = " + thuong;
        } else {
            result += "\nKhong the chia cho 0";
        }

        JOptionPane.showMessageDialog(null, result);
    }
}