package dtos;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ProductDTO implements Serializable {
    private Integer id;
    private String name;
    private Double price;
}
