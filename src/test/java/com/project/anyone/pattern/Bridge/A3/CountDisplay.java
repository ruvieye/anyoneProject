public class CountDisplay extends Display {
    public CountDisplay(DisplayImpl impl) {
        super(impl);
    }
    public void multiDisplay(int times) {       // timesȸ �ݺ��ؼ� �����Ѵ�
        open();
        for (int i = 0; i < times; i++) {
            print();
        }
        close();
    }
}
