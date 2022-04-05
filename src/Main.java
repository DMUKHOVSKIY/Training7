public class Main {
    public static void main(String[] args) {
        Car car = new Car("Mercedes", 360,120000);
        try{
            car.start();
        } catch (MyException e) {
            System.out.println("Exception!");
        }
        try{
            car.start();
        } catch (MyException e) {
            System.out.println("Exception!");
        }
         try{
            car.start();
        } catch (MyException e) {
            System.out.println("Exception!");
        }
         try{
            car.start();
        } catch (MyException e) {
            System.out.println("Exception!");
        }
         try{
            car.start();
        } catch (MyException e) {
            System.out.println("Exception!");
        }


    }
}
