package Singleton;

public class SingletonSaticInnerClass {

  private SingletonSaticInnerClass(){}


  private static class Singleton {

      private static Singleton instance = new Singleton();


  }

  public static Singleton getInstance() {

    return Singleton.instance;

  }


}
