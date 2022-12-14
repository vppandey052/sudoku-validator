package sudoku;

import sudoku.field.SudokuCell;
import sudoku.field.structure.Blocks;
import sudoku.field.structure.Columns;
import sudoku.field.structure.Rows;
import sudoku.field.structure.SudokuGridInitializer;
import sudoku.field.structure.estimation.EstimationUpdater;
import sudoku.field.structure.validator.BlocksValidator;
import sudoku.field.structure.validator.ColumnsValidator;
import sudoku.field.structure.validator.RowsValidator;

/**
 * @author vinay.panday
 * @version 1.0
 */
public class SudokuGrid {

  private final SudokuCell[][] table;

  public SudokuGrid(final SudokuGridInitializer table) {
    this.table = table.getCells();

    updateEmptyCell();
  }

  private void updateEmptyCell() {
    boolean update = true;

    while (update) {
      update = new EstimationUpdater(new Rows(table).getListOfRow()).update();
      update |= new EstimationUpdater(new Columns(table).getListOfColumn()).update();
      update |= new EstimationUpdater(new Blocks(table).getBlocks()).update();
    }
  }

  public boolean validate() {
    return validateRows() && validateColumns() && validateBlocks();
  }

  private boolean validateRows() {
    return new RowsValidator(new Rows(table)).validate();
  }

  private boolean validateColumns() {
    return new ColumnsValidator(new Columns(table)).validate();
  }

  private boolean validateBlocks() {
    return new BlocksValidator(new Blocks(table)).validate();
  }
}
