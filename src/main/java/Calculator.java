import javax.swing.*;
import java.awt.*;

public class Calculator extends JFrame {

    public Calculator() {

        setTitle("Калькулятор");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(200, 200, 250, 300);
//      ------------------------------------

        setLayout(new GridBagLayout());
        GridBagHelper helper = new GridBagHelper();
//      ------------------------------------
        ResultIInfo resultIInfo = new ResultIInfo();
        add(resultIInfo, helper.nextCell().fillHorizontally().span().gapRight(5).get());
        helper.nextRow().nextCell().nextCell().nextCell();
        add(new OperationButton(resultIInfo, "C"), helper.nextCell().gapTop(5).gapRight(5).get());
        helper.nextRow();
        add(new NumberButton(resultIInfo, "7"), helper.nextCell().gapTop(5).gapRight(5).get());
        add(new NumberButton(resultIInfo, "8"), helper.nextCell().gapTop(5).gapRight(5).get());
        add(new NumberButton(resultIInfo, "9"), helper.nextCell().gapTop(5).gapRight(5).get());
        add(new OperationButton(resultIInfo, "*"), helper.nextCell().gapTop(5).gapRight(5).get());
        helper.nextRow();
        add(new NumberButton(resultIInfo, "4"), helper.nextCell().gapRight(5).gapTop(5).get());
        add(new NumberButton(resultIInfo, "5"), helper.nextCell().gapRight(5).gapTop(5).get());
        add(new NumberButton(resultIInfo, "6"), helper.nextCell().gapRight(5).gapTop(5).get());
        add(new OperationButton(resultIInfo, "-"), helper.nextCell().gapRight(5).gapTop(5).get());
        helper.nextRow();
        add(new NumberButton(resultIInfo, "1"), helper.nextCell().gapRight(5).gapTop(5).get());
        add(new NumberButton(resultIInfo, "2"), helper.nextCell().gapRight(5).gapTop(5).get());
        add(new NumberButton(resultIInfo, "3"), helper.nextCell().gapRight(5).gapTop(5).get());
        add(new OperationButton(resultIInfo, "+"), helper.nextCell().gapRight(5).gapTop(5).get());
        helper.nextRow();
        add(new NumberButton(resultIInfo, "."), helper.nextCell().gapRight(5).gapTop(5).get());
        add(new NumberButton(resultIInfo, "0"), helper.nextCell().gapRight(5).gapTop(5).get());
        add(new OperationButton(resultIInfo, "/"), helper.nextCell().gapRight(5).gapTop(5).get());
        add(new OperationButton(resultIInfo, "="), helper.nextCell().gapRight(5).gapTop(5).get());

//        add(new NumberButton(resultIInfo, "/"), helper.nextCell().gapRight(5).gapTop(5).get());
        setVisible(true);
    }

    public static void main(String[] args) {
        new Calculator();
    }


}
