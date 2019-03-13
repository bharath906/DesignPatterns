package Singleton;

public class SingletonTest {

  public static void main(String args[]) {
   //Static Inner class singleton
   System.out.println(SingletonSaticInnerClass.getInstance());
   System.out.println(SingletonSaticInnerClass.getInstance());
   // Singleton ENUM
   System.out.println(SingletonEnum.Insatance.hashCode());
   System.out.println(SingletonEnum.Insatance.hashCode());

  }
}
