package DecratorPattern;

/**
 * ���ڱ���װ�Ļ����齨�ӿڻ��߳����� Ϊ�˱�֤����װ�����װ�����������ͬ������
 * 
 * @author wk
 *
 */
public abstract class Beverage {
	String description = "unknown beverage";

	public String getDescription() {
		return this.description;
	}

	public abstract double cost();
}
