public class Main {
    public static void main(String[] args) {
	// 'H'�� ���� CharDisplay �ν��Ͻ��� 1�� �����>
        AbstractDisplay d1 = new CharDisplay('H');
	// ��Hello, world.���� ���� StringDisplay�� �ν��Ͻ��� 1�� �����.
        AbstractDisplay d2 = new StringDisplay(��Hello, world.��);
    	// ���ȳ��ϼ���.���� ���� StringDisplay�� �ν��Ͻ��� 1�� �����.
        AbstractDisplay d3 = new StringDisplay(���ȳ��ϼ���.��);
        d1.display();   // d1, d2, d3 ��� AbstractDisplay�� ����Ŭ������ �ν��Ͻ��̱� ������
        d2.display();   // ����� display�޼ҵ带 ȣ���� �� �ִ�.
        d3.display();   // ���� ������ CharDisplay�� StringDisplay���� �����Ѵ�.
    }
}
