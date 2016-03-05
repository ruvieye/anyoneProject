package game;
import java.io.*;
import java.util.*;

public class Memento implements Serializable {  
    int money;                              // ������
    ArrayList fruits;                          // ����
    public int getMoney() {                  // �������� ��´�(narrow interface)
        return money;
    }
    Memento(int money) {                    // ������(wide interface)
        this.money = money;
        this.fruits = new ArrayList();
    }
    void addFruit(String fruit) {               // ������ �߰��Ѵ�(wide interface)
        fruits.add(fruit);
    }
    List getFruits() {                         // ������ ��´�(wide interface)
         return (List)fruits.clone();
    }
}
