import javax.swing.JOptionPane;

public class DaysInMonth {
    public static void main(String[] args) {
        try {
            int month = Integer.parseInt(JOptionPane.showInputDialog("Nhap thang:"));
            int year = Integer.parseInt(JOptionPane.showInputDialog("Nhap nam:"));

            if (month < 1 || month > 12) {
                JOptionPane.showMessageDialog(null, "Thang khong hop le");
                return;
            }

            int days;

            switch (month) {
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    days = 31;
                    break;
                case 4: case 6: case 9: case 11:
                    days = 30;
                    break;
                case 2:
                    if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
                        days = 29;
                    else
                        days = 28;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Thang khong hop le");
                    return;
            }

            JOptionPane.showMessageDialog(null, "So ngay: " + days);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Nhap sai du lieu!");
        }
    }
}