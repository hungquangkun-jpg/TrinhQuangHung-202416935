import javax.swing.JOptionPane;

public class Triangle {
    public static void main(String[] args) {

        int n = Integer.parseInt(JOptionPane.showInputDialog("Nhap so hang:"));

        String result = "";

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                result += "*";
            }
            result += "\n";
        }

        JOptionPane.showMessageDialog(null, result);
    }
}