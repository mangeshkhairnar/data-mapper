import java.util.Map;

public class DataMapper {
    public <T> T map(Object source, Class<T> clazz) {
        if(source != null) {
            //make instance of clazz
            T target = null;
            try {
                target = clazz.newInstance();
            } catch (InstantiationException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
            //map source to target
            return target;

        }
        return null;
    }

    public  <T> T map(Object source, Class<T> clazz, Map<String, String> config) {
        if(source != null) {
            //make instance of clazz
            T target = null;
            try {
                target = clazz.newInstance();
            } catch (InstantiationException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
            //map source to target
            return target;

        }
        return null;
    }


}
