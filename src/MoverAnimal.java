import java.util.Random;


public class MoverAnimal extends Thread{
	private int direccion=0;
	private boolean mover=false;
	private float tiempoMov=0;
	private float tiempoMovimiento;
	private Random random = new Random();
	// Update is called once per frame

	void Run () {

		if (mover && tiempoMov<tiempoMovimiento) {
			tiempoMov++;
			switch(direccion){
/*arrriba*/	case 1: if(animal.position.y<1.3f)
				animal.position = new Vector3 (animal.position.x, animal.position.y + .01f, animal.position.z);
				break;
/*abajo*/	case 2: if(animal.position.y>-1.3f)
				animal.position = new Vector3 (animal.position.x, animal.position.y - .01f, animal.position.z);
				break;
/*izquierda*/case 3: if(animal.position.x>-3.2f)
					animal.position = new Vector3 (animal.position.x - .01f, animal.position.y, animal.position.z);
				break;
/*derecha*/	case 4: if(animal.position.x<3.2f)
				animal.position = new Vector3 (animal.position.x + .01f, animal.position.y, animal.position.z);
				break;
			}
		}
		if (tiempoMov >= tiempoMovimiento) {
			mover=false;
			tiempoMov=0;
		}
	}

	public  void moverAn(float tiempoMovimiento){
		this.tiempoMovimiento = tiempoMovimiento;
		mover = true;
		direccion=random.nextInt(5);
	}


	public int getDireccion(){
		return direccion;
	}

}
