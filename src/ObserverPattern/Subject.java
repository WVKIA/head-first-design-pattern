package ObserverPattern;
/**
 * ����ӿڣ���������۲���
 * @author wk
 *
 */
public interface Subject {

	/**
	 * ע��Ϊ�۲���
	 * @param o
	 */
	void registObserver(Observer o);
	/**
	 * ɾ���۲���
	 * @param o
	 */
	void removeObserver(Observer o);
	/**
	 * ������״̬�ı䣬���÷���֪ͨ���й۲���
	 */
	void notifyObservers();

}
