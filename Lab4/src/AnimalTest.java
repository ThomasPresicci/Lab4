/**
 * Testing class for Product object
 *
 * @author Stephen Thung, references previous code from Dr.Fagg, Taner Davis
 * @version 2018-08-25
 */
public class AnimalTest
{

    /**
     * Test the empty Animal constructor and the getters
     */
    public void emptyConstructorTest() throws AssertException
    {
        // Use the default constructor
        Animal animal = new Animal();

        // The name should be "noname", color "unknown", height and weight 0.
        Assert.assertEquals("unknown", animal.getColor());
        Assert.assertEquals("noname", animal.getName());
        Assert.assertEquals(0, animal.getHeight(), 0.01);
        Assert.assertEquals(0, animal.getWeight(), 0.01);
    }

    // TODO: test full constructor, getters, and toString
    public void fullConstructorTest() throws AssertException
    {
    	String color1 = "Purple";
    	String name1 = "Zebra";
    	Double weight1 = 200.00;
    	Double height1 = 2.00;
    	
    	String color2 = "Yellow";
    	String name2 = "Dog";
    	Double weight2 = 50.00;
    	Double height2 = 1.00;
    	
    	String color3 = "Green";
    	String name3 = "Rhino";
    	Double weight3 = 600.00;
    	Double height3 = 4.00;
    	
    	//String color, String name, double weight, double height
    	Animal animal1 = new Animal(color1, name1, weight1, height1);
    	Animal animal2 = new Animal(color2, name2, weight2, height2);
    	Animal animal3 = new Animal(color3, name3, weight3, height3);
    	
    	Assert.assertTrue(animal1.getColor().equals(color1));
    	Assert.assertTrue(animal1.getName().equals(name1));
    	Assert.assertEquals(weight1, animal1.getWeight(), 0.01);
    	Assert.assertEquals(height1, animal1.getHeight(), 0.01);
    	
    	Assert.assertTrue(animal2.getColor().equals(color2));
    	Assert.assertTrue(animal2.getName().equals(name2));
    	Assert.assertEquals(weight2, animal2.getWeight(), 0.01);
    	Assert.assertEquals(height2, animal2.getHeight(), 0.01);
    	
    	Assert.assertTrue(animal3.getColor().equals(color3));
    	Assert.assertTrue(animal3.getName().equals(name3));
    	Assert.assertEquals(weight3, animal3.getWeight(), 0.01);
    	Assert.assertEquals(height3, animal3.getHeight(), 0.01);
    }
    
	public void equalsTest() throws AssertException
	{
    	String color1 = "Purple";
    	String name1 = "Zebra";
    	Double weight1 = 200.00;
    	Double height1 = 2.00;
    	
    	String color2 = "Yellow";
    	String name2 = "Dog";
    	Double weight2 = 50.00;
    	Double height2 = 1.00;
    	
    	String color3 = "Purple";
    	String name3 = "Zebra";
    	Double weight3 = 200.00;
    	Double height3 = 2.00;
    	
    	Animal animal1 = new Animal(color1, name1, weight1, height1);
    	Animal animal2 = new Animal(color2, name2, weight2, height2);
    	Animal animal3 = new Animal(color3, name3, weight3, height3);
		
		Assert.assertFalse(animal1.equals(animal2));
		Assert.assertFalse(animal3.equals(animal2));
		Assert.assertTrue(animal1.equals(animal3));
	}
    
    public void toStringTest() throws AssertException
    {
    	String color = "Purple";
    	String name = "Zebra";
    	Double weight = 200.00;
    	Double height = 2.00;
    	
    	Animal animal = new Animal(color, name, weight, height);
    	
    	Assert.assertEquals(String.format("%s, a %s-colored animal. %.1f pounds, %.1f inches\n",
                name, color, weight, height), animal.toString());
    }
}

