public class CharDisplay extends AbstractDisplay {  // CharDisplay�� AbstractDisplay�� 
// ���� Ŭ����.
    private char ch;                              // ǥ���ؾ� �� ����
    public CharDisplay(char ch) {                  // �����ڿ��� ���޵� ���� ch��
        this.ch = ch;                             // �ʵ忡 ����� �д�.
    }
    public void open() {                            // ���� Ŭ���������� �߻� �޼ҵ忴��.
						  // ���⿡�� �������̵��ؼ� ����.
        System.out.print(��<<��);                     // ���� ���ڿ���<<���� ǥ���Ѵ�.
    }
    public void print() {                           // print �޼ҵ嵵 ���⿡�� �����Ѵ�.
// �̰��� display���� �ݺ��ؼ� ȣ��ȴ�.
        System.out.print(ch);                      // �ʵ忡 ����� �� ���ڸ� 1�� ǥ���Ѵ�.
    }
    public void close() {                           // close �޼ҵ嵵 ���⿡�� ����.
        System.out.println(��>>��);                   // ���� ���ڿ� ��>>���� ǥ��.
    }
}
