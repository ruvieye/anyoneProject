package pattern.Bridge.A1;

public class StringDisplayImpl extends DisplayImpl {
    private String string;                            // ǥ���ؾ� �� ���ڿ�.
    private int width;                               // ����Ʈ ������ ����� ���ڿ��� �����̡�.
    public StringDisplayImpl(String string) {           // �����ڿ��� ���޵� ���ڿ� string��
        this.string = string;                         // �ʵ忡 ����صд�.
        this.width = string.getBytes().length;         // �׸��� ����Ʈ ������ ���̵� �ʵ忡 ����صΰ� ���߿� ����Ѵ�*.
    }
    public void rawOpen() {
        printLine();
    }
    public void rawPrint() {
        System.out.println("|" + string + "|");     // �յڿ� ��|���� �ٿ��� ǥ��
    }
    public void rawClose() {
        printLine();
    }
    private void printLine() {
        System.out.print("+");                // �׵θ��� �𼭸��� ǥ���ϴ� ��+����ũ�� ǥ���Ѵ�.
        for (int i = 0; i < width; i++) {         // width���� ��-���� ǥ���ؼ�
            System.out.print("-");             // �׵θ� ������ �̿��Ѵ�.
        }
        System.out.println("+");              // �׵θ��� �𼭸��� ǥ���ϴ� ��+����ũ�� ǥ���Ѵ�.
    }
}
