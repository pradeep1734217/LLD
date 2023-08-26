package DecoratorDesignPattern;

public class Mushroom extends ToppingDecorator{

	BasePizza basePizza;
	
	public Mushroom(BasePizza pizza) {
		this.basePizza =  pizza;
	}
	@Override
	protected int cost() {
		return this.basePizza.cost()+15;
	}

}
