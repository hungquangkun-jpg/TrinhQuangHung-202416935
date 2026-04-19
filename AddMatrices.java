import javax.swing.JOptionPane;

public class AddMatrices {
    public static void main(String[] args) {

        int m = Integer.parseInt(JOptionPane.showInputDialog("Nhap so hang:"));
        int n = Integer.parseInt(JOptionPane.showInputDialog("Nhap so cot:"));

        int[][] A = new int[m][n];
        int[][] B = new int[m][n];
        int[][] C = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                A[i][j] = Integer.parseInt(JOptionPane.showInputDialog("A[" + i + "][" + j + "]"));
                B[i][j] = Integer.parseInt(JOptionPane.showInputDialog("B[" + i + "][" + j + "]"));
                C[i][j] = A[i][j] + B[i][j];
            }
        }

        String result = "Ma tran tong:\n";

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                result += C[i][j] + " ";
            }
            result += "\n";
        }

        JOptionPane.showMessageDialog(null, result);
    }
}