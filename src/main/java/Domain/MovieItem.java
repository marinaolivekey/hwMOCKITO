package Domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class MovieItem {
    private int id;
    private int movieId;
    private String movieName;
    private int year;

}
