package sudoku.field.structure;

import java.util.Arrays;
import sudoku.field.SudokuCell;

/**
 * @author vinay.panday
 * @version 1.0
 */
public class SudokuGridInitializer {

  private static final int MAX_SIZE = 9;
  private final SudokuCell[][] cells;

  public SudokuGridInitializer(final Integer[][] cells) {
    if (cells.length == 0) {
      throw new IllegalArgumentException("The table is empty");
    }

    if (cells.length != MAX_SIZE) {
      throw new IllegalArgumentException("The table must have a length of 9");
    }

    if (cells[0].length != MAX_SIZE) {
      throw new IllegalArgumentException("The table must have a height of 9");
    }

    this.cells = Arrays.stream(cells)
        .map(row -> Arrays.stream(row).map(SudokuCell::new).toArray(SudokuCell[]::new))
        .toArray(SudokuCell[][]::new);
  }

  public SudokuCell[][] getCells() {
    return cells.clone();
  }
}
