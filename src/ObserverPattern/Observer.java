package ObserverPattern;

/**
 * ���й۲��߱���ʵ��Observer�ӿ�
 * 
 * @author wk
 *
 */
public interface Observer {
	/**
	 * ��ֵ����ʱ����������Щ״ֵ̬���������Ĳ��������ݸ��۲���
	 * 
	 * @param tempe
	 * @param pressure
	 */
	void update(float tempe, float pressure);
}
