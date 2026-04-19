import javax.swing.JOptionPane;

public class LinearEquationGUI {
    public static void main(String[] args) {

        double a = Double.parseDouble(JOptionPane.showInputDialog("Nhap a:"));
        double b = Double.parseDouble(JOptionPane.showInputDialog("Nhap b:"));

        String result;

        if (a == 0) {
            if (b == 0) {
                result = "Vo so nghiem";
            } else {
                result = "Vo nghiem";
            }
        } else {
            double x = -b / a;
            result = "x = " + x;
        }

        JOptionPane.showMessageDialog(null, result);
    }
}