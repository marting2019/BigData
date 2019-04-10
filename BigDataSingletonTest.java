Pakage com.bigdata;

public class BigDataSingletonTest {

    public static void main(String[] args) {
        BigDataSingleton instanceOne = BigDataSingleton.getInstance();
        BigDataSingleton instanceTwo = null;
	
        try {
            Constructor[] constructors = BigDataSingleton.class.getDeclaredConstructors();
            for (Constructor constructor : constructors) {
                //reflection may breadk the sigleton
                constructor.setAccessible(true);
                instanceTwo = (BigDataSingleton) constructor.newInstance();
		
                break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(instanceOne.hashCode());
        System.out.println(instanceTwo.hashCode());
    }

}