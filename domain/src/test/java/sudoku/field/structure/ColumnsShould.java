package sudoku.field.structure;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.List;
import org.junit.Test;
import sudoku.field.SudokuCell;

/**
 * @author vinay.panday
 * @version 1.0
 */
public class ColumnsShould {

  @Test
  public void return_a_list_of_column_when_the_row_are_created_with_an_array_of_sudoku_cell() {
    // given
    Columns columns = new Columns(new SudokuCell[][]{{
        new SudokuCell(1), new SudokuCell(2), new SudokuCell(3),
        new SudokuCell(4), new SudokuCell(5), new SudokuCell(6),
        new SudokuCell(7), new SudokuCell(8), new SudokuCell(9)
    }, {
        new SudokuCell(2), new SudokuCell(3), new SudokuCell(4),
        new SudokuCell(5), new SudokuCell(6), new SudokuCell(7),
        new SudokuCell(8), new SudokuCell(9), new SudokuCell(1)
    }});

    // when
    List<SudokuCell[]> result = columns.getListOfColumn();

    // then
    List<SudokuCell[]> expectedListOfColumns = Arrays.asList(
        new SudokuCell[]{new SudokuCell(1), new SudokuCell(2)},
        new SudokuCell[]{new SudokuCell(2), new SudokuCell(3)},
        new SudokuCell[]{new SudokuCell(3), new SudokuCell(4)},
        new SudokuCell[]{new SudokuCell(4), new SudokuCell(5)},
        new SudokuCell[]{new SudokuCell(5), new SudokuCell(6)},
        new SudokuCell[]{new SudokuCell(6), new SudokuCell(7)},
        new SudokuCell[]{new SudokuCell(7), new SudokuCell(8)},
        new SudokuCell[]{new SudokuCell(8), new SudokuCell(9)},
        new SudokuCell[]{new SudokuCell(9), new SudokuCell(1)}
    );

    assertThat(result).containsExactlyElementsOf(expectedListOfColumns);
  }
}
