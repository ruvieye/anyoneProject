public class PrinterProxy implements Printable {
    private String name;          // �̸�
    private Printer real;           // �����Ρ�
    public PrinterProxy() {
    }
    public PrinterProxy(String name) {      // ������
        this.name = name;
    }
    public synchronized void setPrinterName(String name) {  // �̸��� ����
        if (real != null) {
            real.setPrinterName(name);  // �����Ρ����Ե� �����Ѵ�
        }
        this.name = name;
    }
    public String getPrinterName() {     // �̸��� ����
        return name;
    }
    public void print(String string) {     // ǥ��
        realize();
        real.print(string);
    }
    private synchronized void realize() {   // �����Ρ��� ����
        if (real == null) {            
            real = new Printer(name);
        }                           
    }
}
