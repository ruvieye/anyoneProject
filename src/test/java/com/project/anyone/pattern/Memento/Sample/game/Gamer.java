package game;
import java.util.*;

public class Gamer {
    private int money;                             // ������
    private List fruits = new ArrayList();         // ����
    private Random random = new Random();          // �����߻���
    private static String[] fruitsname = {         // ���� �̸��� ǥ
        "���", "����", "�ٳ���", "��",
    };
    public Gamer(int money) {                      // ������
        this.money = money;
    }
    public int getMoney() {                         // ������ �������� ��´�
        return money;
    }
    public void bet() {                             // �����ϴ� - ������ ����
        int dice = random.nextInt(6) + 1;           // �ֻ����� ������
        if (dice == 1) {                            // 1 - �������� �����Ѵ�
            money += 100;
            System.out.println("�������� �����߽��ϴ�.");
        } else if (dice == 2) {                     // 2 - �������� ������ �ȴ�
            money /= 2;
            System.out.println("�������� ������ �Ǿ����ϴ�.");
        } else if (dice == 6) {                     // 6 - ������ �޴´�
            String f = getFruit();
            System.out.println("����(" + f + ")�� �޾ҽ��ϴ�.");
            fruits.add(f);
        } else {                                    // �׿� - ���� ���� ����
            System.out.println("���� ���� �����ϴ�.");
        }
    }
    public Memento createMemento() {                // �������� ��´�
        Memento m = new Memento(money);
        Iterator it = fruits.iterator();
        while (it.hasNext()) {
            String f = (String)it.next();
            if (f.startsWith("���ִ� ")) {         // ������ ���ִ� �͸� ����
                m.addFruit(f);
            }
        }
        return m;
    }
    public void restoreMemento(Memento memento) {   // undo ����
        this.money = memento.money;
        this.fruits = memento.getFruits();
    }
    public String toString() {                      // ���ڿ� ǥ��
        return "[money = " + money + ", fruits = " + fruits + "]";
    }
    private String getFruit() {                     // ������ 1�� ��´�
        String prefix = "";
        if (random.nextBoolean()) {
            prefix = "���ִ� ";
        }
        return prefix + fruitsname[random.nextInt(fruitsname.length)];
    }
}

