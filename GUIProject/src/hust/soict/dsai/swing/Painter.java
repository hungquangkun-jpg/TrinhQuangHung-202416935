package hust.soict.dsai.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Painter extends JFrame {
    private JPanel canvas;
    private JRadioButton radioButtonPen;
    private JRadioButton radioButtonEraser;

    public Painter() {
        Container cp = getContentPane();
        cp.setLayout(new BorderLayout());

        // 1. Tạo khu vực vẽ (Canvas) nằm ở giữa (CENTER)
        canvas = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                // Không xóa các hình cũ khi vẽ hình mới bằng cách bỏ super.paintComponent(g)
            }
        };
        canvas.setBackground(Color.WHITE);
        
        // Bắt sự kiện di chuột khi người dùng nhấn giữ và kéo (Mouse Dragged)
        canvas.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                Graphics g = canvas.getGraphics();
                
                // Kiểm tra xem người dùng đang chọn Pen hay Eraser
                if (radioButtonPen.isSelected()) {
                    g.setColor(Color.BLACK); // Vẽ màu đen
                    g.fillOval(e.getX(), e.getY(), 4, 4); // Chấm kích thước 4x4
                } else if (radioButtonEraser.isSelected()) {
                    g.setColor(Color.WHITE); // Xóa bằng cách tô màu trắng đè lên
                    g.fillOval(e.getX(), e.getY(), 16, 16); // Kích thước tẩy to hơn (16x16)
                }
            }
        });
        cp.add(canvas, BorderLayout.CENTER);

        // 2. Tạo thanh công cụ điều khiển (Control Panel) nằm ở bên trái (WEST)
        JPanel panelLeft = new JPanel();
        panelLeft.setLayout(new BoxLayout(panelLeft, BoxLayout.Y_AXIS));

        // Công cụ chọn chế độ Vẽ / Xóa (Yêu cầu nâng cao trong tài liệu)
        JPanel panelTool = new JPanel();
        panelTool.setBorder(BorderFactory.createTitledBorder("Tools"));
        panelTool.setLayout(new BoxLayout(panelTool, BoxLayout.Y_AXIS));

        radioButtonPen = new JRadioButton("Pen", true); // Mặc định chọn Pen
        radioButtonEraser = new JRadioButton("Eraser");

        // Gom nhóm 2 Radio Button để tại một thời điểm chỉ chọn được 1 trong 2
        ButtonGroup groupTools = new ButtonGroup();
        groupTools.add(radioButtonPen);
        groupTools.add(radioButtonEraser);

        panelTool.add(radioButtonPen);
        panelTool.add(radioButtonEraser);
        panelLeft.add(panelTool);

        // Nút bấm Clear để xóa toàn bộ màn hình vẽ
        JButton btnClear = new JButton("Clear");
        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                canvas.repaint(); // Vẽ lại giao diện trắng ban đầu
                
                // Mẹo nhỏ ép Canvas quét lại màu trắng ngay lập tức
                Graphics g = canvas.getGraphics();
                g.setColor(Color.WHITE);
                g.fillRect(0, 0, canvas.getWidth(), canvas.getHeight());
            }
        });
        panelLeft.add(btnClear);

        cp.add(panelLeft, BorderLayout.WEST);

        // Thiết lập thuộc tính cửa sổ
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Painter App");
        setSize(600, 400);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Painter();
    }
}
