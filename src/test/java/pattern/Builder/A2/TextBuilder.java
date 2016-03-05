public class TextBuilder extends Builder {
    private StringBuffer buffer = new StringBuffer();        // �� �ʵ忡 ������ �����Ѵ�
    public void buildTitle(String title) {                    // �Ϲ� �ؽ�Ʈ������ Ÿ��Ʋ
        buffer.append("==============================\n");    // ��ļ�
        buffer.append("��" + title + "��\n");                // �������� Ÿ��Ʋ
        buffer.append("\n");                             // ����
    }
    public void buildString(String str) {                     // �Ϲ� �ؽ�Ʈ������ ���ڿ�
        buffer.append('��' + str + "\n");                   // ����� ���ڿ�
        buffer.append("\n");                              // ����
    }
    public void buildItems(String[] items) {                  // �Ϲ� �ؽ�Ʈ������ �����׸�
        for (int i = 0; i < items.length; i++) {
            buffer.append(" ��" + items[i] + "\n");           // ������ �׸�
        }
        buffer.append("\n");                               // ����
    }
    public void buildDone() {                                // ������ �ϼ�
        buffer.append("==============================\n");     // ��ļ�
    }
    public String getResult() {
        return buffer.toString();                              // StringBuffer�� Stringd�� ��ȯ
    }
}
