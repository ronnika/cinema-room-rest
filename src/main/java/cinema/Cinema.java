package cinema;

import java.util.ArrayList;
import java.util.List;

public class Cinema {
    private int total_rows;
    private int total_columns;
    private List<Seat> available_seats = new ArrayList<>();

    public Cinema(int totalRows, int totalCols) {
        this.total_rows = totalRows;
        this.total_columns = totalCols;
        for (int i = 0; i < totalRows; i++) {
            for (int j = 0; j < totalCols; j++) {
                available_seats.add(new Seat(i + 1, j + 1));
            }
        }
    }

    public int getTotal_rows() {
        return total_rows;
    }

    public int getTotal_columns() {
        return total_columns;
    }

    public List<Seat> getAvailable_seats() {
        return available_seats;
    }
}

