import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OperationButton extends JButton {

    private final ResultIInfo resultIInfo;
    private static final Font font = new Font("Arial", Font.BOLD, 18);

    public OperationButton(ResultIInfo resultIInfo, String textButton) {
        super();
        this.resultIInfo = resultIInfo;
        this.setText(textButton);
        this.setFont(font);
        this.addActionListener(new putSymbolActionListener(this));
    }

    public class putSymbolActionListener implements ActionListener {
        private final JButton button;

        public putSymbolActionListener(JButton button) {
            this.button = button;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if (button.getText().equals("C")) {
                resultIInfo.setText("");
            } else if (button.getText().equals("=")) {
                resultIInfo.setText(Calculation.calc(resultIInfo.getText()));
            } else {
                String example = resultIInfo.getText();
                if (example == null || example.length() == 0) {
                    return;
                }
                for (char o : new char[]{'+', '-', '/', '*'}) {
                    if (example.indexOf(o) > 0) {
                        return;
                    }
                }
                resultIInfo.setText(resultIInfo.getText() + button.getText());
            }
        }
    }

}
