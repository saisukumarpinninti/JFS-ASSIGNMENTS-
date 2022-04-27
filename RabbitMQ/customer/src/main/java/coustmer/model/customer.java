package coustmer.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class customer {

    private String costumerId;
    private String name;
    private int age;
    private String mobile_number;
}
