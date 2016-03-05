public class StringDisplay extends AbstractDisplay {    // StringDisplay�� 
// AbstrctDisplay�� ���� Ŭ����.
    private String string;                            // ǥ���ؾ� �� ���ڿ�.
    private int width;                              // ����Ʈ ������ ����� ���ڿ��� ������.
    public StringDisplay(String string) {               // �����ڿ��� ���޵� ���ڿ� string��
        this.string = string;                           // �ʵ忡 ���.
        this.width = string.getBytes().length;          // �׸��� ����Ʈ ������ ���� �ʵ忡
							// ����� �ΰ� ���߿� ����Ѵ�.
    }
    public void open() {                             // �������̵��ؼ� ������ open �޼ҵ�.
        printLine();                                 // �� Ŭ������ �޼ҵ� printLine����
                                                     // ���� �׸��� �ִ�.
    }
    public void print() {                               // print �޼ҵ��
        System.out.println(��|�� + string + ��|��);     // �ʵ忡 ����� �� ���ڿ���
   							// ���Ŀ� ��|���� �ٿ��� ǥ��.
    }
    public void close() {                               // close �޼ҵ��
        printLine();                                    // open ó�� printLine �޼ҵ忡��
                                                       // ���� �׸��� �ִ�.
    }
    private void printLine() {                  // open�� close���� ȣ��� printLine �޼ҵ��̴�.
 						// private�̱� ������ �� Ŭ���� �ȿ����� ���ȴ�.
        System.out.print(��+��);                // �׵θ��� �𼭸��� ǥ���ϴ¡�+�� ��ũ�� ǥ��.
        for (int i = 0; i < width; i++) {       // width���� ��-���� ǥ���ϰ�
            System.out.print(��-��);            // �׵θ� ������ �̿��Ѵ�.
        }
        System.out.println(��+��);              // �׵θ��� �𼭸��� ǥ���ϴ� ��+�� ��ũ�� ǥ��.
    }
}
