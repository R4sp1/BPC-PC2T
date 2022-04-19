import javax.swing.*;
import java.awt.*;

public class App extends JFrame {
    App() {
        setSize(225, 400);
        setTitle("CalcTheShitOfIt");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton button;
        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(3, 3));
        for (int i = 0; i < 10; i++) {
            button = new JButton(Integer.toString(i));
            final int buttonNum = i;
            button.addActionListener(e -> setNum(buttonNum));
            p1.add(button);
        }

        button = new JButton("+");
        button.addActionListener(e -> mathOperation(true));
        p1.add(button);

        button = new JButton("-");
        button.addActionListener(e -> mathOperation(false));
        p1.add(button);

        button = new JButton("=");
        button.addActionListener(e -> doMathOperation());
        p1.add(button);

        label = new JLabel("0");
        label.setHorizontalAlignment(SwingConstants.RIGHT);
        setLayout(new BorderLayout());
        getContentPane().add(label, BorderLayout.NORTH);
        getContentPane().add(p1, BorderLayout.CENTER);
        getContentPane().add(button, BorderLayout.SOUTH);
        text = "";
        setVisible(true);
    }

    public static void main(String[] args) {
        new App();
    }


    public void mathOperation(boolean type) {
        if (!operation) {
            operation = true;
            add = type;
            if (add)
                text += "+";
            else
                text += "-";
            label.setText(text);
        }
    }

    public void doMathOperation() {
        int result;
        if (add)
            result = a + b;
        else
            result = -b;
        text = Integer.toString(result);
        label.setText(text);
        delete = true;
        operation = true;
    }

    public void setNum(int number) {
        if (delete) {
            a = 0;
            b = 0;
            text = "";
            delete = false;
            operation = false;
        }
        if (operation) {
            b *= 10;
            b += number;
        } else {
            a *= 10;
            a += number;
        }
        text += number;
        label.setText(text);
    }

    private final JLabel label;
    private boolean delete = true;
    private boolean add = true;
    private boolean operation = true;
    private int a = 0;
    private int b = 0;
    private String text;
}
