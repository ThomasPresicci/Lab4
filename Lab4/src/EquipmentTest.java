/**
 * Testing Equipment class
 *
 * @author Thomas Presicci
 * @version 2019-02-12
 */
public class EquipmentTest
{
	public void constructorTest() throws AssertException
	{
		Equipment equipment = new Equipment("Batarang/5,5.0,5.0,A boomerang for bats");
	
		Assert.assertTrue(equipment.getName().equals("Batarang"));
		Assert.assertTrue(equipment.getCount() == 5);
		Assert.assertEquals(5.0, equipment.getTotalWeight(), 0.01);
		Assert.assertEquals(5.0, equipment.getTotalPrice(), 0.01);
		Assert.assertTrue(equipment.getDescription().equals("A boomerang for bats"));
	}
	
	public void equalsTest() throws AssertException
	{
		Equipment equipment = new Equipment("Batarang/5,5.0,5.0,A boomerang for bats");
		Equipment equipment1 = new Equipment("Batarang/5,5.0,5.0,A boomerang for bats");
		
		Equipment equipment2 = new Equipment("Bat Bow/5,5.0,4.0,A boomerang for bats");
		Equipment equipment3 = new Equipment("Batarang/6,2.0,5.0,A boomerang for bats");
		
		Assert.assertTrue(equipment.equals(equipment1));
		Assert.assertTrue(equipment.equals(equipment2));
		Assert.assertTrue(equipment.equals(equipment3));
		
		Assert.assertTrue(equipment2.equals(equipment3));
	}
	
	public void toStringTest() throws AssertException
	{
		Equipment equipment = new Equipment("Batarang/5,5.0,5.0,A boomerang for bats");
		
		Assert.assertEquals(String.format("Name: %s, Number: %d, Weight: %.2f lbs, Price: $%.2f - %s",
                "Batarang", 5, 5.0, 5.0, "A boomerang for bats"), equipment.toString());
	}
}