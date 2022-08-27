package Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Hamster implements Serializable {

    private static final long serialVersionUID = -7817224776021728682L;

    private Integer hamId;
    private String hamsterName;
    private Double hamsterWeight;

}