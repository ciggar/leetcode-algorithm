package face.classloader;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author: jia.xue
 * @create: 2020-03-17 16:19
 * @Description
 **/

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Car {

    Integer id;
    String brand;
    String color;
}