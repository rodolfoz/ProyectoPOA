import java.util.Random;


public class Animal extends Thread{
	private int hijoRand;
	protected float tiempoHijo;
	public Random random=new Random();
	
	public void muerte(float vida){
	//	if (vida <= 0)
//			Dispose();
	}
	

	public void tenerHijo(float hijoRand2){
		if (tiempoHijo >= hijoRand2) {
			hijoRand= random.nextInt(3);
			tiempoHijo=0;
			if(hijoRand==2){
			//	clone = (Instantiate (Hijo, transform.position, transform.rotation)) as GameObject;
			}
		}
	}
}
