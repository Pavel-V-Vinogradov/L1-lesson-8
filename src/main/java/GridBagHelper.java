import java.awt.*;

public class GridBagHelper {

    // координаты текущей ячейки
    private int gridx, gridy;
    // настраиваемый объект GridBagConstraints
    private GridBagConstraints constraints;

    // возвращает настроенный объект GridBagConstraints
    public GridBagConstraints get() {
        return constraints;
    }

    // двигается на следующую ячейку
    public GridBagHelper nextCell() {
        constraints = new GridBagConstraints();
        constraints.gridx = gridx++;
        constraints.gridy = gridy;
        // для удобства возвращаем себя
        return this;
    }

    // двигается на следующий ряд
    public GridBagHelper nextRow() {
        gridy++;
        gridx = 0;
        constraints.gridx = 0;
        constraints.gridy = gridy;
        return this;
    }

    // раздвигает ячейку до конца строки
    public GridBagHelper span() {
        constraints.gridwidth = GridBagConstraints.REMAINDER;
        return this;
    }

    // заполняет ячейку по горизонтали
    public GridBagHelper fillHorizontally() {
        constraints.fill = GridBagConstraints.HORIZONTAL;
        return this;
    }

    // вставляет распорку справа
    public GridBagHelper gapRight(int size) {
        constraints.insets.right = size;
        return this;
    }

    public GridBagHelper gapTop(int size) {
        constraints.insets.top = size;
        return this;
    }

}