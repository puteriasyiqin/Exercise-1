//Author: Puteri Asyiqin
public class Driver {

	public static void main(String [] arg) {
		//Fish actually is a data type
		//Fish nemo; == int x;
		//nemo adalah object, Fish adalah class
		Fish nemo = new Fish();  

		nemo.Swim();
		nemo.color = "red";  //tukar value
		nemo.Swim();

		Fish dory = new Fish();
		dory.Swim();
		dory.color = "orange";  //tukar value
		dory.Swim();
	}
}