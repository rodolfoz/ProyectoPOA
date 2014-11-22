
public class Gallina extends Animal{
	Posicion posicion = null;
	private float tiempoMover=0,
			  tiempoMoverRand=0,
			  tiempoMovimiento,
			  tiempoVida=0,
			  vidaGallina=100f,
		      hijoRand2;


	private int direccion=0;
	private BarraVida vidaBar;
	private MoverAnimal movAnimal;
	
	public Gallina(){
		hijoRand2 = random.nextInt(30)+35;
	}
	
	public void run(){
		while(true){
			tiempoHijo++;
			moverGallina ();
			reducirVida ();
			tenerHijo (hijoRand2);
			muerte (vidaGallina);
		}
	}
	void moverGallina(){
		tiempoMover++;
		if (tiempoMover >= tiempoMovimiento) {
		
		}
		tiempoMoverRand = random.nextInt(7);
		if (tiempoMover >= 2+tiempoMoverRand) {
			tiempoMovimiento = random.nextFloat();
			movAnimal.moverAn (tiempoMovimiento);
			tiempoMover=0;
			direccion=movAnimal.getDireccion();
		}


	}



	void reducirVida(){
		tiempoVida++;
		if (tiempoVida >= 1f) {
			vidaGallina -= 1.0f;
			vidaBar.pintarVida(vidaGallina);
			tiempoVida=0;
		}
	}
}
