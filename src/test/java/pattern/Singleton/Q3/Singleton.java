public class Singleton {
    private static Singleton singleton = null;
    private Singleton() {
        System.out.println("�ν��Ͻ��� �����߽��ϴ�.");
    }
    public static Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }
}
