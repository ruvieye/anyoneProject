public abstract class AbstractDisplay {  // �߻� Ŭ���� AbstractDisplay
    public abstract void open();         // ���� Ŭ������ ������ �ñ�� �߻� �޼ҵ� (1) open
    public abstract void print();        // ���� Ŭ������ ������ �ñ�� �߻� �޼ҵ� (2) print
    public abstract void close();        // ���� Ŭ������ ������ �ñ�� �߻� �޼ҵ� (3) close
    public final void display() {        // �߻� Ŭ�������� �����ǰ� �ִ� �޼ҵ� display
        open();                      	 // �켱 open�ϰ�
        for (int i = 0; i < 5; i++) {    // 5�� print�� �ݺ��ϰ�
            print();                    
        }
        close();     // �� ���������� close�Ѵ�. �̰��� display �޼ҵ忡�� �����ǰ� �ִ� ����.
    }
}
