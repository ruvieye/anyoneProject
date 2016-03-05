package pattern.Composite.Sample;

import java.util.Iterator;
import java.util.ArrayList;

public class Directory extends Entry {
	private String name; // ���͸��� �̸�
	private ArrayList directory = new ArrayList(); // ���͸� ��Ʈ���� ����

	public Directory(String name) { // ������
		this.name = name;
	}

	public String getName() { // �̸��� ��´�
		return name;
	}

	public int getSize() { // ũ�⸦ ��´�
		int size = 0;
		Iterator it = directory.iterator();
		while (it.hasNext()) {
			Entry entry = (Entry) it.next();
			size += entry.getSize();
		}
		return size;
	}

	@Override
	public Entry add(Entry entry) {
		directory.add(entry);
		return this;
	}

	protected void printList(String prefix) { // ��Ʈ���� �϶�
		System.out.println(prefix + "/" + this);
		Iterator it = directory.iterator();
		while (it.hasNext()) {
			Entry entry = (Entry) it.next();
			entry.printList(prefix + "/" + name);
		}
	}
}
