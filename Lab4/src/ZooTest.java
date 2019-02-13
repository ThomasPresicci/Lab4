/**
 * Testing Zoo class
 *
 * @author Thomas Presicci
 * @version 2019-02-12
 */
public class ZooTest
{
	
	public void constructorTest() throws AssertException
    {
    	Zoo zoo = new Zoo(10);
    	
    	Assert.assertTrue(zoo.getCapacity() == 10);
    	Assert.assertTrue(zoo.getAnimals().length == 10);
    }
	
	public void addAnimalTest() throws AssertException
    {
		Zoo zoo = new Zoo(10);
		Animal animal1 = new Animal("Green", "Chester", 350.0, 40);
		Animal animal2 = new Animal("Orange", "Tony", 200.5, 15);
    	
    	zoo.addAnimal(animal1);
    	zoo.addAnimal(animal2);
    	Assert.assertTrue(zoo.getAnimals()[0].equals(animal1));
    	Assert.assertTrue(zoo.getAnimals()[1].equals(animal2));
    }
	
	public void extendTest() throws AssertException
	{
		Zoo zoo = new Zoo(1);
		
		Assert.assertTrue(zoo.getCapacity() == 1);
		zoo.addAnimal(new Animal());
		zoo.addAnimal(new Animal());
		Assert.assertTrue(zoo.getCapacity() == 2);
	}
	
	public void totalHeightTest() throws AssertException
    {
		Zoo zoo = new Zoo(10);
		Animal animal1 = new Animal("Green", "Chester", 350.0, 40);
	    Animal animal2 = new Animal("Orange", "Tony", 200.5, 15);
	    
	    zoo.addAnimal(animal1);
	    zoo.addAnimal(animal2);
	    
	    Assert.assertEquals(animal1.getHeight() + animal2.getHeight(), zoo.getTotalHeight(), 0.01);
    }
	
	public void averageWeightTest() throws AssertException
    {
		Zoo zoo = new Zoo(10);
		Animal animal1 = new Animal("Green", "Chester", 350.0, 40);
	    Animal animal2 = new Animal("Orange", "Tony", 200.5, 15);
	    
	    zoo.addAnimal(animal1);
	    zoo.addAnimal(animal2);
	    
	    Assert.assertEquals((int)(animal1.getWeight() + animal2.getWeight())/2, zoo.getAverageWeight(), 0.01);
    }
	
	public void averageWeightColorTest() throws AssertException
    {
    	
		Zoo zoo = new Zoo(10);
		Animal animal1 = new Animal("Green", "Chester", 350.0, 40);
	    Animal animal2 = new Animal("Orange", "Tony", 200.5, 15);
	    Animal animal3 = new Animal("Green", "Chestery", 250.0, 50);
	    
	    zoo.addAnimal(animal1);
	    zoo.addAnimal(animal2);
	    zoo.addAnimal(animal3);
	    
	    Assert.assertEquals((int)(animal1.getWeight() + animal3.getWeight())/2, zoo.getAverageWeight("Green"), 0.01);
    }

    public void toStringTest() throws AssertException
    {
    	Zoo zoo = new Zoo(10);
		Animal animal1 = new Animal("Green", "Chester", 350.0, 40);
	    Animal animal2 = new Animal("Orange", "Tony", 200.5, 15);
	    Animal animal3 = new Animal("Green", "Chestery", 250.0, 50);
	    
	    zoo.addAnimal(animal1);
	    zoo.addAnimal(animal2);
	    zoo.addAnimal(animal3);
	    
	    Assert.assertEquals("These animals live in the zoo: \n" + animal1.toString() + ""
	    	+ animal2.toString() + "" + animal3.toString(), zoo.toString());
    }
}

