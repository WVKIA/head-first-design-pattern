package ObserverPattern;

/**
 * currentCondition�۲��� ʵ��observer�۲��߽ӿ�
 * 
 * @author wk
 *
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {
	private float tempe;
	private float pressure;
	// ����һ�����������
	private Subject weatherData;

	public CurrentConditionsDisplay(Subject weatherData) {
		// TODO Auto-generated constructor stub
		this.weatherData = weatherData;
		// ���Լ�ע���ȥ
		weatherData.registObserver(this);
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Current conditions : " + tempe + " degrees and pressure :" + pressure);
	}

	@Override
	public void update(float tempe, float pressure) {
		// TODO Auto-generated method stub
		this.tempe = tempe;
		this.pressure = pressure;
		display();
	}

}
