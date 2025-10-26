public class Example {
    public static void main(String[] args)
     {
         int a=10;
         String name="Ankita";
            System.out.println("Hello, World! " + name + " " + a);
            System.out.println("This is an example file.");
            int b =20;
            System.out.println("The value of b is: " + b);
    }

    public int newNumber(int number) {
        System.out.println("This is a new method,we will add new number to it");
        number += 10;
        return number;
    }


     public void newFeature() {
        System.out.println("This is a new feature added to the class.");
        System.out.println("fetaure b");
}
static void sampleStaticMethod() {
        System.out.println("This is a static method added to the class.");
    } 

}
