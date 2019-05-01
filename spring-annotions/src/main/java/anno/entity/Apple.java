package anno.entity;

import com.anno.aa.FruitColor;
import com.anno.aa.FruitName;
import com.anno.aa.FruitProvider;
import com.anno.aa.Table;

@Table(tableName = "fruit_table")
public class Apple {

    @FruitName(value = "apple",appTest = "test")
    private String name;

    @FruitName(value = "apple1",appTest = "test1")
    @FruitColor(color="red")
    private String color;

    @FruitProvider(id=1,name="aa",addredss = "bbb")
    private String provider;
}
