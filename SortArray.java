import javax.swing.JOptionPane;
import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {

        int n = Integer.parseInt(JOptionPane.showInputDialog("Nhap so phan tu:"));

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(JOptionPane.showInputDialog("Nhap phan tu " + i + ":"));
        }

        Arrays.sort(arr);

        String result = "Mang sau khi sap xep:\n";

        for (int i = 0; i < n; i++) {
            result += arr[i] + " ";
        }

        JOptionPane.showMessageDialog(null, result);
    }
}