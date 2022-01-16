import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NumberButton extends JButton {

    public static final String COMMA = ".";
    private final ResultIInfo resultIInfo;
    private static final Font font = new Font("Arial", Font.BOLD, 18);

    public NumberButton(ResultIInfo resultIInfo, String text) {
        super();
        this.resultIInfo = resultIInfo;
        this.setText(text);
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
            if (button.getText().equals(COMMA)) {
                if (resultIInfo.getText().lastIndexOf(COMMA) == resultIInfo.getText().length() - 1) {
                    return;
                }
            }
            resultIInfo.setText(resultIInfo.getText() + button.getText());
        }
    }
}

