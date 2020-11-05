package ch14;

@FunctionalInterface
interface MyFunction2 {
	void myMethod();	//public abstract void myMethod();
}

public class LambdaEx2 {
	public static void main(String[] args) {
		MyFunction2 f = () -> {};	// MyFunction2 f = (MyFunction2)() -> {};
		Object obj = (MyFunction2)(() -> {});	// Object Ÿ������ ����ȯ�� ������
		String str = ((Object)(MyFunction2) (() -> {})).toString();
		
		System.out.println(f);
		System.out.println(obj);
		System.out.println(str);
		
//		System.out.println(() -> {});	//����. ���ٽ��� Object Ÿ������ ����ȯ �ȵ�
		System.out.println((MyFunction2) (() -> {}));
//		System.out.println((MyFunction2) (() -> {} ).toString());	//����
		System.out.println(((Object)(MyFunction2) (() -> {})).toString());
	}
}