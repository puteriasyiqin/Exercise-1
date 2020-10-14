//Author: Puteri Asyiqin
public class Fish {

	//attribute or data member or fields
	private String color = "blue";  //default values

	//method
	public void Swim () {
		System.out.println(color + " fish swim");
	}

	//Setter / Mutator method
	public void SetColor(String warna){
		color = warna;
	}

	//Getter / Accessor method
	public String GetColor() {
		return color;
	}
}