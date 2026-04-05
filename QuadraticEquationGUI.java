import javax.swing.JOptionPane;

public class QuadraticEquationGUI {
    public static void main(String[] args) {

        double a = Double.parseDouble(JOptionPane.showInputDialog("Nhap a:"));
        double b = Double.parseDouble(JOptionPane.showInputDialog("Nhap b:"));
        double c = Double.parseDouble(JOptionPane.showInputDialog("Nhap c:"));

        String result;

        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    result = "Vo so nghiem";
                } else {
                    result = "Vo nghiem";
                }
            } else {
                double x = -c / b;
                result = "x = " + x;
            }
        } else {
            double delta = b * b - 4 * a * c;

            if (delta < 0) {
                result = "Vo nghiem";
            } else if (delta == 0) {
                double x = -b / (2 * a);
                result = "Nghiem kep x = " + x;
            } else {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                result = "x1 = " + x1 + "\nx2 = " + x2;
            }
        }

        JOptionPane.showMessageDialog(null, result);
    }
}