package anno.test;

import anno.aa.FruitColor;
import anno.aa.FruitName;
import anno.aa.FruitProvider;
import anno.entity.Apple;
import java.lang.reflect.Field;

public class TestAnno {

    /**
     * 单纯的解析注解里面的值
     * @param classz
     * @return
     */
    public static boolean isNotNull(Class<?>  classz){
        Field[] fields = classz.getDeclaredFields();
        String fruitName = "";
        for(Field f : fields){
            if(f.isAnnotationPresent(FruitName.class)){
                FruitName name = f.getAnnotation(FruitName.class);
                fruitName += name.value();
                System.out.println("fruitName="+fruitName);
            }
            if(f.isAnnotationPresent(FruitColor.class)){
                FruitColor name = f.getAnnotation(FruitColor.class);
                String fruitColorName = name.color();
                System.out.println("fruitColorName="+fruitColorName);
            }

            if(f.isAnnotationPresent(FruitProvider.class)){
                FruitProvider provider = f.getAnnotation(FruitProvider.class);
                String providerValue = provider.id()+"_"+provider.name()+"_"+provider.addredss();
                System.out.println("providerValue="+providerValue);
            }
        }
        return true;
    }

    public static void main(String[] arg0){
        TestAnno.isNotNull(Apple.class);
    }
}
