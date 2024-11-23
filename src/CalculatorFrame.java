import java.awt.*;
import java.awt.event.*;

class CalculatorFrame extends Frame implements ActionListener {
    CalculatorEngine engine;
    TextField display;
    WindowListener listener = new WindowAdapter() {
        public void windowClosing(WindowEvent e) {
            System.exit(0);
        }
    };

    CalculatorFrame(CalculatorEngine e) {
        super("Calculator");
        Panel top, bottom;
        Button b;

        engine = e;
        top = new Panel();
        top.add(display = new TextField(20));


        bottom = new Panel();
        bottom.setLayout(new GridLayout(5, 4));

        bottom.add(b = new Button("1"));
        b.addActionListener(this);
        bottom.add(b = new Button("2"));
        b.addActionListener(this);
        bottom.add(b = new Button("3"));
        b.addActionListener(this);
        bottom.add(b = new Button("+"));
        b.addActionListener(this);

        bottom.add(b = new Button("4"));
        b.addActionListener(this);
        bottom.add(b = new Button("5"));
        b.addActionListener(this);
        bottom.add(b = new Button("6"));
        b.addActionListener(this);
        bottom.add(b = new Button("-"));
        b.addActionListener(this);

        bottom.add(b = new Button("7"));
        b.addActionListener(this);
        bottom.add(b = new Button("8"));
        b.addActionListener(this);
        bottom.add(b = new Button("9"));
        b.addActionListener(this);
        bottom.add(b = new Button("*"));
        b.addActionListener(this);

        bottom.add(b = new Button("C"));
        b.addActionListener(this);
        bottom.add(b = new Button("0"));
        b.addActionListener(this);
        bottom.add(b = new Button("="));
        b.addActionListener(this);
        bottom.add(b = new Button("/"));
        b.addActionListener(this);

        // Tambah tombol untuk squareOf (^2) dan factorial (!)
        bottom.add(b = new Button("^2"));
        b.addActionListener(this);
        bottom.add(b = new Button("!"));
        b.addActionListener(this);

        setLayout(new BorderLayout());
        add("North", top);
        add("South", bottom);
        addWindowListener(listener);
        setSize(200, 200);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        if (command.equals("+")) engine.add();
        else if (command.equals("-")) engine.subtract();
        else if (command.equals("*")) engine.multiply();
        else if (command.equals("/")) engine.divide();
        else if (command.equals("^2")) engine.squareOf();
        else if (command.equals("!")) engine.factorial();
        else if (command.equals("=")) engine.compute();
        else if (command.equals("C")) engine.clear();
        else {
            try {
                int digit = Integer.parseInt(command);
                engine.digit(digit);
            } catch (NumberFormatException ex) {
                display.setText("Error");
            }
        }
        display.setText(Integer.toString(engine.display()));
    }

    public static void main(String arg[]) {
        new CalculatorFrame(new CalculatorEngine());
    }
}
