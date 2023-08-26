package DecoratorDesignPattern;

public class Client {

	public static void main(String[] args) {
		BasePizza basePizza = new Margharita();
		//margharita cost
		System.out.println("Margharita cost "+basePizza.cost());
		BasePizza pizza= new ExtraCheese(new Margharita());
		System.out.println("margharita + extracheese cost "+pizza.cost());
		BasePizza pizza1 =new Mushroom(new ExtraCheese(new Margharita()));
		System.out.println("margharita + extracheese +mushroom cost "+pizza1.cost());
		}
}
