package kervie;

public class App {

	public static void main(String[] args) {
		
	      Weapon gun = new Weapon();

	        gun.name = "Kervie's Engine";
	        gun.damage = 80;
	        gun.rarity = "Rare";
	        gun.addDamage(80);
	        System.out.println(gun.showWeaponNameAndRarity());

	        character barbarian = new character ();

	        barbarian.name = "Kervie";
	        barbarian.sayMyName();
	        barbarian.attack();

	       
	    }
	

	}


